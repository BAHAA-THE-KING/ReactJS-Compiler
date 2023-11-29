package js.ExpAbdulla;

import js.Expression;

public class PreDecreaseExpression implements Expression {

    Expression objectName;

    public PreDecreaseExpression(Expression objectName) {
        this.objectName = objectName;
    }

    @Override
    public String toString() {
        return "PreDecreaseExpression{" + "objectName=" + objectName + '}';
    }
}
