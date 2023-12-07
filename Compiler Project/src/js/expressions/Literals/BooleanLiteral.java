package js.expressions.Literals;

import js.visitors.models.Literal;

public class BooleanLiteral implements Literal {
    public boolean value;
    public BooleanLiteral(String value) {
        this.value = Boolean.parseBoolean(value);
    }
}
