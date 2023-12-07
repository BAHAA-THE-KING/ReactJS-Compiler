package js.statements.VariableDeclarationStatement;

import js.SymbolTable.Symbolable;
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
}
