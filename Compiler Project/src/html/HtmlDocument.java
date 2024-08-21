package html;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class HtmlDocument {

    public List<HtmlElement> elements;

    public HtmlDocument() {
        this.elements = new ArrayList<>();
    }

    public void addElement(HtmlElement e) {
        this.elements.add(e);
    }

    @Override
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner("\n");
        elements.forEach(htmlElement -> stringJoiner.add(htmlElement.toString()));
        return stringJoiner.toString();
    }
}
