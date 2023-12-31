package js.expressions.jsxElement;

import js.visitors.models.AttributeValue;

public class AttributStringValue implements AttributeValue {
    public String value;

    public AttributStringValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
