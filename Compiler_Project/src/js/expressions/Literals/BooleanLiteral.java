package js.expressions.Literals;

import js.visitors.models.Literal;

public class BooleanLiteral implements Literal {
    private final String className = this.getClass().getSimpleName();
    public boolean value;
    public BooleanLiteral(String value) {
        this.value = Boolean.parseBoolean(value);
    }

    @Override
    public String toString() {
        return "BooleanLiteral{" +
                ", value=" + value +
                '}';
    }
}
