package js.expressions.Literals;

import js.visitors.models.Literal;

public class NullLiteral implements Literal {
    @Override
    public String toString() {
        return "null";
    }
}
