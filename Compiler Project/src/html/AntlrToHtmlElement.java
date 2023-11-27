package html;

import antlrHTML.HTMLParser;
import antlrHTML.HTMLParserBaseVisitor;
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
        int column = ctx.getStart().getCharPositionInLine();
        String message = "HTML ERROR (%d:%d) : Attribute ( %s ) is already defined.".formatted(line,column,ctx.TAG_NAME().getText());
        ProgramHTML.errors.add(message);
    }
}
