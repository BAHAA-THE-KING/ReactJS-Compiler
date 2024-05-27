package js.visitors.models;

import org.antlr.v4.runtime.misc.Pair;

import java.util.List;
import java.util.StringJoiner;

public class Parameters {
    public List<Pair<Assignable, Expression>> values;
    public Expression spreadParameter;

    public Parameters(List<Pair<Assignable, Expression>> values, Expression spreadParameter) {
        this.values = values;
        this.spreadParameter = spreadParameter;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ");
        values.forEach(val -> joiner.add(val.a + " = " + val.b));
        if (spreadParameter != null) joiner.add("..." + spreadParameter);
        return joiner.toString();
    }
}
