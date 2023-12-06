package js.expressions.Function;

import js.visitors.models.Assignable;
import js.visitors.models.Expression;
import js.visitors.models.Function;
import js.visitors.models.Statement;
import org.antlr.v4.runtime.misc.Pair;

import java.util.List;

public class ArrowFunction extends Function {
    public List<Pair<Assignable, Expression>> parameters;
    public Expression spreadParameter;
    public List<Statement> body;

    public ArrowFunction(List<Pair<Assignable, Expression>> parameters, Expression spreadParameter, List<Statement> body) {
        this.parameters = parameters;
        this.spreadParameter = spreadParameter;
        this.body = body;
    }

    @Override
    public String toString() {
        return "ArrowFunction{" + "parameters=" + parameters + ", spreadParameter=" + spreadParameter + ", body=" + body + '}';
    }
}