package program;

import js.expressions.ArgumentsExpression.Argument;
import js.expressions.ArgumentsExpression.Arguments;
import js.expressions.ArgumentsExpression.ArgumentsExpression;
import js.expressions.ArgumentsExpression.UseStateFunction;
import js.expressions.ArrayLiteral.ArrayElement;
import js.expressions.ArrayLiteral.ArrayLiteral;
import js.expressions.*;
import js.expressions.Function.ArrowFunction;
import js.expressions.Literals.ObjectLiteral;
import js.expressions.Properties.EllipsisProperty;
import js.expressions.Properties.NormalProperty;
import js.statements.ClassDeclaration.ClassDeclaration;
import js.statements.ClassDeclaration.ClassMethodDefinition;
import js.statements.ClassDeclaration.PropertyName.PropertyByName;
import js.statements.ExpressionChunk.ExpressionChunk;
import js.statements.Function.FunctionDeclaration;
import js.statements.VariableDeclarationStatement.VariableDeclaration;
import js.statements.VariableDeclarationStatement.VariableDeclarationStatement;
import js.visitors.models.*;
import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;
import java.util.List;

public class CodeGeneration {
    private static int stateNum1 = 0;
    private static int stateNum2 = 0;

    public static void UniformComponents(JsProgram program) {
    }

    public static ClassDeclaration FunctionToClass(FunctionDeclaration functionDeclaration) {
        if (GetStates(functionDeclaration).objectProperties.size() == 0) return null;
        ClassDeclaration classDeclaration = new ClassDeclaration(functionDeclaration.Identifier, "ReactJSClassComponent");
        /*
        constructor(props){
            this.props=props;
            this.state=Object Of States
            }
        */
        DefineConstructor(classDeclaration, functionDeclaration);
        /*
        componentWillMount(){}
        */
        DefineComponentWillMount(classDeclaration);
        /*
        render(){}
         */
        DefineRender(classDeclaration, functionDeclaration);
        /*
        componentDidMount(){}
        */
        DefineComponentDidMount(classDeclaration);
        /*
        componentWillReceiveProps(){}
        */
        DefineComponentWillReceiveProps(classDeclaration);
        /*
        setState(){}
        */
        DefineSetState(classDeclaration);
        /*
        shouldComponentUpdate(){}
        */
        DefineShouldComponentUpdate(classDeclaration);
        /*
        componentWillUpdate(){}
        */
        DefineComponentWillUpdate(classDeclaration);
        /*
        componentDidUpdate(){}
        */
        DefineComponentDidUpdate(classDeclaration);
        /*
        componentWillUnmount(){}
        */
        DefineComponentWillUnmount(classDeclaration);

        return classDeclaration;
    }

    private static void DefineConstructor(ClassDeclaration classDeclaration, FunctionDeclaration functionDeclaration) {
        /*
        constructor(props){
            this.props=props;
            this.state=Object Of States
            }
        */
        Expression propsAssignmentExpression = new AssignmentExpression(new OptionalChainExpression(new SimpleExpression().This(), new IdentifierExpression("props"), false), new IdentifierExpression("props"), null);
        ObjectLiteral objectLiteral = GetStates(functionDeclaration);
        Expression stateAssignmentExpression = new AssignmentExpression(new OptionalChainExpression(new SimpleExpression().This(), new IdentifierExpression("state"), false), objectLiteral, null);

        List<Statement> constructorBody = new ArrayList<>();
        constructorBody.add(new ExpressionChunk(new ExpressionSequence(propsAssignmentExpression)));
        constructorBody.add(new ExpressionChunk(new ExpressionSequence(stateAssignmentExpression)));

        List<Pair<Assignable, Expression>> propsParam = new ArrayList<>();
        propsParam.add(new Pair<>(new IdentifierExpression("props"), new ObjectLiteral()));

        ClassMethodDefinition constructor = new ClassMethodDefinition(false, new PropertyByName("constructor", null), new Parameters(propsParam, null), constructorBody);
        classDeclaration.addElement(constructor);
    }

