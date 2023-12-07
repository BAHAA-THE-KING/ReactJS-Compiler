package js.expressions.Literals;

import js.visitors.models.Literal;
import js.visitors.models.Expression;

public class TemplateStringLiteral implements Literal {
    public String value ;
    public Expression placeholder;

    public TemplateStringLiteral(String value ,Expression placeholder) {
        this.value = value;
        this.placeholder = placeholder;
    }

    @Override
    public String toString() {
        //TODO:make sure this is the best way
        return value;
    }
}
