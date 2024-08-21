package program;

import js.SymbolTable.Scope;
import js.SymbolTable.Symbol;
import js.SymbolTable.Symbolable;
import js.expressions.*;
import js.expressions.ArgumentsExpression.UseEffectFunction;
import js.expressions.ArgumentsExpression.UseRefFunction;
import js.expressions.ArgumentsExpression.UseStateFunction;
import js.expressions.ArrayLiteral.ArrayElement;
import js.expressions.ArrayLiteral.ArrayLiteral;
import js.expressions.Function.AnonymousFunction;
import js.expressions.Function.ArrowFunction;
import js.expressions.Literals.ObjectLiteral;
import js.expressions.Literals.StringLiteral;
import js.expressions.Properties.ComputedProperty;
import js.expressions.Properties.EllipsisProperty;
import js.expressions.Properties.FunctionProperty;
import js.expressions.Properties.NormalProperty;
import js.expressions.jsxElement.JSXElement;
import js.statements.Block.Block;
import js.statements.ClassDeclaration.ClassDeclaration;
import js.statements.ClassDeclaration.ClassFieldDefinition;
import js.statements.ClassDeclaration.ClassMethodDefinition;
import js.statements.ClassDeclaration.PropertyName.PropertyByExpression;
import js.statements.ClassDeclaration.PropertyName.PropertyByName;
import js.statements.ClassDeclaration.PropertyName.PropertyByString;
import js.statements.ConditionalStatement.ConditionalStatement;
import js.statements.ExpressionChunk.ExpressionChunk;
import js.statements.Function.FunctionDeclaration;
import js.statements.Loops.*;
import js.statements.ReturnStatement.ReturnStatement;
import js.statements.TryStatement.CatchProduction;
import js.statements.TryStatement.FinallyProduction;
import js.statements.TryStatement.TryStatement;
import js.statements.VariableDeclarationStatement.VariableDeclaration;
import js.statements.VariableDeclarationStatement.VariableDeclarationStatement;
import js.visitors.models.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.misc.Pair;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SymbolTableVisitor {
    public static List<Symbolable> visit(Statement model,Object ...args) {
//        System.out.println(model);
        if (model instanceof Block) {
            return visit((Block) model,args);
        }
        if (model instanceof VariableDeclarationStatement) {
            return visit((VariableDeclarationStatement) model,args);
        }
        if (model instanceof TryStatement) {
            return visit((TryStatement) model,args);
        }
        if (model instanceof CatchProduction) {
            return visit((CatchProduction) model,args);
        }
        if (model instanceof FinallyProduction) {
            return visit((FinallyProduction) model,args);
        }
        if (model instanceof ConditionalStatement) {
            return visit((ConditionalStatement) model,args);
        }
        if (model instanceof ClassDeclaration) {
            return visit((ClassDeclaration) model,args);
        }
        if (model instanceof ForLoop) {
            return visit((ForLoop) model,args);
        }
        if (model instanceof ForInLoop) {
            return visit((ForInLoop) model,args);
        }
        if (model instanceof ForOfLoop) {
            return visit((ForOfLoop) model,args);
        }
        if (model instanceof WhileLoop) {
            return visit((WhileLoop) model,args);
        }
        if (model instanceof DoWhileLoop) {
            return visit((DoWhileLoop) model,args);
        }
        if (model instanceof FunctionDeclaration) {
            return visit((FunctionDeclaration) model,args);
        }
        if (model instanceof AnonymousFunction) {
            if (model instanceof ArrowFunction)
                return visit((ArrowFunction) model,args);
            else
                return visit((AnonymousFunction) model,args);
        }
        if (model instanceof Property) {
            return visit((Property) model,args);
        }
        if (model instanceof ArrayLiteral) {
            return visit((ArrayLiteral) model,args);
        }
        if (model instanceof AssignmentExpression) {
            return visit((AssignmentExpression) model,args);
        }
        if (model instanceof ExpressionChunk) {
            return visit((ExpressionChunk) model,args);
        }
        if (model instanceof ExpressionSequence) {
            return visit((ExpressionSequence) model,args);
        }
        // If the statement type is not recognized, return an empty list
        return new ArrayList<>();
    }


    public static Symbolable visit(JsProgram prog,Object ...args) {

        List<Symbolable> symbolables = new ArrayList<>();
        HashMap<String,Pair<String,String>> map = initializeHashMap();

        for (Statement st : prog.statements) {
            if (st != null) {
                List<Symbolable> childSymbolables = visit(st,cloneHashMap(map));

                addNewSymbolsToMap(map, childSymbolables);

                symbolables.addAll(childSymbolables);
            }
        }
        return new Scope(prog.getClass().getSimpleName(), "Main", symbolables);
    }

    public static List<Symbolable> visit(Block model,Object ...args) {
        List<Symbolable> symbolables = new ArrayList<>();
        HashMap<String,Pair<String,String>> fatherMap = getMapFromArgs(args);
        HashMap<String,Pair<String,String>> myMap = initializeHashMap();


        for (Statement child : model.statements) {
            List<Symbolable> childSymbolables = visit(child, cloneHashMap(myMap), cloneHashMap(fatherMap));

            if (childSymbolables != null) {
                addNewSymbolsToMap(myMap, childSymbolables);
                symbolables.addAll(childSymbolables);
            }
        }
        return listify(new Scope(model.getClass().getSimpleName(), "", symbolables));
    }

    public static List<Symbolable> visit(VariableDeclarationStatement model,Object ...args) {

        List<Symbolable> syms = new ArrayList<>();
        HashMap<String,Pair<String,String>> fatherMap = getMapFromArgs(args);
        HashMap<String,Pair<String,String>> grandMap = getGrandMapFromArgs(args);

        for (VariableDeclaration var : model.vars) {

            //defining array literal = array literal
            if(var.name instanceof ArrayLiteral variables && var.value instanceof ArrayLiteral values){

                //visit each array element as variable declaration
                for(int i = 0; i < variables.elements.size(); i++ ){

                    IdentifierExpression element = (IdentifierExpression) variables.elements.get(i).element;
                    Expression elementValue = values.elements.size() > i ? values.elements.get(i).element : new StringLiteral("ToBeDetermined");

                    String type = var.modifier.equals("const") ? "Constant" : "Variable";
                    VariableDeclaration declaration = new VariableDeclaration(var.modifier,element, elementValue, type);

                    ArrayList<VariableDeclaration> newVar = new ArrayList<VariableDeclaration>();
                    newVar.add(declaration);

                    VariableDeclarationStatement pair = new VariableDeclarationStatement(newVar, element.context);
                    List<Symbolable> childSymbolables = visit(pair, cloneHashMap(fatherMap), cloneHashMap(grandMap), getIsInComponentFromArgs(args));

                    addNewSymbolsToMap(fatherMap, childSymbolables);

                    syms.addAll(childSymbolables);
                }
                continue;
            }

            else {

                //array literal but value isn't array literal
                if (var.name instanceof ArrayLiteral variables){

                    if (!isaHook(var.value))
                        Error.jsError(model.context, var.value.toString() + " isn't of type ArrayLiteral");

                    //visit each variable in the array literal and save in symbol table
                    for (ArrayElement arrayElement : variables.elements){

                        IdentifierExpression element = (IdentifierExpression) arrayElement.element;
                        Expression elementValue = isaHook(var.value) ? new StringLiteral(var.value.toString()) : new StringLiteral("error");

                        String type = var.modifier.equals("const") ? "Constant" : "Variable";
                        VariableDeclaration declaration = new VariableDeclaration(var.modifier,element, elementValue, type);

                        ArrayList<VariableDeclaration> newVar = new ArrayList<VariableDeclaration>();
                        newVar.add(declaration);

                        VariableDeclarationStatement pair = new VariableDeclarationStatement(newVar, element.context);
                        List<Symbolable> childSymbolables = visit(pair, cloneHashMap(fatherMap), cloneHashMap(grandMap), getIsInComponentFromArgs(args));

                        addNewSymbolsToMap(fatherMap, childSymbolables);

                        syms.addAll(childSymbolables);
                    }
                }

                    //identifierExpression
                else if (var.name instanceof IdentifierExpression id){
                    if(fatherMap.containsKey(var.name.toString())) {
                        //already exists
                        Error.variableAlreadyDefined(
                                id.context,
                                var.name.toString()
                        );
                        continue;
                    }

                    //naming is good, lets check the value
                    String definitionType = var.modifier.equals("const")?Symbol.CONST:Symbol.VAR;

                    if (var.value instanceof ArrowFunction af ){
                        visit(af,cloneHashMap(fatherMap), cloneHashMap(grandMap), isComponent(id.name));
                    }
                    else{
                        visit(var.value,cloneHashMap(fatherMap), cloneHashMap(grandMap), getIsInComponentFromArgs(args));
                    }

                    syms.add(Symbol.make(definitionType, var.name.toString(), var.value));
                    fatherMap.put(var.name.toString(),new Pair<>(definitionType,var.value==null?"":var.value.toString()));
                }

            }

        }
        return syms;
    }

    public static List<Symbolable> visit(ConditionalStatement ConditionalStatement,Object ...args) {

        HashMap<String,Pair<String,String>> fatherMap = getMapFromArgs(args);
        HashMap<String,Pair<String,String>> grandMap = getGrandMapFromArgs(args);

        visit(ConditionalStatement.expressions, fatherMap, grandMap);

        List<Symbolable> condition = new ArrayList<>();

        List<Symbolable> f = visit(ConditionalStatement.statement, cloneHashMap(fatherMap), cloneHashMap(grandMap));
        Scope ifBlock = new Scope("if", "", f);
        condition.add(ifBlock);

        if (ConditionalStatement.elseStatement != null){
            List<Symbolable> e = visit(ConditionalStatement.elseStatement, cloneHashMap(fatherMap), cloneHashMap(grandMap));
            Scope elseBlock = new Scope("else", "", e);
            condition.add(elseBlock);
        }

        Scope ConditionalBlock = new Scope("ConditionalStatement", "", condition);
        return listify(ConditionalBlock);
    }

    public static List<Symbolable> visit(FunctionDeclaration functionDeclaration,Object ...args) {

        List<Symbolable> symbolables = new ArrayList<>();

        HashMap<String,Pair<String,String>> fatherMap = getMapFromArgs(args);
        HashMap<String,Pair<String,String>> myMap = initializeHashMap();

        if (fatherMap.containsKey(functionDeclaration.Identifier) && fatherMap.get(functionDeclaration.Identifier).a.equals("Function")){
            Error.jsError(functionDeclaration.context, "there is already a function with the same name: " + functionDeclaration.Identifier);
        }
        //adding function parameters to the symbol table
        for (Pair<Assignable, Expression> parameter : functionDeclaration.parameters.values) {
            Symbol paramSymbol = (Symbol) Symbol.make(Symbol.PARAM, parameter.a.toString(), parameter.b != null ? parameter.b : "ToBeDetermined");
            symbolables.add(paramSymbol);
            myMap.put(paramSymbol.name, new Pair<>(paramSymbol.type, "ToBeDetermined"));

        }
        //same wtih spread parameter
        Expression spreadParameter = functionDeclaration.parameters.spreadParameter;
        if (spreadParameter != null) {
            Symbol paramSymbol = (Symbol) Symbol.make(Symbol.PARAM, "spreadParameter", spreadParameter);
            symbolables.add(paramSymbol);
        }

        //adding symbols of the function body to symbol table
        for (Statement statement : functionDeclaration.body) {
            List<Symbolable> childSymbolables = visit(statement, cloneHashMap(myMap), cloneHashMap(fatherMap), isComponent(functionDeclaration));

            addNewSymbolsToMap(myMap, childSymbolables);

            symbolables.addAll(childSymbolables);
        }

        Scope funcScope = new Scope(Scope.MTHD, functionDeclaration.Identifier, symbolables);

        return listify(funcScope);

    }

    public static List<Symbolable> visit(AnonymousFunction functionDeclaration,Object ...args) {
        List<Symbolable> symbolables = new ArrayList<>();
        HashMap<String,Pair<String,String>> fatherMap = getMapFromArgs(args);
        HashMap<String,Pair<String,String>> myMap = initializeHashMap();

        for (Pair<Assignable, Expression> parameter : functionDeclaration.parameters.values) {
            Symbol paramSymbol = (Symbol) Symbol.make(Symbol.PARAM, parameter.a.toString(), parameter.b != null ? parameter.b : "ToBeDetermined");
            symbolables.add(paramSymbol);
            myMap.put(paramSymbol.name, new Pair<>(paramSymbol.type, "ToBeDetermined"));
        }
        Expression spreadParameter = functionDeclaration.parameters.spreadParameter;
        if (spreadParameter != null) {
            symbolables.add(Symbol.make(Symbol.PARAM, "spreadParameter", spreadParameter));
        }

        for (Statement statement : functionDeclaration.body) {
            List<Symbolable> childSymbolables = visit(statement, cloneHashMap(myMap), cloneHashMap(fatherMap), getIsInComponentFromArgs(args));

            addNewSymbolsToMap(myMap, childSymbolables);

            symbolables.addAll(childSymbolables);
        }
        Scope funcScope = new Scope(Scope.MTHD, "", symbolables);

        return listify(funcScope);

    }

    public static List<Symbolable> visit(ArrowFunction functionDeclaration,Object ...args) {
        List<Symbolable> symbolables = new ArrayList<>();
        HashMap<String,Pair<String,String>> fatherMap = getMapFromArgs(args);
        HashMap<String,Pair<String,String>> myMap = initializeHashMap();

        for (Pair<Assignable, Expression> parameter : functionDeclaration.parameters.values) {
            Symbol paramSymbol = (Symbol) Symbol.make(Symbol.PARAM, parameter.a.toString(), parameter.b != null ? parameter.b : "ToBeDetermined");
            symbolables.add(paramSymbol);
            myMap.put(paramSymbol.name, new Pair<>(paramSymbol.type, "ToBeDetermined"));
        }

        Expression spreadParameter = functionDeclaration.parameters.spreadParameter;
        if (spreadParameter != null) {
            symbolables.add(Symbol.make(Symbol.PARAM, "spreadParameter", spreadParameter));
        }

        for (Statement statement : functionDeclaration.body) {
            List<Symbolable> childSymbolables = visit(statement, cloneHashMap(myMap), cloneHashMap(fatherMap), getIsInComponentFromArgs(args));

            addNewSymbolsToMap(myMap, childSymbolables);

            symbolables.addAll(childSymbolables);
        }
        Scope funcScope = new Scope(Scope.MTHD, "", symbolables);

        return listify(funcScope);

    }

    public static List<Symbolable> visit(ArrayLiteral ar,Object ...args) {
        List<Symbolable> symbArray = new ArrayList<>();
        HashMap<String,Pair<String,String>> fatherMap = getMapFromArgs(args);
        for (ArrayElement ae : ar.elements) {
            visit(ae.element,cloneHashMap(fatherMap));
            symbArray.add(Symbol.make("ArrayElement", "", ae));
        }
        return symbArray;
    }

    public static List<Symbolable> visit(ExpressionChunk e, Object ...args) {
        visit(e.expressions,getMapFromArgs(args), getGrandMapFromArgs(args), getIsInComponentFromArgs(args));
        return new ArrayList<>();
    }

    public static List<Symbolable> visit(ExpressionSequence e, Object ...args) {
        for (Expression exp : e.list) {
            if (exp instanceof AssignmentExpression ae) {
                visit(ae,cloneHashMap(getMapFromArgs(args)), cloneHashMap(getGrandMapFromArgs(args)), getIsInComponentFromArgs(args));
            }
            if (exp instanceof RelationalExpression re){
                visit(re.leftExpression ,cloneHashMap(getMapFromArgs(args)), cloneHashMap(getGrandMapFromArgs(args)), getIsInComponentFromArgs(args));
                visit(re.rightExpression ,cloneHashMap(getMapFromArgs(args)), cloneHashMap(getGrandMapFromArgs(args)), getIsInComponentFromArgs(args));
            }
            if (exp instanceof UseStateFunction us){
                visit(us,cloneHashMap(getMapFromArgs(args)), cloneHashMap(getGrandMapFromArgs(args)), getIsInComponentFromArgs(args));
            }
            if (exp instanceof UseEffectFunction ue){
                visit(ue,cloneHashMap(getMapFromArgs(args)), cloneHashMap(getGrandMapFromArgs(args)), getIsInComponentFromArgs(args));
            }
            if (exp instanceof UseRefFunction ur){
                visit(ur,cloneHashMap(getMapFromArgs(args)), cloneHashMap(getGrandMapFromArgs(args)), getIsInComponentFromArgs(args));
            }
        }
        return new ArrayList<>();
    }

    public static List<Symbolable> visit(Expression e,Object ...args) {
        HashMap<String,Pair<String,String>> fatherMap = cloneHashMap(getMapFromArgs(args));
        HashMap<String,Pair<String,String>> grandMap = cloneHashMap(getGrandMapFromArgs(args));

        if(e instanceof VariableDeclarationStatement vds){
            return visit(vds,fatherMap, grandMap, getIsInComponentFromArgs(args));
        }
        if(e instanceof IdentifierExpression ie){
            return visit(ie,fatherMap, grandMap, getIsInComponentFromArgs(args));
        }
        if (e instanceof ArrowFunction af){
            return visit(af, fatherMap, grandMap, getIsInComponentFromArgs(args));
        }
        if (e instanceof AnonymousFunction af){
            return visit(af, fatherMap, grandMap, getIsInComponentFromArgs(args));
        }
        if (e instanceof MathmaticalExpression me){
            visit(me.firstExpression, fatherMap, grandMap, getIsInComponentFromArgs(args));
            return visit(me.secondExpression, fatherMap, grandMap, getIsInComponentFromArgs(args));
        }
        if (e instanceof UseStateFunction us){
            if (!getIsInComponentFromArgs(args))
                Error.hookError(us.context, us.toString());
        }
        if (e instanceof UseEffectFunction ue){
            if (!getIsInComponentFromArgs(args))
                Error.hookError(ue.context, ue.toString());
        }
        if (e instanceof UseRefFunction ur){
            if (!getIsInComponentFromArgs(args))
                Error.hookError(ur.context, ur.toString());
        }
        return new ArrayList<>();
    }

    public static List<Symbolable> visit(IdentifierExpression e, Object ...args) {
        HashMap<String,Pair<String,String>> mergedMap = getMapFromArgs(args);
        mergedMap.putAll(getGrandMapFromArgs(args));
        if(!mergedMap.containsKey(e.name)){
            Error.variableUnDefined(e.context,e.name);
        }
//        visit(e.expressions,getMapFromArgs(args));
        return new ArrayList<>();
    }

    public static List<Symbolable> visit(AssignmentExpression e, Object ...args) {

        HashMap<String,Pair<String,String>> fatherMap = getMapFromArgs(args);
        HashMap<String,Pair<String,String>> grandMap = getGrandMapFromArgs(args);

        HashMap<String,Pair<String,String>> mergedMap = cloneHashMap(grandMap);
        mergedMap.putAll(fatherMap);


        //checking the left expression for errors
        visit(e.leftExpression, fatherMap, grandMap, getIsInComponentFromArgs(args));
        if (e.leftExpression instanceof IdentifierExpression id && mergedMap.get(id.name) != null && mergedMap.get(id.name).a.equals("Constant")){
            Error.jsError(e.context, "Trying to assign value to a constant: " + id.name +".");
        }

        //checking the right expression for errors
        visit(e.rightExpression, fatherMap, grandMap, getIsInComponentFromArgs(args));

        return new ArrayList<>();
    }

    public static List<Symbolable> visit(TryStatement ts,Object ...args) {
        List<Symbolable> symbArray = new ArrayList<>();
        Scope block = (Scope) visit(ts.block).get(0);
        block.type = "tryBlock";
        symbArray.add(block);
        Scope catchBlock;
        if (ts.catchProduction != null) {
            catchBlock = (Scope) visit(ts.catchProduction).get(0);
            symbArray.add(catchBlock);
        }
        Scope finBlock;
        if (ts.finallyProduction != null) {
            finBlock = (Scope) visit(ts.finallyProduction).get(0);
            symbArray.add(finBlock);
        }
        return symbArray;
    }

    public static List<Symbolable> visit(CatchProduction cp,Object ...args) {

        Scope block = (Scope) visit(cp.block).get(0);
        block.type = "catchBlock";
        block.symbolables.add(cp.exception);
        return listify(block);
    }

    public static List<Symbolable> visit(FinallyProduction fp,Object ...args) {

        Scope block = (Scope) visit(fp.block).get(0);
        block.type = "finallyBlock";
        return listify(block);
    }

    public static List<Symbolable> visit(ClassDeclaration classDeclaration,Object ...args) {
        ArrayList<Symbolable> symbArray = new ArrayList();
        Scope classBlock;
        for (ClassElement element : classDeclaration.elements) {
            symbArray.addAll(visit(element));
        }
        classBlock = new Scope("class", classDeclaration.id, symbArray);
        return listify(classBlock);
    }

    public static List<Symbolable> visit(ClassElement classElement,Object ...args) {
        if (classElement instanceof ClassFieldDefinition) {
            return visit((ClassFieldDefinition) classElement);
        } else if (classElement instanceof ClassMethodDefinition) {
            return visit((ClassMethodDefinition) classElement);
        } else {
//            System.out.println("found null in symbol table visitor , ClassElement");
            return new ArrayList<>();
        }
    }

    public static List<Symbolable> visit(ClassFieldDefinition classFieldDefinition,Object ...args) {
        Symbolable field = Symbol.make(Symbol.ATRIB, classFieldDefinition.propertyName.toString(), classFieldDefinition.propertyValue != null ? classFieldDefinition.propertyValue : null);
        return listify(field);
    }

    public static List<Symbolable> visit(ObjectLiteral ol,Object ...args) {
        List<Symbolable> symbArray = new ArrayList<>();
        for (Property p : ol.objectProperties) {
            symbArray.addAll(visit(p));
        }
        return symbArray;
    }

    public static List<Symbolable> visit(Property p,Object ...args) {

        if (p instanceof NormalProperty) return visit((NormalProperty) p);

        if (p instanceof ComputedProperty) return visit((ComputedProperty) p);

        if (p instanceof FunctionProperty) return visit((FunctionProperty) p);

        return visit((EllipsisProperty) p);
    }

    public static List<Symbolable> visit(NormalProperty np,Object ...args) {
        Symbolable symb;
        PropertyName prop = np.key;
        if (prop instanceof PropertyByName) {
            symb = Symbol.make(Symbol.PROP, ((PropertyByName) prop).id, np.value);
        } else if (prop instanceof PropertyByExpression) {
            symb = Symbol.make(Symbol.PROP, ((PropertyByExpression) prop).value.toString(), np.value);
        } else//propertyByString
        {
            symb = Symbol.make(Symbol.PROP, "\"" + ((PropertyByString) prop).value + "\"", np.value);
        }

        return listify(symb);
    }

    public static List<Symbolable> visit(ComputedProperty np,Object ...args) {
        Symbolable symb = Symbol.make(Symbol.PROP, np.key.toString(), np.value);
        return listify(symb);
    }

    public static List<Symbolable> visit(FunctionProperty functionProperty,Object ...args) {
        List<Symbolable> symbolables = new ArrayList<>();
        //add parameters
        for (Assignable name : functionProperty.parameters.keySet()) {
            Expression value = functionProperty.parameters.get(name);
            symbolables.add(Symbol.make(Symbol.PARAM, name.toString(), value));
        }
        //spread parameter
        symbolables.add(Symbol.make("Spread Param", "", functionProperty.spreadParameter));
        //visit the body
        for (Statement s : functionProperty.bodyStatements) {
            symbolables.addAll(visit(s));
        }
        return listify(new Scope("Function", "", symbolables));
    }

    public static List<Symbolable> visit(EllipsisProperty ellipsisProperty,Object ...args) {
        if (ellipsisProperty.value instanceof ObjectLiteral) {
            return visit((ObjectLiteral) ellipsisProperty.value);
        } else if (ellipsisProperty.value instanceof IdentifierExpression) {
            Symbolable symbolable = Symbol.make("EllipsisProperty", ((IdentifierExpression) ellipsisProperty.value).name, "Calculated in runtime");
            return listify(symbolable);
        } else {
//            System.out.println("In EllipsisProperty visit, found unknown type");
            return new ArrayList<>();
        }
    }

    public static List<Symbolable> visit(ClassMethodDefinition classMethodDefinition,Object ...args) {
        List<Symbolable> symbolables = new ArrayList<>();
        for (Pair<Assignable, Expression> parameter : classMethodDefinition.parameters.values) {
            symbolables.add(Symbol.make(Symbol.PARAM, parameter.a.toString(), parameter.b != null ? parameter.b : null));
        }
        for (Statement statement : classMethodDefinition.body) {
            symbolables.addAll(visit(statement));
        }
        Scope methodScope = new Scope(Scope.MTHD, classMethodDefinition.propertyName.toString(), symbolables);
        return listify(methodScope);
    }

    public static List<Symbolable> visit(ForLoop loop,Object ...args) {
        List<Symbolable> symbolables = new ArrayList<>();
        HashMap<String, Pair<String, String>> myMap = initializeHashMap();

        List<Symbolable> childSymbolables = visit(loop.firstPart, cloneHashMap(getMapFromArgs(args)));
        addNewSymbolsToMap(myMap, childSymbolables);
        symbolables.addAll(childSymbolables);
        symbolables.addAll(visit(loop.statement, cloneHashMap(myMap), cloneHashMap(getMapFromArgs(args))));
        return listify(new Scope("ForLoop", "", symbolables));
    }

    public static List<Symbolable> visit(ForInLoop forInLoop,Object ...args) {
        List<Symbolable> symbolables = new ArrayList<>();
        symbolables.addAll(visit(forInLoop.firstPart));
        symbolables.addAll(visit(forInLoop.statement));
        return listify(new Scope("ForInLoop", "", symbolables));
    }

    public static List<Symbolable> visit(ForOfLoop forInLoop,Object ...args) {
        List<Symbolable> symbolables = new ArrayList<>();
        symbolables.addAll(visit(forInLoop.firstPart));
        symbolables.addAll(visit(forInLoop.statement));
        return listify(new Scope("ForOfLoop", "", symbolables));
    }

    public static List<Symbolable> visit(WhileLoop forInLoop,Object ...args) {
        List<Symbolable> symbolables = new ArrayList<>();
        symbolables.addAll(visit(forInLoop.statement));
        return listify(new Scope("WhileLoop", "", symbolables));
    }

    public static List<Symbolable> visit(DoWhileLoop forInLoop,Object ...args) {
        List<Symbolable> symbolables = new ArrayList<>();
        symbolables.addAll(visit(forInLoop.statement));
        return listify(new Scope("DoWhileLoop", "", symbolables));
    }





    private static HashMap<String,Pair<String,String>> initializeHashMap(){
        return new HashMap<>();
    }

    private static HashMap<String,Pair<String,String>> cloneHashMap(HashMap<String,Pair<String,String>> map){
        return new HashMap<>(map);
    }

    private static HashMap<String,Pair<String,String>> getMapFromArgs(Object[] args){
        if(args.length>=1){
            return (HashMap<String,Pair<String,String>>) args[0];
        }
        return new HashMap<>();
    }

    private static HashMap<String,Pair<String,String>> getGrandMapFromArgs(Object[] args){
        if(args.length>=2){
            return (HashMap<String,Pair<String,String>>) args[1];
        }
        return new HashMap<>();
    }

    private static void addNewSymbolsToMap(HashMap<String,Pair<String,String>> map, List<Symbolable> childSymbolables){

        for (Symbolable symbolable : childSymbolables) {
            if (symbolable instanceof Symbol){
                Symbol symbol = (Symbol) symbolable;
                map.put(symbol.name,new Pair(symbol.type,symbol.value));
            }
            else if (symbolable instanceof Scope sp){
                Scope scope = (Scope) symbolable;
                map.put(scope.name,new Pair(scope.type, "Block"));
            }
        }
    }

    private static boolean getIsInComponentFromArgs(Object[] args){
        return args.length >= 3 && (boolean) args[2];
    }

    private static boolean isComponent(Function function, Object ...args){
        if (function instanceof FunctionDeclaration)
            return isComponent(((FunctionDeclaration) function).Identifier);
        else
            return getIsInComponentFromArgs(args);
    }

    private static boolean isComponent(String name){
        return Character.isUpperCase(name.charAt(0));
    }

    private static boolean isaHook(Expression hook){
        return hook instanceof UseStateFunction || hook instanceof UseEffectFunction || hook instanceof UseRefFunction;
    }

    public static List<Symbolable> listify(Symbolable s,Object ...args) {
        ArrayList symbArray = new ArrayList<>();
        symbArray.add(s);
        return symbArray;
    }
}
