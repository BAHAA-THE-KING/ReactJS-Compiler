package js.ExpAbdulla;

import js.Expression;

public class PreIncrementExpression implements Expression {

    Expression objectName;

    public PreIncrementExpression(Expression objectName) {
        this.objectName = objectName;
    }

    @Override
    public String toString() {
        return "PreIncrementExpression{" + "objectName=" + objectName + '}';
    }
}
