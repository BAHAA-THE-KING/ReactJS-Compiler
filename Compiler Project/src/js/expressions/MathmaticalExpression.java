package js.expressions;

import js.visitors.models.Expression;

public class MathmaticalExpression implements Expression {
    public Expression firstExpression;
    public Expression secondExpression;
    public String process;

    public MathmaticalExpression(Expression firstExpression, Expression secondExpression, String process) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
        this.process = process;
    }

    @Override
    public String toString() {
        return firstExpression+" "+process+" "+secondExpression;
    }
}
