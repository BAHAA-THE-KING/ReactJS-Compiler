package js.expressions;

import js.visitors.models.Expression;
import org.antlr.v4.runtime.ParserRuleContext;

public class AssignmentOperatorExpression extends AssignmentExpression {
    public String operator;

    public AssignmentOperatorExpression(Expression left, Expression right, String operator, ParserRuleContext context) {
        super(left, right, context);
        this.operator = operator;
    }

    @Override
    public String toString() {
        return leftExpression + " " + operator + " " + rightExpression;
    }
}
