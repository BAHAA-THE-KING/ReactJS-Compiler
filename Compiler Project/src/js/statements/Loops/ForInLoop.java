package js.statements.Loops;

import js.expressions.ExpressionSequence;
import js.visitors.models.Expression;
import js.visitors.models.IterationStatement;
import js.visitors.models.Statement;

import java.util.List;

public class ForInLoop implements IterationStatement {
    Statement firstPart;
    ExpressionSequence expressions;
    Statement statement;

    public ForInLoop(Statement firstPart, ExpressionSequence expressions, Statement statement) {
        this.firstPart = firstPart;
        this.expressions = expressions;
        this.statement = statement;
    }

    @Override
    public String toString() {
        return "ForInLoop{" + "firstPart=" + firstPart + ", expressions=" + expressions + ", statement=" + statement + '}';
    }
}
