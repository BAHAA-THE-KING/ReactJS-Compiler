package js.expressions;

import antlrJS.JSParser;
import js.visitors.AntlrToExpressionList;
import js.visitors.models.Expression;

import java.util.List;

public class ExpressionSequence {
    List<Expression> list ;
    public ExpressionSequence(JSParser.ExpressionSequenceContext ctx) {
        AntlrToExpressionList visitor = new AntlrToExpressionList();
        this.list = visitor.visit(ctx);
    }
}
