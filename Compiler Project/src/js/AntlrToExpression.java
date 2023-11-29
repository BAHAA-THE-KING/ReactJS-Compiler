package js;

import antlrJS.JSParser;
import antlrJS.JSParserBaseVisitor;
import js.ClassDeclaration.ClassDeclaration;

public class AntlrToExpression extends JSParserBaseVisitor<Expression> {
    @Override
    public Expression visitClassExpression(JSParser.ClassExpressionContext ctx) {
        String name = ctx.Identifier() != null ? ctx.Identifier().getText() : "";
        return
    }
}
