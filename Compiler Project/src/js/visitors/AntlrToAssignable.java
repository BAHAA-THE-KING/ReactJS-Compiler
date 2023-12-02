package js.visitors;

import antlrJS.JSParser;
import antlrJS.JSParserBaseVisitor;
import js.expressions.ArrayLiteral.ArrayLiteral;
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
        return new ArrayLiteral(ctx.arrayLiteral());
    }

    @Override
    public Assignable visitVariableByObject(JSParser.VariableByObjectContext ctx) {
        //TODO Wait Object Literal And Use It Like The Array Literal
        return super.visitVariableByObject(ctx);
    }
}
