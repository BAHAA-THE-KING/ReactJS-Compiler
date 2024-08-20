package js.visitors;

import antlrJS.JSParser;
import antlrJS.JSParserBaseVisitor;
import js.expressions.jsxElement.JSXExpression;
import js.expressions.jsxElement.JSXText;
import js.visitors.models.JSXContent;

public class AntlrToAttributeValue extends JSParserBaseVisitor<JSXContent> {
    public String filePath;

    public AntlrToAttributeValue(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public JSXContent visitAttributeString(JSParser.AttributeStringContext ctx) {
        return new JSXText(ctx.StringLiteral().getText());
    }

    @Override
    public JSXContent visitAttributeInjection(JSParser.AttributeInjectionContext ctx) {
        AntlrToExpression visitor = new AntlrToExpression(filePath);
        return new JSXExpression(visitor.visit(ctx.expressionInjection().singleExpression()));
    }
}
