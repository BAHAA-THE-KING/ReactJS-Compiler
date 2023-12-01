package js;

import antlrJS.JSParser;

import java.util.ArrayList;
import java.util.List;

public class Arguments {
    List<Argument> argumentsList;

    public Arguments(JSParser.ArgumentsContext ctx) {
        AntlrToArguments visitor = new AntlrToArguments();
        this.argumentsList = visitor.visit(ctx);
    }

    public void addArgument(Argument argument) {
        argumentsList.add(argument);
    }

}
