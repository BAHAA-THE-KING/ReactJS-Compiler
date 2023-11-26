package js;

import java.util.HashMap;
import java.util.Map;

public class Scope {
    private static int ctr = 0;
    public int id;
    public Map<String, Scopable> symbolTable;
    public Scope parent;

    public Scope(Scope parent) {
        this.id = ctr++;
        this.symbolTable = new HashMap<>();
        this.parent = parent;
    }

    public void addVariable(Variable variable) {
        symbolTable.put(variable.id, variable);
    }

}
