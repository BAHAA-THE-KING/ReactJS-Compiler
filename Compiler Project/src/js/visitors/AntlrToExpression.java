package js.visitors;

import antlrJS.JSParser;
import antlrJS.JSParserBaseVisitor;
import js.expressions.ArrayLiteral.ArrayLiteral;
import js.expressions.Literals.TemplateStringLiteral;
import js.expressions.SimpleExpression;
import js.expressions.*;
import js.expressions.ArgumentsExpression.Arguments;
import js.expressions.ArgumentsExpression.ArgumentsExpression;
import js.expressions.ClassExpression;
import js.expressions.AssignmentOperatorExpression;
import js.expressions.LogicalExpression;
import js.visitors.models.ClassElement;
import js.visitors.models.Expression;
import java.util.ArrayList;

public class AntlrToExpression extends JSParserBaseVisitor<Expression> {

    @Override
    public Expression visitOptionalChainExpression(JSParser.OptionalChainExpressionContext ctx) {
        Expression objectName = visit(ctx.getChild(0));
        Expression objectProperty = visit(ctx.getChild(2));
        OptionalChainExpression optionalChainExpression = new OptionalChainExpression(objectName, objectProperty);
        return optionalChainExpression;
    }

    @Override
    public Expression visitNewExpression(JSParser.NewExpressionContext ctx) {
        String id = ctx.Identifier().getText();
        Arguments arguments = new Arguments(ctx.arguments());
        NewExpression newExpression = new NewExpression(id, arguments);
        return newExpression;
    }

    @Override
    public Expression visitArgumentsExpression(JSParser.ArgumentsExpressionContext ctx) {
        Expression expression = visit(ctx.singleExpression());
        Arguments arguments = new Arguments(ctx.arguments());
        ArgumentsExpression argumentsExpression = new ArgumentsExpression(expression, arguments);
        return argumentsExpression;
    }

