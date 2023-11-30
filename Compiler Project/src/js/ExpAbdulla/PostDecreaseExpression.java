package js.ExpAbdulla;

import js.Expression;

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
