package js.expressions;

import js.visitors.models.Expression;

public class MemberIndex implements Expression {
    public Expression accessedExpression;
    public ExpressionSequence accessedAt;
    public boolean checkNull;

    public MemberIndex(Expression accessedExpression, ExpressionSequence accessedAt, boolean checkNull) {
        this.accessedExpression = accessedExpression;
        this.accessedAt = accessedAt;
        this.checkNull = checkNull;
    }

    @Override
    public String toString() {
        return accessedExpression+(checkNull?"?.":"")+"["+accessedAt+"]";
    }
}