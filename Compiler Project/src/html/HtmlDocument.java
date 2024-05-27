package html;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {

    public List<HtmlElement> elements;

    public HtmlDocument() {
        this.elements = new ArrayList<>();
    }

    public void addElement(HtmlElement e) {
        this.elements.add(e);
    }
}
