package js.expressions;

import js.visitors.models.Expression;

public class MemberIndex implements Expression {
    public Expression accessedExpression;
    public ExpressionSequence accessedAt;

    public MemberIndex(Expression accessedExpression, ExpressionSequence accessedAt) {
        this.accessedExpression = accessedExpression;
        this.accessedAt = accessedAt;
    }
}