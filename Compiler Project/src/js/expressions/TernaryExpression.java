package js.expressions;

import js.visitors.models.Expression;

public class TernaryExpression implements Expression {
    public Expression condition;
    public Expression firstStatement;
    public Expression secondStatement;

    public TernaryExpression(Expression condition, Expression firstStatement, Expression secondStatement) {
        this.condition = condition;
        this.firstStatement = firstStatement;
        this.secondStatement = secondStatement;
    }

    @Override
    public String toString() {
        return condition+"?"+firstStatement+":"+secondStatement;
    }
}
