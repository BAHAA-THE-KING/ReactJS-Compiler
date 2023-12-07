package js.expressions.Properties;


import js.visitors.models.Property;
import js.visitors.models.ObjectLiteral;

public class EllipsisProperty implements Property {
    public ObjectLiteral value;
    public EllipsisProperty(ObjectLiteral value) {
        this.value = value;
    }
}
