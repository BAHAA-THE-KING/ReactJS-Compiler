package js.visitors;

import antlrJS.JSParser;
import antlrJS.JSParserBaseVisitor;
import js.expressions.jsxElement.JSXText;
import js.visitors.models.JSXContent;

public class AntlrToJSXContent extends JSParserBaseVisitor<JSXContent> {
    public String filePath;

    public AntlrToJSXContent(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public JSXContent visitJSXContentText(JSParser.JSXContentTextContext ctx) {
        return new JSXText(ctx.jsxText().getText());
    }

    @Override
    public JSXContent visitJSXContentElement(JSParser.JSXContentElementContext ctx) {
        return new AntlrToJSXElement(filePath).visit(ctx.jsxElement());
    }

    @Override
    public JSXContent visitJSXContentExpression(JSParser.JSXContentExpressionContext ctx) {
        return new AntlrToExpression(filePath).visit(ctx.expressionInjection().singleExpression());
    }
}
