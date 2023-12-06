package js.statements.TryStatement;

import js.statements.Block.BlockModel;
import js.visitors.models.Statement;

public class TryStatement implements Statement {

    BlockModel block;
    CatchProduction catchProduction;
    FinallyProduction finallyProduction;

    public TryStatement(BlockModel block, CatchProduction catchProduction, FinallyProduction finallyProduction) {
        this.block = block;
        this.catchProduction = catchProduction;
        this.finallyProduction = finallyProduction;
    }

    @Override
    public String toString() {
        return "TryStatement{" +
                "block=" + block +
                ", catchProduction=" + catchProduction +
                ", finallyProduction=" + finallyProduction +
                '}';
    }
}
