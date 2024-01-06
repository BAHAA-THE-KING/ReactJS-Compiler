package js.visitors;

import antlrJS.JSParser;
import antlrJS.JSParserBaseVisitor;
import js.expressions.ArrayLiteral.ArrayLiteral;
import js.expressions.IdentifierExpression;
import js.visitors.models.Assignable;
import js.expressions.Literals.ObjectLiteral;

public class AntlrToAssignable extends JSParserBaseVisitor<Assignable> {
    public String filePath ;

    public AntlrToAssignable(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public Assignable visitVariableByName(JSParser.VariableByNameContext ctx) {
        String name = ctx.Identifier().getText();
        return new IdentifierExpression(name);
    }

    @Override
    public Assignable visitVariableByArray(JSParser.VariableByArrayContext ctx) {
        return new ArrayLiteral(ctx.arrayLiteral(),filePath);
    }

    @Override
    public Assignable visitVariableByObject(JSParser.VariableByObjectContext ctx) {
        ObjectLiteral literal = new ObjectLiteral();
        AntlrToProperty attributeVisitor = new AntlrToProperty(filePath);
        for (JSParser.PropertyAssignmentContext child:ctx.objectLiteral().propertyAssignment()) {
            literal.addAttribute(attributeVisitor.visit(child));
        }
        return literal;
    }
}
