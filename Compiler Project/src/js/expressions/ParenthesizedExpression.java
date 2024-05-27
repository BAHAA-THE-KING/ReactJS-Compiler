package js.expressions;

import antlrJS.JSParser;
import js.visitors.models.Expression;

public class ParenthesizedExpression implements Expression {
    public ExpressionSequence sequence;

    public ParenthesizedExpression(JSParser.ExpressionSequenceContext ctx, String filePath) {
        this.sequence = new ExpressionSequence(ctx, filePath);
    }

    @Override
    public String toString() {
        return "(" + sequence + ")";
    }
}
