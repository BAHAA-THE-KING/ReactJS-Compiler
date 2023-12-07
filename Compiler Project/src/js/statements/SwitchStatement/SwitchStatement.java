package js.statements.SwitchStatement;

import js.expressions.ExpressionSequence;
import js.visitors.models.Statement;

import java.util.List;

public class SwitchStatement  extends SwitchChunk {
    public ExpressionSequence expressionSequences;
   public CaseClauses cases;
    public DefaultClause defaultcase;

    public SwitchStatement(ExpressionSequence expressionSequences, CaseClauses cases, DefaultClause defaultcase) {
        this.expressionSequences = expressionSequences;
        this.cases = cases;
        this.defaultcase = defaultcase;
    }
}
