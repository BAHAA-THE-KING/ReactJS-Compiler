package program;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Error {
    private static String getMessage(int line, int column, String filePath, String errorType, String errorMsg) {
        return String.format("%s Error at line %d: %s",
                errorType, line, errorMsg);
    }

    private static String getMessage(ParserRuleContext ctx, String filePath, String errorType, String errorMsg) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine() + 1;
        return getMessage(line, column, filePath, errorType, errorMsg);
    }

    private static String getMessage(TerminalNode ctx, String filePath, String errorType, String errorMsg) {
        int line = ctx.getSymbol().getLine();
        int column = ctx.getSymbol().getCharPositionInLine() + 1;
        return getMessage(line, column, filePath, errorType, errorMsg);
    }

    public static void htmlError(ParserRuleContext ctx, String filePath, String errorMsg) {
        ProgramHTML.errors.add(getMessage(ctx, filePath, "HTML", errorMsg));
    }

    public static void htmlError(TerminalNode ctx, String filePath, String errorMsg) {
        ProgramHTML.errors.add(getMessage(ctx, filePath, "HTML", errorMsg));
    }

    public static void jsError(ParserRuleContext ctx, String filePath, String errorMsg) {
        ProgramJS.errors.add(getMessage(ctx, filePath, "JS", errorMsg));
    }
    public static void jsError(ParserRuleContext ctx,String errorMsg) {
        ProgramJS.errors.add(getMessage(ctx, "", "JS", errorMsg));
    }

    public static void jsError(TerminalNode ctx, String filePath, String errorMsg) {
        ProgramJS.errors.add(getMessage(ctx, filePath, "JS", errorMsg));
    }

    public static String reactError(ParserRuleContext ctx, String filePath, String errorMsg) {
        //TODO: report error to relative class(we don't seem to need it)
        return getMessage(ctx, filePath, "REACT", errorMsg);
    }

    public static String reactError(TerminalNode ctx, String filePath, String errorMsg) {
        //TODO: report error to relative class(we don't seem to need it)
        return getMessage(ctx, filePath, "REACT", errorMsg);
    }

    public static void variableAlreadyDefined(ParserRuleContext ctx,String varName){
        jsError(ctx,"Variable "+varName+" is already defined.");
    }
    public static void variableUnDefined(ParserRuleContext ctx,String varName){
        jsError(ctx,"Variable "+varName+" is undefined.");
    }

    public static void hookError(ParserRuleContext ctx, String varName){
        jsError(ctx,"Hook used insinde non-Component scope: " + varName);
    }
}
