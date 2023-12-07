package js.expressions.Literals;

import js.visitors.models.Literal;

public class NullLiteral implements Literal {
    private final String className = this.getClass().getSimpleName();

    @Override
    public String toString() {
        return "NullLiteral{" +
                '}';
    }
}
