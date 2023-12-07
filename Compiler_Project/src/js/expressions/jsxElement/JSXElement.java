package js.expressions.jsxElement;

import js.visitors.models.AttributeValue;
import js.visitors.models.Expression;
import js.visitors.models.JSXContent;
import org.antlr.v4.runtime.misc.Pair;

import java.util.List;

public class JSXElement implements Expression, JSXContent {
    String tagName;
    List<Pair<String, AttributeValue>> attributes;
    List<JSXContent> body;

    public JSXElement(String tagName, List<Pair<String, AttributeValue>> attributes, List<JSXContent> body) {
        this.tagName = tagName;
        this.attributes = attributes;
        this.body = body;
    }
}
