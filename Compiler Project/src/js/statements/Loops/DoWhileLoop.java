package js.statements.Loops;

import js.visitors.models.Expression;
import js.visitors.models.IterationStatement;
import js.visitors.models.Statement;

import java.util.List;

public class DoWhileLoop implements IterationStatement {
    Statement statement;
    List<Expression> expressions;

    public DoWhileLoop(Statement statement, List<Expression> expressions) {
        this.statement = statement;
        this.expressions = expressions;
    }

    @Override
    public String toString() {
        return "DoWhileLoop{" + "statements=" + statement + ", expressions=" + expressions + '}';
    }
}
