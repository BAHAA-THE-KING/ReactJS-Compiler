package js;

public class TemplateStringCharacter extends TemplateStringAtom {
    char character;

    public TemplateStringCharacter(char character) {
        this.character = character;
    }

    @Override
    public String toString() {
        return "TemplateStringCharacter{" + "characters='" + character + '\'' + '}';
    }
}
