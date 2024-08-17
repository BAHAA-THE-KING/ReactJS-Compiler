package js.visitors;

import antlrJS.JSParser;
import antlrJS.JSParserBaseVisitor;
import js.statements.ClassDeclaration.PropertyName.PropertyByExpression;
import js.statements.ClassDeclaration.PropertyName.PropertyByName;
import js.statements.ClassDeclaration.PropertyName.PropertyByNumber;
import js.statements.ClassDeclaration.PropertyName.PropertyByString;
import js.visitors.models.Expression;
import js.visitors.models.PropertyName;

public class AntlrToPropertyName extends JSParserBaseVisitor<PropertyName> {
    public String filePath;

    public AntlrToPropertyName(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public PropertyName visitPropertyByName(JSParser.PropertyByNameContext ctx) {
        String id = ctx.Identifier().getText();
        return new PropertyByName(id,ctx);
    }

    @Override
    public PropertyName visitPropertyByString(JSParser.PropertyByStringContext ctx) {
        String name = ctx.StringLiteral().getText();
        return new PropertyByString(name);
    }

    @Override
    public PropertyName visitPropertyByNumber(JSParser.PropertyByNumberContext ctx) {
        String number = ctx.DecimalLiteral().getText();
        return new PropertyByNumber(number);
    }

    @Override
    public PropertyName visitPropertyByExpression(JSParser.PropertyByExpressionContext ctx) {
        AntlrToExpression visitor = new AntlrToExpression(filePath);
        Expression exp = visitor.visit(ctx.singleExpression());
        return new PropertyByExpression(exp);
    }
}
