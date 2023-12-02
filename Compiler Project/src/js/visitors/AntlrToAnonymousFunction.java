package js.visitors;

import antlrJS.JSParser;
import antlrJS.JSParserBaseVisitor;
import js.expressions.ExpressionSequence;
import js.expressions.Function.AnonymousFunction;
import js.expressions.Function.ArrowFunction;
import js.statements.ReturnStatement.ReturnStatement;
import js.visitors.models.Assignable;
import js.visitors.models.Expression;
import js.visitors.models.Function;
import js.visitors.models.Statement;
import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;
import java.util.List;

public class AntlrToAnonymousFunction extends JSParserBaseVisitor<Function> {
    @Override
    public Function visitAnonymousFunctionDecl(JSParser.AnonymousFunctionDeclContext ctx) {
        AntlrToExpression expressionVisitor = new AntlrToExpression();
        AntlrToAssignable assignableVisitor = new AntlrToAssignable();
        var allParameters = ctx.formalParameterList();
        List<Pair<Assignable, Expression>> parameters = new ArrayList<>();
        for (int i = 0; i < allParameters.formalParameterArg().size(); i++) {
            Assignable name = assignableVisitor.visit(allParameters.formalParameterArg(i).assignable());
            Expression value = allParameters.formalParameterArg(i).singleExpression() != null ? expressionVisitor.visit(allParameters.formalParameterArg(i).singleExpression()) : null;
            parameters.add(new Pair<>(name, value));
        }

        Expression spreadParameter = allParameters.lastFormalParameterArg() != null ? expressionVisitor.visit(allParameters.lastFormalParameterArg()) : null;

        List<Statement> body = new ArrayList<>();
        AntlrToStatement statementVisitor = new AntlrToStatement();
        var functionBody = ctx.functionBody();
        for (int i = 0; i < functionBody.statement().size(); i++) {
            body.add(statementVisitor.visit(functionBody.statement(i)));
        }
        return new AnonymousFunction(parameters, spreadParameter, body);
    }

    @Override
    public Function visitArrowFunction(JSParser.ArrowFunctionContext ctx) {
        AntlrToExpression expressionVisitor = new AntlrToExpression();
        AntlrToAssignable assignableVisitor = new AntlrToAssignable();
        var allParameters = ctx.arrowFunctionParameters();
        List<Pair<Assignable, Expression>> parameters = new ArrayList<>();
        Expression spreadParameter = null;
        if (allParameters.formalParameterList() != null) {
            for (int i = 0; i < allParameters.formalParameterList().formalParameterArg().size(); i++) {
                Assignable name = assignableVisitor.visit(allParameters.formalParameterList().formalParameterArg(i).assignable());
                Expression value = allParameters.formalParameterList().formalParameterArg(i).singleExpression() != null ? expressionVisitor.visit(allParameters.formalParameterList().formalParameterArg(i).singleExpression()) : null;
                parameters.add(new Pair<>(name, value));
            }
            spreadParameter = allParameters.formalParameterList().lastFormalParameterArg() != null ? expressionVisitor.visit(allParameters.formalParameterList().lastFormalParameterArg()) : null;
        }
        if (allParameters.Identifier() != null) {
            parameters.add(new Pair<>(assignableVisitor.visit(allParameters.Identifier()), null));
        }

        List<Statement> body = new ArrayList<>();
        AntlrToStatement statementVisitor = new AntlrToStatement();
        var arrowFunctionBody = ctx.arrowFunctionBody();
        if (arrowFunctionBody.functionBody() != null) {
            for (int i = 0; i < arrowFunctionBody.functionBody().statement().size(); i++) {
                body.add(statementVisitor.visit(arrowFunctionBody.functionBody().statement(i)));
            }
        }
        if (arrowFunctionBody.singleExpression() != null) {
            Expression expression = expressionVisitor.visit(arrowFunctionBody.singleExpression());
            ExpressionSequence expressions = new ExpressionSequence(expression);
            body.add(new ReturnStatement(expressions));
        }
        return new ArrowFunction(parameters, spreadParameter, body);
    }
}
