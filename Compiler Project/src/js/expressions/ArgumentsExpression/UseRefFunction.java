package js.expressions.ArgumentsExpression;

import js.visitors.models.Expression;

public class UseRefFunction implements Expression {
    public Argument initialValue;

    public UseRefFunction(Argument initialValue) {
        this.initialValue = initialValue;
    }

    @Override
    public String toString() {
        return "useRef("+initialValue+")";
    }
}
