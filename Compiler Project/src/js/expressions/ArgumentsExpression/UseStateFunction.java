package js.expressions.ArgumentsExpression;

import js.visitors.models.Expression;

public class UseStateFunction implements Expression {
    public Argument initialState;

    public UseStateFunction(Argument initialState) {
        this.initialState = initialState;
    }

    @Override
    public String toString() {
        return "useState("+initialState+")";
    }
}
