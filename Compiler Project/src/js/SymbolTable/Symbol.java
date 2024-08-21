package js.SymbolTable;

import js.expressions.ArrayLiteral.ArrayElement;
import js.expressions.ArrayLiteral.ArrayLiteral;
import js.expressions.Function.AnonymousFunction;
import js.expressions.Literals.ObjectLiteral;
import js.expressions.Literals.StringLiteral;
import program.SymbolTableVisitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Symbol implements Symbolable {
    public static final String VAR = "Variable", ATRIB = "Attribute", PARAM = "Parameter", PROP="Property", CONST = "Constant";
    public String type; // variable , property , parameter
    public String name;
    public Object value;

    public Symbol(String type, String name, String value) {
        this.type = type;
        this.name = name;
        this.value = value;
    }

    //for array destructor
    public static List<Symbolable> make(String type, Object name, Object value) {
        List<Symbolable> symbArray = new ArrayList<>();

        if (name instanceof ArrayLiteral) {
            int nsize = (((ArrayLiteral) name).elements).size();
            for (int i = 0; i < nsize; i++) {

                //TODO: if value is bool or num -> error
                if (value instanceof ArrayLiteral) {
                    int vsize = (((ArrayLiteral) value).elements).size();
                    if (nsize > vsize) {
                        List<ArrayElement> temp = Collections.nCopies(nsize - vsize, new ArrayElement(new StringLiteral("undefined")));
                        ((ArrayLiteral) value).elements.addAll(temp);
                    }
                    symbArray.add(Symbol.make(
                            Symbol.VAR,
                            (((ArrayLiteral) name).elements).get(i).element.toString(),
                            (((ArrayLiteral) value).elements).get(i)));
                } else if (value instanceof StringLiteral) {
                    int vsize = ((StringLiteral) value).value.length();
                    Object val = ((StringLiteral) value).value.charAt(i + 1);
                    if (i >= vsize - 2) {
                        val = "undefined";
                    }
                    symbArray.add(Symbol.make(
                            Symbol.VAR,
                            (((ArrayLiteral) name).elements).get(i).element.toString(),
                            val)
                    );
                } else {
                    symbArray.add(Symbol.make(
                            Symbol.VAR,
                            (((ArrayLiteral) name).elements).get(i).element.toString(),
                            value + "[" + i + "]")
                    );
                }
            }
        }
        return symbArray;
    }

    public static Symbolable make(String type, String name, Object value) {

        if (value instanceof ArrayLiteral al) {
            return new Scope(
                    al.getClass().getSimpleName(),
                    name,
                    SymbolTableVisitor.visit(al)
            );
        }

        if (value instanceof AnonymousFunction function) {
            return new Scope(
                    "AnonymousFunction",
                    name,
                    SymbolTableVisitor.visit(function, new HashMap<>(), new HashMap<>(), true)
            );
        }
        if (value instanceof ObjectLiteral literal) {
            return new Scope(
                    "ObjectLiteral",
                    name,
                    SymbolTableVisitor.visit(literal)
            );
        }
        if (value instanceof ArrayElement al) {
            return (Symbol.make(type, name, al.element));
        }
        if (value instanceof Scope) {
            return (Scope) value;
        }
        return new Symbol(
                type,
                name,
                value != null ? value.toString() : null
        );
    }
}
