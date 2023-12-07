package js.statements.ConditionalStatement;

import js.expressions.ExpressionSequence;
import js.visitors.models.Expression;
import js.visitors.models.Statement;

import java.util.List;

public class ConditionalStatement implements Statement {
    ExpressionSequence expressions;
    Statement statement;
    Statement elseStatement;

    public ConditionalStatement(ExpressionSequence expressions, Statement statement, Statement elseStatement) {
        this.expressions = expressions;
        this.statement = statement;
        this.elseStatement = elseStatement;
    }

    @Override
    public String toString() {
        return "ConditionalStatement{" + "expressions=" + expressions + ", statement=" + statement + ", elseStatement=" + elseStatement + '}';
    }
}
