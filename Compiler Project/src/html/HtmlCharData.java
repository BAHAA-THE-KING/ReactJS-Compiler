package html;

public class HtmlCharData implements HtmlContent {
    String className = this.getClass().getSimpleName();
    public String text;

    public HtmlCharData(String text) {
        this.text = text;
    }
}