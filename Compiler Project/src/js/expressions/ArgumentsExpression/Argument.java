package js.expressions.ArgumentsExpression;

import js.visitors.models.Expression;

public class Argument {
    public Expression value;

    public Argument(Expression value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
