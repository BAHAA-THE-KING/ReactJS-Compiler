package js.expressions.Function;

import js.visitors.models.Function;
import js.visitors.models.Parameters;
import js.visitors.models.Statement;

import java.util.List;
import java.util.StringJoiner;

public class ArrowFunction extends AnonymousFunction {
    public Parameters parameters;
    public List<Statement> body;

    public ArrowFunction(Parameters parameters, List<Statement> body) {
        super(parameters, body);
        this.parameters = parameters;
        this.body = body;
    }

    @Override
    public String toString() {
        StringJoiner bodyString = new StringJoiner(";\\n", "", ";");
        body.forEach(statement -> {
            bodyString.add(statement.toString());
        });
        return "(" + parameters + ")=>{\\n" + bodyString + "\\n}";
    }
}
