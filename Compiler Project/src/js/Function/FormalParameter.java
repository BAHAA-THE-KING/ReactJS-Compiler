package js.Function;

import java.util.List;

public class FormalParameter extends JSExpression {
    List<String>parameters ;

    public FormalParameter(List<String> parameters) {
        this.parameters = parameters;
    }
}
