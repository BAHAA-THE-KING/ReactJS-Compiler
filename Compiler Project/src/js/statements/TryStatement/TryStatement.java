package js.statements.TryStatement;

import js.statements.Block.BlockModel;
import js.visitors.models.Statement;

public class TryStatement implements Statement {

    public BlockModel block;
    public CatchProduction catchProduction;
    public FinallyProduction finallyProduction;

    public TryStatement(BlockModel block, CatchProduction catchProduction, FinallyProduction finallyProduction) {
        this.block = block;
        this.catchProduction = catchProduction;
        this.finallyProduction = finallyProduction;
    }
}
