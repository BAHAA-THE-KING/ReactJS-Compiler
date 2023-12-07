package js.expressions;

import js.visitors.models.Expression;

public class UnaryMinusExpression implements Expression {
    Expression identifier;

    public UnaryMinusExpression(Expression identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "UnaryMinusExpression{" + "identifier=" + identifier + '}';
    }
}
