package js.statements.Loops;

import js.expressions.ExpressionSequence;
import js.visitors.models.IterationStatement;
import js.visitors.models.Statement;

public class ForOfLoop implements IterationStatement {
    public Statement firstPart;
    public ExpressionSequence expressions;
    public Statement statement;

    public ForOfLoop(Statement firstPart, ExpressionSequence expressions, Statement statement) {
        this.firstPart = firstPart;
        this.expressions = expressions;
        this.statement = statement;
    }

    @Override
    public String toString() {
        return "for (" + firstPart + " of " + expressions + ")\n" + statement;
    }
}
