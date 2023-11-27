package html;

import antlrHTML.HTMLParser;
import antlrHTML.HTMLParserBaseVisitor;

public class AntlrToHtmlDocument extends HTMLParserBaseVisitor<HtmlDocument> {
    @Override
    public HtmlDocument visitHtmlDocument(HTMLParser.HtmlDocumentContext ctx) {
        HtmlDocument doc = new HtmlDocument();
        AntlrToHtmlElement visitor = new AntlrToHtmlElement();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) instanceof HTMLParser.HtmlElementContext) {
                doc.addElement(visitor.visit(ctx.getChild(i)));
            }
        }
        return doc;
    }
}
