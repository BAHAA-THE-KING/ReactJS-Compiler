package js.statements.TryStatement;

import js.statements.Block.BlockModel;
import js.visitors.models.Assignable;
import js.visitors.models.Statement;

public class CatchProduction implements Statement {
    Assignable exception;
    BlockModel block;

    public CatchProduction(Assignable exception, BlockModel block) {
        this.exception = exception;
        this.block = block;
    }

    @Override
    public String toString() {
        return "{exception=" + exception +
                ", block=" + block +
                '}';
    }
}
