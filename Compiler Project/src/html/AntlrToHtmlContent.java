package html;

import antlrHTML.HTMLLexer;
import antlrHTML.HTMLParser;
import antlrHTML.HTMLParserBaseVisitor;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

public class AntlrToHtmlContent extends HTMLParserBaseVisitor<HtmlContent> {
    @Override
    public HtmlContent visitHtmlChardata(HTMLParser.HtmlChardataContext ctx) {
        String text = ctx.getChild(0).getText();
        Token token = ((TerminalNodeImpl) ctx.getChild(0)).getSymbol();
        int tokenType = token.getType();
        if (tokenType == HTMLLexer.SEA_WS) {
            return null;
        }
        return new HtmlCharData(text);
    }

    @Override
    public HtmlContent visitHtmlComment(HTMLParser.HtmlCommentContext ctx) {
        String text = ctx.HTML_COMMENT().getText();
        return new HtmlComment(text);
    }
}
