package js.expressions;

import js.visitors.models.Expression;

public class DeleteExpression implements Expression{

    public Expression identifier;

    public DeleteExpression(Expression identifier) {
        this.identifier = identifier;
    }
}
