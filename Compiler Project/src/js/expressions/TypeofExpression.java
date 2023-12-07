package js.expressions;

import js.visitors.models.Expression;

public class TypeofExpression implements Expression {
    public Expression identifier;

    public TypeofExpression(Expression identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "typeof"+identifier;
    }
}
