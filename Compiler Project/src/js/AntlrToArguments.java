package js;

import antlrJS.JSParser;
import antlrJS.JSParserBaseVisitor;

import java.util.ArrayList;
import java.util.List;

public class AntlrToArguments extends JSParserBaseVisitor<List<Argument>> {
    @Override
    public List<Argument> visitArguments(JSParser.ArgumentsContext ctx) {
        List<Argument> arguments = new ArrayList<>();
        for (int i = 0 ; i < ctx.getChildCount() ; i++ ){
            if (ctx.getChild(i) instanceof JSParser.ArgumentsContext) {
                if(ctx.getChild(i) instanceof JSParser.SingleExpressionContext){
                    AntlrToExpression visitor = new AntlrToExpression();
                    arguments.add(new Argument(visitor.visit(ctx.getChild(i))));
                }else {
                    arguments.add(new Argument(ctx.getChild(i).getText()));
                }
            }
        }

        return arguments;
    }
}
