package js.expressions.Literals;

import js.visitors.models.Literal;

public class StringLiteral implements Literal {
    private final String className = this.getClass().getSimpleName();
    public String value;
    public StringLiteral(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "StringLiteral{" +
                "value='" + value + '\'' +
                '}';
    }
}
