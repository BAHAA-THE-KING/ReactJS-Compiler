package js.expressions;

import js.visitors.models.ClassElement;
import js.visitors.models.Expression;

import java.util.ArrayList;
import java.util.List;

public class ClassExpression implements Expression {
    String name;
    List<ClassElement> elements;

    public ClassExpression(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void addElement(ClassElement element) {
        this.elements.add(element);
    }

    @Override
    public String toString() {
        return "ClassExpression{" + "name='" + name + '\'' + ", elements=" + elements + '}';
    }
}