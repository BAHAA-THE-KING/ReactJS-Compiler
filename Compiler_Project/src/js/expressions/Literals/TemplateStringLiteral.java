package js.expressions.Literals;

import js.visitors.models.Literal;
import js.visitors.models.Expression;

public class TemplateStringLiteral implements Literal {
    private final String className = this.getClass().getSimpleName();
    public String value ;
    public Expression placeholder;

    public TemplateStringLiteral(String value ,Expression placeholder) {
        this.value = value;
        this.placeholder = placeholder;
    }

    @Override
    public String toString() {
        return "TemplateStringLiteral{" +
                "value='" + value + '\'' +
                ", placeholder=" + placeholder +
                '}';
    }
}
