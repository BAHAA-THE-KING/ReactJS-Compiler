package program;

import js.SymbolTable.Scope;
import js.SymbolTable.Symbol;
import js.statements.Block.BlockModel;
import js.statements.VariableDeclarationStatement.VariableDeclarationStatement;
import js.visitors.models.Statement;

import java.util.ArrayList;
import java.util.List;

public class SymbolTableVisitor {
    public static Symbol visit(Statement model){
        return null;
    }
    public static Symbol visit(BlockModel model){
        List<Symbol> symbols=new ArrayList<>();
        for(Statement child:model.statements){
            Symbol s= visit(child);
            if(s!=null){
                symbols.add(s);
            }
        }
        return new Scope(model.getClass().getSimpleName(),"",symbols);
    }
    public static Symbol visit(VariableDeclarationStatement model){
        List<Symbol> symbols=new ArrayList<>();
//        for(Statement child:model.statements){
//            Symbol s= visit(child);
//            if(s!=null){
//                symbols.add(s);
//            }
//        }
        return new Scope(model.getClass().getSimpleName(),"",symbols);
    }
}
