package js.ExpAbood;

import js.Expression;

public class LogicalExpression implements Expression {
    Expression left;
    Expression right;
    String operator;

    public LogicalExpression(Expression left, Expression right, String operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "Logical{" + "left=" + left + ", right=" + right + ", operator='" + operator + '\'' + '}';
    }
}
