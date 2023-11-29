package js;

import antlrJS.JSParser;
import antlrJS.JSParserBaseVisitor;
import js.ClassDeclaration.ClassElement;
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
        //TODO BAHAA
        return super.visitClassMethodDefinition(ctx);
    }

    @Override
    public ClassElement visitClassEmptyStatement(JSParser.ClassEmptyStatementContext ctx) {
        return null;
    }
}
