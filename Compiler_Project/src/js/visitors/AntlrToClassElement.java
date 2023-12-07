package js.visitors;

import antlrJS.JSParser;
import antlrJS.JSParserBaseVisitor;
import js.statements.ClassDeclaration.ClassFieldDefinition;
import js.statements.ClassDeclaration.ClassMethodDefinition;
import js.visitors.models.*;
import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;
import java.util.List;

public class AntlrToClassElement extends JSParserBaseVisitor<ClassElement> {
    public String filePath;

    public AntlrToClassElement(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public ClassElement visitClassFieldDefinition(JSParser.ClassFieldDefinitionContext ctx) {
        boolean isStatic = ctx.Static() != null;

        AntlrToPropertyName propertyNamevisitor = new AntlrToPropertyName(filePath);
        PropertyName propertyName = propertyNamevisitor.visit(ctx.fieldDefinition().propertyName());

        AntlrToExpression expressionVisitor = new AntlrToExpression(filePath);
        Expression expression = ctx.fieldDefinition().singleExpression() != null ? expressionVisitor.visit(ctx.fieldDefinition().singleExpression()) : null;

        return new ClassFieldDefinition(isStatic, propertyName, expression);
    }

    @Override
    public ClassElement visitClassMethodDefinition(JSParser.ClassMethodDefinitionContext ctx) {
        boolean isStatic = ctx.Static() != null;

        AntlrToPropertyName propertyNameVisitor = new AntlrToPropertyName(filePath);
        PropertyName funcName = propertyNameVisitor.visit(ctx.methodDefinition().propertyName());

        Parameters parameters = new AntlrToParameters(filePath).visitFormalParameterList(ctx.methodDefinition().formalParameterList());

        List<Statement> body = new ArrayList<>();
        AntlrToStatement statementVisitor = new AntlrToStatement(filePath);
        var functionBody = ctx.methodDefinition().functionBody();
        for (int i = 0; i < functionBody.statement().size(); i++) {
            body.add(statementVisitor.visit(functionBody.statement(i)));
        }
        return new ClassMethodDefinition(isStatic, funcName, parameters, body);
    }

    @Override
    public ClassElement visitClassEmptyStatement(JSParser.ClassEmptyStatementContext ctx) {
        return null;
    }
}
