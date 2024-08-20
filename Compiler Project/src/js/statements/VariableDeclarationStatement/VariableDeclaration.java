package js.statements.VariableDeclarationStatement;

import js.expressions.Function.AnonymousFunction;
import js.visitors.models.Assignable;
import js.visitors.models.Expression;
import program.CodeGeneration;

public class VariableDeclaration {
    public String modifier;
    public Assignable name;
    public Expression value;
    public String type;

    public VariableDeclaration(String modifier, Assignable name, Expression value, String type) {
        this.modifier = modifier;
        this.name = name;
        this.value = value;
        this.type = type;
    }

    @Override
    public String toString() {
        if (value instanceof AnonymousFunction && name.toString().toUpperCase().charAt(0) == name.toString().charAt(0)) {
            return modifier + " " + name + " = " + CodeGeneration.FunctionToClass((AnonymousFunction) value);
        }
        return modifier + " " + name + " = " + value;
    }
}
