package js.expressions.jsxElement;

import js.visitors.models.Expression;
import js.visitors.models.JSXContent;

public class JSXExpression implements JSXContent {
    public Expression value;

    public JSXExpression(Expression value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
