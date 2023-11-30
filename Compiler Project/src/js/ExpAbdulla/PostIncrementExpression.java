package js.ExpAbdulla;

import js.Expression;

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
