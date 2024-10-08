package js.statements.TryStatement;

import js.statements.Block.Block;
import js.visitors.models.Statement;

public class TryStatement implements Statement {

    public Block block;
    public CatchProduction catchProduction;
    public FinallyProduction finallyProduction;

    public TryStatement(Block block, CatchProduction catchProduction, FinallyProduction finallyProduction) {
        this.block = block;
        this.catchProduction = catchProduction;
        this.finallyProduction = finallyProduction;
    }

    @Override
    public String toString() {
        return "try\n" + block + "\n" + catchProduction + "\n" + finallyProduction;
    }
}
