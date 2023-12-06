package js.visitors;

import antlrJS.JSParser;
import antlrJS.JSParserBaseVisitor;
import js.expressions.jsxElement.AttributStringValue;
import js.expressions.jsxElement.AttributeInjectValue;
import js.visitors.models.AttributeValue;

public class AntlrToAttributeValue extends JSParserBaseVisitor<AttributeValue> {
    public String filePath;

    public AntlrToAttributeValue(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public AttributeValue visitAttributeString(JSParser.AttributeStringContext ctx) {
        return new AttributStringValue(ctx.StringLiteral().getText());
    }

    @Override
    public AttributeValue visitAttributeInjection(JSParser.AttributeInjectionContext ctx) {
        AntlrToExpression visitor = new AntlrToExpression(filePath);
        return new AttributeInjectValue(visitor.visit(ctx.expressionInjection().singleExpression()));
    }
}
