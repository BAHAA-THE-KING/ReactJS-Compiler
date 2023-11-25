// Generated from C:/Users/ASUS/Desktop/GitHub/ReactJS-Compiler/untitled/src/rules/ReactJSParser.g4 by ANTLR 4.13.1
package rules;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ReactJSParserLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, OPEN_BRACKET=4, OPEN_SLASH_BRACKET=5, CLOSE_BRACKET=6, 
		CLOSE_SLASH_BRACKET=7, ELEMENT_NAME=8, TEXT=9, ATTRIBUTE_NAME=10, ID=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "OPEN_BRACKET", "OPEN_SLASH_BRACKET", "CLOSE_BRACKET", 
			"CLOSE_SLASH_BRACKET", "ELEMENT_NAME", "TEXT", "ATTRIBUTE_NAME", "ID"
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


	public ReactJSParserLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ReactJSParser.g4"; }

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
		"\u0004\u0000\u000bC\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0004\u0007)\b\u0007"+
		"\u000b\u0007\f\u0007*\u0001\u0007\u0003\u0007.\b\u0007\u0001\b\u0005\b"+
		"1\b\b\n\b\f\b4\t\b\u0001\t\u0001\t\u0005\t8\b\t\n\t\f\t;\t\t\u0001\n\u0001"+
		"\n\u0005\n?\b\n\n\n\f\nB\t\n\u0000\u0000\u000b\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0001\u0000\u0006\u0001\u0000az\u0001\u000016\u0004\u0000"+
		"--AZ__az\u0005\u0000--09AZ__az\u0003\u0000AZ__az\u0003\u000009AZazG\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0001\u0017\u0001\u0000\u0000\u0000\u0003\u0019"+
		"\u0001\u0000\u0000\u0000\u0005\u001b\u0001\u0000\u0000\u0000\u0007\u001d"+
		"\u0001\u0000\u0000\u0000\t\u001f\u0001\u0000\u0000\u0000\u000b\"\u0001"+
		"\u0000\u0000\u0000\r$\u0001\u0000\u0000\u0000\u000f(\u0001\u0000\u0000"+
		"\u0000\u00112\u0001\u0000\u0000\u0000\u00135\u0001\u0000\u0000\u0000\u0015"+
		"<\u0001\u0000\u0000\u0000\u0017\u0018\u0005=\u0000\u0000\u0018\u0002\u0001"+
		"\u0000\u0000\u0000\u0019\u001a\u0005\'\u0000\u0000\u001a\u0004\u0001\u0000"+
		"\u0000\u0000\u001b\u001c\u0005\"\u0000\u0000\u001c\u0006\u0001\u0000\u0000"+
		"\u0000\u001d\u001e\u0005<\u0000\u0000\u001e\b\u0001\u0000\u0000\u0000"+
		"\u001f \u0005<\u0000\u0000 !\u0005/\u0000\u0000!\n\u0001\u0000\u0000\u0000"+
		"\"#\u0005>\u0000\u0000#\f\u0001\u0000\u0000\u0000$%\u0005/\u0000\u0000"+
		"%&\u0005>\u0000\u0000&\u000e\u0001\u0000\u0000\u0000\')\u0007\u0000\u0000"+
		"\u0000(\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*(\u0001\u0000"+
		"\u0000\u0000*+\u0001\u0000\u0000\u0000+-\u0001\u0000\u0000\u0000,.\u0007"+
		"\u0001\u0000\u0000-,\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000"+
		".\u0010\u0001\u0000\u0000\u0000/1\u0007\u0000\u0000\u00000/\u0001\u0000"+
		"\u0000\u000014\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000023\u0001"+
		"\u0000\u0000\u00003\u0012\u0001\u0000\u0000\u000042\u0001\u0000\u0000"+
		"\u000059\u0007\u0002\u0000\u000068\u0007\u0003\u0000\u000076\u0001\u0000"+
		"\u0000\u00008;\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001"+
		"\u0000\u0000\u0000:\u0014\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000"+
		"\u0000<@\u0007\u0004\u0000\u0000=?\u0007\u0005\u0000\u0000>=\u0001\u0000"+
		"\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001"+
		"\u0000\u0000\u0000A\u0016\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000"+
		"\u0000\u0006\u0000*-29@\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}