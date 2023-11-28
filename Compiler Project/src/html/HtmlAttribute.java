package html;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.w3c.dom.html.HTMLElement;

import java.io.IOException;

public class HtmlAttribute {

    String className = this.getClass().getSimpleName();
    String id;
    String value;

    public HtmlAttribute(String id, String value) {
        this.id = id;
        this.value = value;
    }
}
