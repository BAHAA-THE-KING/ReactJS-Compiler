package js;

public class Variable implements Scopable {
    public String type, value, id;
    public Scope scope;

    public Variable(String type, String value, String id, Scope scope) {
        this.type = type;
        this.value = value;
        this.id = id;
        this.scope = scope;
    }
}
