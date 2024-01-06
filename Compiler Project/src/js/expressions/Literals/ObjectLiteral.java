package js.expressions.Literals;

import js.visitors.models.Assignable;
import js.visitors.models.Expression;
import js.visitors.models.Property;

import java.util.ArrayList;
import java.util.List;

public class ObjectLiteral implements Expression, Assignable {
    public List<Property> objectProperties = new ArrayList<>();

    public ObjectLiteral addAttribute(Property property) {
        objectProperties.add(property);
        return this;
    }

    public ObjectLiteral setAttributes(List<Property> properties) {
        objectProperties = properties;
        return this;
    }

    @Override
    public String toString() {
        return "ObjectLiteral";
    }
}