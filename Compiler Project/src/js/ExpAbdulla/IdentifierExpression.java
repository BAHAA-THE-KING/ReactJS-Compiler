package js.ExpAbdulla;

import js.Expression;

public class IdentifierExpression implements Expression {

    String name;

    public IdentifierExpression(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name;
    }
}
