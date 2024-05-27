package js.expressions;

import js.visitors.models.Expression;

public class CoalesceExpression implements Expression {
    public Expression firstExpression;
    public Expression secondExpression;

    public CoalesceExpression(Expression firstExpression, Expression secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public String toString() {
        return firstExpression + " ?? " + secondExpression;
    }
}
