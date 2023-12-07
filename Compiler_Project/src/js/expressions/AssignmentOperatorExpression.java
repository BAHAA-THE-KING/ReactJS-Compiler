package js.expressions;

import js.visitors.models.Expression;

public class AssignmentOperatorExpression implements Expression {
    Expression left;
    Expression right;
    String operator;

    public AssignmentOperatorExpression(Expression left, Expression right, String operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "AssignmentOperatorExpression{" + "left=" + left + ", right=" + right + ", operator='" + operator + '\'' + '}';
    }
}
