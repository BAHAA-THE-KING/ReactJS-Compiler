package js.ClassDeclaration;

import js.Statement;

import java.util.ArrayList;
import java.util.List;
public class ClassDeclaration extends Statement {

    String id;
    String parent;
    List<ClassElement> elements;

    public ClassDeclaration(String id, String parent) {
        this.id = id;
        this.parent = parent;
        this.elements = new ArrayList<>();
    }

    public void addElement(ClassElement element) {
        this.elements.add(element);
    }

    @Override
    public String toString() {
        return "js.ClassDeclaration{" + "id='" + id + '\'' + ", parent='" + parent + '\'' + ", elements=" + elements + '}';
    }
}
