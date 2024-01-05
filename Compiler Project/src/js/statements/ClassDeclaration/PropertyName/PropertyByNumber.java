package js.statements.ClassDeclaration.PropertyName;

import js.visitors.models.PropertyName;

public class PropertyByNumber implements PropertyName {
    public double value;

    public PropertyByNumber(double value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return value+"";
    }
}
