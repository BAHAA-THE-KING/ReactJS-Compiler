package js.SymbolTable;

public class Symbol implements Symbolable{
    public String type; // variable , property , parameter
    public String name,value;
    public static final String VAR="Variable" , ATRIB= "Attribute" , PARAM = "Parameter";
    public Symbol(String type, String name, String value) {
        this.type = type;
        this.name = name;
        this.value = value;
    }
}
