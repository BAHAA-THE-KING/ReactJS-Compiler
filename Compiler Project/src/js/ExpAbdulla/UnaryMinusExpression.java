package js.ExpAbdulla;

import js.Expression;

public class UnaryMinusExpression implements Expression {
    Expression objectName;

    public UnaryMinusExpression(Expression objectName) {
        this.objectName = objectName;
    }

    @Override
    public String toString() {
        return "UnaryMinusExpression{" + "objectName=" + objectName + '}';
    }
}
