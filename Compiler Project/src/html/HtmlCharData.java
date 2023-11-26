package html;

public class HtmlCharData implements HtmlContent {
    public String text;


    public HtmlCharData(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "HtmlCharData{ " + text + " }";
    }
}