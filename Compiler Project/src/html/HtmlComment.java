package html;

public class HtmlComment implements HtmlContent {
    public String text;


    public HtmlComment(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "{ \"class\": \"HtmlComment\", \"text\": \"" + text + "\" }";
    }
}