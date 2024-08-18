package program;

import js.expressions.ArgumentsExpression.*;
import js.expressions.ArrayLiteral.ArrayElement;
import js.expressions.ArrayLiteral.ArrayLiteral;
import js.expressions.*;
import js.expressions.Function.ArrowFunction;
import js.expressions.Literals.DecimalLiteral;
import js.expressions.Literals.ObjectLiteral;
import js.expressions.Properties.EllipsisProperty;
import js.expressions.Properties.NormalProperty;
import js.statements.Block.Block;
import js.statements.ClassDeclaration.ClassDeclaration;
import js.statements.ClassDeclaration.ClassFieldDefinition;
import js.statements.ClassDeclaration.ClassMethodDefinition;
import js.statements.ClassDeclaration.PropertyName.PropertyByName;
import js.statements.ConditionalStatement.ConditionalStatement;
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
    private static int effectNum1 = 0;
    private static int effectNum2 = 0;

    public static void UniformComponents(JsProgram program) {
    }

    public static ClassDeclaration FunctionToClass(FunctionDeclaration functionDeclaration) {
        if (GetStates(functionDeclaration).objectProperties.size() == 0) return null;
        ClassDeclaration classDeclaration = new ClassDeclaration(functionDeclaration.Identifier, "Component");
        stateNum1 = 0;
        stateNum2 = 0;
        effectNum1 = 0;
        effectNum2 = 0;
        /*
        constructor(props){
            this.props=props;
            this.state=Object Of States
            }
        */
        DefineConstructor(classDeclaration, functionDeclaration);
        /*
        render(){}
         */
        DefineRender(classDeclaration, functionDeclaration);

        return classDeclaration;
    }

    private static void DefineConstructor(ClassDeclaration classDeclaration, FunctionDeclaration functionDeclaration) {
        /*
        constructor(props){
            this.props=props;
            this.state=Object Of States
            }
        */
        Arguments arguments = new Arguments();
        arguments.addArgument(new Argument(new IdentifierExpression("props")));
        Expression superCall = new ArgumentsExpression(new SimpleExpression().Super(), arguments);
        Expression propsAssignmentExpression = new AssignmentExpression(new OptionalChainExpression(new SimpleExpression().This(), new IdentifierExpression("props"), false), new IdentifierExpression("props"), null);
        ObjectLiteral objectLiteral = GetStates(functionDeclaration);
        List<ClassFieldDefinition> fields = GetDeps(functionDeclaration);
        for (ClassFieldDefinition field : fields) {
            classDeclaration.addElement(field);
        }
        Expression stateAssignmentExpression = new AssignmentExpression(new OptionalChainExpression(new SimpleExpression().This(), new IdentifierExpression("state"), false), objectLiteral, null);

        List<Statement> constructorBody = new ArrayList<>();
        constructorBody.add(new ExpressionChunk(new ExpressionSequence(superCall)));
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

    private static List<ClassFieldDefinition> GetDeps(FunctionDeclaration functionDeclaration) {
        List<ClassFieldDefinition> fields = new ArrayList<>();
        List<Statement> statements = functionDeclaration.body;
        for (Statement statement : statements) {
            // Plain useState()
            if (statement instanceof ExpressionChunk) {
                for (Expression expressionChunk : ((ExpressionChunk) statement).expressions.list) {
                    if (expressionChunk instanceof UseEffectFunction) {
                        effectNum1++;
                        PropertyName name1 = new PropertyByName("deps_" + stateNum1, null);
                        Expression value1 = new ArrayLiteral();
                        PropertyName name2 = new PropertyByName("deps_length_" + stateNum1, null);
                        Expression value2 = new DecimalLiteral(((UseEffectFunction) expressionChunk).dependencies == null ? "-1" : (((UseEffectFunction) expressionChunk).dependencies.elements.size() + ""));
                        fields.add(new ClassFieldDefinition(false, name1, value1));
                        fields.add(new ClassFieldDefinition(false, name2, value2));
                    }
                }
            }
        }
        return fields;
    }

    private static List<Statement> ReplaceUseStates(List<Statement> statements) {
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

                        array.addElement(new ArrayElement(new ExpressionSequence(new OptionalChainExpression(new SimpleExpression().This(), new OptionalChainExpression(new IdentifierExpression("state"), new IdentifierExpression("state_" + stateNum2), false), false)), false));

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

    private static List<Statement> ReplaceUseEffects(List<Statement> statements) {
        for (int i = 0; i < statements.size(); i++) {
            Statement statement = statements.get(i);
            if (statement instanceof ExpressionChunk) {
                for (Expression expressionChunk : ((ExpressionChunk) statement).expressions.list) {
                    if (expressionChunk instanceof UseEffectFunction) {
                        List<ArrayElement> deps = ((UseEffectFunction) expressionChunk).dependencies != null ? ((UseEffectFunction) expressionChunk).dependencies.elements : null;
                        effectNum2++;
                        // Replace useEffect() with if (this.deps_length_1 === -1 || (this.deps_length_1 !== 0 && this.deps_1 && (this.deps_1[0] !== dep0 || this.deps_1[1] !== dep1))){}
                        ExpressionSequence expressions = new ExpressionSequence();
                        LogicalExpression noDeps = new LogicalExpression(new IdentifierExpression("this.deps_length_" + effectNum2), new DecimalLiteral("-1"), "===");
                        LogicalExpression zeroDeps = new LogicalExpression(new IdentifierExpression("this.deps_length_" + effectNum2), new DecimalLiteral("0"), "!==");

                        ExpressionSequence sequence2 = new ExpressionSequence();
                        ExpressionSequence sequence3 = new ExpressionSequence();
                        if (deps != null && deps.size() > 0) {
                            Expression changesCheck = new LogicalExpression(new IdentifierExpression("this.deps_" + effectNum2 + "[0]"), ((UseEffectFunction) expressionChunk).dependencies.elements.get(0).element, "===");
                            for (int j = 0; j < deps.size(); j++) {
                                changesCheck = new LogicalExpression(changesCheck, new LogicalExpression(new IdentifierExpression("this.deps_" + effectNum2 + "[" + j + "]"), deps.get(j).element, "==="), "&&");
                            }
                            sequence3.addExpression(changesCheck);
                            sequence2.addExpression(new ParenthesizedExpression(sequence3));
                        }

                        LogicalExpression depsChanged = sequence2.list.size() == 0 ? zeroDeps : new LogicalExpression(zeroDeps, sequence2, "&&");
                        ExpressionSequence sequence = new ExpressionSequence();
                        sequence.addExpression(depsChanged);
                        expressions.addExpression(new LogicalExpression(noDeps, new ParenthesizedExpression(sequence), "||"));
                        Block newStatements = new Block();
                        newStatements.statements = ((UseEffectFunction) expressionChunk).onRenderFunction.body;
                        ConditionalStatement ifStatement = new ConditionalStatement(expressions, newStatements, null);
                        statements.set(i, ifStatement);
                    }
                }
            }
        }
        return statements;
    }

    private static void DefineRender(ClassDeclaration classDeclaration, FunctionDeclaration functionDeclaration) {
        /*
        render(){}
        */
        List<Statement> newBody = ReplaceUseStates(functionDeclaration.body);
        newBody = ReplaceUseEffects(newBody);
        List<VariableDeclaration> vars = new ArrayList<>();
        vars.add(new VariableDeclaration("const", functionDeclaration.parameters.values.size() != 0 ? functionDeclaration.parameters.values.get(0).a : new ObjectLiteral(), new OptionalChainExpression(new SimpleExpression().This(), new IdentifierExpression("props"), false), "idk"));
        newBody.add(0, new VariableDeclarationStatement(vars, null));
        ClassMethodDefinition renderMethod = new ClassMethodDefinition(false, new PropertyByName("render", null), new Parameters(new ArrayList<>(), null), newBody);
        classDeclaration.addElement(renderMethod);
    }
}