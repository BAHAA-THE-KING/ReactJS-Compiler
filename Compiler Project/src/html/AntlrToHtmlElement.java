package html;

import antlrHTML.HTMLParser;
import antlrHTML.HTMLParserBaseVisitor;

import java.util.ArrayList;
import java.util.List;

public class AntlrToHtmlElement extends HTMLParserBaseVisitor<HtmlElement> {
    @Override
    public HtmlElement visitNormalElement(HTMLParser.NormalElementContext ctx) {
        String tagName = ctx.TAG_NAME(0).getText();
        AntlrToHtmlContent visitor = new AntlrToHtmlContent();
        HtmlElement element = new HtmlElement(tagName, HtmlElement.NORMAL);
        for (int i = 0; i < ctx.htmlContent().getChildCount(); i++) {
            if (ctx.htmlContent().getChild(i) instanceof HTMLParser.NormalElementContext || ctx.htmlContent().getChild(i) instanceof HTMLParser.SelfClosedElementContext) {
                element.addContents(this.visit(ctx.htmlContent().getChild(i)));
            } else {
                element.addContents(visitor.visit(ctx.htmlContent().getChild(i)));
            }
        }
        //visit attributes

        //---------------
        return element;
    }

    @Override
    public HtmlElement visitSelfClosedElement(HTMLParser.SelfClosedElementContext ctx) {
        String tagName = ctx.TAG_NAME().getText();
        HtmlElement element = new HtmlElement(tagName, HtmlElement.SELF_CLOSING);
        //visit attributes
        return element;
    }
}
