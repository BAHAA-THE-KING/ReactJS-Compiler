package js.expressions.Properties;

import js.visitors.models.Expression;
import js.visitors.models.Property;
import js.visitors.models.PropertyName;

public class NormalProperty implements Property {
    public PropertyName key;
    public Expression value;

    public NormalProperty(PropertyName key, Expression value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return key + ":" + value;
    }
}
