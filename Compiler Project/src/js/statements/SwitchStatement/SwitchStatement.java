package js.statements.SwitchStatement;

import js.expressions.ExpressionSequence;

public class SwitchStatement extends SwitchChunk {
    public ExpressionSequence expressionSequences;
    public CaseClauses cases;
    public DefaultClause defaultcase;

    public SwitchStatement(ExpressionSequence expressionSequences, CaseClauses cases, DefaultClause defaultcase) {
        this.expressionSequences = expressionSequences;
        this.cases = cases;
        this.defaultcase = defaultcase;
    }

    @Override
    public String toString() {
        return "switch(" + expressionSequences + "){\n" + cases + ";\n" + defaultcase + "\n}";
    }
}
