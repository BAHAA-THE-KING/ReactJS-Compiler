package html;

import antlrHTML.HTMLParser;
import antlrHTML.HTMLParserBaseVisitor;

public class AntlrToHtmlContent extends HTMLParserBaseVisitor<HtmlContent> {
    @Override
    public HtmlContent visitHtmlContent(HTMLParser.HtmlContentContext ctx) {
        return super.visitHtmlContent(ctx);
    }

    @Override
    public HtmlContent visitHtmlChardata(HTMLParser.HtmlChardataContext ctx) {
        return super.visitHtmlChardata(ctx);
    }

    @Override
    public HtmlContent visitHtmlComment(HTMLParser.HtmlCommentContext ctx) {
        return super.visitHtmlComment(ctx);
    }
}
