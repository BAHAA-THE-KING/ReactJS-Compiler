package js.visitors;

import antlrJS.JSParser;
import antlrJS.JSParserBaseVisitor;
import js.expressions.jsxElement.JSXElement;
import js.visitors.models.AttributeValue;
import js.visitors.models.JSXContent;
import org.antlr.v4.runtime.misc.Pair;
import program.Error;

import java.util.ArrayList;
import java.util.List;

public class AntlrToJSXElement extends JSParserBaseVisitor<JSXElement> {
    public String filePath;

    public AntlrToJSXElement(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public JSXElement visitSelfClosing(JSParser.SelfClosingContext ctx) {
        String tagName = ctx.tagName().getText();
        List<Pair<String, AttributeValue>> attributes = new ArrayList<>();
        AntlrToAttributeValue visitor = new AntlrToAttributeValue(filePath);
        for (var attribute : ctx.attribute()) {
            String name = attribute.attributeName().getText();
            AttributeValue value = visitor.visit(attribute.attributeValue());
            attributes.add(new Pair<>(name, value));
        }
        return new JSXElement(tagName, attributes, new ArrayList<>());
    }

    @Override
    public JSXElement visitNormal(JSParser.NormalContext ctx) {
        if ((ctx.tagName(0) != null || ctx.tagName(1) != null) && !ctx.tagName(0).getText().equals(ctx.tagName(1).getText())) {
            String message = "Closing tag </%s> doesn't match the opening tag <%s> ".formatted(ctx.tagName(1).getText(), ctx.tagName(0).getText());
            Error.reactError(ctx.tagName(0), filePath, message);
            System.err.println("ERROR");

        }
        String tagName = ctx.tagName(0) != null ? ctx.tagName(0).getText() : "";
        List<Pair<String, AttributeValue>> attributes = new ArrayList<>();
        AntlrToAttributeValue attributeValueVisitor = new AntlrToAttributeValue(filePath);
        for (var attribute : ctx.attribute()) {
            String name = attribute.attributeName().getText();
            AttributeValue value = attributeValueVisitor.visit(attribute.attributeValue());
            attributes.add(new Pair<>(name, value));
        }
        List<JSXContent> body = new ArrayList<>();
        AntlrToJSXContent jsxContentVisitor = new AntlrToJSXContent(filePath);
        for (var jsxContent : ctx.jsxContent()) {
            body.add(jsxContentVisitor.visit(jsxContent));
        }
        return new JSXElement(tagName, attributes, body);
    }
}
