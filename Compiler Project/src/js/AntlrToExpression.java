package js;

import antlrJS.JSParser;
import antlrJS.JSParserBaseVisitor;
import js.ClassDeclaration.ClassDeclaration;
import js.ImportStatement.MemberIndex;

public class AntlrToExpression extends JSParserBaseVisitor<Expression> {
    @Override
    public Expression visitClassExpression(JSParser.ClassExpressionContext ctx) {
        String name = ctx.Identifier() != null ? ctx.Identifier().getText() : "";
        ClassDeclaration classDeclaration = new ClassDeclaration(name, "");
        return classDeclaration;
    }

    @Override
    public Expression visitMemberIndexExpression(JSParser.MemberIndexExpressionContext ctx) {
        Expression accessedExpression = this.visit(ctx.singleExpression());
        ExpressionSequence accessedAt = new ExpressionSequence(ctx.expressionSequence());
        return new MemberIndex(accessedExpression,accessedAt);

    }
}
