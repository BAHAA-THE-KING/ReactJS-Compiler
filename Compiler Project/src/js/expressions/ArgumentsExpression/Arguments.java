package js.expressions.ArgumentsExpression;

import antlrJS.JSParser;
import js.visitors.AntlrToArguments;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Arguments {
    public List<Argument> argumentsList;

    public Arguments() {
        this.argumentsList = new ArrayList<>();
    }

    public Arguments(Argument argument) {
        this.argumentsList = new ArrayList<>();
        this.argumentsList.add(argument);
    }

    public Arguments(JSParser.ArgumentsContext ctx, String filePath) {
        AntlrToArguments visitor = new AntlrToArguments(filePath);
        this.argumentsList = visitor.visit(ctx);
    }

    public void addArgument(Argument argument) {
        argumentsList.add(argument);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ");
        for (Argument arg : argumentsList) {
            joiner.add(arg.toString());
        }
        return joiner.toString();
    }
}
