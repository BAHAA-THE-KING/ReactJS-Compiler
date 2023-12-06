package js.expressions;

import js.visitors.models.Expression;

public class OptionalChainExpression implements Expression {
    Expression objectName ;
    Expression objectProperty;

    public OptionalChainExpression(Expression objectName, Expression objectProperty) {
        this.objectName = objectName;
        this.objectProperty = objectProperty;
    }

    @Override
    public String toString() {
        return "OptionalChainExpression{" +
                "objectName=" + objectName +
                ", objectProperty=" + objectProperty +
                '}';
    }
}
