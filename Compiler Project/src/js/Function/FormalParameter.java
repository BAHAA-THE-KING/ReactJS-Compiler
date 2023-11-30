package js.Function;

import js.Statement;

import java.util.ArrayList;
import java.util.List;

public class FormalParameter implements Statement {
    private   List<String>parameters =new ArrayList<>();
    public List<String> getParameters() {
        return parameters;
    }

    public void addParameter(String e){
        parameters.add(e);
    }
}
