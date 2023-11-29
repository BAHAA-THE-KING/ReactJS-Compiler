package js.ExpAbdulla;

import js.Expression;

public class PostDecreaseExpression implements Expression {

    Expression objectName;

    public PostDecreaseExpression(Expression objectName) {
        this.objectName = objectName;
    }

    @Override
    public String toString() {
        return "PostDecreaseExpression{" + "objectName=" + objectName + '}';
    }
}
