package js.statements.ExpressionChunk;

import js.expressions.ExpressionSequence;
import js.visitors.models.Expression;
import js.visitors.models.Statement;

import java.util.ArrayList;
import java.util.List;

public class ExpressionChunk implements Statement {

    public ExpressionSequence expressions;

    public ExpressionChunk(ExpressionSequence expressions) {
        this.expressions = expressions;
    }
}
