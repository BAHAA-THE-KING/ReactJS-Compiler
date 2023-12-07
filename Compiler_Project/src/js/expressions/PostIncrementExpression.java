package js.expressions;

import js.visitors.models.Expression;

public class PostIncrementExpression implements Expression {

    Expression identifier;

    public PostIncrementExpression(Expression identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "PostIncrementExpression{" + "identifier=" + identifier + '}';
    }
}
