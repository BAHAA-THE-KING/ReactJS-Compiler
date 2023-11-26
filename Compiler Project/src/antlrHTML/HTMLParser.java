// Generated from D:/__git projects/ReactJS-Compiler/untitled/src/rules/HTMLParser.g4 by ANTLR 4.13.1
package antlrHTML;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class HTMLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HTML_COMMENT=1, HTML_CONDITIONAL_COMMENT=2, XML=3, CDATA=4, DTD=5, SCRIPTLET=6, 
		SEA_WS=7, SCRIPT_OPEN=8, STYLE_OPEN=9, TAG_OPEN=10, HTML_TEXT=11, TAG_CLOSE=12, 
		TAG_SLASH_CLOSE=13, TAG_SLASH=14, TAG_EQUALS=15, TAG_NAME=16, TAG_WHITESPACE=17, 
		SCRIPT_BODY=18, SCRIPT_SHORT_BODY=19, STYLE_BODY=20, STYLE_SHORT_BODY=21, 
		ATTVALUE_VALUE=22, ATTRIBUTE=23;
	public static final int
		RULE_htmlDocument = 0, RULE_htmlElement = 1, RULE_htmlContent = 2, RULE_htmlAttribute = 3, 
		RULE_htmlChardata = 4, RULE_htmlMisc = 5, RULE_htmlComment = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"htmlDocument", "htmlElement", "htmlContent", "htmlAttribute", "htmlChardata", 
			"htmlMisc", "htmlComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "'<'", null, 
			"'>'", "'/>'", "'/'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", "XML", "CDATA", "DTD", 
			"SCRIPTLET", "SEA_WS", "SCRIPT_OPEN", "STYLE_OPEN", "TAG_OPEN", "HTML_TEXT", 
			"TAG_CLOSE", "TAG_SLASH_CLOSE", "TAG_SLASH", "TAG_EQUALS", "TAG_NAME", 
			"TAG_WHITESPACE", "SCRIPT_BODY", "SCRIPT_SHORT_BODY", "STYLE_BODY", "STYLE_SHORT_BODY", 
			"ATTVALUE_VALUE", "ATTRIBUTE"
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
	public String getGrammarFileName() { return "HTMLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HTMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlDocumentContext extends ParserRuleContext {
		public List<HtmlMiscContext> htmlMisc() {
			return getRuleContexts(HtmlMiscContext.class);
		}
		public HtmlMiscContext htmlMisc(int i) {
			return getRuleContext(HtmlMiscContext.class,i);
		}
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public HtmlDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlDocumentContext htmlDocument() throws RecognitionException {
		HtmlDocumentContext _localctx = new HtmlDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_htmlDocument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 134L) != 0)) {
				{
				setState(14);
				htmlMisc();
				}
			}

			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_OPEN) {
				{
				{
				setState(17);
				htmlElement();
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 134L) != 0)) {
					{
					setState(18);
					htmlMisc();
					}
				}

				}
				}
				setState(25);
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
	public static class HtmlElementContext extends ParserRuleContext {
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
	 
		public HtmlElementContext() { }
		public void copyFrom(HtmlElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelfClosedElementContext extends HtmlElementContext {
		public TerminalNode TAG_OPEN() { return getToken(HTMLParser.TAG_OPEN, 0); }
		public TerminalNode TAG_NAME() { return getToken(HTMLParser.TAG_NAME, 0); }
		public TerminalNode TAG_SLASH_CLOSE() { return getToken(HTMLParser.TAG_SLASH_CLOSE, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public SelfClosedElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterSelfClosedElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitSelfClosedElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitSelfClosedElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalElementContext extends HtmlElementContext {
		public List<TerminalNode> TAG_OPEN() { return getTokens(HTMLParser.TAG_OPEN); }
		public TerminalNode TAG_OPEN(int i) {
			return getToken(HTMLParser.TAG_OPEN, i);
		}
		public List<TerminalNode> TAG_NAME() { return getTokens(HTMLParser.TAG_NAME); }
		public TerminalNode TAG_NAME(int i) {
			return getToken(HTMLParser.TAG_NAME, i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(HTMLParser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(HTMLParser.TAG_CLOSE, i);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public TerminalNode TAG_SLASH() { return getToken(HTMLParser.TAG_SLASH, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public NormalElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNormalElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNormalElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNormalElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_htmlElement);
		int _la;
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new NormalElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				match(TAG_OPEN);
				setState(27);
				match(TAG_NAME);
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_NAME) {
					{
					{
					setState(28);
					htmlAttribute();
					}
					}
					setState(33);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(34);
				match(TAG_CLOSE);
				setState(35);
				htmlContent();
				setState(36);
				match(TAG_OPEN);
				setState(37);
				match(TAG_SLASH);
				setState(38);
				match(TAG_NAME);
				setState(39);
				match(TAG_CLOSE);
				}
				break;
			case 2:
				_localctx = new SelfClosedElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				match(TAG_OPEN);
				setState(42);
				match(TAG_NAME);
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_NAME) {
					{
					{
					setState(43);
					htmlAttribute();
					}
					}
					setState(48);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(49);
				match(TAG_SLASH_CLOSE);
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
	public static class HtmlContentContext extends ParserRuleContext {
		public List<HtmlChardataContext> htmlChardata() {
			return getRuleContexts(HtmlChardataContext.class);
		}
		public HtmlChardataContext htmlChardata(int i) {
			return getRuleContext(HtmlChardataContext.class,i);
		}
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<HtmlCommentContext> htmlComment() {
			return getRuleContexts(HtmlCommentContext.class);
		}
		public HtmlCommentContext htmlComment(int i) {
			return getRuleContext(HtmlCommentContext.class,i);
		}
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlContent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEA_WS || _la==HTML_TEXT) {
				{
				setState(52);
				htmlChardata();
				}
			}

			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(57);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TAG_OPEN:
						{
						setState(55);
						htmlElement();
						}
						break;
					case HTML_COMMENT:
					case HTML_CONDITIONAL_COMMENT:
						{
						setState(56);
						htmlComment();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(60);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEA_WS || _la==HTML_TEXT) {
						{
						setState(59);
						htmlChardata();
						}
					}

					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
	public static class HtmlAttributeContext extends ParserRuleContext {
		public TerminalNode TAG_NAME() { return getToken(HTMLParser.TAG_NAME, 0); }
		public TerminalNode TAG_EQUALS() { return getToken(HTMLParser.TAG_EQUALS, 0); }
		public TerminalNode ATTVALUE_VALUE() { return getToken(HTMLParser.ATTVALUE_VALUE, 0); }
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_htmlAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(TAG_NAME);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAG_EQUALS) {
				{
				setState(68);
				match(TAG_EQUALS);
				setState(69);
				match(ATTVALUE_VALUE);
				}
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
	public static class HtmlChardataContext extends ParserRuleContext {
		public TerminalNode HTML_TEXT() { return getToken(HTMLParser.HTML_TEXT, 0); }
		public TerminalNode SEA_WS() { return getToken(HTMLParser.SEA_WS, 0); }
		public HtmlChardataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlChardata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlChardata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlChardata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlChardata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlChardataContext htmlChardata() throws RecognitionException {
		HtmlChardataContext _localctx = new HtmlChardataContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_htmlChardata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_la = _input.LA(1);
			if ( !(_la==SEA_WS || _la==HTML_TEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class HtmlMiscContext extends ParserRuleContext {
		public HtmlCommentContext htmlComment() {
			return getRuleContext(HtmlCommentContext.class,0);
		}
		public TerminalNode SEA_WS() { return getToken(HTMLParser.SEA_WS, 0); }
		public HtmlMiscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlMisc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlMisc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlMisc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlMisc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlMiscContext htmlMisc() throws RecognitionException {
		HtmlMiscContext _localctx = new HtmlMiscContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_htmlMisc);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_COMMENT:
			case HTML_CONDITIONAL_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				htmlComment();
				}
				break;
			case SEA_WS:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(SEA_WS);
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
	public static class HtmlCommentContext extends ParserRuleContext {
		public TerminalNode HTML_COMMENT() { return getToken(HTMLParser.HTML_COMMENT, 0); }
		public TerminalNode HTML_CONDITIONAL_COMMENT() { return getToken(HTMLParser.HTML_CONDITIONAL_COMMENT, 0); }
		public HtmlCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlCommentContext htmlComment() throws RecognitionException {
		HtmlCommentContext _localctx = new HtmlCommentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_htmlComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !(_la==HTML_COMMENT || _la==HTML_CONDITIONAL_COMMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\u0004\u0001\u0017Q\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0003\u0000\u0010"+
		"\b\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u0014\b\u0000\u0005\u0000"+
		"\u0016\b\u0000\n\u0000\f\u0000\u0019\t\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001\u001e\b\u0001\n\u0001\f\u0001!\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001-\b\u0001\n\u0001\f\u0001"+
		"0\t\u0001\u0001\u0001\u0003\u00013\b\u0001\u0001\u0002\u0003\u00026\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002:\b\u0002\u0001\u0002\u0003"+
		"\u0002=\b\u0002\u0005\u0002?\b\u0002\n\u0002\f\u0002B\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003G\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0003\u0005M\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0000\u0000\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u0002"+
		"\u0002\u0000\u0007\u0007\u000b\u000b\u0001\u0000\u0001\u0002U\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u00022\u0001\u0000\u0000\u0000\u00045\u0001\u0000"+
		"\u0000\u0000\u0006C\u0001\u0000\u0000\u0000\bH\u0001\u0000\u0000\u0000"+
		"\nL\u0001\u0000\u0000\u0000\fN\u0001\u0000\u0000\u0000\u000e\u0010\u0003"+
		"\n\u0005\u0000\u000f\u000e\u0001\u0000\u0000\u0000\u000f\u0010\u0001\u0000"+
		"\u0000\u0000\u0010\u0017\u0001\u0000\u0000\u0000\u0011\u0013\u0003\u0002"+
		"\u0001\u0000\u0012\u0014\u0003\n\u0005\u0000\u0013\u0012\u0001\u0000\u0000"+
		"\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0016\u0001\u0000\u0000"+
		"\u0000\u0015\u0011\u0001\u0000\u0000\u0000\u0016\u0019\u0001\u0000\u0000"+
		"\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000"+
		"\u0000\u0018\u0001\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000"+
		"\u0000\u001a\u001b\u0005\n\u0000\u0000\u001b\u001f\u0005\u0010\u0000\u0000"+
		"\u001c\u001e\u0003\u0006\u0003\u0000\u001d\u001c\u0001\u0000\u0000\u0000"+
		"\u001e!\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f"+
		" \u0001\u0000\u0000\u0000 \"\u0001\u0000\u0000\u0000!\u001f\u0001\u0000"+
		"\u0000\u0000\"#\u0005\f\u0000\u0000#$\u0003\u0004\u0002\u0000$%\u0005"+
		"\n\u0000\u0000%&\u0005\u000e\u0000\u0000&\'\u0005\u0010\u0000\u0000\'"+
		"(\u0005\f\u0000\u0000(3\u0001\u0000\u0000\u0000)*\u0005\n\u0000\u0000"+
		"*.\u0005\u0010\u0000\u0000+-\u0003\u0006\u0003\u0000,+\u0001\u0000\u0000"+
		"\u0000-0\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000"+
		"\u0000\u0000/1\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000013\u0005"+
		"\r\u0000\u00002\u001a\u0001\u0000\u0000\u00002)\u0001\u0000\u0000\u0000"+
		"3\u0003\u0001\u0000\u0000\u000046\u0003\b\u0004\u000054\u0001\u0000\u0000"+
		"\u000056\u0001\u0000\u0000\u00006@\u0001\u0000\u0000\u00007:\u0003\u0002"+
		"\u0001\u00008:\u0003\f\u0006\u000097\u0001\u0000\u0000\u000098\u0001\u0000"+
		"\u0000\u0000:<\u0001\u0000\u0000\u0000;=\u0003\b\u0004\u0000<;\u0001\u0000"+
		"\u0000\u0000<=\u0001\u0000\u0000\u0000=?\u0001\u0000\u0000\u0000>9\u0001"+
		"\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000"+
		"@A\u0001\u0000\u0000\u0000A\u0005\u0001\u0000\u0000\u0000B@\u0001\u0000"+
		"\u0000\u0000CF\u0005\u0010\u0000\u0000DE\u0005\u000f\u0000\u0000EG\u0005"+
		"\u0016\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000"+
		"G\u0007\u0001\u0000\u0000\u0000HI\u0007\u0000\u0000\u0000I\t\u0001\u0000"+
		"\u0000\u0000JM\u0003\f\u0006\u0000KM\u0005\u0007\u0000\u0000LJ\u0001\u0000"+
		"\u0000\u0000LK\u0001\u0000\u0000\u0000M\u000b\u0001\u0000\u0000\u0000"+
		"NO\u0007\u0001\u0000\u0000O\r\u0001\u0000\u0000\u0000\f\u000f\u0013\u0017"+
		"\u001f.259<@FL";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}