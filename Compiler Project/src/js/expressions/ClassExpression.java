package js.expressions;

import js.statements.ClassDeclaration.ClassFieldDefinition;
import js.statements.ClassDeclaration.ClassMethodDefinition;
import js.visitors.models.ClassElement;
import js.visitors.models.Expression;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class ClassExpression implements Expression {
    public String name;
    public List<ClassElement> elements;

    public ClassExpression(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void addElement(ClassElement element) {
        this.elements.add(element);
    }

    @Override
    public String toString() {
        StringJoiner elementsString=new StringJoiner("\n");
        elements.forEach(classElement -> {
            if (classElement instanceof ClassFieldDefinition field){
                elementsString.add(field.propertyName+" = "+field.propertyValue);
            }else if(classElement instanceof ClassMethodDefinition method) {
                StringJoiner bodyString=new StringJoiner("\n");
                method.body.forEach(statement -> {bodyString.add(statement.toString());});
                elementsString.add(method.propertyName+" = function("+method.parameters+")"+"{\n"+bodyString+"}");
            }
        });
        return "class "+name+"{\n"+elementsString+"}";
    }
}
