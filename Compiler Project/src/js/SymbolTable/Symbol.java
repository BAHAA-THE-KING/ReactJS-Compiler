package js.SymbolTable;

import js.expressions.Function.AnonymousFunction;
import js.visitors.models.ObjectLiteral;
import program.SymbolTableVisitor;

public class Symbol implements Symbolable{
    public String type; // variable , property , parameter
    public String name,value;
    public static final String VAR="Variable" , ATRIB= "Attribute" , PARAM = "Parameter";
    public Symbol(String type, String name, String value) {
        this.type = type;
        this.name = name;
        this.value = value;
    }
    public static Symbolable make(String type, String name, Object value){
        if(value instanceof AnonymousFunction) {
            AnonymousFunction function = (AnonymousFunction) value;
            return new Scope(
                    "AnonymousFunction",
                    name,
                    SymbolTableVisitor.visit(function)
            );
        }
        if(value instanceof ObjectLiteral){
            ObjectLiteral literal = (ObjectLiteral) value;
            return new Scope(
                    "ObjectLiteral",
                    name,
                    SymbolTableVisitor.visit(literal)
            );
        }else {
            return new Symbol(
                    type,
                    name,
                    value!=null?value.toString():null
            );
        }
    }
}
