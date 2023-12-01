package js.ImportStatement;

import js.Expression;
import js.ExpressionSequence;

import java.util.List;

public class MemberIndex implements Expression {
    Expression accessedExpression;
    ExpressionSequence accessedAt;

    public MemberIndex(Expression accessedExpression, ExpressionSequence accessedAt) {
        this.accessedExpression = accessedExpression;
        this.accessedAt = accessedAt;
    }
}
