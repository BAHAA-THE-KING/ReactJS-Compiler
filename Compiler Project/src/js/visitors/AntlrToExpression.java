package js.visitors;

import antlrJS.JSParser;
import antlrJS.JSParserBaseVisitor;
import js.expressions.ArgumentsExpression.*;
import js.expressions.ArrayLiteral.ArrayLiteral;
import js.expressions.*;
import js.expressions.Function.AnonymousFunction;
import js.expressions.Literals.ObjectLiteral;
import js.visitors.models.ClassElement;
import js.visitors.models.Expression;

public class AntlrToExpression extends JSParserBaseVisitor<Expression> {

    public String filePath;

    public AntlrToExpression(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public Expression visitOptionalChainExpression(JSParser.OptionalChainExpressionContext ctx) {
        Expression objectName = visit(ctx.singleExpression(0));
        Expression objectProperty = visit(ctx.singleExpression(1));
        boolean checkNull = ctx.QuestionMark() != null;
        return new OptionalChainExpression(objectName, objectProperty, checkNull);
    }

    @Override
    public Expression visitNewExpression(JSParser.NewExpressionContext ctx) {
        String id = ctx.Identifier().getText();
        Arguments arguments = new Arguments(ctx.arguments(), filePath);
        return new NewExpression(id, arguments);
    }

    @Override
    public Expression visitArgumentsExpression(JSParser.ArgumentsExpressionContext ctx) {
        Expression expression = visit(ctx.singleExpression());
        Arguments arguments = new Arguments(ctx.arguments(), filePath);
        return new ArgumentsExpression(expression, arguments);
    }

    @Override
    public Expression visitUseStateExpression(JSParser.UseStateExpressionContext ctx) {
        Argument argument = new Argument(visit(ctx.argument()));
        return new UseStateFunction(argument, ctx);
    }

    @Override
    public Expression visitUseEffectExpression(JSParser.UseEffectExpressionContext ctx) {
        AntlrToAnonymousFunction visitor = new AntlrToAnonymousFunction(filePath);
        AnonymousFunction anonymousFunction = (AnonymousFunction) visitor.visit(ctx.anonymousFunction());
        ArrayLiteral deps = ctx.arrayLiteral() != null ? new ArrayLiteral(ctx.arrayLiteral(), "") : null;
        return new UseEffectFunction(anonymousFunction, deps, ctx);
    }

    @Override
    public Expression visitUseRefExpression(JSParser.UseRefExpressionContext ctx) {
        Argument argument = ctx.argument() != null ? new Argument(visit(ctx.argument())) : null;
        return new UseRefFunction(argument, ctx);
    }

    @Override
    public Expression visitClassExpression(JSParser.ClassExpressionContext ctx) {
        String name = ctx.Identifier() != null ? ctx.Identifier().getText() : "";
        ClassExpression classExpression = new ClassExpression(name);
        var classElements = ctx.classTail().classElements();
        AntlrToClassElement visitor = new AntlrToClassElement(filePath);
        for (int i = 0; i < classElements.getChildCount(); i++) {
            ClassElement classElement = visitor.visit(classElements.getChild(i));
            if (classElement != null) classExpression.addElement(classElement);
        }
        return classExpression;
    }

    @Override
    public Expression visitPostIncrementExpression(JSParser.PostIncrementExpressionContext ctx) {
        Expression objectName = visit(ctx.singleExpression());
        return new PostIncrementExpression(objectName);
    }

    @Override
    public Expression visitPostDecreaseExpression(JSParser.PostDecreaseExpressionContext ctx) {

        Expression objectName = visit(ctx.singleExpression());
        return new PostDecreaseExpression(objectName);
    }

    @Override
    public Expression visitPreIncrementExpression(JSParser.PreIncrementExpressionContext ctx) {
        Expression objectName = visit(ctx.singleExpression());
        return new PreIncrementExpression(objectName);
    }

    @Override
    public Expression visitPreDecreaseExpression(JSParser.PreDecreaseExpressionContext ctx) {

        Expression objectName = visit(ctx.singleExpression());
        return new PreDecreaseExpression(objectName);
    }

    @Override
    public Expression visitUnaryPlusExpression(JSParser.UnaryPlusExpressionContext ctx) {

        Expression objectName = visit(ctx.singleExpression());
        return new UnaryExpression("+", objectName);
    }

    @Override
    public Expression visitUnaryMinusExpression(JSParser.UnaryMinusExpressionContext ctx) {

        Expression objectName = visit(ctx.singleExpression());
        return new UnaryExpression("-", objectName);
    }

    @Override
    public Expression visitDeleteExpression(JSParser.DeleteExpressionContext ctx) {
        Expression identifier = visit(ctx.singleExpression());
        return new DeleteExpression(identifier);
    }

    @Override
    public Expression visitTypeofExpression(JSParser.TypeofExpressionContext ctx) {
        Expression identifier = visit(ctx.singleExpression());
        return new TypeofExpression(identifier);
    }

    @Override
    public Expression visitIdentifierExpression(JSParser.IdentifierExpressionContext ctx) {
        return new IdentifierExpression(ctx.Identifier().getText(), ctx);
    }

    @Override
    public Expression visitMultiplicativeExpression(JSParser.MultiplicativeExpressionContext ctx) {
        Expression firstExpression = visit(ctx.singleExpression(0));
        Expression secondExpression = visit(ctx.singleExpression(1));
        String process = ctx.getChild(1).getText();
        return new MathmaticalExpression(firstExpression, secondExpression, process);
    }

    @Override
    public Expression visitAdditiveExpression(JSParser.AdditiveExpressionContext ctx) {
        Expression firstExpression = visit(ctx.singleExpression(0));
        Expression secondExpression = visit(ctx.singleExpression(1));
        String process = ctx.getChild(1).getText();
        return new MathmaticalExpression(firstExpression, secondExpression, process);
    }

    @Override
    public Expression visitCoalesceExpression(JSParser.CoalesceExpressionContext ctx) {
        Expression firstExpression = visit(ctx.singleExpression(0));
        Expression secondExpression = visit(ctx.singleExpression(1));
        return new CoalesceExpression(firstExpression, secondExpression);
    }

    @Override
    public Expression visitTernaryExpression(JSParser.TernaryExpressionContext ctx) {
        Expression condition = visit(ctx.singleExpression(0));
        Expression firstStatement = visit(ctx.singleExpression(1));
        Expression secondStatement = visit(ctx.singleExpression(2));
        return new TernaryExpression(condition, firstStatement, secondStatement);
    }

    @Override
    public Expression visitAssignmentExpression(JSParser.AssignmentExpressionContext ctx) {
        Expression leftExpression = visit(ctx.singleExpression(0));
        Expression rightExpression = visit(ctx.singleExpression(1));
        return new AssignmentExpression(leftExpression, rightExpression, ctx);
    }

    @Override
    public Expression visitLogicalAndExpression(JSParser.LogicalAndExpressionContext ctx) {
        Expression left = visit(ctx.singleExpression(0));
        Expression right = visit(ctx.singleExpression(2));
        String operator = ctx.getChild(1).getText();
        return new LogicalExpression(left, right, operator);
    }

    @Override
    public Expression visitLogicalOrExpression(JSParser.LogicalOrExpressionContext ctx) {
        Expression left = visit(ctx.singleExpression(0));
        Expression right = visit(ctx.singleExpression(1));
        String operator = ctx.getChild(1).getText();
        return new LogicalExpression(left, right, operator);
    }

    @Override
    public Expression visitEqualityExpression(JSParser.EqualityExpressionContext ctx) {

        Expression left = visit(ctx.singleExpression(0));
        Expression right = visit(ctx.singleExpression(1));
        String operator = ctx.getChild(1).getText();
        return new LogicalExpression(left, right, operator);
    }

    @Override
    public Expression visitAssignmentOperatorExpression(JSParser.AssignmentOperatorExpressionContext ctx) {
        Expression left = visit(ctx.singleExpression(0));
        Expression right = visit(ctx.singleExpression(1));
        String operator = ctx.getChild(1).getText();
        AssignmentOperatorExpression assignmentOperatorExpression = new AssignmentOperatorExpression(left, right, operator, ctx);
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
        ExpressionSequence accessedAt = new ExpressionSequence(ctx.expressionSequence(), filePath);
        boolean checkNull = ctx.QuestionMarkDot() != null;
        return new MemberIndex(accessedExpression, accessedAt, checkNull);

    }

    @Override
    public Expression visitAnonymousFunctionDecl(JSParser.AnonymousFunctionDeclContext ctx) {
        AntlrToAnonymousFunction visitor = new AntlrToAnonymousFunction(filePath);
        return visitor.visit(ctx);
    }

    @Override
    public Expression visitParenthesizedExpression(JSParser.ParenthesizedExpressionContext ctx) {
        return new ParenthesizedExpression(ctx.expressionSequence(), filePath);
    }

    @Override
    public Expression visitLiteralExpression(JSParser.LiteralExpressionContext ctx) {
        AntlrToLiteral visitor = new AntlrToLiteral(filePath);
        return visitor.visit(ctx.literal());
    }

    @Override
    public Expression visitArrayLiteralExpression(JSParser.ArrayLiteralExpressionContext ctx) {
        return new ArrayLiteral(ctx.arrayLiteral(), filePath);
    }

    @Override
    public Expression visitObjectLiteralExpression(JSParser.ObjectLiteralExpressionContext ctx) {
        ObjectLiteral literal = new ObjectLiteral();
        AntlrToProperty attributeVisitor = new AntlrToProperty(filePath);
        for (JSParser.PropertyAssignmentContext child : ctx.objectLiteral().propertyAssignment()) {
            literal.addAttribute(attributeVisitor.visit(child));
        }
        return literal;
    }

    @Override
    public Expression visitJSXExpression(JSParser.JSXExpressionContext ctx) {
        return new AntlrToJSXElement(filePath).visit(ctx.jsxElement());
    }

    @Override
    public Expression visitArrowFunction(JSParser.ArrowFunctionContext ctx) {
        return (new AntlrToAnonymousFunction(filePath)).visitArrowFunction(ctx);
    }

    @Override
    public Expression visitNotExpression(JSParser.NotExpressionContext ctx) {
        return new UnaryExpression(ctx.Not().getText(), this.visit(ctx.singleExpression()));
    }

    @Override
    public Expression visitRelationalExpression(JSParser.RelationalExpressionContext ctx) {
        Expression left = visit(ctx.singleExpression(0));
        Expression right = visit(ctx.singleExpression(1));
        String comparision = ctx.getChild(1).toString();

        return new RelationalExpression(left, right, comparision, ctx);
    }

    @Override
    public Expression visitUndefined(JSParser.UndefinedContext ctx) {
        return new SimpleExpression().Undefined();
    }

    @Override
    public Expression visitAttributeInjection(JSParser.AttributeInjectionContext ctx) {
        return visit(ctx.expressionInjection().singleExpression());
    }
}