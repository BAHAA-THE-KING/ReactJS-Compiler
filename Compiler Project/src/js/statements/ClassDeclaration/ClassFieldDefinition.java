package js.statements.ClassDeclaration;

import js.visitors.models.ClassElement;
import js.visitors.models.Expression;
import js.visitors.models.PropertyName;

public class ClassFieldDefinition implements ClassElement {

    public boolean isStatic;
    public PropertyName propertyName;
    public Expression propertyValue;

    public ClassFieldDefinition(boolean isStatic, PropertyName propertyName, Expression propertyValue) {
        this.isStatic = isStatic;
        this.propertyName = propertyName;
        this.propertyValue = propertyValue;
    }

    @Override
    public String toString() {
        return (isStatic ? "static " : "") + propertyName + " = " + propertyValue;
    }
}