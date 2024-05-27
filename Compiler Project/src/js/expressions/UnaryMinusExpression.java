package js.expressions;

import js.visitors.models.Expression;

public class UnaryMinusExpression implements Expression {
    public Expression expression;

    public UnaryMinusExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "-" + expression;
    }
}
