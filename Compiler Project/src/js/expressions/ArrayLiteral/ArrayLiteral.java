package js.expressions.ArrayLiteral;

import antlrJS.JSParser;
import js.visitors.AntlrToExpression;
import js.visitors.models.Assignable;
import js.visitors.models.Expression;

import java.util.ArrayList;
import java.util.List;

public class ArrayLiteral implements Expression, Assignable {

    public String filePath ;
    public List<ArrayElement> elements ;
    public ArrayLiteral(JSParser.ArrayLiteralContext ctx,String filePath) {
        AntlrToExpression visitor = new AntlrToExpression(filePath);
        List<ArrayElement> result = new ArrayList<>();
        for (JSParser.ArrayElementContext child : ctx.elementList().arrayElement()) {
            Expression exp = visitor.visit(child.singleExpression());
            result.add(new ArrayElement(exp).withEllipsis(child.Ellipsis() != null));
        }
        this.elements = result;
    }

}
