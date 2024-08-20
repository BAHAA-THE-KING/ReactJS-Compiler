package html;

public class HtmlCharData implements HtmlContent {
    public String text;
    String className = this.getClass().getSimpleName();

    public HtmlCharData(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}