package js.expressions;

import js.visitors.models.Expression;

public class UnaryPlusExpression implements Expression {
    Expression identifier;

    public UnaryPlusExpression(Expression identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "UnaryPlusExpression{" + "identifier=" + identifier + '}';
    }
}
