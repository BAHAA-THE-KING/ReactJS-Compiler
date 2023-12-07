package program;

import antlrJS.JSLexer;
import antlrJS.JSParser;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import js.statements.Block.BlockModel;
import js.visitors.AntlrToProgram;
import js.visitors.models.JsProgram;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ProgramJS {
    public static List<String> errors = new ArrayList<>();

    public static void main(String[] args) throws IOException, IllegalAccessException {
        if (args.length != 1) {
            System.err.println("fuck you");
        } else {
            JSParser parser = getParser(args[0]);
            ParseTree antlrAST = parser.program();
            AntlrToProgram progVisitor = new AntlrToProgram(args[0]);
            JsProgram doc = progVisitor.visit(antlrAST);
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
            mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
            mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
            for (String err : errors) {
                System.err.println(err);
            }
            String result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(doc);
            System.out.println(result);
            File file = new File("ast.json");
            FileWriter fw = new FileWriter(file);
            fw.write(result);
            fw.close();
            System.out.println("{" + print(doc) + "}");
        }
        SymbolTableVisitor.visit(new BlockModel());
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
        for (Field f : fields) {
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