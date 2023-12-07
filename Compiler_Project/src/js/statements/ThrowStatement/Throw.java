package js.statements.ThrowStatement;

import js.expressions.ExpressionSequence;
import js.visitors.models.Statement;

public class Throw implements Statement {
    ExpressionSequence expressions;

    public Throw(ExpressionSequence expressions) {
        this.expressions = expressions;
    }
}
