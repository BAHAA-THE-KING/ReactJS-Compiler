// Generated from D:/__git projects/ReactJS-Compiler/Compiler Project/src/rules/HTMLLexer.g4 by ANTLR 4.13.1
package antlrHTML;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HTMLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOCTYPE=1, HTML_COMMENT=2, SEA_WS=3, TAG_OPEN=4, HTML_TEXT=5, TAG_CLOSE=6, 
		TAG_SLASH_CLOSE=7, TAG_SLASH=8, TAG_EQUALS=9, TAG_NAME=10, TAG_WHITESPACE=11, 
		ATTVALUE_VALUE=12, ATTRIBUTE=13;
	public static final int
		TAG=1, ATTVALUE=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "TAG", "ATTVALUE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DOCTYPE", "HTML_COMMENT", "SEA_WS", "TAG_OPEN", "HTML_TEXT", "TAG_CLOSE", 
			"TAG_SLASH_CLOSE", "TAG_SLASH", "TAG_EQUALS", "TAG_NAME", "TAG_WHITESPACE", 
			"HEXDIGIT", "DIGIT", "TAG_NameChar", "TAG_NameStartChar", "ATTVALUE_VALUE", 
			"ATTRIBUTE", "ATTCHARS", "ATTCHAR", "DECCHARS", "DOUBLE_QUOTE_STRING", 
			"SINGLE_QUOTE_STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<!DOCTYPE html>'", null, null, "'<'", null, "'>'", "'/>'", "'/'", 
			"'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOCTYPE", "HTML_COMMENT", "SEA_WS", "TAG_OPEN", "HTML_TEXT", "TAG_CLOSE", 
			"TAG_SLASH_CLOSE", "TAG_SLASH", "TAG_EQUALS", "TAG_NAME", "TAG_WHITESPACE", 
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


	public HTMLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HTMLLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\r\u00ba\u0006\uffff\uffff\u0006\uffff\uffff\u0006\uffff\uffff"+
		"\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002"+
		"\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005"+
		"\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007\b\u0002"+
		"\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007\f\u0002"+
		"\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f\u0002\u0010"+
		"\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012\u0002\u0013"+
		"\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001F\b\u0001\n\u0001\f\u0001"+
		"I\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0003\u0002Q\b\u0002\u0001\u0002\u0004\u0002T\b\u0002\u000b"+
		"\u0002\f\u0002U\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0004\u0004]\b\u0004\u000b\u0004\f\u0004^\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0005\tr\b\t\n\t\f\tu\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0003\r\u0082"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000f\u0005\u000f\u0087\b\u000f\n\u000f"+
		"\f\u000f\u008a\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0094\b\u0010"+
		"\u0001\u0011\u0004\u0011\u0097\b\u0011\u000b\u0011\f\u0011\u0098\u0001"+
		"\u0011\u0003\u0011\u009c\b\u0011\u0001\u0012\u0003\u0012\u009f\b\u0012"+
		"\u0001\u0013\u0004\u0013\u00a2\b\u0013\u000b\u0013\f\u0013\u00a3\u0001"+
		"\u0013\u0003\u0013\u00a7\b\u0013\u0001\u0014\u0001\u0014\u0005\u0014\u00ab"+
		"\b\u0014\n\u0014\f\u0014\u00ae\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0005\u0015\u00b4\b\u0015\n\u0015\f\u0015\u00b7\t\u0015\u0001"+
		"\u0015\u0001\u0015\u0001G\u0000\u0016\u0003\u0001\u0005\u0002\u0007\u0003"+
		"\t\u0004\u000b\u0005\r\u0006\u000f\u0007\u0011\b\u0013\t\u0015\n\u0017"+
		"\u000b\u0019\u0000\u001b\u0000\u001d\u0000\u001f\u0000!\f#\r%\u0000\'"+
		"\u0000)\u0000+\u0000-\u0000\u0003\u0000\u0001\u0002\n\u0002\u0000\t\t"+
		"  \u0001\u0000<<\u0003\u0000\t\n\r\r  \u0003\u000009AFaf\u0001\u00000"+
		"9\u0002\u0000..__\u0003\u0000::AZaz\u0007\u0000##+;==??AZ__az\u0002\u0000"+
		"\"\"<<\u0002\u0000\'\'<<\u00c0\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0001\r"+
		"\u0001\u0000\u0000\u0000\u0001\u000f\u0001\u0000\u0000\u0000\u0001\u0011"+
		"\u0001\u0000\u0000\u0000\u0001\u0013\u0001\u0000\u0000\u0000\u0001\u0015"+
		"\u0001\u0000\u0000\u0000\u0001\u0017\u0001\u0000\u0000\u0000\u0002!\u0001"+
		"\u0000\u0000\u0000\u0002#\u0001\u0000\u0000\u0000\u0003/\u0001\u0000\u0000"+
		"\u0000\u0005?\u0001\u0000\u0000\u0000\u0007S\u0001\u0000\u0000\u0000\t"+
		"W\u0001\u0000\u0000\u0000\u000b\\\u0001\u0000\u0000\u0000\r`\u0001\u0000"+
		"\u0000\u0000\u000fd\u0001\u0000\u0000\u0000\u0011i\u0001\u0000\u0000\u0000"+
		"\u0013k\u0001\u0000\u0000\u0000\u0015o\u0001\u0000\u0000\u0000\u0017v"+
		"\u0001\u0000\u0000\u0000\u0019z\u0001\u0000\u0000\u0000\u001b|\u0001\u0000"+
		"\u0000\u0000\u001d\u0081\u0001\u0000\u0000\u0000\u001f\u0083\u0001\u0000"+
		"\u0000\u0000!\u0088\u0001\u0000\u0000\u0000#\u0093\u0001\u0000\u0000\u0000"+
		"%\u0096\u0001\u0000\u0000\u0000\'\u009e\u0001\u0000\u0000\u0000)\u00a1"+
		"\u0001\u0000\u0000\u0000+\u00a8\u0001\u0000\u0000\u0000-\u00b1\u0001\u0000"+
		"\u0000\u0000/0\u0005<\u0000\u000001\u0005!\u0000\u000012\u0005D\u0000"+
		"\u000023\u0005O\u0000\u000034\u0005C\u0000\u000045\u0005T\u0000\u0000"+
		"56\u0005Y\u0000\u000067\u0005P\u0000\u000078\u0005E\u0000\u000089\u0005"+
		" \u0000\u00009:\u0005h\u0000\u0000:;\u0005t\u0000\u0000;<\u0005m\u0000"+
		"\u0000<=\u0005l\u0000\u0000=>\u0005>\u0000\u0000>\u0004\u0001\u0000\u0000"+
		"\u0000?@\u0005<\u0000\u0000@A\u0005!\u0000\u0000AB\u0005-\u0000\u0000"+
		"BC\u0005-\u0000\u0000CG\u0001\u0000\u0000\u0000DF\t\u0000\u0000\u0000"+
		"ED\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000"+
		"\u0000GE\u0001\u0000\u0000\u0000HJ\u0001\u0000\u0000\u0000IG\u0001\u0000"+
		"\u0000\u0000JK\u0005-\u0000\u0000KL\u0005-\u0000\u0000LM\u0005>\u0000"+
		"\u0000M\u0006\u0001\u0000\u0000\u0000NT\u0007\u0000\u0000\u0000OQ\u0005"+
		"\r\u0000\u0000PO\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0001"+
		"\u0000\u0000\u0000RT\u0005\n\u0000\u0000SN\u0001\u0000\u0000\u0000SP\u0001"+
		"\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000"+
		"UV\u0001\u0000\u0000\u0000V\b\u0001\u0000\u0000\u0000WX\u0005<\u0000\u0000"+
		"XY\u0001\u0000\u0000\u0000YZ\u0006\u0003\u0000\u0000Z\n\u0001\u0000\u0000"+
		"\u0000[]\b\u0001\u0000\u0000\\[\u0001\u0000\u0000\u0000]^\u0001\u0000"+
		"\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_\f\u0001"+
		"\u0000\u0000\u0000`a\u0005>\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0006"+
		"\u0005\u0001\u0000c\u000e\u0001\u0000\u0000\u0000de\u0005/\u0000\u0000"+
		"ef\u0005>\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0006\u0006\u0001\u0000"+
		"h\u0010\u0001\u0000\u0000\u0000ij\u0005/\u0000\u0000j\u0012\u0001\u0000"+
		"\u0000\u0000kl\u0005=\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0006\b"+
		"\u0002\u0000n\u0014\u0001\u0000\u0000\u0000os\u0003\u001f\u000e\u0000"+
		"pr\u0003\u001d\r\u0000qp\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000"+
		"sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000t\u0016\u0001\u0000"+
		"\u0000\u0000us\u0001\u0000\u0000\u0000vw\u0007\u0002\u0000\u0000wx\u0001"+
		"\u0000\u0000\u0000xy\u0006\n\u0003\u0000y\u0018\u0001\u0000\u0000\u0000"+
		"z{\u0007\u0003\u0000\u0000{\u001a\u0001\u0000\u0000\u0000|}\u0007\u0004"+
		"\u0000\u0000}\u001c\u0001\u0000\u0000\u0000~\u0082\u0003\u001f\u000e\u0000"+
		"\u007f\u0082\u0007\u0005\u0000\u0000\u0080\u0082\u0003\u001b\f\u0000\u0081"+
		"~\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0080"+
		"\u0001\u0000\u0000\u0000\u0082\u001e\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0007\u0006\u0000\u0000\u0084 \u0001\u0000\u0000\u0000\u0085\u0087\u0005"+
		" \u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000"+
		"\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000"+
		"\u0000\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0003#\u0010\u0000\u008c\u008d\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0006\u000f\u0001\u0000\u008e\"\u0001\u0000\u0000\u0000"+
		"\u008f\u0094\u0003+\u0014\u0000\u0090\u0094\u0003-\u0015\u0000\u0091\u0094"+
		"\u0003%\u0011\u0000\u0092\u0094\u0003)\u0013\u0000\u0093\u008f\u0001\u0000"+
		"\u0000\u0000\u0093\u0090\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000"+
		"\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094$\u0001\u0000\u0000"+
		"\u0000\u0095\u0097\u0003\'\u0012\u0000\u0096\u0095\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009b\u0001\u0000\u0000\u0000"+
		"\u009a\u009c\u0005 \u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0001\u0000\u0000\u0000\u009c&\u0001\u0000\u0000\u0000\u009d\u009f"+
		"\u0007\u0007\u0000\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f(\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a2\u0007\u0004\u0000\u0000\u00a1\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a7\u0005%\u0000\u0000\u00a6\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7*\u0001\u0000\u0000"+
		"\u0000\u00a8\u00ac\u0005\"\u0000\u0000\u00a9\u00ab\b\b\u0000\u0000\u00aa"+
		"\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac"+
		"\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad"+
		"\u00af\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0005\"\u0000\u0000\u00b0,\u0001\u0000\u0000\u0000\u00b1\u00b5"+
		"\u0005\'\u0000\u0000\u00b2\u00b4\b\t\u0000\u0000\u00b3\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005\'\u0000"+
		"\u0000\u00b9.\u0001\u0000\u0000\u0000\u0013\u0000\u0001\u0002GPSU^s\u0081"+
		"\u0088\u0093\u0098\u009b\u009e\u00a3\u00a6\u00ac\u00b5\u0004\u0005\u0001"+
		"\u0000\u0004\u0000\u0000\u0005\u0002\u0000\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}