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
        Expression propsAssignmentExpression = new AssignmentExpression(new OptionalChainExpression(new SimpleExpression().This(), new IdentifierExpression("props"), false), new IdentifierExpression("props"));
        ObjectLiteral objectLiteral = GetStates(functionDeclaration);
        Expression stateAssignmentExpression = new AssignmentExpression(new OptionalChainExpression(new SimpleExpression().This(), new IdentifierExpression("state"), false), objectLiteral);

        List<Statement> constructorBody = new ArrayList<>();
        constructorBody.add(new ExpressionChunk(new ExpressionSequence(propsAssignmentExpression)));
        constructorBody.add(new ExpressionChunk(new ExpressionSequence(stateAssignmentExpression)));

        List<Pair<Assignable, Expression>> propsParam = new ArrayList<>();
        propsParam.add(new Pair<>(new IdentifierExpression("props"), new ObjectLiteral()));

        ClassMethodDefinition constructor = new ClassMethodDefinition(false, new PropertyByName("constructor"), new Parameters(propsParam, null), constructorBody);
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
                        PropertyName name = new PropertyByName("state_" + (stateNum1++));
                        Expression value = ((UseStateFunction) expressionChunk).initialState.value;
                        objectLiteral.addAttribute(new NormalProperty(name, value));
                    }
                }
            } else if (statement instanceof VariableDeclarationStatement) {
                // variables with useState()
                for (VariableDeclaration varDecl : ((VariableDeclarationStatement) statement).vars) {
                    if (varDecl.value instanceof UseStateFunction) {
                        PropertyName name = new PropertyByName("state_" + (stateNum1++));
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
        for (Statement statement : statements) {
            if (statement instanceof UseStateFunction) {
                // Replace useState() with [this.state, value=>this.setState({...this.state, state_NUM++:value})]
                ArrayLiteral array = new ArrayLiteral();

                array.addElement(new ArrayElement(new ExpressionSequence(new OptionalChainExpression(new SimpleExpression().This(), new IdentifierExpression("state"), false)), false));

                List<Pair<Assignable, Expression>> params = new ArrayList<>();
                params.add(new Pair<>(new IdentifierExpression("value"), null));
                Parameters parameters = new Parameters(params, null);

                List<Statement> body = new ArrayList<>();
                ObjectLiteral objectLiteral = new ObjectLiteral();
                objectLiteral.addAttribute(new EllipsisProperty(new IdentifierExpression("this.state")));
                objectLiteral.addAttribute(new NormalProperty(new PropertyByName("state_" + (stateNum2++)), new IdentifierExpression("value")));
                Arguments arguments = new Arguments();
                arguments.addArgument(new Argument(objectLiteral));

                body.add(new ExpressionChunk(new ExpressionSequence(new ArgumentsExpression(new OptionalChainExpression(new SimpleExpression().This(), new IdentifierExpression("setState"), false), arguments))));
                array.addElement(new ArrayElement(new ArrowFunction(parameters, body), false));
            } else if (statement instanceof VariableDeclarationStatement) {
                // variables with useState()
                for (VariableDeclaration varDecl : ((VariableDeclarationStatement) statement).vars) {
                    if (varDecl.value instanceof UseStateFunction) {

                        // Replace useState() with [this.state, value=>this.setState({...this.state, state_NUM++:value})]
                        ArrayLiteral array = new ArrayLiteral();

                        array.addElement(new ArrayElement(new ExpressionSequence(new OptionalChainExpression(new SimpleExpression().This(), new IdentifierExpression("state"), false)), false));

                        List<Pair<Assignable, Expression>> params = new ArrayList<>();
                        params.add(new Pair<>(new IdentifierExpression("value"), null));
                        Parameters parameters = new Parameters(params, null);

                        List<Statement> body = new ArrayList<>();
                        ObjectLiteral objectLiteral = new ObjectLiteral();
                        objectLiteral.addAttribute(new EllipsisProperty(new IdentifierExpression("this.state")));
                        objectLiteral.addAttribute(new NormalProperty(new PropertyByName("state_" + (stateNum2++)), new IdentifierExpression("value")));
                        Arguments arguments = new Arguments();
                        arguments.addArgument(new Argument(objectLiteral));

                        body.add(new ExpressionChunk(new ExpressionSequence(new ArgumentsExpression(new OptionalChainExpression(new SimpleExpression().This(), new IdentifierExpression("setState"), false), arguments))));
                        array.addElement(new ArrayElement(new ArrowFunction(parameters, body), false));

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
        ClassMethodDefinition componentWillMountMethod = new ClassMethodDefinition(false, new PropertyByName("componentWillMount"), new Parameters(new ArrayList<>(), null), new ArrayList<>());
        classDeclaration.addElement(componentWillMountMethod);
    }

    private static void DefineRender(ClassDeclaration classDeclaration, FunctionDeclaration functionDeclaration) {
        /*
        render(){}
        */
        List<Statement> newBody = ReplaceUseStates(functionDeclaration);
        List<Pair<Assignable, Expression>> paramsList = new ArrayList<>();
        paramsList.add(new Pair<>(new ObjectLiteral(), null));
        ClassMethodDefinition renderMethod = new ClassMethodDefinition(false, new PropertyByName("render"), new Parameters(paramsList, null), newBody);
        classDeclaration.addElement(renderMethod);
    }

    private static void DefineComponentDidMount(ClassDeclaration classDeclaration) {
        /*
        componentDidMount(){}
        */
        ClassMethodDefinition componentDidMountMethod = new ClassMethodDefinition(false, new PropertyByName("componentDidMount"), new Parameters(new ArrayList<>(), null), new ArrayList<>());
        classDeclaration.addElement(componentDidMountMethod);
    }

    private static void DefineComponentWillReceiveProps(ClassDeclaration classDeclaration) {
        /*
        componentWillReceiveProps(){}
        */
        ClassMethodDefinition componentWillReceivePropsMethod = new ClassMethodDefinition(false, new PropertyByName("componentWillReceiveProps"), new Parameters(new ArrayList<>(), null), new ArrayList<>());
        classDeclaration.addElement(componentWillReceivePropsMethod);
    }

    private static void DefineSetState(ClassDeclaration classDeclaration) {
        /*
        setState(){}
        */
        ClassMethodDefinition setStateMethod = new ClassMethodDefinition(false, new PropertyByName("setState"), new Parameters(new ArrayList<>(), null), new ArrayList<>());
        classDeclaration.addElement(setStateMethod);
    }

    private static void DefineShouldComponentUpdate(ClassDeclaration classDeclaration) {
        /*
        shouldComponentUpdate(){}
        */
        ClassMethodDefinition shouldComponentUpdateMethod = new ClassMethodDefinition(false, new PropertyByName("shouldComponentUpdate"), new Parameters(new ArrayList<>(), null), new ArrayList<>());
        classDeclaration.addElement(shouldComponentUpdateMethod);

    }

    private static void DefineComponentWillUpdate(ClassDeclaration classDeclaration) {
        /*
        componentWillUpdate(){}
        */
        ClassMethodDefinition componentWillUpdateMethod = new ClassMethodDefinition(false, new PropertyByName("componentWillUpdate"), new Parameters(new ArrayList<>(), null), new ArrayList<>());
        classDeclaration.addElement(componentWillUpdateMethod);

    }

    private static void DefineComponentDidUpdate(ClassDeclaration classDeclaration) {
        /*
        componentDidUpdate(){}
        */
        ClassMethodDefinition componentDidUpdateMethod = new ClassMethodDefinition(false, new PropertyByName("componentDidUpdate"), new Parameters(new ArrayList<>(), null), new ArrayList<>());
        classDeclaration.addElement(componentDidUpdateMethod);
    }

    private static void DefineComponentWillUnmount(ClassDeclaration classDeclaration) {
        /*
        componentWillUnmount(){}
        */
        ClassMethodDefinition componentWillUnmountMethod = new ClassMethodDefinition(false, new PropertyByName("componentWillUnmount"), new Parameters(new ArrayList<>(), null), new ArrayList<>());
        classDeclaration.addElement(componentWillUnmountMethod);
    }
}