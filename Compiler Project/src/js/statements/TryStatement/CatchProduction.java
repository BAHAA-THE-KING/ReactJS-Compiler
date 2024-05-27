package js.statements.TryStatement;

import js.statements.Block.Block;
import js.visitors.models.Assignable;
import js.visitors.models.Statement;

public class CatchProduction implements Statement {
    public final String className = getClass().getSimpleName();
    public Assignable exception;
    public Block block;

    public CatchProduction(Assignable exception, Block block) {
        this.exception = exception;
        this.block = block;
    }

    @Override
    public String toString() {
        return "catch(" + exception + ")\n" + block;
    }
}
