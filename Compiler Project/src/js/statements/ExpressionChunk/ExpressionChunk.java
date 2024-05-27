package js.statements.ExpressionChunk;

import js.expressions.ExpressionSequence;
import js.visitors.models.Statement;

public class ExpressionChunk implements Statement {

    public ExpressionSequence expressions;

    public ExpressionChunk(ExpressionSequence expressions) {
        this.expressions = expressions;
    }

    @Override
    public String toString() {
        return expressions.toString();
    }
}
