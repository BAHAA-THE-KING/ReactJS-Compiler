package js.statements.VariableDeclarationStatement;

import js.visitors.models.Assignable;
import js.visitors.models.Expression;

public class VariableDeclaration {
    Assignable name;
    Expression value;
    String type;

    public VariableDeclaration(Assignable name, Expression value, String type) {
        this.name = name;
        this.value = value;
        this.type = type;
    }

    @Override
    public String toString() {
        return "VariableDeclaration{" + "name=" + name + ", value=" + value + '}';
    }
}
