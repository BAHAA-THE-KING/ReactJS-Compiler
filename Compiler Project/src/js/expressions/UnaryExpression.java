package js.expressions;

import js.visitors.models.Expression;

public class UnaryExpression implements Expression {
    public String operation;
    public Expression expression;

    public UnaryExpression(String operation, Expression expression) {
        this.operation = operation;
        this.expression = expression;
    }

    @Override
    public String toString() {
        return operation + expression;
    }
}
