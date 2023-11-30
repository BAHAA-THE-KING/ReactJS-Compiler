package js.expressions;

import js.visitors.models.Assignable;
import js.visitors.models.Expression;

public class IdentifierExpression implements Expression, Assignable {

    String name;

    public IdentifierExpression(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name;
    }
}
