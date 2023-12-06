package js.SymbolTable;

import java.util.List;

public class Scope implements Symbol{
    public String type ,name;
    public List<Symbol> symbols;
    public Scope(String type, String name , List<Symbol>list) {
        this.type = type;
        this.name = name;
        this.symbols = list;
    }
}
