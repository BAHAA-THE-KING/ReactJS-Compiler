package js.expressions.TemplateString;

import js.visitors.models.Expression;

public class TemplateStringJSExpression extends TemplateStringAtom {
    Expression singleExpression;

    public TemplateStringJSExpression(Expression singleExpression) {
        this.singleExpression = singleExpression;
    }

    @Override
    public String toString() {
        return "TemplateStringJSExpression{" + "singleExpression=" + singleExpression + '}';
    }
}
