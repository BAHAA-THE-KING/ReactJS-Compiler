package html;

public class HtmlComment implements HtmlContent {
    String className = this.getClass().getSimpleName();
    public String text;


    public HtmlComment(String text) {
        this.text = text;
    }
}