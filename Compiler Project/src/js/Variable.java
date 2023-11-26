package js;

public class Variable implements Scopable {
    public String type, value, id;
    public Scope scope;

    public Variable(String value, String id, Scope scope) {
        this.type = determineType(value);
        this.value = value;
        this.id = id;
        this.scope = scope;
    }

    private String determineType(String value) {
        String result = "aha";
        //todo: fix it
        return result;
    }
}
