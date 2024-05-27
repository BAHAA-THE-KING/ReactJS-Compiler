package js.expressions.Literals;

import js.visitors.models.Literal;

public class DecimalLiteral implements Literal {
    public String value;

    public DecimalLiteral(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
