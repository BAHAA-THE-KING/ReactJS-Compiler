package js.expressions.jsxElement;

import js.visitors.models.AttributeValue;
import js.visitors.models.Expression;

public class AttributeInjectValue implements AttributeValue {

    public Expression exp;

    public AttributeInjectValue(Expression exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "AttributeInjectValue: "+exp;
    }
}
