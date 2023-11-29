package js;

import antlrJS.JSParser;
import antlrJS.JSParserBaseVisitor;

public class AntlrToExpression extends JSParserBaseVisitor<Expression> {

    @Override
    public Expression visitOptionalChainExpression(JSParser.OptionalChainExpressionContext ctx) {
        Expression objectName =  visit(ctx.getChild(0));
        Expression objectProperty =  visit(ctx.getChild(2));
        OptionalChainExpression optionalChainExpression = new OptionalChainExpression(objectName , objectProperty);
        return optionalChainExpression;
    }

    @Override
    public Expression visitNewExpression(JSParser.NewExpressionContext ctx) {
        String id = ctx.Identifier().getText();
       Arguments arguments = new Arguments(ctx.arguments());
       NewExpression newExpression = new NewExpression( id , arguments);
       return  newExpression;
    }

    @Override
    public Expression visitArgumentsExpression(JSParser.ArgumentsExpressionContext ctx) {
        Expression expression = visit(ctx.singleExpression());
        Arguments arguments = new Arguments(ctx.arguments());
        ArgumentsExpression argumentsExpression = new ArgumentsExpression(expression , arguments);
        return argumentsExpression;
    }
}
