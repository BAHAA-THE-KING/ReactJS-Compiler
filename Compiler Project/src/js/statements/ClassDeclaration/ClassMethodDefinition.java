package js.statements.ClassDeclaration;

import js.visitors.models.Assignable;
import js.visitors.models.ClassElement;
import js.visitors.models.Expression;
import js.visitors.models.PropertyName;
import js.visitors.models.Statement;
import org.antlr.v4.runtime.misc.Pair;

import java.util.List;

public class ClassMethodDefinition extends ClassElement {
    public boolean isStatic;
    public PropertyName propertyName;
    public List<Pair<Assignable, Expression>> parameters;
    public Expression spreadParameter;
    public List<Statement> body;

    public ClassMethodDefinition(boolean isStatic, PropertyName propertyName, List<Pair<Assignable, Expression>> parameters, Expression spreadParameter, List<Statement> body) {
        this.isStatic = isStatic;
        this.propertyName = propertyName;
        this.parameters = parameters;
        this.spreadParameter = spreadParameter;
        this.body = body;
    }

    @Override
    public String toString() {
        return "ClassMethodDefinition{" + "isStatic=" + isStatic + ", propertyName=" + propertyName + ", parameters=" + parameters + ", spreadParameter=" + spreadParameter + ", body=" + body + '}';
    }
}
