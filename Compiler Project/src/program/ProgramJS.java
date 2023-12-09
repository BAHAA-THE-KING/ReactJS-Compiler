package program;

import antlrJS.JSLexer;
import antlrJS.JSParser;
import js.visitors.AntlrToProgram;
import js.visitors.models.JsProgram;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;

public class ProgramJS {
    public static final String AST_FILE_NAME = "ast.json", SYMB_FILE_NAME = "symbolTable.json";
    public static List<String> errors = new ArrayList<>();

    public static void main(String[] args) throws IOException, IllegalAccessException {
        if (args.length != 1) {
            System.err.println("fuck you");
        } else {
            JSParser parser = getParser(args[0]);
            ParseTree antlrAST = parser.program();
            AntlrToProgram progVisitor = new AntlrToProgram(args[0]);
            JsProgram doc = progVisitor.visit(antlrAST);
            if (!errors.isEmpty()) {
                for (String err : errors) {
                    System.err.println(err);
                }
                System.out.println("Do you want to view ast and symbol table anyway? (Default:yes)");
                Scanner sc = new Scanner(System.in);
                String userInput = sc.nextLine().trim();
                boolean wantToContinue = userInput.isEmpty() ? false : Boolean.parseBoolean(userInput);
                if (!wantToContinue) return;
            }
//            saveAstInFile(doc);
            saveSymbolTableInFile(doc);
            VsCode.openAstTree();
            VsCode.openSymbolTree();
        }
    }

    private static void saveAstInFile(JsProgram doc) throws IOException, IllegalAccessException {
        File file = new File(AST_FILE_NAME);
        FileWriter fw = new FileWriter(file);
        fw.write("{" + print(doc) + "}");
        fw.close();
    }

    private static void saveSymbolTableInFile(JsProgram doc) throws IOException, IllegalAccessException {
        File file = new File(SYMB_FILE_NAME);
        FileWriter fw = new FileWriter(file);
        fw.write("{" + print(SymbolTableVisitor.visit(doc)) + "}");
        fw.close();
    }

    private static JSParser getParser(String filename) {
        JSParser parser = null;
        try {
            CharStream input = CharStreams.fromFileName(filename);
            JSLexer lexer = new JSLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new JSParser(tokens);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return parser;
    }

    public static String print(Object obj) throws IllegalAccessException {
        if (obj == null) return "";
        StringBuilder str = new StringBuilder();
        str.append("\"").append(obj.getClass().getSimpleName()).append("\"").append(":{");
        Field[] fields = obj.getClass().getDeclaredFields();
        StringJoiner strjoi=new StringJoiner(",");
        //TODO
        for (Field f : fields) {
            if (Modifier.isFinal(f.getModifiers())) {
                if (str.charAt(str.length()-1)==',') {
                    str=str.deleteCharAt(str.length() - 1);
                }
                continue;
            }
            String propName = f.getName();
            if (propName.equals("filePath")) continue;
            Object value = f.get(obj);
            if (!(value instanceof Boolean) && !(value instanceof String) && !(value instanceof Integer) && !(value instanceof Double) && !(value instanceof Character)) {
                if (value instanceof List) {
                    StringBuilder listString = new StringBuilder();
                    List<Object> list = (List<Object>) value;
                    for (Object item : list) {
                        String stringVal = print(item);
                        if (stringVal.equals("")) continue;
                        listString.append("{");
                        listString.append(stringVal);
                        listString.append("}");
                        if (item != null && !item.equals(list.getLast())) listString.append(",");
                    }
                    value = "[";
                    value += listString.toString();
                    value += "]";
                } else {
                    String string = print(value);
                    value = "{";
                    value += string;
                    value += "}";
                }
            } else if (value instanceof String) {
                if (((String) value).startsWith("'") || ((String) value).startsWith("\"")) {
                    value = ((String) value).substring(1);
                }
                if (((String) value).endsWith("'") || ((String) value).endsWith("\"")) {
                    value = ((String) value).substring(0, ((String) value).length() - 1);
                }
                value = "\"" + value + "\"";
            } else {
                value = value.toString();
            }
            str.append("\"").append(propName).append("\"").append(":").append(value);
            if (!f.equals(fields[fields.length - 1])) str.append(",");
        }
        str.append("}");
        return str.toString();
    }
}