package js;

import antlrJS.JSParser;
import antlrJS.JSParserBaseVisitor;
import js.ClassDeclaration.ClassDeclaration;
import js.ClassDeclaration.ClassElement;

public class AntlrToExpression extends JSParserBaseVisitor<Expression> {
    @Override
    public Expression visitClassExpression(JSParser.ClassExpressionContext ctx) {
        String name = ctx.Identifier() != null ? ctx.Identifier().getText() : "";
        ClassDeclaration classDeclaration = new ClassDeclaration(name, "");
        var classElements = ctx.classTail().classElements();
        AntlrToClassElement visitor = new AntlrToClassElement();
        for (int i = 0; i < classElements.getChildCount(); i++) {
            ClassElement classElement = visitor.visit(classElements.getChild(i));
            if (classElement != null) classDeclaration.addElement(classElement);
        }
        return classDeclaration;
    }
}
