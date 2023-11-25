// Generated from C:/Users/ASUS/Desktop/GitHub/ReactJS-Compiler/untitled/src/rules/ReactJSParser.g4 by ANTLR 4.13.1
package rules;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ReactJSParserParser}.
 */
public interface ReactJSParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code BodyElement}
	 * labeled alternative in {@link ReactJSParserParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBodyElement(ReactJSParserParser.BodyElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BodyElement}
	 * labeled alternative in {@link ReactJSParserParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBodyElement(ReactJSParserParser.BodyElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Text}
	 * labeled alternative in {@link ReactJSParserParser#body}.
	 * @param ctx the parse tree
	 */
	void enterText(ReactJSParserParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Text}
	 * labeled alternative in {@link ReactJSParserParser#body}.
	 * @param ctx the parse tree
	 */
	void exitText(ReactJSParserParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalElement}
	 * labeled alternative in {@link ReactJSParserParser#element}.
	 * @param ctx the parse tree
	 */
	void enterNormalElement(ReactJSParserParser.NormalElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalElement}
	 * labeled alternative in {@link ReactJSParserParser#element}.
	 * @param ctx the parse tree
	 */
	void exitNormalElement(ReactJSParserParser.NormalElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelfElement}
	 * labeled alternative in {@link ReactJSParserParser#element}.
	 * @param ctx the parse tree
	 */
	void enterSelfElement(ReactJSParserParser.SelfElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelfElement}
	 * labeled alternative in {@link ReactJSParserParser#element}.
	 * @param ctx the parse tree
	 */
	void exitSelfElement(ReactJSParserParser.SelfElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Attributes}
	 * labeled alternative in {@link ReactJSParserParser#listOfAttributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(ReactJSParserParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Attributes}
	 * labeled alternative in {@link ReactJSParserParser#listOfAttributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(ReactJSParserParser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParserParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(ReactJSParserParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParserParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(ReactJSParserParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParserParser#attributeWithoutEqual}.
	 * @param ctx the parse tree
	 */
	void enterAttributeWithoutEqual(ReactJSParserParser.AttributeWithoutEqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParserParser#attributeWithoutEqual}.
	 * @param ctx the parse tree
	 */
	void exitAttributeWithoutEqual(ReactJSParserParser.AttributeWithoutEqualContext ctx);
}