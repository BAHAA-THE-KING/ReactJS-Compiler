package js.statements.SwitchStatement;

import js.expressions.ExpressionSequence;
import js.visitors.models.Statement;

import java.util.List;

public class DefaultClause extends SwitchChunk {


    List<Statement> statements;

    public DefaultClause(List<Statement> statements) {
        this.statements = statements;
    }

    @Override
    public String toString() {
        return "DefaultClause{" +
                "statements=" + statements +
                '}';
    }
}
