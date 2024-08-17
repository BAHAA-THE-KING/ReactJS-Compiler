package js.expressions.Function;

import js.visitors.models.Function;
import js.visitors.models.Parameters;
import js.visitors.models.Statement;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.List;
import java.util.StringJoiner;

public class AnonymousFunction implements Function {
    public Parameters parameters;
    public List<Statement> body;
    public ParserRuleContext context;

    public AnonymousFunction(Parameters parameters, List<Statement> body,ParserRuleContext context) {
        this.parameters = parameters;
        this.body = body;
        this.context = context;
    }

    @Override
    public String toString() {
        StringJoiner bodyString = new StringJoiner("\n");
        body.forEach(statement -> {
            bodyString.add(statement.toString());
        });
        return "function(" + parameters + "){\n" + bodyString + "}";
    }
}
