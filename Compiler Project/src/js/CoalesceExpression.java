package js;

public class CoalesceExpression implements Expression {
    Expression firstExpression;
    Expression secondExpression;
    String nullString;

    public CoalesceExpression(Expression firstExpression, Expression secondExpression, String nullString) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
        this.nullString = nullString;
    }

    @Override
    public String toString() {
        return "CoalesceExpression{" + "firstExpression=" + firstExpression + ", secondExpression=" + secondExpression + ", nullString='" + nullString + '\'' + '}';
    }
}
