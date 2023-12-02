package program;

import antlrHTML.HTMLParser;
import antlrJS.JSParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

public class Error {
    private static String getMessage(ParserRuleContext ctx, String filePath,String errorType, String errorMsg){
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine()+1;
        return String.format("Error in %s at line %d, column %d%nType: %s%nMessage: %s",
                filePath, line, column, errorType, errorMsg);
    }
    public static String htmlError(ParserRuleContext ctx, String filePath, String errorMsg){
        return getMessage(ctx,filePath,"HTML",errorMsg);
    }
    public static String jsError(ParserRuleContext ctx, String filePath, String errorMsg){
        return getMessage(ctx,filePath,"JS",errorMsg);
    }
    public static String reactError(ParserRuleContext ctx, String filePath, String errorMsg){
        return getMessage(ctx,filePath,"REACT",errorMsg);
    }
}
