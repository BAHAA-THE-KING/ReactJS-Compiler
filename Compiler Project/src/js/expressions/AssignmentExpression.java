package js.expressions;

import js.visitors.models.Expression;

public class AssignmentExpression implements Expression {
    Expression leftExpression;
    Expression rightExpression;

    public AssignmentExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public String toString() {
        return "AssignmentExpression{" + "leftExpression = rightExpression => " + leftExpression + "=" + rightExpression + '}';
    }
}
