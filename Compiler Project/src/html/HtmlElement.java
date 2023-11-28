package html;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import org.w3c.dom.html.HTMLElement;

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
    public static int outDepth=0;

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

}
