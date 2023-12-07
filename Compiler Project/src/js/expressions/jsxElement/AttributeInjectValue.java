package js.expressions.jsxElement;

import js.visitors.models.AttributeValue;
import js.visitors.models.Expression;

public class AttributeInjectValue extends AttributeValue {

    Expression exp;

    public AttributeInjectValue(Expression exp) {
        this.exp = exp;
    }
}