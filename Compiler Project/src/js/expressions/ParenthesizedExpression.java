package js.expressions;

import antlrJS.JSParser;
import js.visitors.models.Expression;

public class ParenthesizedExpression implements Expression {
    private final String className = this.getClass().getSimpleName();
    public ExpressionSequence sequence;

    public ParenthesizedExpression(JSParser.ExpressionSequenceContext ctx,String filePath) {
        this.sequence = new ExpressionSequence(ctx,filePath);
    }
}
