// Generated from C:/Users/ASUS/Desktop/GitHub/ReactJS-Compiler/untitled/src/rules/ReactJSParser.g4 by ANTLR 4.13.1
package rules;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ReactJSParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, OPEN_BRACKET=4, OPEN_SLASH_BRACKET=5, CLOSE_BRACKET=6, 
		CLOSE_SLASH_BRACKET=7, ELEMENT_NAME=8, TEXT=9, ATTRIBUTE_NAME=10, ID=11;
	public static final int
		RULE_body = 0, RULE_element = 1, RULE_listOfAttributes = 2, RULE_attribute = 3, 
		RULE_attributeWithoutEqual = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"body", "element", "listOfAttributes", "attribute", "attributeWithoutEqual"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'''", "'\"'", "'<'", "'</'", "'>'", "'/>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "OPEN_BRACKET", "OPEN_SLASH_BRACKET", "CLOSE_BRACKET", 
			"CLOSE_SLASH_BRACKET", "ELEMENT_NAME", "TEXT", "ATTRIBUTE_NAME", "ID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ReactJSParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ReactJSParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BodyContext extends ParserRuleContext {
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
	 
		public BodyContext() { }
		public void copyFrom(BodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BodyElementContext extends BodyContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public BodyElementContext(BodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterBodyElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitBodyElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitBodyElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextContext extends BodyContext {
		public TerminalNode TEXT() { return getToken(ReactJSParserParser.TEXT, 0); }
		public TextContext(BodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_body);
		try {
			setState(12);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACKET:
				_localctx = new BodyElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(10);
				element();
				}
				break;
			case TEXT:
				_localctx = new TextContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(11);
				match(TEXT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementContext extends ParserRuleContext {
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	 
		public ElementContext() { }
		public void copyFrom(ElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelfElementContext extends ElementContext {
		public TerminalNode OPEN_BRACKET() { return getToken(ReactJSParserParser.OPEN_BRACKET, 0); }
		public TerminalNode ELEMENT_NAME() { return getToken(ReactJSParserParser.ELEMENT_NAME, 0); }
		public ListOfAttributesContext listOfAttributes() {
			return getRuleContext(ListOfAttributesContext.class,0);
		}
		public TerminalNode CLOSE_SLASH_BRACKET() { return getToken(ReactJSParserParser.CLOSE_SLASH_BRACKET, 0); }
		public SelfElementContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterSelfElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitSelfElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitSelfElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalElementContext extends ElementContext {
		public TerminalNode OPEN_BRACKET() { return getToken(ReactJSParserParser.OPEN_BRACKET, 0); }
		public List<TerminalNode> ELEMENT_NAME() { return getTokens(ReactJSParserParser.ELEMENT_NAME); }
		public TerminalNode ELEMENT_NAME(int i) {
			return getToken(ReactJSParserParser.ELEMENT_NAME, i);
		}
		public ListOfAttributesContext listOfAttributes() {
			return getRuleContext(ListOfAttributesContext.class,0);
		}
		public List<TerminalNode> CLOSE_BRACKET() { return getTokens(ReactJSParserParser.CLOSE_BRACKET); }
		public TerminalNode CLOSE_BRACKET(int i) {
			return getToken(ReactJSParserParser.CLOSE_BRACKET, i);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode OPEN_SLASH_BRACKET() { return getToken(ReactJSParserParser.OPEN_SLASH_BRACKET, 0); }
		public NormalElementContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterNormalElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitNormalElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitNormalElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_element);
		try {
			setState(28);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new NormalElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				match(OPEN_BRACKET);
				setState(15);
				match(ELEMENT_NAME);
				setState(16);
				listOfAttributes();
				setState(17);
				match(CLOSE_BRACKET);
				setState(18);
				body();
				setState(19);
				match(OPEN_SLASH_BRACKET);
				setState(20);
				match(ELEMENT_NAME);
				setState(21);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				_localctx = new SelfElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				match(OPEN_BRACKET);
				setState(24);
				match(ELEMENT_NAME);
				setState(25);
				listOfAttributes();
				setState(26);
				match(CLOSE_SLASH_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListOfAttributesContext extends ParserRuleContext {
		public ListOfAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listOfAttributes; }
	 
		public ListOfAttributesContext() { }
		public void copyFrom(ListOfAttributesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttributesContext extends ListOfAttributesContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public AttributesContext(ListOfAttributesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListOfAttributesContext listOfAttributes() throws RecognitionException {
		ListOfAttributesContext _localctx = new ListOfAttributesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_listOfAttributes);
		int _la;
		try {
			_localctx = new AttributesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ATTRIBUTE_NAME) {
				{
				{
				setState(30);
				attribute();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode ATTRIBUTE_NAME() { return getToken(ReactJSParserParser.ATTRIBUTE_NAME, 0); }
		public TerminalNode TEXT() { return getToken(ReactJSParserParser.TEXT, 0); }
		public AttributeWithoutEqualContext attributeWithoutEqual() {
			return getRuleContext(AttributeWithoutEqualContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attribute);
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				match(ATTRIBUTE_NAME);
				setState(37);
				match(T__0);
				setState(38);
				match(TEXT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				match(ATTRIBUTE_NAME);
				setState(40);
				match(T__0);
				setState(41);
				match(T__1);
				setState(42);
				match(TEXT);
				setState(43);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				match(ATTRIBUTE_NAME);
				setState(45);
				match(T__0);
				setState(46);
				match(T__2);
				setState(47);
				match(TEXT);
				setState(48);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				attributeWithoutEqual();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeWithoutEqualContext extends ParserRuleContext {
		public TerminalNode ATTRIBUTE_NAME() { return getToken(ReactJSParserParser.ATTRIBUTE_NAME, 0); }
		public AttributeWithoutEqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeWithoutEqual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterAttributeWithoutEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitAttributeWithoutEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitAttributeWithoutEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeWithoutEqualContext attributeWithoutEqual() throws RecognitionException {
		AttributeWithoutEqualContext _localctx = new AttributeWithoutEqualContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attributeWithoutEqual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(ATTRIBUTE_NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000b7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0003\u0000\r\b\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u001d\b\u0001\u0001\u0002\u0005\u0002 \b\u0002\n\u0002\f\u0002"+
		"#\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u00033\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0000\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000"+
		"\u00007\u0000\f\u0001\u0000\u0000\u0000\u0002\u001c\u0001\u0000\u0000"+
		"\u0000\u0004!\u0001\u0000\u0000\u0000\u00062\u0001\u0000\u0000\u0000\b"+
		"4\u0001\u0000\u0000\u0000\n\r\u0003\u0002\u0001\u0000\u000b\r\u0005\t"+
		"\u0000\u0000\f\n\u0001\u0000\u0000\u0000\f\u000b\u0001\u0000\u0000\u0000"+
		"\r\u0001\u0001\u0000\u0000\u0000\u000e\u000f\u0005\u0004\u0000\u0000\u000f"+
		"\u0010\u0005\b\u0000\u0000\u0010\u0011\u0003\u0004\u0002\u0000\u0011\u0012"+
		"\u0005\u0006\u0000\u0000\u0012\u0013\u0003\u0000\u0000\u0000\u0013\u0014"+
		"\u0005\u0005\u0000\u0000\u0014\u0015\u0005\b\u0000\u0000\u0015\u0016\u0005"+
		"\u0006\u0000\u0000\u0016\u001d\u0001\u0000\u0000\u0000\u0017\u0018\u0005"+
		"\u0004\u0000\u0000\u0018\u0019\u0005\b\u0000\u0000\u0019\u001a\u0003\u0004"+
		"\u0002\u0000\u001a\u001b\u0005\u0007\u0000\u0000\u001b\u001d\u0001\u0000"+
		"\u0000\u0000\u001c\u000e\u0001\u0000\u0000\u0000\u001c\u0017\u0001\u0000"+
		"\u0000\u0000\u001d\u0003\u0001\u0000\u0000\u0000\u001e \u0003\u0006\u0003"+
		"\u0000\u001f\u001e\u0001\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!"+
		"\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"\u0005\u0001"+
		"\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000$%\u0005\n\u0000\u0000%&\u0005"+
		"\u0001\u0000\u0000&3\u0005\t\u0000\u0000\'(\u0005\n\u0000\u0000()\u0005"+
		"\u0001\u0000\u0000)*\u0005\u0002\u0000\u0000*+\u0005\t\u0000\u0000+3\u0005"+
		"\u0002\u0000\u0000,-\u0005\n\u0000\u0000-.\u0005\u0001\u0000\u0000./\u0005"+
		"\u0003\u0000\u0000/0\u0005\t\u0000\u000003\u0005\u0003\u0000\u000013\u0003"+
		"\b\u0004\u00002$\u0001\u0000\u0000\u00002\'\u0001\u0000\u0000\u00002,"+
		"\u0001\u0000\u0000\u000021\u0001\u0000\u0000\u00003\u0007\u0001\u0000"+
		"\u0000\u000045\u0005\n\u0000\u00005\t\u0001\u0000\u0000\u0000\u0004\f"+
		"\u001c!2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}