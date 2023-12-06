package js.expressions.Properties;

import js.visitors.models.Assignable;
import js.visitors.models.Expression;
import js.visitors.models.Property;
import js.visitors.models.Statement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionProperty implements Property {
    Map<Assignable, Expression> parameters = new HashMap<>();
    Expression spreadParameter ;
    List<Statement> bodyStatements = new ArrayList<>();

    public boolean addParameter(Assignable key , Expression value){
        if(parameters.containsKey(key))return false;
        parameters.put(key,value);
        return true;
    }
    public void setSpreadParameter(Expression spreadParameter){
        this.spreadParameter=spreadParameter;
    }
    public void addStatement(Statement statement){
        bodyStatements.add(statement);
    }

}
