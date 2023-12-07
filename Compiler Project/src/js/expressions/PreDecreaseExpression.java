package js.expressions;

import js.visitors.models.Expression;

public class PreDecreaseExpression implements Expression {

    public Expression identifier;

    public PreDecreaseExpression(Expression identifier) {
        this.identifier = identifier;
    }
    @Override
    public String toString() {
        return "--"+identifier;
    }
}
