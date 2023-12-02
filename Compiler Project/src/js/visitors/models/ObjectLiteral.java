package js.visitors.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ObjectLiteral implements Expression {
    public List<Property> objectProperties = new ArrayList<>();

    public ObjectLiteral addAttribute(Property property) {
        objectProperties.add(property);
        return this;
    }

    public ObjectLiteral setAttributes(List<Property> properties) {
        objectProperties = properties;
        return this;
    }
}