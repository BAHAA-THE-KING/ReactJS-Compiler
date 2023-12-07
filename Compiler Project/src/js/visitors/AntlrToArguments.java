package js.visitors;

import antlrJS.JSParser;
import antlrJS.JSParserBaseVisitor;
import js.expressions.ArgumentsExpression.Argument;

import java.util.ArrayList;
import java.util.List;

public class AntlrToArguments extends JSParserBaseVisitor<List<Argument>> {
    public String filePath;

    public AntlrToArguments(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public List<Argument> visitArguments(JSParser.ArgumentsContext ctx) {
        List<Argument> arguments = new ArrayList<>();
        AntlrToExpression visitor = new AntlrToExpression(filePath);
        for (int i = 0; i < ctx.argument().size(); i++) {
            arguments.add(new Argument(visitor.visit(ctx.argument(i))));
        }
        return arguments;
    }
}
