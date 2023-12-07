package js.statements.VariableDeclarationStatement;

import js.SymbolTable.Symbolable;
import js.visitors.models.Assignable;
import js.visitors.models.Expression;

public class VariableDeclaration  {
    public Assignable name;
    public Expression value;
    public String type;

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
