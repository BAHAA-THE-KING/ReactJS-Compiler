package js.expressions.ArgumentsExpression;

import js.visitors.models.Expression;

public class ArgumentsExpression implements Expression {
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
