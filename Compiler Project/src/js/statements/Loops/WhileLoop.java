package js.statements.Loops;

import js.expressions.ExpressionSequence;
import js.visitors.models.IterationStatement;
import js.visitors.models.Statement;

public class WhileLoop implements IterationStatement {
    public Statement statement;
    public ExpressionSequence expressions;

    public WhileLoop(Statement statement, ExpressionSequence expressions) {
        this.statement = statement;
        this.expressions = expressions;
    }

    @Override
    public String toString() {
        return "while (" + expressions + ")\n" + statement;
    }
}
