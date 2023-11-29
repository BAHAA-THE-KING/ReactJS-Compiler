package js.Function;

import java.util.List;

public class AnonymousFunctionDecl extends JSExpression {

    private List<FormalParameter> parameters;
    private JSExpression body;

    public AnonymousFunctionDecl(List<FormalParameter> parameters, JSExpression body) {
        this.parameters = parameters;
        this.body = body;
    }



}
