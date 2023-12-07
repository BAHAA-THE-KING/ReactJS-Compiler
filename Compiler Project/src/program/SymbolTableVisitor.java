package program;

import js.SymbolTable.Scope;
import js.SymbolTable.Symbol;
import js.statements.Block.BlockModel;
import js.statements.TryStatement.CatchProduction;
import js.statements.TryStatement.FinallyProduction;
import js.statements.TryStatement.TryStatement;
import js.statements.VariableDeclarationStatement.VariableDeclarationStatement;
import js.visitors.models.Assignable;
import js.visitors.models.JsProgram;
import js.visitors.models.Statement;

import java.util.ArrayList;
import java.util.List;

public class SymbolTableVisitor {
    public static List<Symbol> visit(Statement model){
        return visit((TryStatement) model);
    }

    public static Symbol visit(JsProgram prog){
        List<Symbol> symbols = new ArrayList<>();
        for (Statement st : prog.statements){
            if(st != null) {

                symbols.addAll(visit(st));
            }
        }

        return new Scope(prog.getClass().getSimpleName(), "", symbols);
    }
    public static List<Symbol> visit(BlockModel model){
        List<Symbol> symbols=new ArrayList<>();
        for(Statement child:model.statements){
            List<Symbol> s= visit(child);
            if(s!=null){
                symbols.addAll(s);
            }
        }
        return listify(new Scope(model.getClass().getSimpleName(),"",symbols));
    }

    public static List<Symbol> visit(VariableDeclarationStatement model){
        List<Symbol> symbols=new ArrayList<>();
//        for(Statement child:model.statements){
//            Symbol s= visit(child);
//            if(s!=null){
//                symbols.add(s);
//            }
//        }
//        return new Scope(model.getClass().getSimpleName(),"",symbols);
        return null;
    }

    public static List<Symbol> visit(TryStatement ts){

        List<Symbol> symbArray = new ArrayList<>();

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

    public static List<Symbol> visit(CatchProduction cp){

        Scope block = (Scope) visit(cp.block).get(0);
        block.type = "catchBlock";
        block.symbols.add(cp.exception);
        return listify(block);
    }

    public static List<Symbol> visit(FinallyProduction fp){

        Scope block = (Scope) visit(fp.block).get(0);
        block.type = "finallyBlock";
        return listify(block);
    }

    public static List<Symbol> listify(Symbol s){
        ArrayList symbArray = new ArrayList<>();
        symbArray.add(s);
        return symbArray;
    }
}
