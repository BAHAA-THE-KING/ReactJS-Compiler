package js.statements.TryStatement;

import js.statements.Block.BlockModel;
import js.visitors.models.Statement;

public class FinallyProduction implements Statement {

    BlockModel block;

    public FinallyProduction(BlockModel block) {
        this.block = block;
    }

    @Override
    public String toString() {
        return "{block=" + block +
                '}';
    }
}
