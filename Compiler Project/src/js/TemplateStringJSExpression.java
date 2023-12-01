package js;

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
