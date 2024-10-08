package js.expressions;

import js.visitors.models.Expression;

public class LogicalExpression implements Expression {
    public Expression left;
    public Expression right;
    public String operator;

    public LogicalExpression(Expression left, Expression right, String operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    @Override
    public String toString() {
        return left + " " + operator + " " + right;
    }
}
