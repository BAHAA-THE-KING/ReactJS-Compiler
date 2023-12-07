package js.expressions.Function;

import js.visitors.models.*;

import java.util.List;

public class ArrowFunction extends Function {
    public Parameters parameters;
    public List<Statement> body;

    public ArrowFunction(Parameters parameters, List<Statement> body) {
        this.parameters = parameters;
        this.body = body;
    }

    @Override
    public String toString() {
        return "ArrowFunction::TODO";
    }
}
