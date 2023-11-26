// Generated from C:/Users/ASUS/Desktop/GitHub/ReactJS-Compiler/Compiler Project/src/rules/HTMLLexer.g4 by ANTLR 4.13.1
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
		HTML_COMMENT=1, SEA_WS=2, TAG_OPEN=3, HTML_TEXT=4, TAG_CLOSE=5, TAG_SLASH_CLOSE=6, 
		TAG_SLASH=7, TAG_EQUALS=8, TAG_NAME=9, TAG_WHITESPACE=10, ATTVALUE_VALUE=11, 
		ATTRIBUTE=12;
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
			"HTML_COMMENT", "SEA_WS", "TAG_OPEN", "HTML_TEXT", "TAG_CLOSE", "TAG_SLASH_CLOSE", 
			"TAG_SLASH", "TAG_EQUALS", "TAG_NAME", "TAG_WHITESPACE", "HEXDIGIT", 
			"DIGIT", "TAG_NameChar", "TAG_NameStartChar", "ATTVALUE_VALUE", "ATTRIBUTE", 
			"ATTCHARS", "ATTCHAR", "DECCHARS", "DOUBLE_QUOTE_STRING", "SINGLE_QUOTE_STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'<'", null, "'>'", "'/>'", "'/'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HTML_COMMENT", "SEA_WS", "TAG_OPEN", "HTML_TEXT", "TAG_CLOSE", 
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
		"\u0004\u0000\f\u00a8\u0006\uffff\uffff\u0006\uffff\uffff\u0006\uffff\uffff"+
		"\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002"+
		"\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005"+
		"\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007\b\u0002"+
		"\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007\f\u0002"+
		"\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f\u0002\u0010"+
		"\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012\u0002\u0013"+
		"\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u00004\b\u0000\n\u0000\f\u0000"+
		"7\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0003\u0001?\b\u0001\u0001\u0001\u0004\u0001B\b\u0001\u000b"+
		"\u0001\f\u0001C\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0004\u0003K\b\u0003\u000b\u0003\f\u0003L\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0005\b`\b\b\n\b\f\bc\t\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0003\fp\b\f\u0001\r\u0001\r\u0001\u000e\u0005\u000eu\b\u000e"+
		"\n\u000e\f\u000ex\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0082\b\u000f"+
		"\u0001\u0010\u0004\u0010\u0085\b\u0010\u000b\u0010\f\u0010\u0086\u0001"+
		"\u0010\u0003\u0010\u008a\b\u0010\u0001\u0011\u0003\u0011\u008d\b\u0011"+
		"\u0001\u0012\u0004\u0012\u0090\b\u0012\u000b\u0012\f\u0012\u0091\u0001"+
		"\u0012\u0003\u0012\u0095\b\u0012\u0001\u0013\u0001\u0013\u0005\u0013\u0099"+
		"\b\u0013\n\u0013\f\u0013\u009c\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0005\u0014\u00a2\b\u0014\n\u0014\f\u0014\u00a5\t\u0014\u0001"+
		"\u0014\u0001\u0014\u00015\u0000\u0015\u0003\u0001\u0005\u0002\u0007\u0003"+
		"\t\u0004\u000b\u0005\r\u0006\u000f\u0007\u0011\b\u0013\t\u0015\n\u0017"+
		"\u0000\u0019\u0000\u001b\u0000\u001d\u0000\u001f\u000b!\f#\u0000%\u0000"+
		"\'\u0000)\u0000+\u0000\u0003\u0000\u0001\u0002\n\u0002\u0000\t\t  \u0001"+
		"\u0000<<\u0003\u0000\t\n\r\r  \u0003\u000009AFaf\u0001\u000009\u0002\u0000"+
		"..__\u0003\u0000::AZaz\u0007\u0000##+;==??AZ__az\u0002\u0000\"\"<<\u0002"+
		"\u0000\'\'<<\u00ae\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0001\u000b\u0001\u0000\u0000\u0000\u0001\r\u0001\u0000\u0000"+
		"\u0000\u0001\u000f\u0001\u0000\u0000\u0000\u0001\u0011\u0001\u0000\u0000"+
		"\u0000\u0001\u0013\u0001\u0000\u0000\u0000\u0001\u0015\u0001\u0000\u0000"+
		"\u0000\u0002\u001f\u0001\u0000\u0000\u0000\u0002!\u0001\u0000\u0000\u0000"+
		"\u0003-\u0001\u0000\u0000\u0000\u0005A\u0001\u0000\u0000\u0000\u0007E"+
		"\u0001\u0000\u0000\u0000\tJ\u0001\u0000\u0000\u0000\u000bN\u0001\u0000"+
		"\u0000\u0000\rR\u0001\u0000\u0000\u0000\u000fW\u0001\u0000\u0000\u0000"+
		"\u0011Y\u0001\u0000\u0000\u0000\u0013]\u0001\u0000\u0000\u0000\u0015d"+
		"\u0001\u0000\u0000\u0000\u0017h\u0001\u0000\u0000\u0000\u0019j\u0001\u0000"+
		"\u0000\u0000\u001bo\u0001\u0000\u0000\u0000\u001dq\u0001\u0000\u0000\u0000"+
		"\u001fv\u0001\u0000\u0000\u0000!\u0081\u0001\u0000\u0000\u0000#\u0084"+
		"\u0001\u0000\u0000\u0000%\u008c\u0001\u0000\u0000\u0000\'\u008f\u0001"+
		"\u0000\u0000\u0000)\u0096\u0001\u0000\u0000\u0000+\u009f\u0001\u0000\u0000"+
		"\u0000-.\u0005<\u0000\u0000./\u0005!\u0000\u0000/0\u0005-\u0000\u0000"+
		"01\u0005-\u0000\u000015\u0001\u0000\u0000\u000024\t\u0000\u0000\u0000"+
		"32\u0001\u0000\u0000\u000047\u0001\u0000\u0000\u000056\u0001\u0000\u0000"+
		"\u000053\u0001\u0000\u0000\u000068\u0001\u0000\u0000\u000075\u0001\u0000"+
		"\u0000\u000089\u0005-\u0000\u00009:\u0005-\u0000\u0000:;\u0005>\u0000"+
		"\u0000;\u0004\u0001\u0000\u0000\u0000<B\u0007\u0000\u0000\u0000=?\u0005"+
		"\r\u0000\u0000>=\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0001"+
		"\u0000\u0000\u0000@B\u0005\n\u0000\u0000A<\u0001\u0000\u0000\u0000A>\u0001"+
		"\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000"+
		"CD\u0001\u0000\u0000\u0000D\u0006\u0001\u0000\u0000\u0000EF\u0005<\u0000"+
		"\u0000FG\u0001\u0000\u0000\u0000GH\u0006\u0002\u0000\u0000H\b\u0001\u0000"+
		"\u0000\u0000IK\b\u0001\u0000\u0000JI\u0001\u0000\u0000\u0000KL\u0001\u0000"+
		"\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000M\n\u0001"+
		"\u0000\u0000\u0000NO\u0005>\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0006"+
		"\u0004\u0001\u0000Q\f\u0001\u0000\u0000\u0000RS\u0005/\u0000\u0000ST\u0005"+
		">\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0006\u0005\u0001\u0000V\u000e"+
		"\u0001\u0000\u0000\u0000WX\u0005/\u0000\u0000X\u0010\u0001\u0000\u0000"+
		"\u0000YZ\u0005=\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0006\u0007\u0002"+
		"\u0000\\\u0012\u0001\u0000\u0000\u0000]a\u0003\u001d\r\u0000^`\u0003\u001b"+
		"\f\u0000_^\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000"+
		"\u0000\u0000ab\u0001\u0000\u0000\u0000b\u0014\u0001\u0000\u0000\u0000"+
		"ca\u0001\u0000\u0000\u0000de\u0007\u0002\u0000\u0000ef\u0001\u0000\u0000"+
		"\u0000fg\u0006\t\u0003\u0000g\u0016\u0001\u0000\u0000\u0000hi\u0007\u0003"+
		"\u0000\u0000i\u0018\u0001\u0000\u0000\u0000jk\u0007\u0004\u0000\u0000"+
		"k\u001a\u0001\u0000\u0000\u0000lp\u0003\u001d\r\u0000mp\u0007\u0005\u0000"+
		"\u0000np\u0003\u0019\u000b\u0000ol\u0001\u0000\u0000\u0000om\u0001\u0000"+
		"\u0000\u0000on\u0001\u0000\u0000\u0000p\u001c\u0001\u0000\u0000\u0000"+
		"qr\u0007\u0006\u0000\u0000r\u001e\u0001\u0000\u0000\u0000su\u0005 \u0000"+
		"\u0000ts\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000"+
		"\u0000\u0000vw\u0001\u0000\u0000\u0000wy\u0001\u0000\u0000\u0000xv\u0001"+
		"\u0000\u0000\u0000yz\u0003!\u000f\u0000z{\u0001\u0000\u0000\u0000{|\u0006"+
		"\u000e\u0001\u0000| \u0001\u0000\u0000\u0000}\u0082\u0003)\u0013\u0000"+
		"~\u0082\u0003+\u0014\u0000\u007f\u0082\u0003#\u0010\u0000\u0080\u0082"+
		"\u0003\'\u0012\u0000\u0081}\u0001\u0000\u0000\u0000\u0081~\u0001\u0000"+
		"\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0080\u0001\u0000"+
		"\u0000\u0000\u0082\"\u0001\u0000\u0000\u0000\u0083\u0085\u0003%\u0011"+
		"\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000"+
		"\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000"+
		"\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088\u008a\u0005 \u0000\u0000"+
		"\u0089\u0088\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000"+
		"\u008a$\u0001\u0000\u0000\u0000\u008b\u008d\u0007\u0007\u0000\u0000\u008c"+
		"\u008b\u0001\u0000\u0000\u0000\u008d&\u0001\u0000\u0000\u0000\u008e\u0090"+
		"\u0007\u0004\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0001\u0000\u0000\u0000\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u0095"+
		"\u0005%\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0094\u0095\u0001"+
		"\u0000\u0000\u0000\u0095(\u0001\u0000\u0000\u0000\u0096\u009a\u0005\""+
		"\u0000\u0000\u0097\u0099\b\b\u0000\u0000\u0098\u0097\u0001\u0000\u0000"+
		"\u0000\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009d\u0001\u0000\u0000"+
		"\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u009e\u0005\"\u0000\u0000"+
		"\u009e*\u0001\u0000\u0000\u0000\u009f\u00a3\u0005\'\u0000\u0000\u00a0"+
		"\u00a2\b\t\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a6\u0001\u0000\u0000\u0000\u00a5\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\'\u0000\u0000\u00a7,\u0001"+
		"\u0000\u0000\u0000\u0013\u0000\u0001\u00025>ACLaov\u0081\u0086\u0089\u008c"+
		"\u0091\u0094\u009a\u00a3\u0004\u0005\u0001\u0000\u0004\u0000\u0000\u0005"+
		"\u0002\u0000\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}