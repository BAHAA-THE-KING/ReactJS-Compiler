package js.expressions.Properties;


import js.visitors.models.Assignable;
import js.visitors.models.Property;
import js.visitors.models.ObjectLiteral;

public class EllipsisProperty implements Property {
    public Assignable value;
    public EllipsisProperty(Assignable value) {
        this.value = value;
    }
}
