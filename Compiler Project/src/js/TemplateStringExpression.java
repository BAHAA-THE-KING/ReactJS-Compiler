package js;

public class TemplateStringExpression implements Expression {
    Expression singleExpression;
    TemplateStringLiteral templateStringLiteral;

    public TemplateStringExpression(Expression singleExpression, TemplateStringLiteral templateStringLiteral) {
        this.singleExpression = singleExpression;
        this.templateStringLiteral = templateStringLiteral;
    }

    @Override
    public String toString() {
        return "TemplateStringExpression{" + "singleExpression=" + singleExpression + ", templateStringLiteral=" + templateStringLiteral + '}';
    }
}
