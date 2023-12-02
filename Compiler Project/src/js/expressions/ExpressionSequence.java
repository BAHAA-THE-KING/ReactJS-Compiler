package js.expressions;

import antlrJS.JSParser;
import js.visitors.AntlrToExpressionList;
import js.visitors.models.Expression;

import java.util.ArrayList;
import java.util.List;

public class ExpressionSequence implements Expression {
    List<Expression> list;

    public ExpressionSequence(JSParser.ExpressionSequenceContext ctx) {
        AntlrToExpressionList visitor = new AntlrToExpressionList();
        this.list = visitor.visit(ctx);
    }

    public ExpressionSequence(Expression exp) {
        AntlrToExpressionList visitor = new AntlrToExpressionList();
        this.list = new ArrayList<>();
        this.list.add(exp);
    }
}
