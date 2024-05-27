package js.expressions;

import antlrJS.JSParser;
import js.visitors.AntlrToExpressionList;
import js.visitors.models.Expression;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class ExpressionSequence implements Expression {
    public List<Expression> list;

    public ExpressionSequence(JSParser.ExpressionSequenceContext ctx, String filePath) {
        AntlrToExpressionList visitor = new AntlrToExpressionList(filePath);
        this.list = visitor.visit(ctx);
    }

    public ExpressionSequence() {
        this.list = new ArrayList<>();
    }

    public ExpressionSequence(Expression exp) {
        this.list = new ArrayList<>();
        this.list.add(exp);
    }

    public void addExpression(Expression expression) {
        this.list.add(expression);
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
