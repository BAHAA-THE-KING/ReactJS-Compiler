package js.expressions.Function;

import js.visitors.models.*;

import java.util.List;

public class AnonymousFunction extends Function {
    public Parameters parameters;
    public List<Statement> body;

    public AnonymousFunction(Parameters parameters, List<Statement> body) {
        this.parameters = parameters;
        this.body = body;
    }
}
