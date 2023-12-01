package js;

public class TernaryExpression implements Expression {
    Expression condition;
    Expression firstStatement;
    Expression secondStatement;

    public TernaryExpression(Expression condition, Expression firstStatement, Expression secondStatement) {
        this.condition = condition;
        this.firstStatement = firstStatement;
        this.secondStatement = secondStatement;
    }

    @Override
    public String toString() {
        return "TernaryExpression{" + "condition=" + condition + ", firstStatement=" + firstStatement + ", secondStatement=" + secondStatement + '}';
    }
}
