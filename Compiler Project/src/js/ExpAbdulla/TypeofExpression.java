package js.ExpAbdulla;

import js.Expression;

public class TypeofExpression implements Expression {
    Expression identifier;

    public TypeofExpression(Expression identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "TypeofExpression{" +
                "identifier=" + identifier +
                '}';
    }
}
