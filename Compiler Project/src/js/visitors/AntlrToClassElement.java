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
    public String filePath ;

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

        AntlrToExpression expressionVisitor = new AntlrToExpression(filePath);
        AntlrToAssignable assignableVisitor = new AntlrToAssignable(filePath);
        var allParameters = ctx.methodDefinition().formalParameterList();
        List<Pair<Assignable, Expression>> parameters = new ArrayList<>();
        for (int i = 0; i < allParameters.formalParameterArg().size(); i++) {
            Assignable name = assignableVisitor.visit(allParameters.formalParameterArg(i).assignable());
            Expression value = allParameters.formalParameterArg(i).singleExpression() != null ? expressionVisitor.visit(allParameters.formalParameterArg(i).singleExpression()) : null;
            parameters.add(new Pair<>(name, value));
        }

        Expression spreadParameter = allParameters.lastFormalParameterArg() != null ? expressionVisitor.visit(allParameters.lastFormalParameterArg()) : null;

        List<Statement> body = new ArrayList<>();
        AntlrToStatement statementVisitor = new AntlrToStatement(filePath);
        var functionBody = ctx.methodDefinition().functionBody();
        for (int i = 0; i < functionBody.statement().size(); i++) {
            body.add(statementVisitor.visit(functionBody.statement(i)));
        }
        return new ClassMethodDefinition(isStatic, funcName, parameters, spreadParameter, body);
    }

    @Override
    public ClassElement visitClassEmptyStatement(JSParser.ClassEmptyStatementContext ctx) {
        return null;
    }
}
