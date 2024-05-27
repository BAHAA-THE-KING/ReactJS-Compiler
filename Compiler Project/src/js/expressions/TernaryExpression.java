package js.expressions;

import js.visitors.models.Expression;

public class TernaryExpression implements Expression {
    public Expression condition;
    public Expression trueExpression;
    public Expression falseExpression;

    public TernaryExpression(Expression condition, Expression trueExpression, Expression falseExpression) {
        this.condition = condition;
        this.trueExpression = trueExpression;
        this.falseExpression = falseExpression;
    }

    @Override
    public String toString() {
        return condition + " ? " + trueExpression + " : " + falseExpression;
    }
}
