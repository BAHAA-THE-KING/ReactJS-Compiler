package program;

import js.expressions.ArgumentsExpression.Argument;
import js.expressions.ArgumentsExpression.Arguments;
import js.expressions.ArgumentsExpression.ArgumentsExpression;
import js.expressions.ArrayLiteral.ArrayElement;
import js.expressions.ArrayLiteral.ArrayLiteral;
import js.expressions.IdentifierExpression;
import js.expressions.Literals.ObjectLiteral;
import js.expressions.Literals.StringLiteral;
import js.expressions.OptionalChainExpression;
import js.expressions.Properties.NormalProperty;
import js.expressions.jsxElement.JSXElement;
import js.statements.ClassDeclaration.PropertyName.PropertyByName;
import js.visitors.models.AttributeValue;
import js.visitors.models.Expression;
import js.visitors.models.JSXContent;
import org.antlr.v4.runtime.misc.Pair;

import java.util.List;

public class JSXConverter {

    public static Expression JsxToFunction(JSXElement element) {
        Arguments arguments = new Arguments();

        arguments.addArgument(new Argument(new StringLiteral("\"" + element.tagName + "\"")));
        arguments.addArgument(new Argument(element.attributes.isEmpty() ? new ObjectLiteral() : toObjectLiteral(element.attributes)));
        ArrayLiteral arrayLiteral = new ArrayLiteral();

        for (JSXContent elem : element.body) {
            if (elem instanceof JSXElement e) {
                arrayLiteral.addElement(new ArrayElement(JsxToFunction(e)));
            } else if (elem instanceof Expression) {
                arrayLiteral.addElement(new ArrayElement(new StringLiteral(elem.toString())));
            } else {
                System.err.println("JSX Converter: Unknown jsx content found!");
            }
        }
        arguments.addArgument(new Argument(arrayLiteral));


        if ((element.tagName.length() == 0)) {
            arguments.argumentsList.get(0).value = new StringLiteral("\"" + "div" + "\"");
            return new ArgumentsExpression(new IdentifierExpression("createElement"), arguments);
        }
        if (Character.isUpperCase(element.tagName.charAt(0))) {
            String method = "render";
            if (element.tagName.equals("App")) method = "mount";
            ((ObjectLiteral) arguments.argumentsList.get(1).value).addAttribute(new NormalProperty(new PropertyByName("children", null), arrayLiteral));
            return new OptionalChainExpression(new ArgumentsExpression(new IdentifierExpression("new " + element.tagName), new Arguments(arguments.argumentsList.get(1))), new IdentifierExpression(method + "()"), false);
        }

        return new ArgumentsExpression(new IdentifierExpression("createElement"), arguments);
    }

    public static Expression toObjectLiteral(List<Pair<String, AttributeValue>> elements) {
        ObjectLiteral literal = new ObjectLiteral();
        for (Pair<String, AttributeValue> element : elements) {
            if (element.a.equals("style")) {
                String value = element.b.toString();
                value = value.replaceAll("[{}]", "");
                String[] attributes = value.split(",\\s*");
                ObjectLiteral innerLiteral = new ObjectLiteral();
                for (String attribute : attributes) {
                    if (attribute.isEmpty()) continue;
                    String[] pair = attribute.split(":\\s*");
                    innerLiteral.addAttribute(new NormalProperty(new PropertyByName(pair[0], null), new StringLiteral(pair[1].replace("'", ""))));
                }
                literal.addAttribute(new NormalProperty(new PropertyByName(element.a, null), innerLiteral));
            } else {
                literal.addAttribute(new NormalProperty(new PropertyByName(element.a, null), new StringLiteral(element.b.toString())));
            }
        }
        return literal;
    }
}
