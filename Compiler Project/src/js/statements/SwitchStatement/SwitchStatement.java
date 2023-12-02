package js.statements.SwitchStatement;

import js.expressions.ExpressionSequence;
import js.visitors.models.Statement;

import java.util.List;

public class SwitchStatement  extends SwitchChunk {
    ExpressionSequence expressionSequences;
   CaseClauses cases;
    DefaultClause defaultcase;

    public SwitchStatement(ExpressionSequence expressionSequences, CaseClauses cases, DefaultClause defaultcase) {
        this.expressionSequences = expressionSequences;
        this.cases = cases;
        this.defaultcase = defaultcase;
    }

    @Override
    public String toString() {
        return "SwitchStatement{" +
                "expressionSequences=" + expressionSequences +
                ", cases=" + cases +
                ", defaultcase=" + defaultcase +
                '}';
    }
}
