package js.ClassDeclaration;

import js.Expression;
import js.PropertyName.PropertyName;
import js.Statement;
import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;
import java.util.List;

public class ClassDeclaration implements Statement, Expression {

    String id;
    String parent;
    List<ClassElement> elements;

    public ClassDeclaration(String id, String parent) {
        this.id = id;
        this.parent = parent;
        this.elements = new ArrayList<>();
    }

    public void addElement(ClassElement classElement) {
        this.elements.add(classElement);
    }

    @Override
    public String toString() {
        return "js.ClassDeclaration{" + "id='" + id + '\'' + ", parent='" + parent + '\'' + ", elements=" + elements + '}';
    }
}
