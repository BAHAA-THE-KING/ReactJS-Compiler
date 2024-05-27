package js.expressions;

import js.visitors.models.Expression;

public class UnaryPlusExpression implements Expression {
    public Expression expression;

    public UnaryPlusExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "+" + expression;
    }
}
