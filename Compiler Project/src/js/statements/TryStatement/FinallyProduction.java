package js.statements.TryStatement;

import js.statements.Block.Block;
import js.visitors.models.Statement;

public class FinallyProduction implements Statement {

    public Block block;

    public FinallyProduction(Block block) {
        this.block = block;
    }

    @Override
    public String toString() {
        return "finally\n" + block;
    }
}
