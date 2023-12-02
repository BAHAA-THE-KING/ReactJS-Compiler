package js.statements.VariableDeclarationStatement;

import js.visitors.models.Statement;

import java.util.List;

public class VariableDeclarationStatement implements Statement {
    String modifier;
    List<VariableDeclaration> vars;

    public VariableDeclarationStatement(String modifier, List<VariableDeclaration> vars) {
        this.modifier = modifier;
        this.vars = vars;
    }

    @Override
    public String toString() {
        return "VariableDeclarationStatement{" + "modifier='" + modifier + '\'' + ", vars=" + vars + '}';
    }
}
