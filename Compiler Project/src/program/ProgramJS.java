package program;

import antlrJS.JSLexer;
import antlrJS.JSParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import js.visitors.AntlrToProgram;
import js.visitors.models.JsProgram;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class ProgramJS {
    public static final String AST_FILE_NAME = "ast.json", SYMB_FILE_NAME = "symbolTable.json";
    public static List<String> errors = new ArrayList<>();
    public static List<String> InjectPaths = new ArrayList<>();

    public static void main(String[] args) throws IOException, IllegalAccessException {
        if (args.length == 0) {
            System.err.println("Please Select A File.");
        } else if (args.length == 1) {
            JSParser parser = getParser(args[0]);
            ParseTree antlrAST = parser.program();
            AntlrToProgram progVisitor = new AntlrToProgram(args[0]);
            JsProgram doc = progVisitor.visit(antlrAST);
            saveAstInFile(doc);
            saveSymbolTableInFile(doc);
            VsCode.openAstTree();
            VsCode.openSymbolTree();
            if (!errors.isEmpty()) {
                System.err.println("Found " + errors.size() + " errors:");
                for (String s : errors) {
                    System.err.println(s);
                }
            }
        } else if (args.length == 2) {
            JSParser parser = getParser(args[0]);
            String outputDir = args[1];
            ParseTree antlrAST = parser.program();
            AntlrToProgram progVisitor = new AntlrToProgram(args[0]);
            JsProgram doc = progVisitor.visit(antlrAST);
            if (!errors.isEmpty()) {
                System.err.println("Found " + errors.size() + " errors:");
                for (String s : errors) {
                    System.err.println(s);
                }
            } else {
                saveAstInFile(doc, outputDir);
                saveSymbolTableInFile(doc, outputDir);
                saveGeneratedCodeInFile("function createRoot(root) {\n" + "  document.getElementById(\"root\").append(root);\n" + "}\n" + "function createElement(type, props = {}, children) {\n" + "  const element = document.createElement(type);\n" + "\n" + "  for (let [key, value] of Object.entries(props)) {\n" + "    if (key === \"style\" && typeof value === \"object\") {\n" + "      Object.assign(element.style, value);\n" + "    } else if (key.startsWith(\"on\") && typeof value === \"function\") {\n" + "      const event = key.slice(2).toLowerCase();\n" + "      element.addEventListener(event, value);\n" + "    } else {\n" + "      element.setAttribute(key, value);\n" + "    }\n" + "  }\n" + "\n" + "  function parseChilds(children) {\n" + "    children.forEach((child) => {\n" + "      if (typeof child === \"string\" || typeof child === \"number\") {\n" + "        element.appendChild(document.createTextNode(child));\n" + "      } else if (child instanceof Node) {\n" + "        element.appendChild(child);\n" + "      } else if (Array.isArray(child)) {\n" + "        parseChilds(child);\n" + "      }\n" + "    });\n" + "  }\n" + "  parseChilds(children);\n" + "\n" + "  return element;\n" + "}class Component {\n" + "  constructor(props) {\n" + "    this.props = props || {};\n" + "    this.state = {};\n" + "    this._rootElement = null;\n" + "    this.componentWillMount();\n" + "  }\n" + "\n" + "  setState(newState) {\n" + "    this.state = { ...this.state, ...newState };\n" + "    this.updateComponent();\n" + "  }\n" + "\n" + "  updateComponent() {\n" + "    const newElement = this.render();\n" + "    if (this._rootElement && this._rootElement.parentNode) {\n" + "      this._rootElement.parentNode.replaceChild(newElement, this._rootElement);\n" + "    }\n" + "    this._rootElement = newElement;\n" + "    this.componentDidUpdate(this.props, this.state);\n" + "  }\n" + "\n" + "  componentWillMount() {}\n" + "  componentDidMount() {}\n" + "  componentWillUpdate(nextProps, nextState) {}\n" + "  componentDidUpdate(prevProps, prevState) {}\n" + "  componentWillUnmount() {}\n" + "\n" + "  render() {\n" + "    throw new Error(\"Component.render must be implemented\");\n" + "  }\n" + "\n" + "  mount() {\n" + "    this._rootElement = this.render();\n" + "    this.componentDidMount();\n" + "    return this._rootElement;\n" + "  }\n" + "\n" + "  unmount() {\n" + "    this.componentWillUnmount();\n" + "  }\n" + "}\n" + doc, outputDir);
            }
        }
    }

    private static void saveAstInFile(JsProgram doc) throws IOException, IllegalAccessException {
        File file = new File(AST_FILE_NAME);
        FileWriter fw = new FileWriter(file);

        String json = "{" + print(doc) + "}";

        ObjectMapper objectMapper = new ObjectMapper();
        Object jsonObject = objectMapper.readValue(json, Object.class);
        json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonObject);

//        System.out.println("AST :");
//        System.out.println(json);
//        System.out.println();

        fw.write(json);
        fw.close();
    }

    private static void saveAstInFile(JsProgram doc, String outputDir) throws IOException, IllegalAccessException {
        File file = new File(outputDir + "\\" + AST_FILE_NAME);
        FileWriter fw = new FileWriter(file);

        String json = "{" + print(doc) + "}";

        ObjectMapper objectMapper = new ObjectMapper();
        Object jsonObject = objectMapper.readValue(json, Object.class);
        json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonObject);

//        System.out.println("AST :");
//        System.out.println(json);
//        System.out.println();

        fw.write(json);
        fw.close();
    }

    private static void saveSymbolTableInFile(JsProgram doc) throws IOException, IllegalAccessException {
        File file = new File(SYMB_FILE_NAME);
        FileWriter fw = new FileWriter(file);

        String json = "{" + print(SymbolTableVisitor.visit(doc)) + "}";

        ObjectMapper objectMapper = new ObjectMapper();
        Object jsonObject = objectMapper.readValue(json.replace("\n", "\\n"), Object.class);
        json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonObject);

//        System.out.println("Symbol Table :");
//        System.out.println(json);
//        System.out.println();

        fw.write(json);
        fw.close();
    }

    private static void saveSymbolTableInFile(JsProgram doc, String outputDir) throws IOException, IllegalAccessException {
        File file = new File(outputDir + "\\" + SYMB_FILE_NAME);
        FileWriter fw = new FileWriter(file);

        String json = "{" + print(SymbolTableVisitor.visit(doc)) + "}";

        ObjectMapper objectMapper = new ObjectMapper();
        Object jsonObject = objectMapper.readValue(json.replace("\n", "\\n"), Object.class);
        json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonObject);

//        System.out.println("Symbol Table :");
//        System.out.println(json);
//        System.out.println();

        fw.write(json);
        fw.close();
    }

    private static void saveGeneratedCodeInFile(String code, String outputDir) throws IOException {
        FileWriter fileWriter = new FileWriter(outputDir + "\\index.js");
        fileWriter.write(code);
        fileWriter.close();
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
            } else if (value instanceof String st) {
                if ((st.startsWith("\"") || st.startsWith("\'")) && ((st.endsWith("\"") || st.endsWith("\'")))) {
                    value = st;
                } else {
                    value = "\"" + st + "\"";
//            System.out.println(value);
                }
                value = value;
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