package js.statements.ClassDeclaration.PropertyName;

import js.visitors.models.Expression;
import js.visitors.models.PropertyName;

public class PropertyByExpression implements PropertyName {
    public Expression value;

    public PropertyByExpression(Expression value) {
        this.value = value;
    }
}
