package js.expressions.Function;

import js.visitors.models.*;

import java.util.List;
import java.util.StringJoiner;

public class AnonymousFunction implements Function {
    public Parameters parameters;
    public List<Statement> body;

    public AnonymousFunction(Parameters parameters, List<Statement> body) {
        this.parameters = parameters;
        this.body = body;
    }

    @Override
    public String toString() {
        StringJoiner bodyString=new StringJoiner("\n");
        body.forEach(statement -> {bodyString.add(statement.toString());});
        return "function("+parameters+"){\n"+bodyString+"}";
    }
}
