package js.expressions.ArrayLiteral;

import antlrJS.JSParser;
import js.expressions.ArgumentsExpression.Argument;
import js.visitors.AntlrToExpression;
import js.visitors.models.Assignable;
import js.visitors.models.Expression;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

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

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        for (ArrayElement elem : elements) {
            joiner.add(elem.toString());
        }
        return joiner.toString();
    }
}
