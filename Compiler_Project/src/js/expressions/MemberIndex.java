package js.expressions;

import js.visitors.models.Expression;

public class MemberIndex implements Expression {
    Expression accessedExpression;
    ExpressionSequence accessedAt;

    public MemberIndex(Expression accessedExpression, ExpressionSequence accessedAt) {
        this.accessedExpression = accessedExpression;
        this.accessedAt = accessedAt;
    }
}