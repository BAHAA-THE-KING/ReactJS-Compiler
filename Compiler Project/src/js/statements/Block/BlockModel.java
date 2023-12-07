package js.statements.Block;

import js.visitors.models.Statement;

import java.util.ArrayList;
import java.util.List;

public class BlockModel implements Statement {
    public List<Statement> statements;

    public BlockModel() {
        this.statements = new ArrayList<>();
    }

    public void addStatement(Statement statement) {
        statements.add(statement);
    }
}
