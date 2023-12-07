package js.statements.ClassDeclaration;

import js.visitors.models.ClassElement;
import js.visitors.models.Statement;

import java.util.ArrayList;
import java.util.List;

public class ClassDeclaration implements Statement{
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
        return "js.statements.ClassDeclaration{" + "id='" + id + '\'' + ", parent='" + parent + '\'' + ", elements=" + elements + '}';
    }
}
