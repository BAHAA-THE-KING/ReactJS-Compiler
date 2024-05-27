package js.statements.SwitchStatement;

import js.expressions.ExpressionSequence;
import js.visitors.models.Statement;

import java.util.List;
import java.util.StringJoiner;

public class CaseClause extends SwitchChunk {
    public ExpressionSequence expressionSequences;
    public List<Statement> statements;

    public CaseClause(ExpressionSequence expressionSequences, List<Statement> statements) {
        this.expressionSequences = expressionSequences;
        this.statements = statements;
    }

    @Override
    public String toString() {
        StringJoiner statementJoiner = new StringJoiner(";\n");
        statements.forEach(stmt -> statementJoiner.add(stmt.toString()));
        return "case " + expressionSequences + " :\n" + statementJoiner;
    }
}
