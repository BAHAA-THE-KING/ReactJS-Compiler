package js.statements.VariableDeclarationStatement;

import js.visitors.models.Statement;

import java.util.List;

public class VariableDeclarationStatement implements Statement {
    public List<VariableDeclaration> vars;

    public VariableDeclarationStatement(List<VariableDeclaration> vars) {
        this.vars = vars;
    }
}
