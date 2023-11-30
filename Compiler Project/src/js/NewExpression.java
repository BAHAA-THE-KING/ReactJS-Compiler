package js;

public class NewExpression implements Expression {
    String id;
    Arguments arguments;

    public NewExpression(String id, Arguments arguments) {
        this.id = id;
        this.arguments = arguments;
    }

    @Override
    public String toString() {
        return "NewExpression{" + "id='" + id + '\'' + ", arguments=" + arguments + '}';
    }
}
