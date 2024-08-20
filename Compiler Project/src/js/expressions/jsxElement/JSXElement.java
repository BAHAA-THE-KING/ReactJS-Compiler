package js.expressions.jsxElement;

import js.visitors.models.Expression;
import js.visitors.models.JSXContent;
import org.antlr.v4.runtime.misc.Pair;

import java.util.List;
import java.util.StringJoiner;

public class JSXElement implements Expression, JSXContent {
    public String tagName;
    public List<Pair<String, Expression>> attributes;
    public List<JSXContent> body;

    public JSXElement(String tagName, List<Pair<String, Expression>> attributes, List<JSXContent> body) {
        this.tagName = tagName;
        this.attributes = attributes;
        this.body = body;
    }

    @Override
    public String toString() {
//        return JSXConverter.JsxToFunction(this).toString();
        StringJoiner attributesJoiner = new StringJoiner(" ");
        attributes.forEach(att -> attributesJoiner.add(att.a + "=" + att.b));

        StringJoiner bodyJoiner = new StringJoiner("\n");
        body.forEach(cnt -> bodyJoiner.add(cnt.toString()));

        if (body.size() == 0) return "<" + tagName + " " + attributesJoiner + " />";
        return "<" + tagName + " " + attributesJoiner + ">\n" + bodyJoiner + "</" + tagName + ">";
    }
}
