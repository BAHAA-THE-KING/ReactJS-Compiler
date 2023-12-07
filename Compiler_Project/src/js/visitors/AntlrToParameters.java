package js.visitors;

import antlrJS.JSParser;
import antlrJS.JSParserBaseVisitor;
import js.visitors.models.Assignable;
import js.visitors.models.Expression;
import js.visitors.models.Parameters;
import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;
import java.util.List;

public class AntlrToParameters extends JSParserBaseVisitor<Parameters> {
    public String filePath;

    public AntlrToParameters(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public Parameters visitFormalParameterList(JSParser.FormalParameterListContext ctx) {
        List<Pair<Assignable, Expression>> parameters = new ArrayList<>();
        AntlrToExpression expressionVisitor = new AntlrToExpression(filePath);
        AntlrToAssignable assignableVisitor = new AntlrToAssignable(filePath);
        if (ctx.formalParameterArg() != null) {
            for (int i = 0; i < ctx.formalParameterArg().size(); i++) {
                Assignable name = assignableVisitor.visit(ctx.formalParameterArg(i).assignable());
                Expression value = ctx.formalParameterArg(i).singleExpression() != null ? expressionVisitor.visit(ctx.formalParameterArg(i).singleExpression()) : null;
                parameters.add(new Pair<>(name, value));
            }
        }

        Expression spreadParameter = ctx.lastFormalParameterArg() != null ? expressionVisitor.visit(ctx.lastFormalParameterArg()) : null;

        return new Parameters(parameters, spreadParameter);
    }
}
