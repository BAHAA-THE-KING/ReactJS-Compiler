package js.statements.ClassDeclaration.PropertyName;

import js.visitors.models.PropertyName;

public class PropertyByString implements PropertyName {
    public String value;

    public PropertyByString(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "[" + value + "]";
    }
}
