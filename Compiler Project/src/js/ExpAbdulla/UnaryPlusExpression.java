package js.ExpAbdulla;

import js.Expression;

public class UnaryPlusExpression implements Expression {
    Expression objectName;

    public UnaryPlusExpression(Expression objectName) {
        this.objectName = objectName;
    }

    @Override
    public String toString() {
        return "UnaryPlusExpression{" + "objectName=" + objectName + '}';
    }
}
