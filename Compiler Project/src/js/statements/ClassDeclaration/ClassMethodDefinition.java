package js.statements.ClassDeclaration;

import js.visitors.models.ClassElement;
import js.visitors.models.Parameters;
import js.visitors.models.PropertyName;
import js.visitors.models.Statement;

import java.util.List;
import java.util.StringJoiner;

public class ClassMethodDefinition implements ClassElement {
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

    @Override
    public String toString() {
        StringJoiner bodyJoiner = new StringJoiner(";\n");
        body.forEach(stmt -> bodyJoiner.add(stmt.toString()));
        return (isStatic ? "static " : "") + propertyName + "(" + parameters + "){\n" + bodyJoiner + "\n}";
    }
}
