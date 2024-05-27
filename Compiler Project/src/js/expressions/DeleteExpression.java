package js.expressions;

import js.visitors.models.Expression;

public class DeleteExpression implements Expression {

    public Expression expression;

    public DeleteExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "delete " + expression;
    }
}
