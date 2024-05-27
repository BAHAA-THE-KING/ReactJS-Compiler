package html;

public class HtmlAttribute {

    String className = this.getClass().getSimpleName();
    String id;
    String value;

    public HtmlAttribute(String id, String value) {
        this.id = id;
        this.value = value;
    }
}
