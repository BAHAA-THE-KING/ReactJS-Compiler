package js;

public class MathmaticalExpression implements Expression {
    Expression firstExpression;
    Expression secondExpression;
    String process;

    public MathmaticalExpression(Expression firstExpression, Expression secondExpression, String process) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
        this.process = process;
    }

    @Override
    public String toString() {
        return "MathmaticalExpression{" + "firstExpression=" + firstExpression + ", secondExpression=" + secondExpression + ", process='" + process + '\'' + '}';
    }
}
