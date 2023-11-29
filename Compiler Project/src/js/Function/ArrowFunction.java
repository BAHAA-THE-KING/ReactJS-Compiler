package js.Function;

import java.util.List;

public class ArrowFunction extends JSExpression {

    private List<FormalParameter> parameters;

    private JSExpression body;

    public ArrowFunction(List<FormalParameter> parameters, JSExpression body) {
        this.parameters = parameters;
        this.body = body;
    }

   }