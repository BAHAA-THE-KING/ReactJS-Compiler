package js.expressions;

import js.visitors.models.Expression;

public class DeleteExpression implements Expression{

    Expression identifier;

    public DeleteExpression(Expression identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "DeleteExpression{" +
                "identifier=" + identifier +
                '}';
    }
}
