// Generated from C:/Users/ASUS/Desktop/GitHub/ReactJS-Compiler/untitled/src/rules/ReactJSParser.g4 by ANTLR 4.13.1
package rules;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ReactJSParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ReactJSParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code BodyElement}
	 * labeled alternative in {@link ReactJSParserParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyElement(ReactJSParserParser.BodyElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Text}
	 * labeled alternative in {@link ReactJSParserParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(ReactJSParserParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalElement}
	 * labeled alternative in {@link ReactJSParserParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalElement(ReactJSParserParser.NormalElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelfElement}
	 * labeled alternative in {@link ReactJSParserParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfElement(ReactJSParserParser.SelfElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Attributes}
	 * labeled alternative in {@link ReactJSParserParser#listOfAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(ReactJSParserParser.AttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParserParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(ReactJSParserParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParserParser#attributeWithoutEqual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeWithoutEqual(ReactJSParserParser.AttributeWithoutEqualContext ctx);
}