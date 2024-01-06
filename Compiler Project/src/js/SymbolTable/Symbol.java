package js.SymbolTable;

import js.expressions.ArrayLiteral.ArrayElement;
import js.expressions.ArrayLiteral.ArrayLiteral;
import js.expressions.Function.AnonymousFunction;
import js.expressions.Literals.ObjectLiteral;
import program.SymbolTableVisitor;

public class Symbol implements Symbolable{
    public String type; // variable , property , parameter
    public String name;
    public Object value;
    public static final String VAR="Variable" , ATRIB= "Attribute" , PARAM = "Parameter";
    public Symbol(String type, String name, String value) {
        this.type = type;
        this.name = name;
        this.value = value;
    }
    public static Symbolable make(String type, String name, Object value){

        if(value instanceof ArrayLiteral){
            ArrayLiteral al = (ArrayLiteral) value;
            return new Scope(
                    al.getClass().getSimpleName(),
                    name,
                    SymbolTableVisitor.visit(al)
            );
        }

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
        }
        if(value instanceof ArrayElement){
            ArrayElement al = (ArrayElement) value;
            return (Symbol.make("ArrayElement", "", al.element));
        }
        if(value instanceof Scope){
            return (Scope)value;
        }
        return new Symbol(
                type,
                name,
                value!=null?value.toString():null
        );
    }
}
