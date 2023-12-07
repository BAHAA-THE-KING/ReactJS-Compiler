package program;

import js.SymbolTable.Scope;
import js.SymbolTable.Symbol;
import js.SymbolTable.Symbolable;
import js.statements.Block.BlockModel;
import js.statements.TryStatement.CatchProduction;
import js.statements.TryStatement.FinallyProduction;
import js.statements.TryStatement.TryStatement;
import js.statements.VariableDeclarationStatement.VariableDeclaration;
import js.statements.VariableDeclarationStatement.VariableDeclarationStatement;
import js.visitors.models.JsProgram;
import js.visitors.models.Statement;

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
        return null;
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
                    var.value.toString()
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

//    public static List<Symbol> visit(ForLoop loop){
//
//
//    }
    public static List<Symbolable> listify(Symbolable s){
        ArrayList symbArray = new ArrayList<>();
        symbArray.add(s);
        return symbArray;
    }


}
