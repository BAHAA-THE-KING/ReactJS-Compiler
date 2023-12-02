package html;

import antlrHTML.HTMLParser;
import antlrHTML.HTMLParserBaseVisitor;
import org.antlr.v4.runtime.ParserRuleContext;
import program.Error;
import program.ProgramHTML;

import java.util.ArrayList;
import java.util.List;

public class AntlrToHtmlElement extends HTMLParserBaseVisitor<HtmlElement> {

    @Override
    public HtmlElement visitNormalElement(HTMLParser.NormalElementContext ctx) {
        String tagName = ctx.TAG_NAME(0).getText();
        AntlrToHtmlContent visitor = new AntlrToHtmlContent();
        HtmlElement element = new HtmlElement(tagName, HtmlElement.NORMAL);
        //visit children (html contents)
        for (int i = 0; i < ctx.htmlContent().getChildCount(); i++) {
            if (ctx.htmlContent().getChild(i) instanceof HTMLParser.NormalElementContext || ctx.htmlContent().getChild(i) instanceof HTMLParser.SelfClosedElementContext) {
                element.addContents(this.visit(ctx.htmlContent().getChild(i)));
            } else {
                HtmlContent content =visitor.visit(ctx.htmlContent().getChild(i));
                if(content!=null)element.addContents(content);
            }
        }
        //visit attributes
        for (HTMLParser.HtmlAttributeContext attribute : ctx.htmlAttribute()){
            String attributeName = attribute.TAG_NAME().getText();
            String attributeValue = attribute.ATTVALUE_VALUE().getText().replace("\"","");
            if(element.hasAttribute(attributeName)){
                declareRepeatedAttributeError(attribute);
                continue;
            }
            element.addAttribute(new HtmlAttribute(attributeName,attributeValue));
        }
        //make sure starting tag equals ending tag
        String startingTag = ctx.TAG_NAME(0).getText();
        String endingTag = ctx.TAG_NAME(1).getText();
        if(!startingTag.equals(endingTag)){
            int line = ctx.TAG_NAME(1).getSymbol().getLine();
            int column = ctx.TAG_NAME(1).getSymbol().getCharPositionInLine()+1;
            String message = "Closing tag </%s> doesn't match the opening tag <%s> ".formatted(
                    endingTag,startingTag
            );
            ProgramHTML.errors.add(Error.htmlError((ParserRuleContext) ctx.TAG_NAME(1),"must send",message));
        }
        return element;
    }

    @Override
    public HtmlElement visitSelfClosedElement(HTMLParser.SelfClosedElementContext ctx) {
        String tagName = ctx.TAG_NAME().getText();
        HtmlElement element = new HtmlElement(tagName, HtmlElement.SELF_CLOSING);
        //visit attributes
        for (HTMLParser.HtmlAttributeContext attribute : ctx.htmlAttribute()){
            String attributeName = attribute.TAG_NAME().getText();
            String attributeValue = attribute.ATTVALUE_VALUE().getText().replace("\"","");
            if(element.hasAttribute(attributeName)){
                declareRepeatedAttributeError(attribute);
                continue;
            }
            element.addAttribute(new HtmlAttribute(attributeName,attributeValue));
        }
        return element;
    }

    private void declareRepeatedAttributeError(HTMLParser.HtmlAttributeContext ctx){
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine()+1;
        String message = "Attribute ( %s ) is already defined.".formatted(ctx.TAG_NAME().getText());
        ProgramHTML.errors.add(Error.htmlError(ctx,"should send it",message));
    }
}
