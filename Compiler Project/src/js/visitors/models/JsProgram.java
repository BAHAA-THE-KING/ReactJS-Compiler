package js.visitors.models;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class JsProgram {
    public List<Statement> statements;

    public JsProgram() {
        this.statements = new ArrayList<>();
    }

    public void addStatement(Statement statement) {
        this.statements.add(statement);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(";\n");

        statements.forEach(stmt -> joiner.add(stmt == null ? "" : stmt.toString()));
        return joiner.toString();
    }
}
