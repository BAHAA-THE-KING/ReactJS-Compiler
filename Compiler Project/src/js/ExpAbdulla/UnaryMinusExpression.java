package js.ExpAbdulla;

import js.Expression;

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
