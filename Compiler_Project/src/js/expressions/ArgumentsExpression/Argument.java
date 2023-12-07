package js.expressions.ArgumentsExpression;

public class Argument {
    Object value;
    String type;

    public Argument(Object value) {
        this.value = value;
        this.type = value instanceof String ? "ID" : "SingleExpression";
    }

    @Override
    public String toString() {
        return "Argument{" + "value=" + value + ", type='" + type + '\'' + '}';
    }
}
