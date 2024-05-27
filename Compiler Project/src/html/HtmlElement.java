package html;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HtmlElement implements HtmlContent {

    String className = this.getClass().getSimpleName();
    String tagName;
    String type;
    public static final String SELF_CLOSING = "self_closing", NORMAL = "normal";

    Map<String, HtmlAttribute> attributes;

    List<HtmlContent> contents;
    public static int outDepth = 0;

    public HtmlElement(String tagName, String type) {
        this.tagName = tagName;
        this.type = type;
        this.attributes = new HashMap<>();
        this.contents = new ArrayList<>();
    }

    public void addAttribute(HtmlAttribute at) {
        attributes.put(at.id, at);
    }

    public boolean hasAttribute(String id) {
        return attributes.containsKey(id);
    }

    public void addContents(HtmlContent co) {
        contents.add(co);
    }

}
