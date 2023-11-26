package html;

import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {

    List<HtmlElement> elements;

    public HtmlDocument() {
        this.elements = new ArrayList<>();
    }

    public void addElement(HtmlElement e) {
        this.elements.add(e);
    }
}
