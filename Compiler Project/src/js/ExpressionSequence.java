package js;

import antlrJS.JSParser;

import java.util.List;

public class ExpressionSequence {
    List<Expression> list ;
    public ExpressionSequence(JSParser.ExpressionSequenceContext ctx) {
        AntlrToExpressionList visitor = new AntlrToExpressionList();
        this.list = visitor.visit(ctx);
    }
}
