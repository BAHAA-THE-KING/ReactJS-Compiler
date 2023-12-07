package js.statements.ClassDeclaration;

import js.visitors.models.*;

import java.util.List;

public class ClassMethodDefinition extends ClassElement {
    public boolean isStatic;
    public PropertyName propertyName;
    public Parameters parameters;
    public List<Statement> body;

    public ClassMethodDefinition(boolean isStatic, PropertyName propertyName, Parameters parameters, List<Statement> body) {
        this.isStatic = isStatic;
        this.propertyName = propertyName;
        this.parameters = parameters;
        this.body = body;
    }
}
