package js.statements.ClassDeclaration;

import js.visitors.models.ClassElement;
import js.visitors.models.Statement;

import java.util.ArrayList;
import java.util.List;

public class ClassDeclaration implements Statement{
    public String id;
    public String parent;
    public List<ClassElement> elements;

    public ClassDeclaration(String id, String parent) {
        this.id = id;
        this.parent = parent;
        this.elements = new ArrayList<>();
    }

    public void addElement(ClassElement classElement) {
        this.elements.add(classElement);
    }
}
