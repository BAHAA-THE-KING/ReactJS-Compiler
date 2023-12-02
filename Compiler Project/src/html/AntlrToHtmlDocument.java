package html;

import antlrHTML.HTMLParser;
import antlrHTML.HTMLParserBaseVisitor;

public class AntlrToHtmlDocument extends HTMLParserBaseVisitor<HtmlDocument> {
    public String filePath;
    public AntlrToHtmlDocument(String filePath){
        this.filePath=filePath;
    }
    @Override
    public HtmlDocument visitHtmlDocument(HTMLParser.HtmlDocumentContext ctx) {
        HtmlDocument doc = new HtmlDocument();
        AntlrToHtmlElement visitor = new AntlrToHtmlElement(filePath);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) instanceof HTMLParser.HtmlElementContext) {
                doc.addElement(visitor.visit(ctx.getChild(i)));
            }
        }
        return doc;
    }
}
