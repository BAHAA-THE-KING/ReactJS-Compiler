package js.statements.ClassDeclaration.PropertyName;

import js.visitors.models.PropertyName;

public class PropertyByName implements PropertyName {
    public String id;

    public PropertyByName(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }
}
