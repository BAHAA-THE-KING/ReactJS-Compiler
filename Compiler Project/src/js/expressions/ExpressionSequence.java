package js.expressions;

import antlrJS.JSParser;
import js.visitors.AntlrToExpressionList;
import js.visitors.models.Expression;

import java.util.ArrayList;
import java.util.List;

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
}