    private static ObjectLiteral GetStates(FunctionDeclaration functionDeclaration) {
        ObjectLiteral objectLiteral = new ObjectLiteral();
        List<Statement> statements = functionDeclaration.body;
        for (Statement statement : statements) {
            // Plain useState()
            if (statement instanceof ExpressionChunk) {
                for (Expression expressionChunk : ((ExpressionChunk) statement).expressions.list) {
                    if (expressionChunk instanceof UseStateFunction) {
                        stateNum1++;
                        PropertyName name = new PropertyByName("state_" + stateNum1, null);
                        Expression value = ((UseStateFunction) expressionChunk).initialState.value;
                        objectLiteral.addAttribute(new NormalProperty(name, value));
                    }
                }
            } else if (statement instanceof VariableDeclarationStatement) {
                // variables with useState()
                for (VariableDeclaration varDecl : ((VariableDeclarationStatement) statement).vars) {
                    if (varDecl.value instanceof UseStateFunction) {
                        stateNum1++;
                        PropertyName name = new PropertyByName("state_" + stateNum1, null);
                        Expression value = ((UseStateFunction) varDecl.value).initialState.value;
                        objectLiteral.addAttribute(new NormalProperty(name, value));
                    }
                }
            }
        }
        return objectLiteral;
    }

    private static List<Statement> ReplaceUseStates(FunctionDeclaration functionDeclaration) {
        List<Statement> statements = functionDeclaration.body;
        for (int i = 0; i < statements.size(); i++) {
            Statement statement = statements.get(i);
            if (statement instanceof ExpressionChunk) {
                for (Expression expressionChunk : ((ExpressionChunk) statement).expressions.list) {
                    if (expressionChunk instanceof UseStateFunction) {
                        stateNum2++;
                        // Replace useState() with [this.state, value=>this.setState({...this.state, state_NUM++:value})]
                        ArrayLiteral array = new ArrayLiteral();

                        array.addElement(new ArrayElement(new ExpressionSequence(new OptionalChainExpression(new SimpleExpression().This(), new IdentifierExpression("state.state_" + stateNum2), false)), false));

                        List<Pair<Assignable, Expression>> params = new ArrayList<>();
                        params.add(new Pair<>(new IdentifierExpression("value"), null));
                        Parameters parameters = new Parameters(params, null);

                        List<Statement> body = new ArrayList<>();
                        ObjectLiteral objectLiteral = new ObjectLiteral();
                        objectLiteral.addAttribute(new EllipsisProperty(new IdentifierExpression("this.state")));
                        objectLiteral.addAttribute(new NormalProperty(new PropertyByName("state_" + (stateNum2), null), new IdentifierExpression("value")));
                        Arguments arguments = new Arguments();
                        arguments.addArgument(new Argument(objectLiteral));

                        body.add(new ExpressionChunk(new ExpressionSequence(new ArgumentsExpression(new OptionalChainExpression(new SimpleExpression().This(), new IdentifierExpression("setState"), false), arguments))));
                        array.addElement(new ArrayElement(new ArrowFunction(parameters, body, null), false));

                        ExpressionSequence expressions = new ExpressionSequence();
                        expressions.addExpression(array);
                        statements.set(i, new ExpressionChunk(expressions));
                    }
                }
            } else if (statement instanceof VariableDeclarationStatement) {
                // variables with useState()
                for (VariableDeclaration varDecl : ((VariableDeclarationStatement) statement).vars) {
                    if (varDecl.value instanceof UseStateFunction) {
                        stateNum2++;
                        // Replace useState() with [this.state, value=>this.setState({...this.state, state_NUM++:value})]
                        ArrayLiteral array = new ArrayLiteral();

                        array.addElement(new ArrayElement(new ExpressionSequence(new OptionalChainExpression(new SimpleExpression().This(), new IdentifierExpression("state.state_" + stateNum2), false)), false));

                        List<Pair<Assignable, Expression>> params = new ArrayList<>();
                        params.add(new Pair<>(new IdentifierExpression("value"), null));
                        Parameters parameters = new Parameters(params, null);

                        List<Statement> body = new ArrayList<>();
                        ObjectLiteral objectLiteral = new ObjectLiteral();
                        objectLiteral.addAttribute(new EllipsisProperty(new IdentifierExpression("this.state")));
                        objectLiteral.addAttribute(new NormalProperty(new PropertyByName("state_" + stateNum2, null), new IdentifierExpression("value")));
                        Arguments arguments = new Arguments();
                        arguments.addArgument(new Argument(objectLiteral));

                        body.add(new ExpressionChunk(new ExpressionSequence(new ArgumentsExpression(new OptionalChainExpression(new SimpleExpression().This(), new IdentifierExpression("setState"), false), arguments))));
                        array.addElement(new ArrayElement(new ArrowFunction(parameters, body, null), false));

                        varDecl.value = array;
                    }
                }
            }

        }
        return statements;
    }

