package js.expressions;

import js.visitors.models.Expression;

public class UnaryPlusExpression implements Expression {
    public Expression identifier;

    public UnaryPlusExpression(Expression identifier) {
        this.identifier = identifier;
    }
    @Override
    public String toString() {
        return "+"+identifier;
    }
}
