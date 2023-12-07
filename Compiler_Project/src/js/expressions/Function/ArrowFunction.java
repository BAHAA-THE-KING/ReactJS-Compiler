package js.expressions.Function;

import js.visitors.models.*;
import org.antlr.v4.runtime.misc.Pair;

import java.util.List;

public class ArrowFunction extends Function {
    public Parameters parameters;
    public List<Statement> body;

    public ArrowFunction(Parameters parameters, List<Statement> body) {
        this.parameters = parameters;
        this.body = body;
    }
}
