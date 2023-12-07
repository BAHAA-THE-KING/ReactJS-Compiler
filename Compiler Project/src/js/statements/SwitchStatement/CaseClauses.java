package js.statements.SwitchStatement;


import java.util.ArrayList;
import java.util.List;

public class CaseClauses extends SwitchChunk  {
    public List<CaseClause> getCases() {
        return cases;
    }

    public List<CaseClause> cases = new ArrayList<>();

    public CaseClauses() {

    }
    public void addCase(CaseClause c){
        cases.add(c);
    }
}
