package js.visitors;

import antlrJS.JSParser;
import antlrJS.JSParserBaseVisitor;
import js.expressions.IdentifierExpression;
import js.visitors.models.Assignable;

public class AntlrToAssignable extends JSParserBaseVisitor<Assignable> {
    @Override
    public Assignable visitVariableByName(JSParser.VariableByNameContext ctx) {
        String name = ctx.Identifier().getText();
        return new IdentifierExpression(name);
    }

    @Override
    public Assignable visitVariableByArray(JSParser.VariableByArrayContext ctx) {
        //TODO
        return super.visitVariableByArray(ctx);
    }

    @Override
    public Assignable visitVariableByObject(JSParser.VariableByObjectContext ctx) {
        //TODO
        return super.visitVariableByObject(ctx);
    }
}
