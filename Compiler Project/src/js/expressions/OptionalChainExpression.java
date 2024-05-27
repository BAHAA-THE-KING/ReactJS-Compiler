package js.expressions;

import js.visitors.models.Expression;

public class OptionalChainExpression implements Expression {
    public Expression objectName;
    public Expression objectProperty;
    public boolean checkNull;

    public OptionalChainExpression(Expression objectName, Expression objectProperty, boolean checkNull) {
        this.objectName = objectName;
        this.objectProperty = objectProperty;
        this.checkNull = checkNull;
    }

    @Override
    public String toString() {
        return objectName + (checkNull ? "?." : ".") + objectProperty;
    }
}
