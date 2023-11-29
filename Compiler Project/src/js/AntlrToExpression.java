package js;

import antlrJS.JSParser;
import antlrJS.JSParserBaseVisitor;
import js.ExpAbdulla.*;

public class AntlrToExpression extends JSParserBaseVisitor<Expression> {
@Override
    public Expression visitClassExpression(JSParser.ClassExpressionContext ctx) {
        String name = ctx.Identifier() != null ? ctx.Identifier().getText() : "";
        ClassDeclaration classDeclaration = new ClassDeclaration(name, "");
        return classDeclaration;
    }
    @Override
    public Expression visitMemberDotExpression(JSParser.MemberDotExpressionContext ctx) {

        Expression objectName = visit(ctx.singleExpression());
        String id = ctx.Identifier().getText();

        MemberDotExpression membDotExp = new MemberDotExpression(objectName, id);
        return membDotExp;
    }

    @Override
    public Expression visitPostIncrementExpression(JSParser.PostIncrementExpressionContext ctx) {
        Expression objectName = visit(ctx.singleExpression());
        PostIncrementExpression incrementExp = new PostIncrementExpression(objectName);
        return incrementExp;
    }

    @Override
    public Expression visitPostDecreaseExpression(JSParser.PostDecreaseExpressionContext ctx) {

        Expression objectName = visit(ctx.singleExpression());
        PostDecreaseExpression decreaseExp = new PostDecreaseExpression(objectName);
        return decreaseExp;
    }

    @Override
    public Expression visitPreIncrementExpression(JSParser.PreIncrementExpressionContext ctx) {
        Expression objectName = visit(ctx.singleExpression());
        PreIncrementExpression incrementExp = new PreIncrementExpression(objectName);
        return incrementExp;
    }

    @Override
    public Expression visitPreDecreaseExpression(JSParser.PreDecreaseExpressionContext ctx) {

        Expression objectName = visit(ctx.singleExpression());
        PreDecreaseExpression decreaseExp = new PreDecreaseExpression(objectName);
        return decreaseExp;
    }

    @Override
    public Expression visitUnaryPlusExpression(JSParser.UnaryPlusExpressionContext ctx) {

        Expression objectName = visit(ctx.singleExpression());
        UnaryPlusExpression unaryPlus = new UnaryPlusExpression(objectName);
        return unaryPlus;
    }

    @Override
    public Expression visitUnaryMinusExpression(JSParser.UnaryMinusExpressionContext ctx) {

        Expression objectName = visit(ctx.singleExpression());
        UnaryMinusExpression unaryMinus = new UnaryMinusExpression(objectName);
        return unaryMinus;
    }
}
