package js.expressions;

import js.visitors.models.Expression;

public class UnaryMinusExpression implements Expression {
    public Expression identifier;

    public UnaryMinusExpression(Expression identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "-"+identifier;
    }
}
