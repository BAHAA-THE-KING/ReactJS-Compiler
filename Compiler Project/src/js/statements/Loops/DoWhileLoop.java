package js.statements.Loops;

import js.expressions.ExpressionSequence;
import js.visitors.models.Expression;
import js.visitors.models.IterationStatement;
import js.visitors.models.Statement;

import java.util.List;

public class DoWhileLoop implements IterationStatement {
    Statement statement;
    ExpressionSequence expressions;

    public DoWhileLoop(Statement statement, ExpressionSequence expressions) {
        this.statement = statement;
        this.expressions = expressions;
    }

    @Override
    public String toString() {
        return "DoWhileLoop{" + "statements=" + statement + ", expressions=" + expressions + '}';
    }
}
