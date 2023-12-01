package js.statements.VariableDeclarationStatement;

import js.visitors.models.Assignable;
import js.visitors.models.Expression;

public class VariableDeclaration {
    Assignable name;
    Expression value;

    public VariableDeclaration(Assignable name, Expression value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "VariableDeclaration{" + "name=" + name + ", value=" + value + '}';
    }
}
