package js.PropertyName;

import js.Expression;

public class PropertyByExpression implements PropertyName {
    public Expression value;

    public PropertyByExpression(Expression value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "PropertyByExpression{" + "value=" + value + '}';
    }
}
