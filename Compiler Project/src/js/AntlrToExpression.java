package js;

import antlrJS.JSParser;
import antlrJS.JSParserBaseVisitor;
import js.ClassDeclaration.ClassDeclaration;
import js.ClassDeclaration.ClassElement;
import js.ExpAbdulla.*;
import js.ExpAbood.LogicalExpression;

public class AntlrToExpression extends JSParserBaseVisitor<Expression> {

    @Override
    public Expression visitOptionalChainExpression(JSParser.OptionalChainExpressionContext ctx) {
        Expression objectName =  visit(ctx.getChild(0));
        Expression objectProperty =  visit(ctx.getChild(2));
        OptionalChainExpression optionalChainExpression = new OptionalChainExpression(objectName , objectProperty);
        return optionalChainExpression;
    }

    @Override
    public Expression visitNewExpression(JSParser.NewExpressionContext ctx) {
        String id = ctx.Identifier().getText();
       Arguments arguments = new Arguments(ctx.arguments());
       NewExpression newExpression = new NewExpression( id , arguments);
       return  newExpression;
    }

    @Override
    public Expression visitArgumentsExpression(JSParser.ArgumentsExpressionContext ctx) {
        Expression expression = visit(ctx.singleExpression());
        Arguments arguments = new Arguments(ctx.arguments());
        ArgumentsExpression argumentsExpression = new ArgumentsExpression(expression , arguments);
        return argumentsExpression;
    }
@Override
    public Expression visitClassExpression(JSParser.ClassExpressionContext ctx) {
        String name = ctx.Identifier() != null ? ctx.Identifier().getText() : "";
        ClassDeclaration classDeclaration = new ClassDeclaration(name, "");
        var classElements = ctx.classTail().classElements();
        AntlrToClassElement visitor = new AntlrToClassElement();
        for (int i = 0; i < classElements.getChildCount(); i++) {
            ClassElement classElement = visitor.visit(classElements.getChild(i));
            if (classElement != null) classDeclaration.addElement(classElement);
        }
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

    @Override
    public Expression visitMultiplicativeExpression(JSParser.MultiplicativeExpressionContext ctx) {


        return super.visitMultiplicativeExpression(ctx);
    }

    @Override
    public Expression visitLogicalAndExpression(JSParser.LogicalAndExpressionContext ctx) {
        Expression left = visit(ctx.singleExpression(0));
        Expression right = visit(ctx.singleExpression(2));
        String operator = ctx.getChild(1).getText();
        LogicalExpression logical =new LogicalExpression(left,right,operator);
        return logical;
    }

    @Override
    public Expression visitLogicalOrExpression(JSParser.LogicalOrExpressionContext ctx) {
        Expression left = visit(ctx.singleExpression(0));
        Expression right = visit(ctx.singleExpression(2));
        String operator = ctx.getChild(1).getText();
        LogicalExpression logical =new LogicalExpression(left,right,operator);
        return logical;
    }

    @Override
    public Expression visitEqualityExpression(JSParser.EqualityExpressionContext ctx) {

        Expression left = visit(ctx.singleExpression(0));
        Expression right = visit(ctx.singleExpression(2));
        String operator = ctx.getChild(1).getText();
        LogicalExpression logical =new LogicalExpression(left,right,operator);
        return logical;
    }
}
