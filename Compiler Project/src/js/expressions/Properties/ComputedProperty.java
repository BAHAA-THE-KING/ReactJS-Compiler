package js.expressions.Properties;

import js.visitors.models.Expression;
import js.visitors.models.Property;

public class ComputedProperty implements Property {
    public Expression key, value;

    public ComputedProperty(Expression key, Expression value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "[" + key + "]: " + value;
    }
}
