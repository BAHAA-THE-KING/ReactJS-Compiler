package js.expressions;

import js.visitors.models.Expression;

public class OptionalChainExpression implements Expression {
    public Expression objectName ;
    public Expression objectProperty;

    public OptionalChainExpression(Expression objectName, Expression objectProperty) {
        this.objectName = objectName;
        this.objectProperty = objectProperty;
    }

}
