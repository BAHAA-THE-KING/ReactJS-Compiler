package js.statements.ClassDeclaration.PropertyName;

import js.visitors.models.PropertyName;

public class PropertyByNumber implements PropertyName {
    public String value;

    public PropertyByNumber(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "[" + value + "]";
    }
}
