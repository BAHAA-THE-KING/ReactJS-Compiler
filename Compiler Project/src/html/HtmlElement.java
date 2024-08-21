package html;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class HtmlElement implements HtmlContent {

    public static final String SELF_CLOSING = "self_closing", NORMAL = "normal";
    public static int outDepth = 0;
    String className = this.getClass().getSimpleName();
    String tagName;
    String type;
    List<HtmlAttribute> attributes;
    List<HtmlContent> contents;

    public HtmlElement(String tagName, String type) {
        this.tagName = tagName;
        this.type = type;
        this.attributes = new ArrayList<>();
        this.contents = new ArrayList<>();
    }

    public void addAttribute(HtmlAttribute at) {
        attributes.add(at);
    }

    public boolean hasAttribute(String id) {
        for (HtmlAttribute htmlAttribute : attributes) {
            if (htmlAttribute.id.equals(id)) return true;
        }
        return false;
    }

    public void addContents(HtmlContent co) {
        contents.add(co);
    }

    @Override
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        attributes.forEach((attribute) -> stringJoiner.add(attribute.toString()));
        StringJoiner stringJoiner2 = new StringJoiner(" ");
        contents.forEach((content) -> stringJoiner2.add(content.toString()));
        return "<" + tagName + " " + stringJoiner + (type.equals(NORMAL) ? (">" + stringJoiner2 + "</" + tagName + ">") : "/>");
    }
}
