package js.statements.Loops;

import js.expressions.ExpressionSequence;
import js.visitors.models.Expression;
import js.visitors.models.IterationStatement;
import js.visitors.models.Statement;

import java.util.List;

public class ForInLoop implements IterationStatement {
    public Statement firstPart;
    public ExpressionSequence expressions;
    public Statement statement;

    public ForInLoop(Statement firstPart, ExpressionSequence expressions, Statement statement) {
        this.firstPart = firstPart;
        this.expressions = expressions;
        this.statement = statement;
    }
}
