package program;

import antlrJS.JSLexer;
import antlrJS.JSParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import js.expressions.jsxElement.AttributStringValue;
import js.expressions.jsxElement.JSXElement;
import js.visitors.AntlrToProgram;
import js.visitors.models.AttributeValue;
import js.visitors.models.JSXContent;
import js.visitors.models.JsProgram;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.Pair;
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
        List<Pair<String, AttributeValue>> attributes = new ArrayList<>();
        attributes.add(new Pair<>("style",new AttributStringValue("background:#343232;weight:20")));
        List<JSXContent> body = new ArrayList<>();
        JSXElement jsx = new JSXElement(
                "div",
                attributes,
                body
        );
        List<Pair<String, AttributeValue>> outerAttributes = new ArrayList<>();
        outerAttributes.add(new Pair<>("style",new AttributStringValue("background:#343232;weight:20")));
        List<JSXContent> outerBody = new ArrayList<>();
        outerBody.add(jsx);outerBody.add(jsx);outerBody.add(jsx);
        JSXElement jsxOuter = new JSXElement(
                "div",
                outerAttributes,
                outerBody
        );
        System.out.println(print(JSXConverter.JsxToFunction(jsxOuter)));










//        if (args.length != 1) {
//            System.err.println("Please Select A File.");
//        } else {
//            JSParser parser = getParser(args[0]);
//            ParseTree antlrAST = parser.program();
//            AntlrToProgram progVisitor = new AntlrToProgram(args[0]);
//            JsProgram doc = progVisitor.visit(antlrAST);
//            if (!errors.isEmpty()) {
//                for (String err : errors) {
//                    System.err.println(err);
//                }
//                System.out.println("Do you want to view ast and symbol table anyway? (Default:yes)");
//                Scanner sc = new Scanner(System.in);
//                String userInput = sc.nextLine().trim();
//                boolean wantToContinue = userInput.isEmpty() ? false : Boolean.parseBoolean(userInput);
//                if (!wantToContinue) return;
//            }
//            saveAstInFile(doc);
//            saveSymbolTableInFile(doc);
//            VsCode.openAstTree();
//            VsCode.openSymbolTree();
//        }
    }

    private static void saveAstInFile(JsProgram doc) throws IOException, IllegalAccessException {
        File file = new File(AST_FILE_NAME);
        FileWriter fw = new FileWriter(file);

        String json = "{" + print(doc) + "}";

        ObjectMapper objectMapper = new ObjectMapper();
        Object jsonObject = objectMapper.readValue(json, Object.class);
        json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonObject);

        System.out.println("AST :");
        System.out.println(json);
        System.out.println();

        fw.write(json);
        fw.close();
    }

    private static void saveSymbolTableInFile(JsProgram doc) throws IOException, IllegalAccessException {
        File file = new File(SYMB_FILE_NAME);
        FileWriter fw = new FileWriter(file);

        String json = "{" + print(SymbolTableVisitor.visit(doc)) + "}";

        ObjectMapper objectMapper = new ObjectMapper();
        Object jsonObject = objectMapper.readValue(json, Object.class);
        json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonObject);

        System.out.println("Symbol Table :");
        System.out.println(json);
        System.out.println();

        fw.write(json);
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
        Field[] fields = obj.getClass().getDeclaredFields();
        StringJoiner strjoi = new StringJoiner(",");
        for (Field f : fields) {
            if (Modifier.isFinal(f.getModifiers()) && !(obj instanceof Pair)) continue;
            if (Modifier.isPrivate(f.getModifiers())) continue;
            String propName = f.getName();
            if (propName.equals("filePath")) continue;
            if (propName.equals("a")) propName = "key";
            if (propName.equals("b")) propName = "value";
            Object value = f.get(obj);
            if (value == null) continue;
            if (!(value instanceof Boolean) && !(value instanceof String) && !(value instanceof Integer) && !(value instanceof Double) && !(value instanceof Character)) {
                if (value instanceof List) {
                    List<Object> list = (List<Object>) value;
                    StringJoiner stj2 = new StringJoiner(",");
                    for (Object item : list) {
                        String stringVal = print(item);
                        if (stringVal.equals("")) continue;
                        stj2.add("{" + stringVal + "}");
                    }
                    value = "[" + stj2 + "]";
                } else {
                    String string = print(value);
                    if (string.equals("")) continue;
                    value = "{" + string + "}";
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
            strjoi.add("\"" + propName + "\"" + ":" + value);
        }
        if (obj instanceof Pair && strjoi.length() == 0) return "";
        if (obj instanceof Pair) return String.valueOf(strjoi);
        return "\"" + obj.getClass().getSimpleName() + "\":{" + strjoi + "}";
    }
}