package js.visitors;

import antlrJS.JSParser;
import antlrJS.JSParserBaseVisitor;
import js.expressions.Literals.*;
import js.visitors.models.Expression;
import js.visitors.models.Literal;
import org.antlr.v4.runtime.tree.ParseTree;

public class AntlrToLiteral extends JSParserBaseVisitor<Literal> {
    public String filePath;

    public AntlrToLiteral(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public Literal visitBoolean(JSParser.BooleanContext ctx) {
        return new BooleanLiteral(ctx.BooleanLiteral().getText());
    }

    @Override
    public Literal visitNumber(JSParser.NumberContext ctx) {
        return new DecimalLiteral(ctx.DecimalLiteral().getText());
    }

    @Override
    public Literal visitNull(JSParser.NullContext ctx) {
        return new NullLiteral();
    }

    @Override
    public Literal visitString(JSParser.StringContext ctx) {
        return new StringLiteral(ctx.StringLiteral().getText());
    }

    @Override
    public Literal visitTemplateString(JSParser.TemplateStringContext ctx) {
        StringBuilder builder = new StringBuilder("`");
        Expression exp = null;
        for (ParseTree child : ctx.templateStringLiteral().children) {
            if (child instanceof JSParser.TemplateStringCharacterContext) {
                builder.append(((JSParser.TemplateStringCharacterContext) child).templateStringText().getText());
            } else if (child instanceof JSParser.TemplateStringJSExpressionContext) {
                JSParser.TemplateStringJSExpressionContext castedChild = (JSParser.TemplateStringJSExpressionContext) child;
                AntlrToExpression visitor = new AntlrToExpression(filePath);
                exp = visitor.visit(castedChild.singleExpression());
                builder.append(castedChild.DollarSign().getText()).append(castedChild.OpenBrace().getText()).append(exp.toString()).append(castedChild.CloseBrace().getText());
            }
        }
        builder.append("`");
        return new TemplateStringLiteral(builder.toString(), exp);
    }
}
