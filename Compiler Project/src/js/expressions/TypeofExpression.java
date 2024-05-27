package js.expressions;

import js.visitors.models.Expression;

public class TypeofExpression implements Expression {
    public Expression expression;

    public TypeofExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "typeof " + expression;
    }
}
