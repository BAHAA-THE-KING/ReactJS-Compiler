package program;

import js.SymbolTable.Scope;
import js.SymbolTable.Symbol;
import js.SymbolTable.Symbolable;
import js.expressions.ExpressionSequence;
import js.expressions.Function.AnonymousFunction;
import js.expressions.Function.ArrowFunction;
import js.statements.Block.BlockModel;
import js.statements.ClassDeclaration.ClassDeclaration;
import js.statements.ClassDeclaration.ClassFieldDefinition;
import js.statements.ClassDeclaration.ClassMethodDefinition;
import js.statements.Function.FunctionDeclaration;
import js.statements.Loops.DoWhileLoop;
import js.statements.Loops.ForInLoop;
import js.statements.Loops.ForOfLoop;
import js.statements.Loops.WhileLoop;
import js.statements.Loops.ForLoop;
import js.statements.ConditionalStatement.ConditionalStatement;
import js.statements.TryStatement.CatchProduction;
import js.statements.TryStatement.FinallyProduction;
import js.statements.TryStatement.TryStatement;
import js.statements.VariableDeclarationStatement.VariableDeclaration;
import js.statements.VariableDeclarationStatement.VariableDeclarationStatement;
import js.visitors.models.*;
import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;
import java.util.List;

public class SymbolTableVisitor {
    public static List<Symbolable> visit(Statement model){
        if(model instanceof VariableDeclarationStatement){
            return visit((VariableDeclarationStatement)model);
        }
        if(model instanceof TryStatement){
            return visit((TryStatement) model);
        }
        return new ArrayList<>();
    }

    public static Symbolable visit(JsProgram prog){
        List<Symbolable> symbolables = new ArrayList<>();
        for (Statement st : prog.statements){
            if(st != null) {
                symbolables.addAll(visit(st));
            }
        }
        return new Scope(prog.getClass().getSimpleName(), "", symbolables);
    }
    public static List<Symbolable> visit(BlockModel model){
        List<Symbolable> symbolables =new ArrayList<>();
        for(Statement child:model.statements){
            List<Symbolable> s= visit(child);
            if(s!=null){
                symbolables.addAll(s);
            }
        }
        return listify(new Scope(model.getClass().getSimpleName(),"", symbolables));
    }

    public static List<Symbolable> visit(VariableDeclarationStatement model){
        List<Symbolable> syms = new ArrayList<>();
        for (VariableDeclaration var : model.vars) {
            syms.add(new Symbol(
                    Symbol.VAR,
                    var.name.toString(),
                    var.value!=null?var.value.toString():null
            ));
        }
        return syms;
    }

    public static List<Symbolable> visit(TryStatement ts){

        List<Symbolable> symbArray = new ArrayList<>();

        Scope block = (Scope) visit(ts.block).get(0);
        block.type = "tryBlock";
        symbArray.add(block);

        Scope catchBlock;
        if(ts.catchProduction != null) {
            catchBlock = (Scope) visit(ts.catchProduction).get(0);
            symbArray.add(catchBlock);
        }
        Scope finBlock;
        if(ts.finallyProduction != null) {
            finBlock = (Scope) visit(ts.finallyProduction).get(0);
            symbArray.add(finBlock);
        }
        return symbArray;
    }

    public static List<Symbolable> visit(CatchProduction cp){

        Scope block = (Scope) visit(cp.block).get(0);
        block.type = "catchBlock";
        block.symbolables.add(cp.exception);
        return listify(block);
    }

    public static List<Symbolable> visit(FinallyProduction fp){

        Scope block = (Scope) visit(fp.block).get(0);
        block.type = "finallyBlock";
        return listify(block);
    }

    public static List<Symbolable> listify(Symbolable s){
        ArrayList symbArray = new ArrayList<>();
        symbArray.add(s);
        return symbArray;
    }

    public static List<Symbolable> visit(ConditionalStatement ConditionalStatement){
        ArrayList<Symbolable> symArray = new ArrayList<>();
        //Todo: ExpressionSequence visit
        List<Symbolable>f = visit(ConditionalStatement.statement);
        Scope ifBlock = new Scope("if","",f);

        List<Symbolable>e = visit(ConditionalStatement.elseStatement);
        Scope elseBlock = new Scope("else","",e);
        List<Symbolable> condition = new ArrayList<>();
        condition.add(ifBlock);
        condition.add(elseBlock);
        Scope ConditionalBlock = new Scope("ConditionalStatement","",condition);
        return listify(ConditionalBlock);
    }

    public static List<Symbolable> visit(ClassDeclaration classDeclaration){
        ArrayList <Symbolable> symbArray =new ArrayList();
        Scope classBlock ;
        for(ClassElement element : classDeclaration.elements){
            symbArray.addAll(visit(element));
        }
        classBlock = new Scope("class" , classDeclaration.id , symbArray);
        return listify(classBlock);
    }
    public static List<Symbolable> visit(ClassElement classElement){
        if (classElement instanceof ClassFieldDefinition){
            return visit((ClassFieldDefinition) classElement);
        }else {
            return visit((ClassMethodDefinition) classElement);
        }
    }

