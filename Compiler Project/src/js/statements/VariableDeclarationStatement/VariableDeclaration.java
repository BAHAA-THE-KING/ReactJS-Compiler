package js.statements.VariableDeclarationStatement;

import js.visitors.models.Assignable;
import js.visitors.models.Expression;

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
        return modifier + " " + name + " = " + value;
    }
}
