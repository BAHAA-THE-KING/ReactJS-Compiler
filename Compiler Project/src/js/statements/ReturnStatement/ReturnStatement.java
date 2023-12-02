package js.statements.ReturnStatement;

import js.expressions.ExpressionSequence;
import js.visitors.models.Expression;
import js.visitors.models.Statement;

import java.util.List;

public class ReturnStatement implements Statement {
    ExpressionSequence expr;

    public ReturnStatement(ExpressionSequence expr) {
        this.expr = expr;
    }

    @Override
    public String toString() {
        return "ReturnStatement{" + "expr=" + expr + '}';
    }
}
