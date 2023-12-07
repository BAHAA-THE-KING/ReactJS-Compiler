package js.statements.TryStatement;

import js.statements.Block.BlockModel;
import js.visitors.models.Assignable;
import js.visitors.models.Statement;

public class CatchProduction implements Statement {
    public Assignable exception;
    public BlockModel block;
    public final String className= getClass().getSimpleName();

    public CatchProduction(Assignable exception, BlockModel block) {
        this.exception = exception;
        this.block = block;
    }
}