    public static List<Symbolable> visit(ClassFieldDefinition classFieldDefinition){
        Symbol field = new Symbol(Symbol.ATRIB ,
                classFieldDefinition.propertyName.toString() ,
                classFieldDefinition.propertyValue!=null?classFieldDefinition.propertyValue.toString():null
        );
        return listify(field);
    }

    public static List<Symbolable> visit (ClassMethodDefinition classMethodDefinition){
        List<Symbolable> symbolables = new ArrayList<>();
        for (Pair<Assignable, Expression> parameter: classMethodDefinition.parameters.values ){
            symbolables.add(new Symbol(Symbol.PARAM , parameter.a.toString() , parameter.b != null ? parameter.b.toString(): null));
        }
        //Todo:visit Ellipsis parameter
        for (Statement statement : classMethodDefinition.body){
            symbolables.addAll(visit(statement));
         }
        Scope methodScope = new Scope( Scope.MTHD, classMethodDefinition.propertyName.toString() ,  symbolables);
        return listify(methodScope);
    }

    public static List<Symbolable> visit (ForLoop loop){
        List<Symbolable> symbolables = new ArrayList<>();
        symbolables.addAll(visit(loop.firstPart));
        symbolables.addAll(visit(loop.statement));
        return listify(new Scope("ForLoop","",symbolables));
    }
    public static List<Symbolable> visit (ForInLoop forInLoop){
        List<Symbolable> symbolables = new ArrayList<>();
        symbolables.addAll(visit(forInLoop.firstPart));
        symbolables.addAll(visit(forInLoop.statement));
        return listify(new Scope("ForInLoop" , "" , symbolables));
    }

    public static List<Symbolable> visit (ForOfLoop forInLoop){
        List<Symbolable> symbolables = new ArrayList<>();
        symbolables.addAll(visit(forInLoop.firstPart));
        symbolables.addAll(visit(forInLoop.statement));
        return listify(new Scope("ForOfLoop" , "" , symbolables));
    }

    public static List<Symbolable> visit (WhileLoop forInLoop){
        List<Symbolable> symbolables = new ArrayList<>();
        symbolables.addAll(visit(forInLoop.statement));
        return listify(new Scope("WhileLoop" , "" , symbolables));
    }

    public static List<Symbolable> visit (DoWhileLoop forInLoop){
        List<Symbolable> symbolables = new ArrayList<>();
        symbolables.addAll(visit(forInLoop.statement));
        return listify(new Scope("DoWhileLoop" , "" , symbolables));
    }
    public static List<Symbolable> visit (FunctionDeclaration functionDeclaration) {
        List<Symbolable> symbolables = new ArrayList<>();
        for (Pair<Assignable, Expression> parameter : functionDeclaration.parameters.values) {
            symbolables.add(new Symbol(Symbol.PARAM, parameter.a.toString(), parameter.b != null ? parameter.b.toString() : null));
        }
        Expression spreadParameter=functionDeclaration.parameters.spreadParameter;
        symbolables.add(new Symbol(Symbol.PARAM,"spreadParameter",spreadParameter != null ? spreadParameter.toString():null));

        for (Statement statement : functionDeclaration.body) {
            symbolables.addAll(visit(statement));
        }
        Scope funcScope = new Scope(Scope.MTHD, functionDeclaration.Identifier.toString(), symbolables);

        return listify(funcScope);

    }
    public static List<Symbolable> visit (AnonymousFunction functionDeclaration) {
        List<Symbolable> symbolables = new ArrayList<>();
        for (Pair<Assignable, Expression> parameter : functionDeclaration.parameters.values) {
            symbolables.add(new Symbol(Symbol.PARAM, parameter.a.toString(), parameter.b != null ? parameter.b.toString() : null));
        }
        Expression spreadParameter=functionDeclaration.parameters.spreadParameter;
        symbolables.add(new Symbol(Symbol.PARAM,"spreadParameter",spreadParameter != null ? spreadParameter.toString():null));

        for (Statement statement : functionDeclaration.body) {
            symbolables.addAll(visit(statement));
        }
        Scope funcScope = new Scope(Scope.MTHD, "", symbolables);

        return listify(funcScope);

    }
    public static List<Symbolable> visit (ArrowFunction functionDeclaration) {
        List<Symbolable> symbolables = new ArrayList<>();
        for (Pair<Assignable, Expression> parameter : functionDeclaration.parameters.values) {
            symbolables.add(new Symbol(Symbol.PARAM, parameter.a.toString(), parameter.b != null ? parameter.b.toString() : null));
        }
      Expression spreadParameter=functionDeclaration.parameters.spreadParameter;
        symbolables.add(new Symbol(Symbol.PARAM,"spreadParameter",spreadParameter != null ? spreadParameter.toString():null));

        for (Statement statement : functionDeclaration.body) {
            symbolables.addAll(visit(statement));
        }
        Scope funcScope = new Scope(Scope.MTHD, "", symbolables);

        return listify(funcScope);

    }
}
