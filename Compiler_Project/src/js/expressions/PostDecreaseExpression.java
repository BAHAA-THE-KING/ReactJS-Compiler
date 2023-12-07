package js.expressions;

import js.visitors.models.Expression;

public class PostDecreaseExpression implements Expression {

    Expression identifier;

    public PostDecreaseExpression(Expression identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "PostDecreaseExpression{" + "identifier=" + identifier + '}';
    }
}
