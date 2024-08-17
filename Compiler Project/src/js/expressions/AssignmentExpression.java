package js.expressions;

import js.visitors.models.Expression;
import org.antlr.v4.runtime.ParserRuleContext;

public class AssignmentExpression implements Expression {
    public Expression leftExpression;
    public Expression rightExpression;
    public ParserRuleContext context;

    public AssignmentExpression(Expression leftExpression, Expression rightExpression, ParserRuleContext context) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.context = context;
    }

    @Override
    public String toString() {
        return leftExpression + " = " + rightExpression;
    }
}
