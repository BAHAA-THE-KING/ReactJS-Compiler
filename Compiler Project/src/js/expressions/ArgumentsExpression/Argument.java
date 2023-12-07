package js.expressions.ArgumentsExpression;

import js.visitors.models.Expression;

public class Argument {
    public Expression value;
    public String type;

    public Argument(Expression value) {
        this.value = value;
    }

    @Override
    public String toString() {
        //TODO: should i return the type?
        return value.toString();
    }
}
