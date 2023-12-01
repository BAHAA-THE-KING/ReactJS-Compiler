package js;

import antlrJS.JSParser;
import antlrJS.JSParserBaseVisitor;
import js.ClassDeclaration.ClassElement;
import js.Function.FormalParameter;
import js.Function.Function;
import js.Function.FunctionBody;
import js.Function.FunctionDeclaration;
import js.PropertyName.PropertyName;

public class AntlrToClassElement extends JSParserBaseVisitor<ClassElement> {
    @Override
    public ClassElement visitClassFieldDefinition(JSParser.ClassFieldDefinitionContext ctx) {
        boolean isStatic = ctx.Static() != null;

        AntlrToPropertyName propertyNamevisitor = new AntlrToPropertyName();
        PropertyName propertyName = propertyNamevisitor.visit(ctx.fieldDefinition().propertyName());

        AntlrToExpression expressionVisitor = new AntlrToExpression();
        Expression expression = ctx.fieldDefinition().singleExpression() != null ? expressionVisitor.visit(ctx.fieldDefinition().singleExpression()) : null;

        return new ClassElement(isStatic, propertyName, expression);
    }

    @Override
    public ClassElement visitClassMethodDefinition(JSParser.ClassMethodDefinitionContext ctx) {
        boolean isStatic = ctx.Static() != null;

        AntlrToPropertyName propertyNameVisitor = new AntlrToPropertyName();
        PropertyName funcName = propertyNameVisitor.visit(ctx.methodDefinition().propertyName());

        AntlrToStatement statementVisitor = new AntlrToStatement();
        FormalParameter fp = (FormalParameter) statementVisitor.visit(ctx.methodDefinition().formalParameterList());

        FunctionBody body = (FunctionBody) statementVisitor.visitFunctionBody(ctx.methodDefinition().functionBody());

        FunctionDeclaration functionDeclaration = new FunctionDeclaration(funcName.toString(), fp.getParameters(), body);
        return new ClassElement(isStatic, funcName, functionDeclaration);
    }

    @Override
    public ClassElement visitClassEmptyStatement(JSParser.ClassEmptyStatementContext ctx) {
        return null;
    }
}
