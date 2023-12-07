package js.expressions.ArgumentsExpression;

import js.visitors.models.Expression;

public class ArgumentsExpression implements Expression {
    public Expression singleExpression;
    public Arguments arguments;

    public ArgumentsExpression(Expression singleExpression, Arguments arguments) {
        this.singleExpression = singleExpression;
        this.arguments = arguments;
    }
}
