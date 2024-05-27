package js.statements.VariableDeclarationStatement;

import js.visitors.models.Statement;

import java.util.List;
import java.util.StringJoiner;

public class VariableDeclarationStatement implements Statement {
    public List<VariableDeclaration> vars;

    public VariableDeclarationStatement(List<VariableDeclaration> vars) {
        this.vars = vars;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(";\n");
        vars.forEach(variable -> joiner.add(variable.toString()));
        return joiner.toString();
    }
}
