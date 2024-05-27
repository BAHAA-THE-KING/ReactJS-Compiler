package js.expressions.Properties;


import js.visitors.models.Assignable;
import js.visitors.models.Property;

public class EllipsisProperty implements Property {
    public Assignable value;

    public EllipsisProperty(Assignable value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "..." + value;
    }
}
