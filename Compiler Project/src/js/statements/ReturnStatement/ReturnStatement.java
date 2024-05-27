package js.statements.ReturnStatement;

import js.expressions.ExpressionSequence;
import js.visitors.models.Statement;

public class ReturnStatement implements Statement {
    public ExpressionSequence expr;

    public ReturnStatement(ExpressionSequence expr) {
        this.expr = expr;
    }

    @Override
    public String toString() {
        return "return " + expr;
    }
}
