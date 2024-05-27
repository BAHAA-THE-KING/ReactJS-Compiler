package js.visitors;

import antlrJS.JSParser;
import antlrJS.JSParserBaseVisitor;
import js.visitors.models.Expression;

import java.util.ArrayList;
import java.util.List;

public class AntlrToExpressionList extends JSParserBaseVisitor<List<Expression>> {
    public String filePath;

    public AntlrToExpressionList(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public List<Expression> visitExpressionSequence(JSParser.ExpressionSequenceContext ctx) {
        AntlrToExpression visitor = new AntlrToExpression(filePath);
        List<Expression> result = new ArrayList<>();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) instanceof JSParser.SingleExpressionContext) {
                result.add(visitor.visit(ctx.getChild(i)));
            }
        }
        return result;
    }
}
