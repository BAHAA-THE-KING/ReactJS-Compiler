package js.statements.VariableDeclarationStatement;

import js.visitors.models.Statement;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.List;
import java.util.StringJoiner;

public class VariableDeclarationStatement implements Statement {
    public List<VariableDeclaration> vars;
    public ParserRuleContext context;

    public VariableDeclarationStatement(List<VariableDeclaration> vars,ParserRuleContext context) {
        this.vars = vars;
        this.context = context;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(";\n");
        vars.forEach(variable -> joiner.add(variable.toString()));
        return joiner.toString();
    }
}
