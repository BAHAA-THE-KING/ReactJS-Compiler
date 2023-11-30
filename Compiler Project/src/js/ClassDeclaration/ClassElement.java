package js.ClassDeclaration;

import js.Expression;
import js.PropertyName.PropertyName;

public class ClassElement {
    public boolean isStatic;
    public PropertyName propertyName;
    public Expression propertyValue;

    public ClassElement(boolean isStatic, PropertyName propertyName, Expression propertyValue) {
        this.isStatic = isStatic;
        this.propertyName = propertyName;
        this.propertyValue = propertyValue;
    }

    public ClassElement() {
    }
}
