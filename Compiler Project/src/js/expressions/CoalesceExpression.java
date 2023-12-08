package js.expressions;

import js.visitors.models.Expression;

public class CoalesceExpression implements Expression {
    public Expression firstExpression;
    public Expression secondExpression;
    public String nullString;

    public CoalesceExpression(Expression firstExpression, Expression secondExpression, String nullString) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
        this.nullString = nullString;
    }

    @Override
    public String toString() {
        return firstExpression+" ?? "+secondExpression;
    }
}
