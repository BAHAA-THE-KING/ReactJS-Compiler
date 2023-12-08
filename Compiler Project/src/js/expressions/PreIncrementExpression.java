package js.expressions;

import js.visitors.models.Expression;

public class PreIncrementExpression implements Expression {

    public Expression identifier;

    public PreIncrementExpression(Expression identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "++"+identifier;
    }
}
