package js.Block;

import js.Statement;

import java.util.ArrayList;
import java.util.List;

public class BlockModel extends Statement{
    List<Statement> statements;

    public BlockModel() {
        this.statements = new ArrayList<>();
    }

    public void addStatement(Statement statement) {
        statements.add(statement);
    }

    @Override
    public String toString() {
        return "block{" + "statements=" + statements + '}';
    }
}
