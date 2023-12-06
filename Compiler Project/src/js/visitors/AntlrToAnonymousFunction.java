package js.visitors;

import antlrJS.JSParser;
import antlrJS.JSParserBaseVisitor;
import js.expressions.ExpressionSequence;
import js.expressions.Function.AnonymousFunction;
import js.expressions.Function.ArrowFunction;
import js.statements.ReturnStatement.ReturnStatement;
import js.visitors.models.*;
import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;
import java.util.List;

public class AntlrToAnonymousFunction extends JSParserBaseVisitor<Function> {
    public String filePath;

    public AntlrToAnonymousFunction(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public Function visitAnonymousFunctionDecl(JSParser.AnonymousFunctionDeclContext ctx) {
        Parameters parameters = new AntlrToParameters(filePath).visitFormalParameterList(ctx.formalParameterList());
        List<Statement> body = new ArrayList<>();
        AntlrToStatement statementVisitor = new AntlrToStatement(filePath);
        var functionBody = ctx.functionBody();
        for (int i = 0; i < functionBody.statement().size(); i++) {
            body.add(statementVisitor.visit(functionBody.statement(i)));
        }
        return new AnonymousFunction(parameters, body);
    }

    @Override
    public Function visitArrowFunction(JSParser.ArrowFunctionContext ctx) {
        Parameters parameters = new Parameters(new ArrayList<>(), null);
        if (ctx.arrowFunctionParameters().Identifier() != null) {
            parameters.values.add(new Pair<>(new AntlrToAssignable(filePath).visit(ctx.arrowFunctionParameters().Identifier()), null));
        } else {
            parameters = new AntlrToParameters(filePath).visitFormalParameterList(ctx.arrowFunctionParameters().formalParameterList());
        }

        List<Statement> body = new ArrayList<>();
        AntlrToStatement statementVisitor = new AntlrToStatement(filePath);
        var arrowFunctionBody = ctx.arrowFunctionBody();
        if (arrowFunctionBody.functionBody() != null) {
            for (int i = 0; i < arrowFunctionBody.functionBody().statement().size(); i++) {
                body.add(statementVisitor.visit(arrowFunctionBody.functionBody().statement(i)));
            }
        }
        if (arrowFunctionBody.singleExpression() != null) {
            Expression expression = new AntlrToExpression(filePath).visit(arrowFunctionBody.singleExpression());
            ExpressionSequence expressions = new ExpressionSequence(expression, filePath);
            body.add(new ReturnStatement(expressions));
        }
        return new ArrowFunction(parameters, body);
    }
}
