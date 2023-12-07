package js.statements.SwitchStatement;

import js.expressions.ExpressionSequence;
import js.visitors.models.Statement;

import java.util.List;

public class DefaultClause extends SwitchChunk {


    public List<Statement> statements;

    public DefaultClause(List<Statement> statements) {
        this.statements = statements;
    }
}
