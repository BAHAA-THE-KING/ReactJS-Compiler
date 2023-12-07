package js.expressions.ArgumentsExpression;

import antlrJS.JSParser;
import js.visitors.AntlrToArguments;

import java.util.List;

public class Arguments {
    public List<Argument> argumentsList;

    public Arguments(JSParser.ArgumentsContext ctx,String filePath) {
        AntlrToArguments visitor = new AntlrToArguments(filePath);
        this.argumentsList = visitor.visit(ctx);
    }

    public void addArgument(Argument argument) {
        argumentsList.add(argument);
    }

}
