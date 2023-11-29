package js;

public class ArgumentsExpression extends Expression {
    Expression singleExpression;
    Arguments arguments;

    public ArgumentsExpression(Expression singleExpression, Arguments arguments) {
        this.singleExpression = singleExpression;
        this.arguments = arguments;
    }

    @Override
    public String toString() {
        return "ArgumentsExpression{" + "singleExpression=" + singleExpression + ", arguments=" + arguments + '}';
    }
}
