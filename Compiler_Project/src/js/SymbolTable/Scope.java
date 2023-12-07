package js.SymbolTable;

import java.util.List;

public class Scope implements Symbolable {
    public String type ,name;
    public List<Symbolable> symbolables;
    public Scope(String type, String name , List<Symbolable>list) {
        this.type = type;
        this.name = name;
        this.symbolables = list;
    }
}
