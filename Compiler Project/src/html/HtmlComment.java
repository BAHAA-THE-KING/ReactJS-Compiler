package html;

import org.w3c.dom.html.HTMLElement;

public class HtmlComment implements HtmlContent {
    String className = this.getClass().getSimpleName();
    public String text;


    public HtmlComment(String text) {
        this.text = text;
    }
}