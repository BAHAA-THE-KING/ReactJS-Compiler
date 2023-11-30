package js.Function;

import java.util.ArrayList;
import java.util.List;

public class ArrowFunction extends Function {

    private List<String> parameters = new ArrayList<>();
    private ArrowFunctionBody body;

    public ArrowFunction(List<String> parameters, ArrowFunctionBody body) {
        this.parameters = parameters;
        this.body = body;
    }

    @Override
    public String toString() {
        return "ArrowFunction{" + "parameters=" + parameters + ", body=" + body + '}';
    }
}
