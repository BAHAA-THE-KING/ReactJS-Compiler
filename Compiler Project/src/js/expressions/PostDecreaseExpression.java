package js.expressions;

import js.visitors.models.Expression;

public class PostDecreaseExpression implements Expression {

    public Expression identifier;

    public PostDecreaseExpression(Expression identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return identifier + "--";
    }
}
