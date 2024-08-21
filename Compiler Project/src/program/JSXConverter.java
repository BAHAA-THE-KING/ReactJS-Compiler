package program;

import js.expressions.ArgumentsExpression.Argument;
import js.expressions.ArgumentsExpression.Arguments;
import js.expressions.ArgumentsExpression.ArgumentsExpression;
import js.expressions.IdentifierExpression;
import js.expressions.Literals.NullLiteral;
import js.expressions.Literals.ObjectLiteral;
import js.expressions.Literals.StringLiteral;
import js.expressions.OptionalChainExpression;
import js.expressions.Properties.NormalProperty;
import js.expressions.jsxElement.AttributeInjectValue;
import js.expressions.jsxElement.JSXElement;
import js.expressions.jsxElement.JSXText;
import js.statements.ClassDeclaration.PropertyName.PropertyByName;
import js.visitors.models.AttributeValue;
import js.visitors.models.Expression;
import js.visitors.models.JSXContent;
import org.antlr.v4.runtime.misc.Pair;

import java.util.Arrays;
import java.util.List;

public class JSXConverter {

    public static Expression JsxToFunction(JSXElement element) {
        Arguments arguments = new Arguments();

        arguments.addArgument(new Argument(new StringLiteral(element.tagName)));
        arguments.addArgument(new Argument(element.attributes.isEmpty() ? new NullLiteral() : toObjectLiteral(element.attributes)));

        for (JSXContent elem : element.body) {
            if (elem instanceof JSXElement e) {
                arguments.addArgument(new Argument(JsxToFunction(e)));
            }else if (elem instanceof Expression) {
                arguments.addArgument(new Argument(new StringLiteral(elem.toString())));
            } else {
                System.err.println("JSX Converter: Unknown jsx content found!");
            }
        }

        return new ArgumentsExpression(
                new IdentifierExpression("createElement"), arguments
        );
    }

    public static Expression toObjectLiteral(List<Pair<String, AttributeValue>> elements) {
        ObjectLiteral literal = new ObjectLiteral();
        for (Pair<String, AttributeValue> element : elements) {
            if (element.a.equals("style")) {
                String value = element.b.toString();
                value=value.replaceAll("[{}]", "");
                String[] attributes = value.split(",\\s*");
                ObjectLiteral innerLiteral = new ObjectLiteral();
                for (String attribute : attributes) {
                        if(attribute.isEmpty())continue;
                        String[] pair = attribute.split(":\\s*");
                        innerLiteral.addAttribute(
                                new NormalProperty(
                                        new PropertyByName(pair[0],null),
                                        new StringLiteral(pair[1].replace("'",""))
                                )
                        );
                }
                literal.addAttribute(new NormalProperty(
                        new PropertyByName(element.a,null),
                        innerLiteral
                ));
            } else {
                literal.addAttribute(
                        new NormalProperty(
                                new PropertyByName(element.a,null),
                                new StringLiteral(element.b.toString())
                        )
                );
            }
        }
        return literal;
    }
}
