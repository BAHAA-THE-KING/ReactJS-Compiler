package html;

public class HtmlComment implements HtmlContent {
    public String text;
    String className = this.getClass().getSimpleName();


    public HtmlComment(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "";
    }
}