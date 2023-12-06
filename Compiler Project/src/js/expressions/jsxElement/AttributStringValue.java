package js.expressions.jsxElement;

import js.visitors.models.AttributeValue;

public class AttributStringValue extends AttributeValue {
    String value;

    public AttributStringValue(String value) {
        this.value = value;
    }
}
