package html;

import org.w3c.dom.html.HTMLElement;

public class HtmlCharData implements HtmlContent {
    String className = this.getClass().getSimpleName();
    public String text;
    public HtmlCharData(String text) {
        this.text = text;
    }
}