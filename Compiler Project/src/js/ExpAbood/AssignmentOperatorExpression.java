package js.ExpAbood;

import js.Expression;

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
