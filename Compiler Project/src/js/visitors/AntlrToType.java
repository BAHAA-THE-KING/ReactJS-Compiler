package js.visitors;

import antlrJS.JSParser;
import antlrJS.JSParserBaseVisitor;
import js.types.*;
import js.visitors.models.Type;

public class AntlrToType extends JSParserBaseVisitor<Type> {
    @Override
    public Type visitLiteralExpression(JSParser.LiteralExpressionContext ctx) {
        return this.visit(ctx.literal());
    }

    @Override
    public Type visitArrayLiteralExpression(JSParser.ArrayLiteralExpressionContext ctx) {
        return new Object_();
    }

    @Override
    public Type visitObjectLiteralExpression(JSParser.ObjectLiteralExpressionContext ctx) {
        return new Object_();
    }

    @Override
    public Type visitNull(JSParser.NullContext ctx) {
        return new Object_();
    }

    @Override
    public Type visitUndefined(JSParser.UndefinedContext ctx) {
        return new Undefined_();
    }

    @Override
    public Type visitBoolean(JSParser.BooleanContext ctx) {
        return new Boolean_();
    }

    @Override
    public Type visitString(JSParser.StringContext ctx) {
        return new String_();
    }

    @Override
    public Type visitTemplateString(JSParser.TemplateStringContext ctx) {
        return new String_();
    }

    @Override
    public Type visitNumber(JSParser.NumberContext ctx) {
        return new Number_();
    }
}