package js.statements.SwitchStatement;


import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class CaseClauses extends SwitchChunk {
    public List<CaseClause> cases = new ArrayList<>();

    public CaseClauses() {

    }

    public List<CaseClause> getCases() {
        return cases;
    }

    public void addCase(CaseClause c) {
        cases.add(c);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(";\n");
        cases.forEach(casee -> joiner.add(casee.toString()));
        return joiner.toString();
    }
}
