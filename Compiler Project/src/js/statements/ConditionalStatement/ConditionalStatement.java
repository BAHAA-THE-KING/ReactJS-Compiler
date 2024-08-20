package js.statements.ConditionalStatement;

import js.expressions.ExpressionSequence;
import js.visitors.models.Statement;

public class ConditionalStatement implements Statement {
    public ExpressionSequence expressions;
    public Statement statement;
    public Statement elseStatement;

    public ConditionalStatement(ExpressionSequence expressions, Statement statement, Statement elseStatement) {
        this.expressions = expressions;
        this.statement = statement;
        this.elseStatement = elseStatement;
    }

    @Override
    public String toString() {
        return "if (" + expressions + ")\n" + statement + (elseStatement != null ? "\nelse\n" + elseStatement : "");
    }
}
