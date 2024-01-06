package js.expressions;

import antlrJS.JSParser;
import js.expressions.ArgumentsExpression.Argument;
import js.visitors.AntlrToExpressionList;
import js.visitors.models.Expression;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class ExpressionSequence implements Expression {
    public List<Expression> list;
    public ExpressionSequence(JSParser.ExpressionSequenceContext ctx,String filePath) {
        AntlrToExpressionList visitor = new AntlrToExpressionList(filePath);
        this.list = visitor.visit(ctx);
    }

    public ExpressionSequence(Expression exp,String filePath) {
        AntlrToExpressionList visitor = new AntlrToExpressionList(filePath);
        this.list = new ArrayList<>();
        this.list.add(exp);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ");
        for (Expression arg : list) {
            joiner.add(arg.toString());
        }
        return joiner.toString();
    }
}
