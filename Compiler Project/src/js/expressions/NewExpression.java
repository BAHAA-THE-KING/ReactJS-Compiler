package js.expressions;

import js.expressions.ArgumentsExpression.Arguments;
import js.visitors.models.Expression;

public class NewExpression implements Expression {
    public String id;
    public Arguments arguments;

    public NewExpression(String id, Arguments arguments) {
        this.id = id;
        this.arguments = arguments;
    }
}
