package js.ExpAbdulla;

import js.Expression;

public class PostIncrementExpression implements Expression {

    Expression objectName;

    public PostIncrementExpression(Expression objectName) {
        this.objectName = objectName;
    }

    @Override
    public String toString() {
        return "PostIncrementExpression{" + "objectName=" + objectName + '}';
    }
}
