package js.expressions;

import js.visitors.models.Expression;
import org.antlr.v4.runtime.ParserRuleContext;

public class RelationalExpression implements Expression {

    public Expression leftExpression;
    public Expression rightExpression;
    public String comparision;
    public ParserRuleContext context;

    public RelationalExpression(Expression leftExpression, Expression rightExpression, String comparision, ParserRuleContext context) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.comparision = comparision;
        this.context = context;
    }

    @Override
    public String toString() {
        return "RelationalExpression{" +
                "leftExpression=" + leftExpression +
                ", \nrightExpression=" + rightExpression +
                ", \ncomparision='" + comparision + '\'' +
                ", \ncontext=" + context +
                '}';
    }
}
