package js.ExpAbdulla;

import js.Expression;

public class MemberDotExpression implements Expression {

    Expression objectName;
    String id;

    public MemberDotExpression(Expression objectName, String id) {
        this.objectName = objectName;
        this.id = id;
    }

    @Override
    public String toString() {
        return "MemberDotExpression{" + "objectName=" + objectName + ", id='" + id + '\'' + '}';
    }
}
