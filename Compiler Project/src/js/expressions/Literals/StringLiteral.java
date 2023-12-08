package js.expressions.Literals;

import js.visitors.models.Literal;

public class StringLiteral implements Literal {
    public String value;
    public StringLiteral(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
