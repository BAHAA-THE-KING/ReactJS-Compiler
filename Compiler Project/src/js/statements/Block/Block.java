package js.statements.Block;

import js.visitors.models.Statement;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Block implements Statement {
    public List<Statement> statements;

    public Block() {
        this.statements = new ArrayList<>();
    }

    public void addStatement(Statement statement) {
        statements.add(statement);
    }

    @Override
    public String toString() {
        StringJoiner statementsJoiner = new StringJoiner(";\\n");
        statements.forEach(stmt -> statementsJoiner.add(stmt.toString()));
        return "{\\n" + statementsJoiner + "\\n}";
    }
}
