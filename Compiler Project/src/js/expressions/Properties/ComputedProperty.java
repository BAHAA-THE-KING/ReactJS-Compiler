package js.expressions.Properties;

import js.visitors.models.Expression;
import js.visitors.models.Property;

public class ComputedProperty implements Property {
    Expression key,value;

    public ComputedProperty(Expression key, Expression value) {
        this.key = key;
        this.value = value;
    }
}