    @Override
    public Expression visitClassExpression(JSParser.ClassExpressionContext ctx) {
        String name = ctx.Identifier() != null ? ctx.Identifier().getText() : "";
        ClassExpression classExpression = new ClassExpression(name);
        var classElements = ctx.classTail().classElements();
        AntlrToClassElement visitor = new AntlrToClassElement();
        for (int i = 0; i < classElements.getChildCount(); i++) {
            ClassElement classElement = visitor.visit(classElements.getChild(i));
            if (classElement != null) classExpression.addElement(classElement);
        }
        return classExpression;
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
    public Expression visitDeleteExpression(JSParser.DeleteExpressionContext ctx) {
        Expression identifier = visit(ctx.singleExpression());
        DeleteExpression delete = new DeleteExpression(identifier);
        return delete;
    }

    @Override
    public Expression visitTypeofExpression(JSParser.TypeofExpressionContext ctx) {
        Expression identifier = visit(ctx.singleExpression());
        TypeofExpression typeOf = new TypeofExpression(identifier);
        return typeOf;
    }

    @Override
    public Expression visitIdentifierExpression(JSParser.IdentifierExpressionContext ctx) {
        return new IdentifierExpression(ctx.Identifier().getText());
    }

    @Override
    public Expression visitMultiplicativeExpression(JSParser.MultiplicativeExpressionContext ctx) {
        Expression firstExpression = visit(ctx.singleExpression(0));
        Expression secondExpression = visit(ctx.singleExpression(1));
        String process = ctx.getChild(1).getText();
        MathmaticalExpression mathmaticalExpression = new MathmaticalExpression(firstExpression, secondExpression, process);
        return mathmaticalExpression;
    }

    @Override
    public Expression visitAdditiveExpression(JSParser.AdditiveExpressionContext ctx) {
        Expression firstExpression = visit(ctx.singleExpression(0));
        Expression secondExpression = visit(ctx.singleExpression(1));
        String process = ctx.getChild(1).getText();
        MathmaticalExpression mathmaticalExpression = new MathmaticalExpression(firstExpression, secondExpression, process);
        return mathmaticalExpression;
    }

    @Override
    public Expression visitCoalesceExpression(JSParser.CoalesceExpressionContext ctx) {
        Expression firstExpression = visit(ctx.singleExpression(0));
        Expression secondExpression = visit(ctx.singleExpression(1));
        String nullString = ctx.getChild(1).getText();
        CoalesceExpression coalesceExpression = new CoalesceExpression(firstExpression, secondExpression, nullString);
        return coalesceExpression;
    }

    @Override
    public Expression visitTernaryExpression(JSParser.TernaryExpressionContext ctx) {
        Expression condition = visit(ctx.singleExpression(0));
        Expression firstStatement = visit(ctx.singleExpression(1));
        Expression secondStatement = visit(ctx.singleExpression(2));
        TernaryExpression ternaryExpression = new TernaryExpression(condition, firstStatement, secondStatement);
        return ternaryExpression;
    }

    @Override
    public Expression visitAssignmentExpression(JSParser.AssignmentExpressionContext ctx) {
        Expression leftExpression = visit(ctx.singleExpression(0));
        Expression rightExpression = visit(ctx.singleExpression(1));
        AssignmentExpression assignmentExpression = new AssignmentExpression(leftExpression, rightExpression);
        return assignmentExpression;
    }

    @Override
    public Expression visitLogicalAndExpression(JSParser.LogicalAndExpressionContext ctx) {
        Expression left = visit(ctx.singleExpression(0));
        Expression right = visit(ctx.singleExpression(2));
        String operator = ctx.getChild(1).getText();
        LogicalExpression logical = new LogicalExpression(left, right, operator);
        return logical;
    }

    @Override
    public Expression visitLogicalOrExpression(JSParser.LogicalOrExpressionContext ctx) {
        Expression left = visit(ctx.singleExpression(0));
        Expression right = visit(ctx.singleExpression(2));
        String operator = ctx.getChild(1).getText();
        LogicalExpression logical = new LogicalExpression(left, right, operator);
        return logical;
    }

    @Override
    public Expression visitEqualityExpression(JSParser.EqualityExpressionContext ctx) {

        Expression left = visit(ctx.singleExpression(0));
        Expression right = visit(ctx.singleExpression(2));
        String operator = ctx.getChild(1).getText();
        LogicalExpression logical = new LogicalExpression(left, right, operator);
        return logical;
    }

    @Override
    public Expression visitAssignmentOperatorExpression(JSParser.AssignmentOperatorExpressionContext ctx) {
        Expression left = visit(ctx.singleExpression(0));
        Expression right = visit(ctx.singleExpression(3));
        String operator = ctx.getChild(1).getText();
        AssignmentOperatorExpression assignmentOperatorExpression = new AssignmentOperatorExpression(left, right, operator);
        return assignmentOperatorExpression;

    }
    @Override
    public Expression visitThisExpression(JSParser.ThisExpressionContext ctx) {
        return new SimpleExpression().This();
    }

    @Override
    public Expression visitSuperExpression(JSParser.SuperExpressionContext ctx) {
        return new SimpleExpression().Super();
    }

    @Override
    public Expression visitMemberIndexExpression(JSParser.MemberIndexExpressionContext ctx) {
        Expression accessedExpression = this.visit(ctx.singleExpression());
        ExpressionSequence accessedAt = new ExpressionSequence(ctx.expressionSequence());
        return new MemberIndex(accessedExpression,accessedAt);

    }

    @Override
    public Expression visitAnonymousFunctionDecl(JSParser.AnonymousFunctionDeclContext ctx) {
        AntlrToAnonymousFunction visitor = new AntlrToAnonymousFunction();
        return visitor.visit(ctx);
    }

    @Override
    public Expression visitParenthesizedExpression(JSParser.ParenthesizedExpressionContext ctx) {
         return new ParenthesizedExpression(ctx.expressionSequence());
    }

    @Override
    public Expression visitLiteralExpression(JSParser.LiteralExpressionContext ctx) {
        AntlrToLiteral visitor = new AntlrToLiteral();
        return visitor.visit(ctx.literal());
    }

    @Override
    public Expression visitArrayLiteralExpression(JSParser.ArrayLiteralExpressionContext ctx) {
        return new ArrayLiteral(ctx.arrayLiteral());
    }

}