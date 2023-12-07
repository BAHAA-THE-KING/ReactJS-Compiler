package js.statements.TryStatement;

import js.statements.Block.BlockModel;
import js.visitors.models.Statement;

public class FinallyProduction implements Statement {

    public BlockModel block;

    public FinallyProduction(BlockModel block) {
        this.block = block;
    }
}
