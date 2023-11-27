package html;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HtmlElement implements HtmlContent {

    String tagName;
    String type;
    public static final String SELF_CLOSING = "self_closing", NORMAL = "normal";

    Map<String, HtmlAttribute> attributes;

    List<HtmlContent> contents;

    public HtmlElement(String tagName, String type) {
        this.tagName = tagName;
        this.type = type;
        this.attributes = new HashMap<>();
        this.contents = new ArrayList<>();
    }

    public void addAttribute(HtmlAttribute at) {
        //TODO: add error detection in visitor
        attributes.put(at.id, at);
    }
    public boolean hasAttribute(String id){
        return attributes.containsKey(id);
    }

    public void addContents(HtmlContent co) {
        contents.add(co);
    }

    @Override
    public String toString() {
        return "{ \"class\": \"HtmlElement\", " +
                "\"tagName\": \"" + tagName + "\", " +
                "\"type\": \"" + type + "\", " +
                "\"attributes\": " + attributes.values() + ", " +
                "\"contents\": " + contents + " }";
    }


}
