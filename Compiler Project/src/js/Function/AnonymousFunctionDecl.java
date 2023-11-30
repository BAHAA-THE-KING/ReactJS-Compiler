package js.Function;

import js.Statement;

import java.util.ArrayList;
import java.util.List;

public class AnonymousFunctionDecl extends Function {

    private List<String> parameters = new ArrayList<>();
    private List<Statement> body;

    public AnonymousFunctionDecl(List<String> parameters, List<Statement> body) {
        this.parameters = parameters;
        this.body = body;
    }

    @Override
    public String toString() {
        return "AnonymousFunctionDecl{" + "parameters=" + parameters + ", body=" + body + '}';
    }
}
