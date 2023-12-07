package js.expressions;

import js.visitors.models.Expression;

public class MemberDotExpression implements Expression {

    public Expression objectName;
    public String id;

    public MemberDotExpression(Expression objectName, String id) {
        this.objectName = objectName;
        this.id = id;
    }
}
