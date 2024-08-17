package js.statements.ClassDeclaration.PropertyName;

import js.visitors.models.PropertyName;
import org.antlr.v4.runtime.ParserRuleContext;

public class PropertyByName implements PropertyName {
    public String id;
    public ParserRuleContext context;

    public PropertyByName(String id, ParserRuleContext context)
    {
        this.id = id;
        this.context = context;
    }

    @Override
    public String toString() {
        return id;
    }
}