    private static void DefineComponentWillMount(ClassDeclaration classDeclaration) {
        /*
        componentWillMount(){}
        */
        ClassMethodDefinition componentWillMountMethod = new ClassMethodDefinition(false, new PropertyByName("componentWillMount", null), new Parameters(new ArrayList<>(), null), new ArrayList<>());
        classDeclaration.addElement(componentWillMountMethod);
    }

    private static void DefineRender(ClassDeclaration classDeclaration, FunctionDeclaration functionDeclaration) {
        /*
        render(){}
        */
        List<Statement> newBody = ReplaceUseStates(functionDeclaration);
        List<VariableDeclaration> vars = new ArrayList<>();
        vars.add(new VariableDeclaration("const", functionDeclaration.parameters.values.size() != 0 ? functionDeclaration.parameters.values.get(0).a : new ObjectLiteral(), new IdentifierExpression("this.props"), "idk"));
        newBody.add(0, new VariableDeclarationStatement(vars, null));
        ClassMethodDefinition renderMethod = new ClassMethodDefinition(false, new PropertyByName("render", null), new Parameters(new ArrayList<>(), null), newBody);
        classDeclaration.addElement(renderMethod);
    }

    private static void DefineComponentDidMount(ClassDeclaration classDeclaration) {
        /*
        componentDidMount(){}
        */
        ClassMethodDefinition componentDidMountMethod = new ClassMethodDefinition(false, new PropertyByName("componentDidMount", null), new Parameters(new ArrayList<>(), null), new ArrayList<>());
        classDeclaration.addElement(componentDidMountMethod);
    }

    private static void DefineComponentWillReceiveProps(ClassDeclaration classDeclaration) {
        /*
        componentWillReceiveProps(){}
        */
        ClassMethodDefinition componentWillReceivePropsMethod = new ClassMethodDefinition(false, new PropertyByName("componentWillReceiveProps", null), new Parameters(new ArrayList<>(), null), new ArrayList<>());
        classDeclaration.addElement(componentWillReceivePropsMethod);
    }

    private static void DefineSetState(ClassDeclaration classDeclaration) {
        /*
        setState(){}
        */
        ClassMethodDefinition setStateMethod = new ClassMethodDefinition(false, new PropertyByName("setState", null), new Parameters(new ArrayList<>(), null), new ArrayList<>());
        classDeclaration.addElement(setStateMethod);
    }

    private static void DefineShouldComponentUpdate(ClassDeclaration classDeclaration) {
        /*
        shouldComponentUpdate(){}
        */
        ClassMethodDefinition shouldComponentUpdateMethod = new ClassMethodDefinition(false, new PropertyByName("shouldComponentUpdate", null), new Parameters(new ArrayList<>(), null), new ArrayList<>());
        classDeclaration.addElement(shouldComponentUpdateMethod);

    }

    private static void DefineComponentWillUpdate(ClassDeclaration classDeclaration) {
        /*
        componentWillUpdate(){}
        */
        ClassMethodDefinition componentWillUpdateMethod = new ClassMethodDefinition(false, new PropertyByName("componentWillUpdate", null), new Parameters(new ArrayList<>(), null), new ArrayList<>());
        classDeclaration.addElement(componentWillUpdateMethod);

    }

    private static void DefineComponentDidUpdate(ClassDeclaration classDeclaration) {
        /*
        componentDidUpdate(){}
        */
        ClassMethodDefinition componentDidUpdateMethod = new ClassMethodDefinition(false, new PropertyByName("componentDidUpdate", null), new Parameters(new ArrayList<>(), null), new ArrayList<>());
        classDeclaration.addElement(componentDidUpdateMethod);
    }

    private static void DefineComponentWillUnmount(ClassDeclaration classDeclaration) {
        /*
        componentWillUnmount(){}
        */
        ClassMethodDefinition componentWillUnmountMethod = new ClassMethodDefinition(false, new PropertyByName("componentWillUnmount", null), new Parameters(new ArrayList<>(), null), new ArrayList<>());
        classDeclaration.addElement(componentWillUnmountMethod);
    }
}