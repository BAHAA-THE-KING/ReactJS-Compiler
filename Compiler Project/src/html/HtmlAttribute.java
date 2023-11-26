package html;

public class HtmlAttribute {

    String id;
    String value;

    public HtmlAttribute(String id, String value) {
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return "HtmlAttribute{" + "id='" + id + '\'' + ", value='" + value + '\'' + '}';
    }
}
