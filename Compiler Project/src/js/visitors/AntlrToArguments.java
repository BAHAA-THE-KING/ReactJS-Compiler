package js.visitors;

import antlrJS.JSParser;
import antlrJS.JSParserBaseVisitor;
import js.expressions.ArgumentsExpression.Argument;

import java.util.ArrayList;
import java.util.List;

public class AntlrToArguments extends JSParserBaseVisitor<List<Argument>> {
    public String filePath ;
    public AntlrToArguments(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public List<Argument> visitArguments(JSParser.ArgumentsContext ctx) {
        List<Argument> arguments = new ArrayList<>();
        for (int i = 0 ; i < ctx.getChildCount() ; i++ ){
            if (ctx.getChild(i) instanceof JSParser.ArgumentsContext) {
                if(ctx.getChild(i) instanceof JSParser.SingleExpressionContext){
                    AntlrToExpression visitor = new AntlrToExpression(filePath);
                    arguments.add(new Argument(visitor.visit(ctx.getChild(i))));
                }else {
                    arguments.add(new Argument(ctx.getChild(i).getText()));
                }
            }
        }

        return arguments;
    }
}
