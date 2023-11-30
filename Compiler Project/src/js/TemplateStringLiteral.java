package js;

import java.util.List;

public class TemplateStringLiteral {
    List<TemplateStringAtom> atoms;

    public TemplateStringLiteral(List<TemplateStringAtom> atoms) {
        this.atoms = atoms;
    }

    @Override
    public String toString() {
        return "TemplateStringLiteral{" + "atoms=" + atoms + '}';
    }
}
