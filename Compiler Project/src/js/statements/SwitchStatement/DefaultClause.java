package js.statements.SwitchStatement;

import js.visitors.models.Statement;

import java.util.List;
import java.util.StringJoiner;

public class DefaultClause extends SwitchChunk {


    public List<Statement> statements;

    public DefaultClause(List<Statement> statements) {
        this.statements = statements;
    }

    @Override
    public String toString() {
        StringJoiner statementJoiner = new StringJoiner(";\n");
        statements.forEach(stmt -> statementJoiner.add(stmt.toString()));
        return "default:\n" + statementJoiner;
    }
}
