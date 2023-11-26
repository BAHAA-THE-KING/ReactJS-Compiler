// Generated from C:/Users/ASUS/Desktop/GitHub/ReactJS-Compiler/Compiler Project/src/rules/JSParser.g4 by ANTLR 4.13.1
package antlrJS;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MultiLineComment=1, SingleLineComment=2, OpenBracket=3, CloseBracket=4, 
		OpenParen=5, CloseParen=6, OpenBrace=7, CloseBrace=8, SemiColon=9, Comma=10, 
		Assign=11, QuestionMark=12, QuestionMarkDot=13, Colon=14, Ellipsis=15, 
		Dot=16, PlusPlus=17, MinusMinus=18, Plus=19, Minus=20, Not=21, Multiply=22, 
		Divide=23, Modulus=24, Power=25, NullCoalesce=26, LessThan=27, MoreThan=28, 
		LessThanEquals=29, GreaterThanEquals=30, Equals=31, NotEquals=32, IdentityEquals=33, 
		IdentityNotEquals=34, And=35, Or=36, MultiplyAssign=37, DivideAssign=38, 
		ModulusAssign=39, PlusAssign=40, MinusAssign=41, PowerAssign=42, NullishCoalescingAssign=43, 
		ARROW=44, NullLiteral=45, BooleanLiteral=46, DecimalLiteral=47, Break=48, 
		Do=49, Typeof=50, Case=51, Else=52, New=53, Var=54, Catch=55, Finally=56, 
		Return=57, Continue=58, For=59, Switch=60, While=61, Function=62, This=63, 
		Default=64, If=65, Throw=66, Delete=67, In=68, Of=69, Try=70, As=71, From=72, 
		Class=73, Extends=74, Super=75, Const=76, Export=77, Import=78, Let=79, 
		Static=80, Identifier=81, StringLiteral=82, BackTick=83, WhiteSpaces=84, 
		LineTerminator=85, UnexpectedCharacter=86, TemplateStringStartExpression=87, 
		TemplateStringAtom=88;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_block = 2, RULE_statementList = 3, 
		RULE_importStatement = 4, RULE_importFromBlock = 5, RULE_importModuleItems = 6, 
		RULE_importAliasName = 7, RULE_importDefault = 8, RULE_importNamespace = 9, 
		RULE_importFrom = 10, RULE_aliasName = 11, RULE_exportStatement = 12, 
		RULE_exportFromBlock = 13, RULE_exportModuleItems = 14, RULE_exportAliasName = 15, 
		RULE_declaration = 16, RULE_variableStatement = 17, RULE_variableDeclarationList = 18, 
		RULE_variableDeclaration = 19, RULE_expressionStatement = 20, RULE_ifStatement = 21, 
		RULE_iterationStatement = 22, RULE_varModifier = 23, RULE_continueStatement = 24, 
		RULE_breakStatement = 25, RULE_returnStatement = 26, RULE_switchStatement = 27, 
		RULE_caseBlock = 28, RULE_caseClauses = 29, RULE_caseClause = 30, RULE_defaultClause = 31, 
		RULE_throwStatement = 32, RULE_tryStatement = 33, RULE_catchProduction = 34, 
		RULE_finallyProduction = 35, RULE_functionDeclaration = 36, RULE_classDeclaration = 37, 
		RULE_classTail = 38, RULE_classElement = 39, RULE_methodDefinition = 40, 
		RULE_fieldDefinition = 41, RULE_formalParameterList = 42, RULE_formalParameterArg = 43, 
		RULE_lastFormalParameterArg = 44, RULE_functionBody = 45, RULE_statements = 46, 
		RULE_arrayLiteral = 47, RULE_elementList = 48, RULE_arrayElement = 49, 
		RULE_propertyAssignment = 50, RULE_propertyName = 51, RULE_arguments = 52, 
		RULE_argument = 53, RULE_expressionSequence = 54, RULE_singleExpression = 55, 
		RULE_initializer = 56, RULE_assignable = 57, RULE_objectLiteral = 58, 
		RULE_anonymousFunction = 59, RULE_arrowFunctionParameters = 60, RULE_arrowFunctionBody = 61, 
		RULE_assignmentOperator = 62, RULE_literal = 63, RULE_templateStringLiteral = 64, 
		RULE_templateStringAtom = 65, RULE_eos = 66;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "block", "statementList", "importStatement", 
			"importFromBlock", "importModuleItems", "importAliasName", "importDefault", 
			"importNamespace", "importFrom", "aliasName", "exportStatement", "exportFromBlock", 
			"exportModuleItems", "exportAliasName", "declaration", "variableStatement", 
			"variableDeclarationList", "variableDeclaration", "expressionStatement", 
			"ifStatement", "iterationStatement", "varModifier", "continueStatement", 
			"breakStatement", "returnStatement", "switchStatement", "caseBlock", 
			"caseClauses", "caseClause", "defaultClause", "throwStatement", "tryStatement", 
			"catchProduction", "finallyProduction", "functionDeclaration", "classDeclaration", 
			"classTail", "classElement", "methodDefinition", "fieldDefinition", "formalParameterList", 
			"formalParameterArg", "lastFormalParameterArg", "functionBody", "statements", 
			"arrayLiteral", "elementList", "arrayElement", "propertyAssignment", 
			"propertyName", "arguments", "argument", "expressionSequence", "singleExpression", 
			"initializer", "assignable", "objectLiteral", "anonymousFunction", "arrowFunctionParameters", 
			"arrowFunctionBody", "assignmentOperator", "literal", "templateStringLiteral", 
			"templateStringAtom", "eos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'['", "']'", "'('", "')'", "'{'", "'}'", "';'", "','", 
			"'='", "'?'", "'?.'", "':'", "'...'", "'.'", "'++'", "'--'", "'+'", "'-'", 
			"'!'", "'*'", "'/'", "'%'", "'**'", "'??'", "'<'", "'>'", "'<='", "'>='", 
			"'=='", "'!='", "'==='", "'!=='", "'&&'", "'||'", "'*='", "'/='", "'%='", 
			"'+='", "'-='", "'**='", "'??='", "'=>'", "'null'", null, null, "'break'", 
			"'do'", "'typeof'", "'case'", "'else'", "'new'", "'var'", "'catch'", 
			"'finally'", "'return'", "'continue'", "'for'", "'switch'", "'while'", 
			"'function'", "'this'", "'default'", "'if'", "'throw'", "'delete'", "'in'", 
			"'of'", "'try'", "'as'", "'from'", "'class'", "'extends'", "'super'", 
			"'const'", "'export'", "'import'", "'let'", "'static'", null, null, null, 
			null, null, null, "'${'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MultiLineComment", "SingleLineComment", "OpenBracket", "CloseBracket", 
			"OpenParen", "CloseParen", "OpenBrace", "CloseBrace", "SemiColon", "Comma", 
			"Assign", "QuestionMark", "QuestionMarkDot", "Colon", "Ellipsis", "Dot", 
			"PlusPlus", "MinusMinus", "Plus", "Minus", "Not", "Multiply", "Divide", 
			"Modulus", "Power", "NullCoalesce", "LessThan", "MoreThan", "LessThanEquals", 
			"GreaterThanEquals", "Equals", "NotEquals", "IdentityEquals", "IdentityNotEquals", 
			"And", "Or", "MultiplyAssign", "DivideAssign", "ModulusAssign", "PlusAssign", 
			"MinusAssign", "PowerAssign", "NullishCoalescingAssign", "ARROW", "NullLiteral", 
			"BooleanLiteral", "DecimalLiteral", "Break", "Do", "Typeof", "Case", 
			"Else", "New", "Var", "Catch", "Finally", "Return", "Continue", "For", 
			"Switch", "While", "Function", "This", "Default", "If", "Throw", "Delete", 
			"In", "Of", "Try", "As", "From", "Class", "Extends", "Super", "Const", 
			"Export", "Import", "Let", "Static", "Identifier", "StringLiteral", "BackTick", 
			"WhiteSpaces", "LineTerminator", "UnexpectedCharacter", "TemplateStringStartExpression", 
			"TemplateStringAtom"
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
	public String getGrammarFileName() { return "JSParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JSParser.EOF, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -114876974865972568L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 490791L) != 0)) {
				{
				setState(134);
				statements();
				}
			}

			setState(137);
			match(EOF);
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
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportChunkContext extends StatementContext {
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public ImportChunkContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterImportChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitImportChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitImportChunk(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyChunkContext extends StatementContext {
		public TerminalNode SemiColon() { return getToken(JSParser.SemiColon, 0); }
		public EmptyChunkContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterEmptyChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitEmptyChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitEmptyChunk(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationChunkContext extends StatementContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public FunctionDeclarationChunkContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterFunctionDeclarationChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitFunctionDeclarationChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitFunctionDeclarationChunk(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContinueChunkContext extends StatementContext {
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ContinueChunkContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterContinueChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitContinueChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitContinueChunk(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExportChunkContext extends StatementContext {
		public ExportStatementContext exportStatement() {
			return getRuleContext(ExportStatementContext.class,0);
		}
		public ExportChunkContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterExportChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitExportChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitExportChunk(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LoopChunkContext extends StatementContext {
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public LoopChunkContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterLoopChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitLoopChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitLoopChunk(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclerationChunkContext extends StatementContext {
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public VariableDeclerationChunkContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterVariableDeclerationChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitVariableDeclerationChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitVariableDeclerationChunk(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockChunkContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockChunkContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterBlockChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitBlockChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitBlockChunk(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionChunkContext extends StatementContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ExpressionChunkContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterExpressionChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitExpressionChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitExpressionChunk(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThrowChunkContext extends StatementContext {
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public ThrowChunkContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterThrowChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitThrowChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitThrowChunk(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TryChunkContext extends StatementContext {
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public TryChunkContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterTryChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitTryChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitTryChunk(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalChunkContext extends StatementContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ConditionalChunkContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterConditionalChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitConditionalChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitConditionalChunk(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SwitchChunkContext extends StatementContext {
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public SwitchChunkContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterSwitchChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitSwitchChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitSwitchChunk(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakChunkContext extends StatementContext {
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public BreakChunkContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterBreakChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitBreakChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitBreakChunk(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclerationChunkContext extends StatementContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ClassDeclerationChunkContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterClassDeclerationChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitClassDeclerationChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitClassDeclerationChunk(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnChunkContext extends StatementContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ReturnChunkContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterReturnChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitReturnChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitReturnChunk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new BlockChunkContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				block();
				}
				break;
			case 2:
				_localctx = new VariableDeclerationChunkContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				variableStatement();
				}
				break;
			case 3:
				_localctx = new ImportChunkContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				importStatement();
				}
				break;
			case 4:
				_localctx = new ExportChunkContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				exportStatement();
				}
				break;
			case 5:
				_localctx = new EmptyChunkContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(143);
				match(SemiColon);
				}
				break;
			case 6:
				_localctx = new ClassDeclerationChunkContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(144);
				classDeclaration();
				}
				break;
			case 7:
				_localctx = new FunctionDeclarationChunkContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(145);
				functionDeclaration();
				}
				break;
			case 8:
				_localctx = new ExpressionChunkContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(146);
				expressionStatement();
				}
				break;
			case 9:
				_localctx = new ConditionalChunkContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(147);
				ifStatement();
				}
				break;
			case 10:
				_localctx = new LoopChunkContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(148);
				iterationStatement();
				}
				break;
			case 11:
				_localctx = new ContinueChunkContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(149);
				continueStatement();
				}
				break;
			case 12:
				_localctx = new BreakChunkContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(150);
				breakStatement();
				}
				break;
			case 13:
				_localctx = new ReturnChunkContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(151);
				returnStatement();
				}
				break;
			case 14:
				_localctx = new SwitchChunkContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(152);
				switchStatement();
				}
				break;
			case 15:
				_localctx = new ThrowChunkContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(153);
				throwStatement();
				}
				break;
			case 16:
				_localctx = new TryChunkContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(154);
				tryStatement();
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(JSParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(JSParser.CloseBrace, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(OpenBrace);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -114876974865972568L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 490791L) != 0)) {
				{
				setState(158);
				statementList();
				}
			}

			setState(161);
			match(CloseBrace);
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
	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitStatementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(163);
				statement();
				}
				}
				setState(166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -114876974865972568L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 490791L) != 0) );
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
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(JSParser.Import, 0); }
		public ImportFromBlockContext importFromBlock() {
			return getRuleContext(ImportFromBlockContext.class,0);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(Import);
			setState(169);
			importFromBlock();
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
	public static class ImportFromBlockContext extends ParserRuleContext {
		public ImportFromBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importFromBlock; }
	 
		public ImportFromBlockContext() { }
		public void copyFrom(ImportFromBlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectImportBlockContext extends ImportFromBlockContext {
		public ImportFromContext importFrom() {
			return getRuleContext(ImportFromContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ImportNamespaceContext importNamespace() {
			return getRuleContext(ImportNamespaceContext.class,0);
		}
		public ImportModuleItemsContext importModuleItems() {
			return getRuleContext(ImportModuleItemsContext.class,0);
		}
		public ImportDefaultContext importDefault() {
			return getRuleContext(ImportDefaultContext.class,0);
		}
		public ObjectImportBlockContext(ImportFromBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterObjectImportBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitObjectImportBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitObjectImportBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FileImportBlockContext extends ImportFromBlockContext {
		public TerminalNode StringLiteral() { return getToken(JSParser.StringLiteral, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public FileImportBlockContext(ImportFromBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterFileImportBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitFileImportBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitFileImportBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportFromBlockContext importFromBlock() throws RecognitionException {
		ImportFromBlockContext _localctx = new ImportFromBlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_importFromBlock);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBrace:
			case Multiply:
			case Identifier:
				_localctx = new ObjectImportBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(171);
					importDefault();
					}
					break;
				}
				setState(176);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Multiply:
				case Identifier:
					{
					setState(174);
					importNamespace();
					}
					break;
				case OpenBrace:
					{
					setState(175);
					importModuleItems();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(178);
				importFrom();
				setState(179);
				eos();
				}
				break;
			case StringLiteral:
				_localctx = new FileImportBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(StringLiteral);
				setState(182);
				eos();
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
	public static class ImportModuleItemsContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(JSParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(JSParser.CloseBrace, 0); }
		public List<ImportAliasNameContext> importAliasName() {
			return getRuleContexts(ImportAliasNameContext.class);
		}
		public ImportAliasNameContext importAliasName(int i) {
			return getRuleContext(ImportAliasNameContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JSParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JSParser.Comma, i);
		}
		public ImportModuleItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importModuleItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterImportModuleItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitImportModuleItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitImportModuleItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportModuleItemsContext importModuleItems() throws RecognitionException {
		ImportModuleItemsContext _localctx = new ImportModuleItemsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_importModuleItems);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(OpenBrace);
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(186);
					importAliasName();
					setState(187);
					match(Comma);
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(194);
				importAliasName();
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(195);
					match(Comma);
					}
				}

				}
			}

			setState(200);
			match(CloseBrace);
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
	public static class ImportAliasNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JSParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JSParser.Identifier, i);
		}
		public TerminalNode As() { return getToken(JSParser.As, 0); }
		public ImportAliasNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importAliasName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterImportAliasName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitImportAliasName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitImportAliasName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportAliasNameContext importAliasName() throws RecognitionException {
		ImportAliasNameContext _localctx = new ImportAliasNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_importAliasName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(Identifier);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(203);
				match(As);
				setState(204);
				match(Identifier);
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
	public static class ImportDefaultContext extends ParserRuleContext {
		public AliasNameContext aliasName() {
			return getRuleContext(AliasNameContext.class,0);
		}
		public TerminalNode Comma() { return getToken(JSParser.Comma, 0); }
		public ImportDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterImportDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitImportDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitImportDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDefaultContext importDefault() throws RecognitionException {
		ImportDefaultContext _localctx = new ImportDefaultContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_importDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			aliasName();
			setState(208);
			match(Comma);
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
	public static class ImportNamespaceContext extends ParserRuleContext {
		public TerminalNode Multiply() { return getToken(JSParser.Multiply, 0); }
		public List<TerminalNode> Identifier() { return getTokens(JSParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JSParser.Identifier, i);
		}
		public TerminalNode As() { return getToken(JSParser.As, 0); }
		public ImportNamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importNamespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterImportNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitImportNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitImportNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportNamespaceContext importNamespace() throws RecognitionException {
		ImportNamespaceContext _localctx = new ImportNamespaceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_importNamespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_la = _input.LA(1);
			if ( !(_la==Multiply || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(211);
				match(As);
				setState(212);
				match(Identifier);
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
	public static class ImportFromContext extends ParserRuleContext {
		public TerminalNode From() { return getToken(JSParser.From, 0); }
		public TerminalNode StringLiteral() { return getToken(JSParser.StringLiteral, 0); }
		public ImportFromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importFrom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterImportFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitImportFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitImportFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportFromContext importFrom() throws RecognitionException {
		ImportFromContext _localctx = new ImportFromContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_importFrom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(From);
			setState(216);
			match(StringLiteral);
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
	public static class AliasNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JSParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JSParser.Identifier, i);
		}
		public TerminalNode As() { return getToken(JSParser.As, 0); }
		public AliasNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterAliasName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitAliasName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitAliasName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasNameContext aliasName() throws RecognitionException {
		AliasNameContext _localctx = new AliasNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_aliasName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(Identifier);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(219);
				match(As);
				setState(220);
				match(Identifier);
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
	public static class ExportStatementContext extends ParserRuleContext {
		public ExportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportStatement; }
	 
		public ExportStatementContext() { }
		public void copyFrom(ExportStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExportDefaultDeclarationContext extends ExportStatementContext {
		public TerminalNode Export() { return getToken(JSParser.Export, 0); }
		public TerminalNode Default() { return getToken(JSParser.Default, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExportDefaultDeclarationContext(ExportStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterExportDefaultDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitExportDefaultDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitExportDefaultDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExportDeclarationContext extends ExportStatementContext {
		public TerminalNode Export() { return getToken(JSParser.Export, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExportFromBlockContext exportFromBlock() {
			return getRuleContext(ExportFromBlockContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode Default() { return getToken(JSParser.Default, 0); }
		public ExportDeclarationContext(ExportStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterExportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitExportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitExportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportStatementContext exportStatement() throws RecognitionException {
		ExportStatementContext _localctx = new ExportStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_exportStatement);
		int _la;
		try {
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new ExportDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(Export);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Default) {
					{
					setState(224);
					match(Default);
					}
				}

				setState(229);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBrace:
					{
					setState(227);
					exportFromBlock();
					}
					break;
				case Var:
				case Function:
				case Class:
				case Const:
				case Let:
					{
					setState(228);
					declaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(231);
				eos();
				}
				break;
			case 2:
				_localctx = new ExportDefaultDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				match(Export);
				setState(234);
				match(Default);
				setState(235);
				singleExpression(0);
				setState(236);
				eos();
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
	public static class ExportFromBlockContext extends ParserRuleContext {
		public ExportModuleItemsContext exportModuleItems() {
			return getRuleContext(ExportModuleItemsContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ImportFromContext importFrom() {
			return getRuleContext(ImportFromContext.class,0);
		}
		public ExportFromBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportFromBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterExportFromBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitExportFromBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitExportFromBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportFromBlockContext exportFromBlock() throws RecognitionException {
		ExportFromBlockContext _localctx = new ExportFromBlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exportFromBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			exportModuleItems();
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==From) {
				{
				setState(241);
				importFrom();
				}
			}

			setState(244);
			eos();
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
	public static class ExportModuleItemsContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(JSParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(JSParser.CloseBrace, 0); }
		public List<ExportAliasNameContext> exportAliasName() {
			return getRuleContexts(ExportAliasNameContext.class);
		}
		public ExportAliasNameContext exportAliasName(int i) {
			return getRuleContext(ExportAliasNameContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JSParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JSParser.Comma, i);
		}
		public ExportModuleItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportModuleItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterExportModuleItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitExportModuleItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitExportModuleItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportModuleItemsContext exportModuleItems() throws RecognitionException {
		ExportModuleItemsContext _localctx = new ExportModuleItemsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exportModuleItems);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(OpenBrace);
			setState(252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(247);
					exportAliasName();
					setState(248);
					match(Comma);
					}
					} 
				}
				setState(254);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(255);
				exportAliasName();
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(256);
					match(Comma);
					}
				}

				}
			}

			setState(261);
			match(CloseBrace);
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
	public static class ExportAliasNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JSParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JSParser.Identifier, i);
		}
		public TerminalNode As() { return getToken(JSParser.As, 0); }
		public ExportAliasNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportAliasName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterExportAliasName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitExportAliasName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitExportAliasName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportAliasNameContext exportAliasName() throws RecognitionException {
		ExportAliasNameContext _localctx = new ExportAliasNameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_exportAliasName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(Identifier);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(264);
				match(As);
				setState(265);
				match(Identifier);
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
	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclareContext extends DeclarationContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public FunctionDeclareContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterFunctionDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitFunctionDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitFunctionDeclare(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclareContext extends DeclarationContext {
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public VariableDeclareContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterVariableDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitVariableDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitVariableDeclare(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclareContext extends DeclarationContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ClassDeclareContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterClassDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitClassDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitClassDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_declaration);
		try {
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
			case Const:
			case Let:
				_localctx = new VariableDeclareContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				variableStatement();
				}
				break;
			case Class:
				_localctx = new ClassDeclareContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				classDeclaration();
				}
				break;
			case Function:
				_localctx = new FunctionDeclareContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
				functionDeclaration();
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
	public static class VariableStatementContext extends ParserRuleContext {
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public VariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitVariableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitVariableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableStatementContext variableStatement() throws RecognitionException {
		VariableStatementContext _localctx = new VariableStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variableStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			variableDeclarationList();
			setState(274);
			eos();
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
	public static class VariableDeclarationListContext extends ParserRuleContext {
		public VarModifierContext varModifier() {
			return getRuleContext(VarModifierContext.class,0);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JSParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JSParser.Comma, i);
		}
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterVariableDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitVariableDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitVariableDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_variableDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			varModifier();
			setState(277);
			variableDeclaration();
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(278);
				match(Comma);
				setState(279);
				variableDeclaration();
				}
				}
				setState(284);
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
	public static class VariableDeclarationContext extends ParserRuleContext {
		public AssignableContext assignable() {
			return getRuleContext(AssignableContext.class,0);
		}
		public TerminalNode Assign() { return getToken(JSParser.Assign, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			assignable();
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(286);
				match(Assign);
				setState(287);
				singleExpression(0);
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
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			expressionSequence();
			setState(291);
			eos();
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
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(JSParser.If, 0); }
		public TerminalNode OpenParen() { return getToken(JSParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(JSParser.CloseParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(JSParser.Else, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(If);
			setState(294);
			match(OpenParen);
			setState(295);
			expressionSequence();
			setState(296);
			match(CloseParen);
			setState(297);
			statement();
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(298);
				match(Else);
				setState(299);
				statement();
				}
				break;
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
	public static class IterationStatementContext extends ParserRuleContext {
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
	 
		public IterationStatementContext() { }
		public void copyFrom(IterationStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends IterationStatementContext {
		public TerminalNode While() { return getToken(JSParser.While, 0); }
		public TerminalNode OpenParen() { return getToken(JSParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(JSParser.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(JSParser.For, 0); }
		public TerminalNode OpenParen() { return getToken(JSParser.OpenParen, 0); }
		public List<TerminalNode> SemiColon() { return getTokens(JSParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(JSParser.SemiColon, i);
		}
		public TerminalNode CloseParen() { return getToken(JSParser.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionSequenceContext> expressionSequence() {
			return getRuleContexts(ExpressionSequenceContext.class);
		}
		public ExpressionSequenceContext expressionSequence(int i) {
			return getRuleContext(ExpressionSequenceContext.class,i);
		}
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public ForStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileStatementContext extends IterationStatementContext {
		public TerminalNode Do() { return getToken(JSParser.Do, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode While() { return getToken(JSParser.While, 0); }
		public TerminalNode OpenParen() { return getToken(JSParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(JSParser.CloseParen, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public DoWhileStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForInStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(JSParser.For, 0); }
		public TerminalNode OpenParen() { return getToken(JSParser.OpenParen, 0); }
		public TerminalNode In() { return getToken(JSParser.In, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(JSParser.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public ForInStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterForInStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitForInStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitForInStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForOfStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(JSParser.For, 0); }
		public TerminalNode OpenParen() { return getToken(JSParser.OpenParen, 0); }
		public TerminalNode Of() { return getToken(JSParser.Of, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(JSParser.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public ForOfStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterForOfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitForOfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitForOfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_iterationStatement);
		int _la;
		try {
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new DoWhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				match(Do);
				setState(303);
				statement();
				setState(304);
				match(While);
				setState(305);
				match(OpenParen);
				setState(306);
				expressionSequence();
				setState(307);
				match(CloseParen);
				setState(308);
				eos();
				}
				break;
			case 2:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				match(While);
				setState(311);
				match(OpenParen);
				setState(312);
				expressionSequence();
				setState(313);
				match(CloseParen);
				setState(314);
				statement();
				}
				break;
			case 3:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(316);
				match(For);
				setState(317);
				match(OpenParen);
				setState(320);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBracket:
				case OpenParen:
				case OpenBrace:
				case PlusPlus:
				case MinusMinus:
				case Plus:
				case Minus:
				case Not:
				case NullLiteral:
				case BooleanLiteral:
				case DecimalLiteral:
				case Typeof:
				case New:
				case Function:
				case This:
				case Delete:
				case Class:
				case Super:
				case Import:
				case Identifier:
				case StringLiteral:
				case BackTick:
					{
					setState(318);
					expressionSequence();
					}
					break;
				case Var:
				case Const:
				case Let:
					{
					setState(319);
					variableDeclarationList();
					}
					break;
				case SemiColon:
					break;
				default:
					break;
				}
				setState(322);
				match(SemiColon);
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4601306628657119064L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 117057L) != 0)) {
					{
					setState(323);
					expressionSequence();
					}
				}

				setState(326);
				match(SemiColon);
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4601306628657119064L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 117057L) != 0)) {
					{
					setState(327);
					expressionSequence();
					}
				}

				setState(330);
				match(CloseParen);
				setState(331);
				statement();
				}
				break;
			case 4:
				_localctx = new ForInStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(332);
				match(For);
				setState(333);
				match(OpenParen);
				setState(336);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBracket:
				case OpenParen:
				case OpenBrace:
				case PlusPlus:
				case MinusMinus:
				case Plus:
				case Minus:
				case Not:
				case NullLiteral:
				case BooleanLiteral:
				case DecimalLiteral:
				case Typeof:
				case New:
				case Function:
				case This:
				case Delete:
				case Class:
				case Super:
				case Import:
				case Identifier:
				case StringLiteral:
				case BackTick:
					{
					setState(334);
					singleExpression(0);
					}
					break;
				case Var:
				case Const:
				case Let:
					{
					setState(335);
					variableDeclarationList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(338);
				match(In);
				setState(339);
				expressionSequence();
				setState(340);
				match(CloseParen);
				setState(341);
				statement();
				}
				break;
			case 5:
				_localctx = new ForOfStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(343);
				match(For);
				setState(344);
				match(OpenParen);
				setState(347);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBracket:
				case OpenParen:
				case OpenBrace:
				case PlusPlus:
				case MinusMinus:
				case Plus:
				case Minus:
				case Not:
				case NullLiteral:
				case BooleanLiteral:
				case DecimalLiteral:
				case Typeof:
				case New:
				case Function:
				case This:
				case Delete:
				case Class:
				case Super:
				case Import:
				case Identifier:
				case StringLiteral:
				case BackTick:
					{
					setState(345);
					singleExpression(0);
					}
					break;
				case Var:
				case Const:
				case Let:
					{
					setState(346);
					variableDeclarationList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(349);
				match(Of);
				setState(350);
				expressionSequence();
				setState(351);
				match(CloseParen);
				setState(352);
				statement();
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
	public static class VarModifierContext extends ParserRuleContext {
		public VarModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varModifier; }
	 
		public VarModifierContext() { }
		public void copyFrom(VarModifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstKeywordContext extends VarModifierContext {
		public TerminalNode Const() { return getToken(JSParser.Const, 0); }
		public ConstKeywordContext(VarModifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterConstKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitConstKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitConstKeyword(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LetKeywordContext extends VarModifierContext {
		public TerminalNode Let() { return getToken(JSParser.Let, 0); }
		public LetKeywordContext(VarModifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterLetKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitLetKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitLetKeyword(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarKeywordContext extends VarModifierContext {
		public TerminalNode Var() { return getToken(JSParser.Var, 0); }
		public VarKeywordContext(VarModifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterVarKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitVarKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitVarKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarModifierContext varModifier() throws RecognitionException {
		VarModifierContext _localctx = new VarModifierContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_varModifier);
		try {
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				_localctx = new VarKeywordContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				match(Var);
				}
				break;
			case Let:
				_localctx = new LetKeywordContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				match(Let);
				}
				break;
			case Const:
				_localctx = new ConstKeywordContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(358);
				match(Const);
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
	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Continue() { return getToken(JSParser.Continue, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(Continue);
			setState(362);
			eos();
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
	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(JSParser.Break, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(Break);
			setState(365);
			eos();
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(JSParser.Return, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(Return);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4601306628657119064L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 117057L) != 0)) {
				{
				setState(368);
				expressionSequence();
				}
			}

			setState(371);
			eos();
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
	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode Switch() { return getToken(JSParser.Switch, 0); }
		public TerminalNode OpenParen() { return getToken(JSParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(JSParser.CloseParen, 0); }
		public CaseBlockContext caseBlock() {
			return getRuleContext(CaseBlockContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(Switch);
			setState(374);
			match(OpenParen);
			setState(375);
			expressionSequence();
			setState(376);
			match(CloseParen);
			setState(377);
			caseBlock();
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
	public static class CaseBlockContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(JSParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(JSParser.CloseBrace, 0); }
		public List<CaseClausesContext> caseClauses() {
			return getRuleContexts(CaseClausesContext.class);
		}
		public CaseClausesContext caseClauses(int i) {
			return getRuleContext(CaseClausesContext.class,i);
		}
		public DefaultClauseContext defaultClause() {
			return getRuleContext(DefaultClauseContext.class,0);
		}
		public CaseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterCaseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitCaseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitCaseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseBlockContext caseBlock() throws RecognitionException {
		CaseBlockContext _localctx = new CaseBlockContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_caseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(OpenBrace);
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Case) {
				{
				setState(380);
				caseClauses();
				}
			}

			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Default) {
				{
				setState(383);
				defaultClause();
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Case) {
					{
					setState(384);
					caseClauses();
					}
				}

				}
			}

			setState(389);
			match(CloseBrace);
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
	public static class CaseClausesContext extends ParserRuleContext {
		public List<CaseClauseContext> caseClause() {
			return getRuleContexts(CaseClauseContext.class);
		}
		public CaseClauseContext caseClause(int i) {
			return getRuleContext(CaseClauseContext.class,i);
		}
		public CaseClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterCaseClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitCaseClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitCaseClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseClausesContext caseClauses() throws RecognitionException {
		CaseClausesContext _localctx = new CaseClausesContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_caseClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(391);
				caseClause();
				}
				}
				setState(394); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Case );
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
	public static class CaseClauseContext extends ParserRuleContext {
		public TerminalNode Case() { return getToken(JSParser.Case, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode Colon() { return getToken(JSParser.Colon, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public CaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterCaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitCaseClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitCaseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseClauseContext caseClause() throws RecognitionException {
		CaseClauseContext _localctx = new CaseClauseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_caseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(Case);
			setState(397);
			expressionSequence();
			setState(398);
			match(Colon);
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -114876974865972568L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 490791L) != 0)) {
				{
				setState(399);
				statementList();
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
	public static class DefaultClauseContext extends ParserRuleContext {
		public TerminalNode Default() { return getToken(JSParser.Default, 0); }
		public TerminalNode Colon() { return getToken(JSParser.Colon, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public DefaultClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterDefaultClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitDefaultClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitDefaultClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultClauseContext defaultClause() throws RecognitionException {
		DefaultClauseContext _localctx = new DefaultClauseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_defaultClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(Default);
			setState(403);
			match(Colon);
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -114876974865972568L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 490791L) != 0)) {
				{
				setState(404);
				statementList();
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
	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(JSParser.Throw, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(Throw);
			setState(408);
			expressionSequence();
			setState(409);
			eos();
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
	public static class TryStatementContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(JSParser.Try, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchProductionContext catchProduction() {
			return getRuleContext(CatchProductionContext.class,0);
		}
		public FinallyProductionContext finallyProduction() {
			return getRuleContext(FinallyProductionContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitTryStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitTryStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_tryStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(Try);
			setState(412);
			block();
			setState(418);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Catch:
				{
				setState(413);
				catchProduction();
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Finally) {
					{
					setState(414);
					finallyProduction();
					}
				}

				}
				break;
			case Finally:
				{
				setState(417);
				finallyProduction();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class CatchProductionContext extends ParserRuleContext {
		public TerminalNode Catch() { return getToken(JSParser.Catch, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(JSParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(JSParser.CloseParen, 0); }
		public AssignableContext assignable() {
			return getRuleContext(AssignableContext.class,0);
		}
		public CatchProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchProduction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterCatchProduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitCatchProduction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitCatchProduction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchProductionContext catchProduction() throws RecognitionException {
		CatchProductionContext _localctx = new CatchProductionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_catchProduction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(Catch);
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenParen) {
				{
				setState(421);
				match(OpenParen);
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OpenBracket || _la==OpenBrace || _la==Identifier) {
					{
					setState(422);
					assignable();
					}
				}

				setState(425);
				match(CloseParen);
				}
			}

			setState(428);
			block();
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
	public static class FinallyProductionContext extends ParserRuleContext {
		public TerminalNode Finally() { return getToken(JSParser.Finally, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyProduction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterFinallyProduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitFinallyProduction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitFinallyProduction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyProductionContext finallyProduction() throws RecognitionException {
		FinallyProductionContext _localctx = new FinallyProductionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_finallyProduction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(Finally);
			setState(431);
			block();
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
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(JSParser.Function, 0); }
		public TerminalNode Identifier() { return getToken(JSParser.Identifier, 0); }
		public TerminalNode OpenParen() { return getToken(JSParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(JSParser.CloseParen, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(Function);
			setState(434);
			match(Identifier);
			setState(435);
			match(OpenParen);
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32904L) != 0) || _la==Identifier) {
				{
				setState(436);
				formalParameterList();
				}
			}

			setState(439);
			match(CloseParen);
			setState(440);
			functionBody();
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
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(JSParser.Class, 0); }
		public TerminalNode Identifier() { return getToken(JSParser.Identifier, 0); }
		public ClassTailContext classTail() {
			return getRuleContext(ClassTailContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_classDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(Class);
			setState(443);
			match(Identifier);
			setState(444);
			classTail();
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
	public static class ClassTailContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(JSParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(JSParser.CloseBrace, 0); }
		public TerminalNode Extends() { return getToken(JSParser.Extends, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public List<ClassElementContext> classElement() {
			return getRuleContexts(ClassElementContext.class);
		}
		public ClassElementContext classElement(int i) {
			return getRuleContext(ClassElementContext.class,i);
		}
		public ClassTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterClassTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitClassTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitClassTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTailContext classTail() throws RecognitionException {
		ClassTailContext _localctx = new ClassTailContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_classTail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(446);
				match(Extends);
				setState(447);
				singleExpression(0);
				}
			}

			setState(450);
			match(OpenBrace);
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140737488355848L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 7L) != 0)) {
				{
				{
				setState(451);
				classElement();
				}
				}
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(457);
			match(CloseBrace);
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
	public static class ClassElementContext extends ParserRuleContext {
		public ClassElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classElement; }
	 
		public ClassElementContext() { }
		public void copyFrom(ClassElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassFieldDefinitionContext extends ClassElementContext {
		public FieldDefinitionContext fieldDefinition() {
			return getRuleContext(FieldDefinitionContext.class,0);
		}
		public TerminalNode Static() { return getToken(JSParser.Static, 0); }
		public TerminalNode Identifier() { return getToken(JSParser.Identifier, 0); }
		public ClassFieldDefinitionContext(ClassElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterClassFieldDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitClassFieldDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitClassFieldDefinition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassMethodDefinitionContext extends ClassElementContext {
		public MethodDefinitionContext methodDefinition() {
			return getRuleContext(MethodDefinitionContext.class,0);
		}
		public TerminalNode Static() { return getToken(JSParser.Static, 0); }
		public TerminalNode Identifier() { return getToken(JSParser.Identifier, 0); }
		public ClassMethodDefinitionContext(ClassElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterClassMethodDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitClassMethodDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitClassMethodDefinition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassEmptyStatementContext extends ClassElementContext {
		public TerminalNode SemiColon() { return getToken(JSParser.SemiColon, 0); }
		public ClassEmptyStatementContext(ClassElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterClassEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitClassEmptyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitClassEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassElementContext classElement() throws RecognitionException {
		ClassElementContext _localctx = new ClassElementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_classElement);
		int _la;
		try {
			setState(468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				_localctx = new ClassMethodDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(459);
					_la = _input.LA(1);
					if ( !(_la==Static || _la==Identifier) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(462);
				methodDefinition();
				}
				break;
			case 2:
				_localctx = new ClassFieldDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(463);
					_la = _input.LA(1);
					if ( !(_la==Static || _la==Identifier) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(466);
				fieldDefinition();
				}
				break;
			case 3:
				_localctx = new ClassEmptyStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(467);
				match(SemiColon);
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
	public static class MethodDefinitionContext extends ParserRuleContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(JSParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(JSParser.CloseParen, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public MethodDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterMethodDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitMethodDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitMethodDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDefinitionContext methodDefinition() throws RecognitionException {
		MethodDefinitionContext _localctx = new MethodDefinitionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_methodDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			propertyName();
			setState(471);
			match(OpenParen);
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32904L) != 0) || _la==Identifier) {
				{
				setState(472);
				formalParameterList();
				}
			}

			setState(475);
			match(CloseParen);
			setState(476);
			functionBody();
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
	public static class FieldDefinitionContext extends ParserRuleContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public FieldDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterFieldDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitFieldDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitFieldDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDefinitionContext fieldDefinition() throws RecognitionException {
		FieldDefinitionContext _localctx = new FieldDefinitionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_fieldDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			propertyName();
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(479);
				initializer();
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
	public static class FormalParameterListContext extends ParserRuleContext {
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
	 
		public FormalParameterListContext() { }
		public void copyFrom(FormalParameterListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalParametersContext extends FormalParameterListContext {
		public List<FormalParameterArgContext> formalParameterArg() {
			return getRuleContexts(FormalParameterArgContext.class);
		}
		public FormalParameterArgContext formalParameterArg(int i) {
			return getRuleContext(FormalParameterArgContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JSParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JSParser.Comma, i);
		}
		public LastFormalParameterArgContext lastFormalParameterArg() {
			return getRuleContext(LastFormalParameterArgContext.class,0);
		}
		public NormalParametersContext(FormalParameterListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterNormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitNormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitNormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RestParametersContext extends FormalParameterListContext {
		public LastFormalParameterArgContext lastFormalParameterArg() {
			return getRuleContext(LastFormalParameterArgContext.class,0);
		}
		public RestParametersContext(FormalParameterListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterRestParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitRestParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitRestParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(495);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBracket:
			case OpenBrace:
			case Identifier:
				_localctx = new NormalParametersContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				formalParameterArg();
				setState(487);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(483);
						match(Comma);
						setState(484);
						formalParameterArg();
						}
						} 
					}
					setState(489);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				}
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(490);
					match(Comma);
					setState(491);
					lastFormalParameterArg();
					}
				}

				}
				break;
			case Ellipsis:
				_localctx = new RestParametersContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
				lastFormalParameterArg();
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
	public static class FormalParameterArgContext extends ParserRuleContext {
		public AssignableContext assignable() {
			return getRuleContext(AssignableContext.class,0);
		}
		public TerminalNode Assign() { return getToken(JSParser.Assign, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public FormalParameterArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterFormalParameterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitFormalParameterArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitFormalParameterArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterArgContext formalParameterArg() throws RecognitionException {
		FormalParameterArgContext _localctx = new FormalParameterArgContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_formalParameterArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			assignable();
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(498);
				match(Assign);
				setState(499);
				singleExpression(0);
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
	public static class LastFormalParameterArgContext extends ParserRuleContext {
		public TerminalNode Ellipsis() { return getToken(JSParser.Ellipsis, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public LastFormalParameterArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameterArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterLastFormalParameterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitLastFormalParameterArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitLastFormalParameterArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParameterArgContext lastFormalParameterArg() throws RecognitionException {
		LastFormalParameterArgContext _localctx = new LastFormalParameterArgContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_lastFormalParameterArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(Ellipsis);
			setState(503);
			singleExpression(0);
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
	public static class FunctionBodyContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(JSParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(JSParser.CloseBrace, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(OpenBrace);
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -114876974865972568L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 490791L) != 0)) {
				{
				setState(506);
				statements();
				}
			}

			setState(509);
			match(CloseBrace);
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
	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(511);
				statement();
				}
				}
				setState(514); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -114876974865972568L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 490791L) != 0) );
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
	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(JSParser.OpenBracket, 0); }
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(JSParser.CloseBracket, 0); }
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_arrayLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(516);
			match(OpenBracket);
			setState(517);
			elementList();
			setState(518);
			match(CloseBracket);
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
	public static class ElementListContext extends ParserRuleContext {
		public List<TerminalNode> Comma() { return getTokens(JSParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JSParser.Comma, i);
		}
		public List<ArrayElementContext> arrayElement() {
			return getRuleContexts(ArrayElementContext.class);
		}
		public ArrayElementContext arrayElement(int i) {
			return getRuleContext(ArrayElementContext.class,i);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitElementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitElementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_elementList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(520);
					match(Comma);
					}
					} 
				}
				setState(525);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4601306628657086296L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 117057L) != 0)) {
				{
				setState(526);
				arrayElement();
				}
			}

			setState(537);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(530); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(529);
						match(Comma);
						}
						}
						setState(532); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Comma );
					setState(534);
					arrayElement();
					}
					} 
				}
				setState(539);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(540);
				match(Comma);
				}
				}
				setState(545);
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
	public static class ArrayElementContext extends ParserRuleContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(JSParser.Ellipsis, 0); }
		public ArrayElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterArrayElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitArrayElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitArrayElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayElementContext arrayElement() throws RecognitionException {
		ArrayElementContext _localctx = new ArrayElementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_arrayElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(546);
				match(Ellipsis);
				}
			}

			setState(549);
			singleExpression(0);
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
	public static class PropertyAssignmentContext extends ParserRuleContext {
		public PropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAssignment; }
	 
		public PropertyAssignmentContext() { }
		public void copyFrom(PropertyAssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyExpressionAssignmentContext extends PropertyAssignmentContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public TerminalNode Colon() { return getToken(JSParser.Colon, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PropertyExpressionAssignmentContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterPropertyExpressionAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitPropertyExpressionAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitPropertyExpressionAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComputedPropertyExpressionAssignmentContext extends PropertyAssignmentContext {
		public TerminalNode OpenBracket() { return getToken(JSParser.OpenBracket, 0); }
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode CloseBracket() { return getToken(JSParser.CloseBracket, 0); }
		public TerminalNode Colon() { return getToken(JSParser.Colon, 0); }
		public ComputedPropertyExpressionAssignmentContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterComputedPropertyExpressionAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitComputedPropertyExpressionAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitComputedPropertyExpressionAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyShorthandContext extends PropertyAssignmentContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(JSParser.Ellipsis, 0); }
		public PropertyShorthandContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterPropertyShorthand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitPropertyShorthand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitPropertyShorthand(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionPropertyContext extends PropertyAssignmentContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(JSParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(JSParser.CloseParen, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionPropertyContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterFunctionProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitFunctionProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitFunctionProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyAssignmentContext propertyAssignment() throws RecognitionException {
		PropertyAssignmentContext _localctx = new PropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_propertyAssignment);
		int _la;
		try {
			setState(573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				_localctx = new PropertyExpressionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(551);
				propertyName();
				setState(552);
				match(Colon);
				setState(553);
				singleExpression(0);
				}
				break;
			case 2:
				_localctx = new ComputedPropertyExpressionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(555);
				match(OpenBracket);
				setState(556);
				singleExpression(0);
				setState(557);
				match(CloseBracket);
				setState(558);
				match(Colon);
				setState(559);
				singleExpression(0);
				}
				break;
			case 3:
				_localctx = new FunctionPropertyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(561);
				propertyName();
				setState(562);
				match(OpenParen);
				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32904L) != 0) || _la==Identifier) {
					{
					setState(563);
					formalParameterList();
					}
				}

				setState(566);
				match(CloseParen);
				setState(567);
				functionBody();
				}
				break;
			case 4:
				_localctx = new PropertyShorthandContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(569);
					match(Ellipsis);
					}
				}

				setState(572);
				singleExpression(0);
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
	public static class PropertyNameContext extends ParserRuleContext {
		public PropertyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyName; }
	 
		public PropertyNameContext() { }
		public void copyFrom(PropertyNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyByStringContext extends PropertyNameContext {
		public TerminalNode StringLiteral() { return getToken(JSParser.StringLiteral, 0); }
		public PropertyByStringContext(PropertyNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterPropertyByString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitPropertyByString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitPropertyByString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyByExpressionContext extends PropertyNameContext {
		public TerminalNode OpenBracket() { return getToken(JSParser.OpenBracket, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(JSParser.CloseBracket, 0); }
		public PropertyByExpressionContext(PropertyNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterPropertyByExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitPropertyByExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitPropertyByExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyByNumberContext extends PropertyNameContext {
		public TerminalNode DecimalLiteral() { return getToken(JSParser.DecimalLiteral, 0); }
		public PropertyByNumberContext(PropertyNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterPropertyByNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitPropertyByNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitPropertyByNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyByNameContext extends PropertyNameContext {
		public TerminalNode Identifier() { return getToken(JSParser.Identifier, 0); }
		public PropertyByNameContext(PropertyNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterPropertyByName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitPropertyByName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitPropertyByName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyNameContext propertyName() throws RecognitionException {
		PropertyNameContext _localctx = new PropertyNameContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_propertyName);
		try {
			setState(582);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				_localctx = new PropertyByNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(575);
				match(Identifier);
				}
				break;
			case StringLiteral:
				_localctx = new PropertyByStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(576);
				match(StringLiteral);
				}
				break;
			case DecimalLiteral:
				_localctx = new PropertyByNumberContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(577);
				match(DecimalLiteral);
				}
				break;
			case OpenBracket:
				_localctx = new PropertyByExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(578);
				match(OpenBracket);
				setState(579);
				singleExpression(0);
				setState(580);
				match(CloseBracket);
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
	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(JSParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(JSParser.CloseParen, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JSParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JSParser.Comma, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_arguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(OpenParen);
			setState(596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4601306628657086296L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 117057L) != 0)) {
				{
				setState(585);
				argument();
				setState(590);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(586);
						match(Comma);
						setState(587);
						argument();
						}
						} 
					}
					setState(592);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				}
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(593);
					match(Comma);
					}
				}

				}
			}

			setState(598);
			match(CloseParen);
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
	public static class ArgumentContext extends ParserRuleContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JSParser.Identifier, 0); }
		public TerminalNode Ellipsis() { return getToken(JSParser.Ellipsis, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(600);
				match(Ellipsis);
				}
			}

			setState(605);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(603);
				singleExpression(0);
				}
				break;
			case 2:
				{
				setState(604);
				match(Identifier);
				}
				break;
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
	public static class ExpressionSequenceContext extends ParserRuleContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JSParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JSParser.Comma, i);
		}
		public ExpressionSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterExpressionSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitExpressionSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitExpressionSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionSequenceContext expressionSequence() throws RecognitionException {
		ExpressionSequenceContext _localctx = new ExpressionSequenceContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_expressionSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			singleExpression(0);
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(608);
				match(Comma);
				setState(609);
				singleExpression(0);
				}
				}
				setState(614);
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
	public static class SingleExpressionContext extends ParserRuleContext {
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
	 
		public SingleExpressionContext() { }
		public void copyFrom(SingleExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateStringExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TemplateStringLiteralContext templateStringLiteral() {
			return getRuleContext(TemplateStringLiteralContext.class,0);
		}
		public TemplateStringExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterTemplateStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitTemplateStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitTemplateStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TernaryExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode QuestionMark() { return getToken(JSParser.QuestionMark, 0); }
		public TerminalNode Colon() { return getToken(JSParser.Colon, 0); }
		public TernaryExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitTernaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitTernaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalAndExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode And() { return getToken(JSParser.And, 0); }
		public LogicalAndExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowerExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Power() { return getToken(JSParser.Power, 0); }
		public PowerExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterPowerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitPowerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitPowerExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PreIncrementExpressionContext extends SingleExpressionContext {
		public TerminalNode PlusPlus() { return getToken(JSParser.PlusPlus, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PreIncrementExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterPreIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitPreIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitPreIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLiteralExpressionContext extends SingleExpressionContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ObjectLiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterObjectLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitObjectLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitObjectLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MetaExpressionContext extends SingleExpressionContext {
		public TerminalNode New() { return getToken(JSParser.New, 0); }
		public TerminalNode Dot() { return getToken(JSParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(JSParser.Identifier, 0); }
		public MetaExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterMetaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitMetaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitMetaExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode In() { return getToken(JSParser.In, 0); }
		public InExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterInExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitInExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitInExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOrExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Or() { return getToken(JSParser.Or, 0); }
		public LogicalOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionalChainExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode QuestionMarkDot() { return getToken(JSParser.QuestionMarkDot, 0); }
		public OptionalChainExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterOptionalChainExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitOptionalChainExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitOptionalChainExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExpressionContext extends SingleExpressionContext {
		public TerminalNode Not() { return getToken(JSParser.Not, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public NotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PreDecreaseExpressionContext extends SingleExpressionContext {
		public TerminalNode MinusMinus() { return getToken(JSParser.MinusMinus, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PreDecreaseExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterPreDecreaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitPreDecreaseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitPreDecreaseExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ArgumentsExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterArgumentsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitArgumentsExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitArgumentsExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThisExpressionContext extends SingleExpressionContext {
		public TerminalNode This() { return getToken(JSParser.This, 0); }
		public ThisExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterThisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitThisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitThisExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionExpressionContext extends SingleExpressionContext {
		public AnonymousFunctionContext anonymousFunction() {
			return getRuleContext(AnonymousFunctionContext.class,0);
		}
		public FunctionExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitFunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitFunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryMinusExpressionContext extends SingleExpressionContext {
		public TerminalNode Minus() { return getToken(JSParser.Minus, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public UnaryMinusExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterUnaryMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitUnaryMinusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitUnaryMinusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Assign() { return getToken(JSParser.Assign, 0); }
		public AssignmentExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostDecreaseExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode MinusMinus() { return getToken(JSParser.MinusMinus, 0); }
		public PostDecreaseExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterPostDecreaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitPostDecreaseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitPostDecreaseExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeofExpressionContext extends SingleExpressionContext {
		public TerminalNode Typeof() { return getToken(JSParser.Typeof, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TypeofExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterTypeofExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitTypeofExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitTypeofExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryPlusExpressionContext extends SingleExpressionContext {
		public TerminalNode Plus() { return getToken(JSParser.Plus, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public UnaryPlusExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterUnaryPlusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitUnaryPlusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitUnaryPlusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeleteExpressionContext extends SingleExpressionContext {
		public TerminalNode Delete() { return getToken(JSParser.Delete, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public DeleteExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterDeleteExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitDeleteExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitDeleteExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportExpressionContext extends SingleExpressionContext {
		public TerminalNode Import() { return getToken(JSParser.Import, 0); }
		public TerminalNode OpenParen() { return getToken(JSParser.OpenParen, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(JSParser.CloseParen, 0); }
		public ImportExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterImportExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitImportExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitImportExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Equals() { return getToken(JSParser.Equals, 0); }
		public TerminalNode NotEquals() { return getToken(JSParser.NotEquals, 0); }
		public TerminalNode IdentityEquals() { return getToken(JSParser.IdentityEquals, 0); }
		public TerminalNode IdentityNotEquals() { return getToken(JSParser.IdentityNotEquals, 0); }
		public EqualityExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SuperExpressionContext extends SingleExpressionContext {
		public TerminalNode Super() { return getToken(JSParser.Super, 0); }
		public SuperExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterSuperExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitSuperExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitSuperExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Multiply() { return getToken(JSParser.Multiply, 0); }
		public TerminalNode Divide() { return getToken(JSParser.Divide, 0); }
		public TerminalNode Modulus() { return getToken(JSParser.Modulus, 0); }
		public MultiplicativeExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedExpressionContext extends SingleExpressionContext {
		public TerminalNode OpenParen() { return getToken(JSParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(JSParser.CloseParen, 0); }
		public ParenthesizedExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Plus() { return getToken(JSParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(JSParser.Minus, 0); }
		public AdditiveExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode LessThan() { return getToken(JSParser.LessThan, 0); }
		public TerminalNode MoreThan() { return getToken(JSParser.MoreThan, 0); }
		public TerminalNode LessThanEquals() { return getToken(JSParser.LessThanEquals, 0); }
		public TerminalNode GreaterThanEquals() { return getToken(JSParser.GreaterThanEquals, 0); }
		public RelationalExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostIncrementExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(JSParser.PlusPlus, 0); }
		public PostIncrementExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterPostIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitPostIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitPostIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewExpressionContext extends SingleExpressionContext {
		public TerminalNode New() { return getToken(JSParser.New, 0); }
		public TerminalNode Identifier() { return getToken(JSParser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public NewExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitNewExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitNewExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExpressionContext extends SingleExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLiteralExpressionContext extends SingleExpressionContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ArrayLiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterArrayLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitArrayLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitArrayLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberDotExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode Dot() { return getToken(JSParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(JSParser.Identifier, 0); }
		public TerminalNode QuestionMark() { return getToken(JSParser.QuestionMark, 0); }
		public MemberDotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterMemberDotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitMemberDotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitMemberDotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassExpressionContext extends SingleExpressionContext {
		public TerminalNode Class() { return getToken(JSParser.Class, 0); }
		public ClassTailContext classTail() {
			return getRuleContext(ClassTailContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JSParser.Identifier, 0); }
		public ClassExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterClassExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitClassExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitClassExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberIndexExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode OpenBracket() { return getToken(JSParser.OpenBracket, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(JSParser.CloseBracket, 0); }
		public TerminalNode QuestionMarkDot() { return getToken(JSParser.QuestionMarkDot, 0); }
		public MemberIndexExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterMemberIndexExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitMemberIndexExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitMemberIndexExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierExpressionContext extends SingleExpressionContext {
		public TerminalNode Identifier() { return getToken(JSParser.Identifier, 0); }
		public IdentifierExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentOperatorExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentOperatorExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterAssignmentOperatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitAssignmentOperatorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitAssignmentOperatorExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CoalesceExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode NullCoalesce() { return getToken(JSParser.NullCoalesce, 0); }
		public CoalesceExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterCoalesceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitCoalesceExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitCoalesceExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		return singleExpression(0);
	}

	private SingleExpressionContext singleExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, _parentState);
		SingleExpressionContext _prevctx = _localctx;
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_singleExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				_localctx = new FunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(616);
				anonymousFunction();
				}
				break;
			case 2:
				{
				_localctx = new ClassExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(617);
				match(Class);
				setState(619);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(618);
					match(Identifier);
					}
				}

				setState(621);
				classTail();
				}
				break;
			case 3:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(622);
				match(New);
				setState(623);
				match(Identifier);
				setState(624);
				arguments();
				}
				break;
			case 4:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(625);
				match(New);
				setState(626);
				singleExpression(0);
				setState(627);
				arguments();
				}
				break;
			case 5:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(629);
				match(New);
				setState(630);
				singleExpression(33);
				}
				break;
			case 6:
				{
				_localctx = new MetaExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(631);
				match(New);
				setState(632);
				match(Dot);
				setState(633);
				match(Identifier);
				}
				break;
			case 7:
				{
				_localctx = new DeleteExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(634);
				match(Delete);
				setState(635);
				singleExpression(28);
				}
				break;
			case 8:
				{
				_localctx = new TypeofExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(636);
				match(Typeof);
				setState(637);
				singleExpression(27);
				}
				break;
			case 9:
				{
				_localctx = new PreIncrementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(638);
				match(PlusPlus);
				setState(639);
				singleExpression(26);
				}
				break;
			case 10:
				{
				_localctx = new PreDecreaseExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(640);
				match(MinusMinus);
				setState(641);
				singleExpression(25);
				}
				break;
			case 11:
				{
				_localctx = new UnaryPlusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(642);
				match(Plus);
				setState(643);
				singleExpression(24);
				}
				break;
			case 12:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(644);
				match(Minus);
				setState(645);
				singleExpression(23);
				}
				break;
			case 13:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(646);
				match(Not);
				setState(647);
				singleExpression(22);
				}
				break;
			case 14:
				{
				_localctx = new ImportExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(648);
				match(Import);
				setState(649);
				match(OpenParen);
				setState(650);
				singleExpression(0);
				setState(651);
				match(CloseParen);
				}
				break;
			case 15:
				{
				_localctx = new ThisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(653);
				match(This);
				}
				break;
			case 16:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(654);
				match(Identifier);
				}
				break;
			case 17:
				{
				_localctx = new SuperExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(655);
				match(Super);
				}
				break;
			case 18:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(656);
				literal();
				}
				break;
			case 19:
				{
				_localctx = new ArrayLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(657);
				arrayLiteral();
				}
				break;
			case 20:
				{
				_localctx = new ObjectLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(658);
				objectLiteral();
				}
				break;
			case 21:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(659);
				match(OpenParen);
				setState(660);
				expressionSequence();
				setState(661);
				match(CloseParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(732);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(730);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
					case 1:
						{
						_localctx = new OptionalChainExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(665);
						if (!(precpred(_ctx, 38))) throw new FailedPredicateException(this, "precpred(_ctx, 38)");
						setState(666);
						match(QuestionMarkDot);
						setState(667);
						singleExpression(39);
						}
						break;
					case 2:
						{
						_localctx = new PowerExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(668);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(669);
						match(Power);
						setState(670);
						singleExpression(21);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(671);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(672);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(673);
						singleExpression(21);
						}
						break;
					case 4:
						{
						_localctx = new AdditiveExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(674);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(675);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(676);
						singleExpression(20);
						}
						break;
					case 5:
						{
						_localctx = new CoalesceExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(677);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(678);
						match(NullCoalesce);
						setState(679);
						singleExpression(19);
						}
						break;
					case 6:
						{
						_localctx = new RelationalExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(680);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(681);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2013265920L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(682);
						singleExpression(18);
						}
						break;
					case 7:
						{
						_localctx = new InExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(683);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(684);
						match(In);
						setState(685);
						singleExpression(17);
						}
						break;
					case 8:
						{
						_localctx = new EqualityExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(686);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(687);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32212254720L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(688);
						singleExpression(16);
						}
						break;
					case 9:
						{
						_localctx = new LogicalAndExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(689);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(690);
						match(And);
						setState(691);
						singleExpression(15);
						}
						break;
					case 10:
						{
						_localctx = new LogicalOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(692);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(693);
						match(Or);
						setState(694);
						singleExpression(14);
						}
						break;
					case 11:
						{
						_localctx = new TernaryExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(695);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(696);
						match(QuestionMark);
						setState(697);
						singleExpression(0);
						setState(698);
						match(Colon);
						setState(699);
						singleExpression(13);
						}
						break;
					case 12:
						{
						_localctx = new AssignmentExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(701);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(702);
						match(Assign);
						setState(703);
						singleExpression(11);
						}
						break;
					case 13:
						{
						_localctx = new AssignmentOperatorExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(704);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(705);
						assignmentOperator();
						setState(706);
						singleExpression(10);
						}
						break;
					case 14:
						{
						_localctx = new MemberIndexExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(708);
						if (!(precpred(_ctx, 37))) throw new FailedPredicateException(this, "precpred(_ctx, 37)");
						setState(710);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==QuestionMarkDot) {
							{
							setState(709);
							match(QuestionMarkDot);
							}
						}

						setState(712);
						match(OpenBracket);
						setState(713);
						expressionSequence();
						setState(714);
						match(CloseBracket);
						}
						break;
					case 15:
						{
						_localctx = new MemberDotExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(716);
						if (!(precpred(_ctx, 36))) throw new FailedPredicateException(this, "precpred(_ctx, 36)");
						setState(718);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==QuestionMark) {
							{
							setState(717);
							match(QuestionMark);
							}
						}

						setState(720);
						match(Dot);
						setState(721);
						match(Identifier);
						}
						break;
					case 16:
						{
						_localctx = new ArgumentsExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(722);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(723);
						arguments();
						}
						break;
					case 17:
						{
						_localctx = new PostIncrementExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(724);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(725);
						match(PlusPlus);
						}
						break;
					case 18:
						{
						_localctx = new PostDecreaseExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(726);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(727);
						match(MinusMinus);
						}
						break;
					case 19:
						{
						_localctx = new TemplateStringExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(728);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(729);
						templateStringLiteral();
						}
						break;
					}
					} 
				}
				setState(734);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitializerContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(JSParser.Assign, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			match(Assign);
			setState(736);
			singleExpression(0);
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
	public static class AssignableContext extends ParserRuleContext {
		public AssignableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignable; }
	 
		public AssignableContext() { }
		public void copyFrom(AssignableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableByObjectContext extends AssignableContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public VariableByObjectContext(AssignableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterVariableByObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitVariableByObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitVariableByObject(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableByNameContext extends AssignableContext {
		public TerminalNode Identifier() { return getToken(JSParser.Identifier, 0); }
		public VariableByNameContext(AssignableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterVariableByName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitVariableByName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitVariableByName(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableByArrayContext extends AssignableContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public VariableByArrayContext(AssignableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterVariableByArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitVariableByArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitVariableByArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignableContext assignable() throws RecognitionException {
		AssignableContext _localctx = new AssignableContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_assignable);
		try {
			setState(741);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				_localctx = new VariableByNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(738);
				match(Identifier);
				}
				break;
			case OpenBracket:
				_localctx = new VariableByArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(739);
				arrayLiteral();
				}
				break;
			case OpenBrace:
				_localctx = new VariableByObjectContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(740);
				objectLiteral();
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
	public static class ObjectLiteralContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(JSParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(JSParser.CloseBrace, 0); }
		public List<PropertyAssignmentContext> propertyAssignment() {
			return getRuleContexts(PropertyAssignmentContext.class);
		}
		public PropertyAssignmentContext propertyAssignment(int i) {
			return getRuleContext(PropertyAssignmentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JSParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JSParser.Comma, i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitObjectLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitObjectLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_objectLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			match(OpenBrace);
			setState(755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4601306628657086296L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 117057L) != 0)) {
				{
				setState(744);
				propertyAssignment();
				setState(749);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(745);
						match(Comma);
						setState(746);
						propertyAssignment();
						}
						} 
					}
					setState(751);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				}
				setState(753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(752);
					match(Comma);
					}
				}

				}
			}

			setState(757);
			match(CloseBrace);
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
	public static class AnonymousFunctionContext extends ParserRuleContext {
		public AnonymousFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousFunction; }
	 
		public AnonymousFunctionContext() { }
		public void copyFrom(AnonymousFunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnonymousFunctionDeclContext extends AnonymousFunctionContext {
		public TerminalNode Function() { return getToken(JSParser.Function, 0); }
		public TerminalNode OpenParen() { return getToken(JSParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(JSParser.CloseParen, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public AnonymousFunctionDeclContext(AnonymousFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterAnonymousFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitAnonymousFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitAnonymousFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrowFunctionContext extends AnonymousFunctionContext {
		public ArrowFunctionParametersContext arrowFunctionParameters() {
			return getRuleContext(ArrowFunctionParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(JSParser.ARROW, 0); }
		public ArrowFunctionBodyContext arrowFunctionBody() {
			return getRuleContext(ArrowFunctionBodyContext.class,0);
		}
		public ArrowFunctionContext(AnonymousFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterArrowFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitArrowFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitArrowFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnonymousFunctionContext anonymousFunction() throws RecognitionException {
		AnonymousFunctionContext _localctx = new AnonymousFunctionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_anonymousFunction);
		int _la;
		try {
			setState(770);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function:
				_localctx = new AnonymousFunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(759);
				match(Function);
				setState(760);
				match(OpenParen);
				setState(762);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32904L) != 0) || _la==Identifier) {
					{
					setState(761);
					formalParameterList();
					}
				}

				setState(764);
				match(CloseParen);
				setState(765);
				functionBody();
				}
				break;
			case OpenParen:
			case Identifier:
				_localctx = new ArrowFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(766);
				arrowFunctionParameters();
				setState(767);
				match(ARROW);
				setState(768);
				arrowFunctionBody();
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
	public static class ArrowFunctionParametersContext extends ParserRuleContext {
		public ArrowFunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunctionParameters; }
	 
		public ArrowFunctionParametersContext() { }
		public void copyFrom(ArrowFunctionParametersContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OneParameterContext extends ArrowFunctionParametersContext {
		public TerminalNode Identifier() { return getToken(JSParser.Identifier, 0); }
		public OneParameterContext(ArrowFunctionParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterOneParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitOneParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitOneParameter(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ManyParametersContext extends ArrowFunctionParametersContext {
		public TerminalNode OpenParen() { return getToken(JSParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(JSParser.CloseParen, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ManyParametersContext(ArrowFunctionParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterManyParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitManyParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitManyParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowFunctionParametersContext arrowFunctionParameters() throws RecognitionException {
		ArrowFunctionParametersContext _localctx = new ArrowFunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_arrowFunctionParameters);
		int _la;
		try {
			setState(778);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				_localctx = new OneParameterContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(772);
				match(Identifier);
				}
				break;
			case OpenParen:
				_localctx = new ManyParametersContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(773);
				match(OpenParen);
				setState(775);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32904L) != 0) || _la==Identifier) {
					{
					setState(774);
					formalParameterList();
					}
				}

				setState(777);
				match(CloseParen);
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
	public static class ArrowFunctionBodyContext extends ParserRuleContext {
		public ArrowFunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunctionBody; }
	 
		public ArrowFunctionBodyContext() { }
		public void copyFrom(ArrowFunctionBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ManyExpressionsContext extends ArrowFunctionBodyContext {
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public ManyExpressionsContext(ArrowFunctionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterManyExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitManyExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitManyExpressions(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OneExpressionContext extends ArrowFunctionBodyContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public OneExpressionContext(ArrowFunctionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterOneExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitOneExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitOneExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowFunctionBodyContext arrowFunctionBody() throws RecognitionException {
		ArrowFunctionBodyContext _localctx = new ArrowFunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_arrowFunctionBody);
		try {
			setState(782);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				_localctx = new OneExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(780);
				singleExpression(0);
				}
				break;
			case 2:
				_localctx = new ManyExpressionsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(781);
				functionBody();
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
	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
	 
		public AssignmentOperatorContext() { }
		public void copyFrom(AssignmentOperatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplyOperatorContext extends AssignmentOperatorContext {
		public TerminalNode MultiplyAssign() { return getToken(JSParser.MultiplyAssign, 0); }
		public MultiplyOperatorContext(AssignmentOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterMultiplyOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitMultiplyOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitMultiplyOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivideOperatorContext extends AssignmentOperatorContext {
		public TerminalNode DivideAssign() { return getToken(JSParser.DivideAssign, 0); }
		public DivideOperatorContext(AssignmentOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterDivideOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitDivideOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitDivideOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowerOperatorContext extends AssignmentOperatorContext {
		public TerminalNode PowerAssign() { return getToken(JSParser.PowerAssign, 0); }
		public PowerOperatorContext(AssignmentOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterPowerOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitPowerOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitPowerOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullishOperatorContext extends AssignmentOperatorContext {
		public TerminalNode NullishCoalescingAssign() { return getToken(JSParser.NullishCoalescingAssign, 0); }
		public NullishOperatorContext(AssignmentOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterNullishOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitNullishOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitNullishOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinusOperatorContext extends AssignmentOperatorContext {
		public TerminalNode MinusAssign() { return getToken(JSParser.MinusAssign, 0); }
		public MinusOperatorContext(AssignmentOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterMinusOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitMinusOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitMinusOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModulusOperatorContext extends AssignmentOperatorContext {
		public TerminalNode ModulusAssign() { return getToken(JSParser.ModulusAssign, 0); }
		public ModulusOperatorContext(AssignmentOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterModulusOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitModulusOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitModulusOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusOperatorContext extends AssignmentOperatorContext {
		public TerminalNode PlusAssign() { return getToken(JSParser.PlusAssign, 0); }
		public PlusOperatorContext(AssignmentOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterPlusOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitPlusOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitPlusOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_assignmentOperator);
		try {
			setState(791);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MultiplyAssign:
				_localctx = new MultiplyOperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(784);
				match(MultiplyAssign);
				}
				break;
			case DivideAssign:
				_localctx = new DivideOperatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(785);
				match(DivideAssign);
				}
				break;
			case ModulusAssign:
				_localctx = new ModulusOperatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(786);
				match(ModulusAssign);
				}
				break;
			case PlusAssign:
				_localctx = new PlusOperatorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(787);
				match(PlusAssign);
				}
				break;
			case MinusAssign:
				_localctx = new MinusOperatorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(788);
				match(MinusAssign);
				}
				break;
			case PowerAssign:
				_localctx = new PowerOperatorContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(789);
				match(PowerAssign);
				}
				break;
			case NullishCoalescingAssign:
				_localctx = new NullishOperatorContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(790);
				match(NullishCoalescingAssign);
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
	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateStringContext extends LiteralContext {
		public TemplateStringLiteralContext templateStringLiteral() {
			return getRuleContext(TemplateStringLiteralContext.class,0);
		}
		public TemplateStringContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterTemplateString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitTemplateString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitTemplateString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullContext extends LiteralContext {
		public TerminalNode NullLiteral() { return getToken(JSParser.NullLiteral, 0); }
		public NullContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitNull(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends LiteralContext {
		public TerminalNode DecimalLiteral() { return getToken(JSParser.DecimalLiteral, 0); }
		public NumberContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends LiteralContext {
		public TerminalNode StringLiteral() { return getToken(JSParser.StringLiteral, 0); }
		public StringContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanContext extends LiteralContext {
		public TerminalNode BooleanLiteral() { return getToken(JSParser.BooleanLiteral, 0); }
		public BooleanContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_literal);
		try {
			setState(798);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NullLiteral:
				_localctx = new NullContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(793);
				match(NullLiteral);
				}
				break;
			case BooleanLiteral:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(794);
				match(BooleanLiteral);
				}
				break;
			case StringLiteral:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(795);
				match(StringLiteral);
				}
				break;
			case BackTick:
				_localctx = new TemplateStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(796);
				templateStringLiteral();
				}
				break;
			case DecimalLiteral:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(797);
				match(DecimalLiteral);
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
	public static class TemplateStringLiteralContext extends ParserRuleContext {
		public List<TerminalNode> BackTick() { return getTokens(JSParser.BackTick); }
		public TerminalNode BackTick(int i) {
			return getToken(JSParser.BackTick, i);
		}
		public List<TemplateStringAtomContext> templateStringAtom() {
			return getRuleContexts(TemplateStringAtomContext.class);
		}
		public TemplateStringAtomContext templateStringAtom(int i) {
			return getRuleContext(TemplateStringAtomContext.class,i);
		}
		public TemplateStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateStringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterTemplateStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitTemplateStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitTemplateStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateStringLiteralContext templateStringLiteral() throws RecognitionException {
		TemplateStringLiteralContext _localctx = new TemplateStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_templateStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			match(BackTick);
			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TemplateStringStartExpression || _la==TemplateStringAtom) {
				{
				{
				setState(801);
				templateStringAtom();
				}
				}
				setState(806);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(807);
			match(BackTick);
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
	public static class TemplateStringAtomContext extends ParserRuleContext {
		public TemplateStringAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateStringAtom; }
	 
		public TemplateStringAtomContext() { }
		public void copyFrom(TemplateStringAtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateStringCharacterContext extends TemplateStringAtomContext {
		public TerminalNode TemplateStringAtom() { return getToken(JSParser.TemplateStringAtom, 0); }
		public TemplateStringCharacterContext(TemplateStringAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterTemplateStringCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitTemplateStringCharacter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitTemplateStringCharacter(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateStringJSExpressionContext extends TemplateStringAtomContext {
		public TerminalNode TemplateStringStartExpression() { return getToken(JSParser.TemplateStringStartExpression, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(JSParser.CloseBrace, 0); }
		public TemplateStringJSExpressionContext(TemplateStringAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterTemplateStringJSExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitTemplateStringJSExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitTemplateStringJSExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateStringAtomContext templateStringAtom() throws RecognitionException {
		TemplateStringAtomContext _localctx = new TemplateStringAtomContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_templateStringAtom);
		try {
			setState(814);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TemplateStringAtom:
				_localctx = new TemplateStringCharacterContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(809);
				match(TemplateStringAtom);
				}
				break;
			case TemplateStringStartExpression:
				_localctx = new TemplateStringJSExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(810);
				match(TemplateStringStartExpression);
				setState(811);
				singleExpression(0);
				setState(812);
				match(CloseBrace);
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
	public static class EosContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(JSParser.SemiColon, 0); }
		public TerminalNode EOF() { return getToken(JSParser.EOF, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitEos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitEos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_eos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==SemiColon) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 55:
			return singleExpression_sempred((SingleExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean singleExpression_sempred(SingleExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 38);
		case 1:
			return precpred(_ctx, 21);
		case 2:
			return precpred(_ctx, 20);
		case 3:
			return precpred(_ctx, 19);
		case 4:
			return precpred(_ctx, 18);
		case 5:
			return precpred(_ctx, 17);
		case 6:
			return precpred(_ctx, 16);
		case 7:
			return precpred(_ctx, 15);
		case 8:
			return precpred(_ctx, 14);
		case 9:
			return precpred(_ctx, 13);
		case 10:
			return precpred(_ctx, 12);
		case 11:
			return precpred(_ctx, 11);
		case 12:
			return precpred(_ctx, 10);
		case 13:
			return precpred(_ctx, 37);
		case 14:
			return precpred(_ctx, 36);
		case 15:
			return precpred(_ctx, 32);
		case 16:
			return precpred(_ctx, 30);
		case 17:
			return precpred(_ctx, 29);
		case 18:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001X\u0333\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0001\u0000\u0003\u0000\u0088\b\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u009c\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002\u00a0\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0004\u0003\u00a5\b\u0003\u000b\u0003\f"+
		"\u0003\u00a6\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0003\u0005"+
		"\u00ad\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00b1\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00b8"+
		"\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00be"+
		"\b\u0006\n\u0006\f\u0006\u00c1\t\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u00c5\b\u0006\u0003\u0006\u00c7\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00ce\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003\t\u00d6\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00de\b\u000b\u0001"+
		"\f\u0001\f\u0003\f\u00e2\b\f\u0001\f\u0001\f\u0003\f\u00e6\b\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00ef\b\f\u0001"+
		"\r\u0001\r\u0003\r\u00f3\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u00fb\b\u000e\n\u000e\f\u000e\u00fe\t\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u0102\b\u000e\u0003\u000e\u0104\b"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u010b\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0110"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0005\u0012\u0119\b\u0012\n\u0012\f\u0012\u011c\t\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0121\b\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u012d\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u0141\b\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0145\b\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u0149\b\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0151\b\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u015c\b\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0163\b\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0168\b\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u0172\b\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u017e\b\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0182"+
		"\b\u001c\u0003\u001c\u0184\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0004\u001d\u0189\b\u001d\u000b\u001d\f\u001d\u018a\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0191\b\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u0196\b\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001!\u0001!\u0001!\u0001!\u0003!\u01a0\b!\u0001!\u0003!\u01a3\b!\u0001"+
		"\"\u0001\"\u0001\"\u0003\"\u01a8\b\"\u0001\"\u0003\"\u01ab\b\"\u0001\""+
		"\u0001\"\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0003$\u01b6"+
		"\b$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0003"+
		"&\u01c1\b&\u0001&\u0001&\u0005&\u01c5\b&\n&\f&\u01c8\t&\u0001&\u0001&"+
		"\u0001\'\u0003\'\u01cd\b\'\u0001\'\u0001\'\u0003\'\u01d1\b\'\u0001\'\u0001"+
		"\'\u0003\'\u01d5\b\'\u0001(\u0001(\u0001(\u0003(\u01da\b(\u0001(\u0001"+
		"(\u0001(\u0001)\u0001)\u0003)\u01e1\b)\u0001*\u0001*\u0001*\u0005*\u01e6"+
		"\b*\n*\f*\u01e9\t*\u0001*\u0001*\u0003*\u01ed\b*\u0001*\u0003*\u01f0\b"+
		"*\u0001+\u0001+\u0001+\u0003+\u01f5\b+\u0001,\u0001,\u0001,\u0001-\u0001"+
		"-\u0003-\u01fc\b-\u0001-\u0001-\u0001.\u0004.\u0201\b.\u000b.\f.\u0202"+
		"\u0001/\u0001/\u0001/\u0001/\u00010\u00050\u020a\b0\n0\f0\u020d\t0\u0001"+
		"0\u00030\u0210\b0\u00010\u00040\u0213\b0\u000b0\f0\u0214\u00010\u0005"+
		"0\u0218\b0\n0\f0\u021b\t0\u00010\u00050\u021e\b0\n0\f0\u0221\t0\u0001"+
		"1\u00031\u0224\b1\u00011\u00011\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00032\u0235\b2\u0001"+
		"2\u00012\u00012\u00012\u00032\u023b\b2\u00012\u00032\u023e\b2\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00033\u0247\b3\u00014\u00014\u0001"+
		"4\u00014\u00054\u024d\b4\n4\f4\u0250\t4\u00014\u00034\u0253\b4\u00034"+
		"\u0255\b4\u00014\u00014\u00015\u00035\u025a\b5\u00015\u00015\u00035\u025e"+
		"\b5\u00016\u00016\u00016\u00056\u0263\b6\n6\f6\u0266\t6\u00017\u00017"+
		"\u00017\u00017\u00037\u026c\b7\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00037\u0298\b7\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00037\u02c7\b7\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00037\u02cf\b7\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00057\u02db\b7\n7\f7\u02de\t7\u00018\u00018\u0001"+
		"8\u00019\u00019\u00019\u00039\u02e6\b9\u0001:\u0001:\u0001:\u0001:\u0005"+
		":\u02ec\b:\n:\f:\u02ef\t:\u0001:\u0003:\u02f2\b:\u0003:\u02f4\b:\u0001"+
		":\u0001:\u0001;\u0001;\u0001;\u0003;\u02fb\b;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0003;\u0303\b;\u0001<\u0001<\u0001<\u0003<\u0308\b<\u0001"+
		"<\u0003<\u030b\b<\u0001=\u0001=\u0003=\u030f\b=\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0003>\u0318\b>\u0001?\u0001?\u0001?\u0001?\u0001"+
		"?\u0003?\u031f\b?\u0001@\u0001@\u0005@\u0323\b@\n@\f@\u0326\t@\u0001@"+
		"\u0001@\u0001A\u0001A\u0001A\u0001A\u0001A\u0003A\u032f\bA\u0001B\u0001"+
		"B\u0001B\u0000\u0001nC\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0000\u0007\u0002\u0000\u0016\u0016"+
		"QQ\u0001\u0000PQ\u0001\u0000\u0016\u0018\u0001\u0000\u0013\u0014\u0001"+
		"\u0000\u001b\u001e\u0001\u0000\u001f\"\u0001\u0001\t\t\u0391\u0000\u0087"+
		"\u0001\u0000\u0000\u0000\u0002\u009b\u0001\u0000\u0000\u0000\u0004\u009d"+
		"\u0001\u0000\u0000\u0000\u0006\u00a4\u0001\u0000\u0000\u0000\b\u00a8\u0001"+
		"\u0000\u0000\u0000\n\u00b7\u0001\u0000\u0000\u0000\f\u00b9\u0001\u0000"+
		"\u0000\u0000\u000e\u00ca\u0001\u0000\u0000\u0000\u0010\u00cf\u0001\u0000"+
		"\u0000\u0000\u0012\u00d2\u0001\u0000\u0000\u0000\u0014\u00d7\u0001\u0000"+
		"\u0000\u0000\u0016\u00da\u0001\u0000\u0000\u0000\u0018\u00ee\u0001\u0000"+
		"\u0000\u0000\u001a\u00f0\u0001\u0000\u0000\u0000\u001c\u00f6\u0001\u0000"+
		"\u0000\u0000\u001e\u0107\u0001\u0000\u0000\u0000 \u010f\u0001\u0000\u0000"+
		"\u0000\"\u0111\u0001\u0000\u0000\u0000$\u0114\u0001\u0000\u0000\u0000"+
		"&\u011d\u0001\u0000\u0000\u0000(\u0122\u0001\u0000\u0000\u0000*\u0125"+
		"\u0001\u0000\u0000\u0000,\u0162\u0001\u0000\u0000\u0000.\u0167\u0001\u0000"+
		"\u0000\u00000\u0169\u0001\u0000\u0000\u00002\u016c\u0001\u0000\u0000\u0000"+
		"4\u016f\u0001\u0000\u0000\u00006\u0175\u0001\u0000\u0000\u00008\u017b"+
		"\u0001\u0000\u0000\u0000:\u0188\u0001\u0000\u0000\u0000<\u018c\u0001\u0000"+
		"\u0000\u0000>\u0192\u0001\u0000\u0000\u0000@\u0197\u0001\u0000\u0000\u0000"+
		"B\u019b\u0001\u0000\u0000\u0000D\u01a4\u0001\u0000\u0000\u0000F\u01ae"+
		"\u0001\u0000\u0000\u0000H\u01b1\u0001\u0000\u0000\u0000J\u01ba\u0001\u0000"+
		"\u0000\u0000L\u01c0\u0001\u0000\u0000\u0000N\u01d4\u0001\u0000\u0000\u0000"+
		"P\u01d6\u0001\u0000\u0000\u0000R\u01de\u0001\u0000\u0000\u0000T\u01ef"+
		"\u0001\u0000\u0000\u0000V\u01f1\u0001\u0000\u0000\u0000X\u01f6\u0001\u0000"+
		"\u0000\u0000Z\u01f9\u0001\u0000\u0000\u0000\\\u0200\u0001\u0000\u0000"+
		"\u0000^\u0204\u0001\u0000\u0000\u0000`\u020b\u0001\u0000\u0000\u0000b"+
		"\u0223\u0001\u0000\u0000\u0000d\u023d\u0001\u0000\u0000\u0000f\u0246\u0001"+
		"\u0000\u0000\u0000h\u0248\u0001\u0000\u0000\u0000j\u0259\u0001\u0000\u0000"+
		"\u0000l\u025f\u0001\u0000\u0000\u0000n\u0297\u0001\u0000\u0000\u0000p"+
		"\u02df\u0001\u0000\u0000\u0000r\u02e5\u0001\u0000\u0000\u0000t\u02e7\u0001"+
		"\u0000\u0000\u0000v\u0302\u0001\u0000\u0000\u0000x\u030a\u0001\u0000\u0000"+
		"\u0000z\u030e\u0001\u0000\u0000\u0000|\u0317\u0001\u0000\u0000\u0000~"+
		"\u031e\u0001\u0000\u0000\u0000\u0080\u0320\u0001\u0000\u0000\u0000\u0082"+
		"\u032e\u0001\u0000\u0000\u0000\u0084\u0330\u0001\u0000\u0000\u0000\u0086"+
		"\u0088\u0003\\.\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0005\u0000\u0000\u0001\u008a\u0001\u0001\u0000\u0000\u0000\u008b\u009c"+
		"\u0003\u0004\u0002\u0000\u008c\u009c\u0003\"\u0011\u0000\u008d\u009c\u0003"+
		"\b\u0004\u0000\u008e\u009c\u0003\u0018\f\u0000\u008f\u009c\u0005\t\u0000"+
		"\u0000\u0090\u009c\u0003J%\u0000\u0091\u009c\u0003H$\u0000\u0092\u009c"+
		"\u0003(\u0014\u0000\u0093\u009c\u0003*\u0015\u0000\u0094\u009c\u0003,"+
		"\u0016\u0000\u0095\u009c\u00030\u0018\u0000\u0096\u009c\u00032\u0019\u0000"+
		"\u0097\u009c\u00034\u001a\u0000\u0098\u009c\u00036\u001b\u0000\u0099\u009c"+
		"\u0003@ \u0000\u009a\u009c\u0003B!\u0000\u009b\u008b\u0001\u0000\u0000"+
		"\u0000\u009b\u008c\u0001\u0000\u0000\u0000\u009b\u008d\u0001\u0000\u0000"+
		"\u0000\u009b\u008e\u0001\u0000\u0000\u0000\u009b\u008f\u0001\u0000\u0000"+
		"\u0000\u009b\u0090\u0001\u0000\u0000\u0000\u009b\u0091\u0001\u0000\u0000"+
		"\u0000\u009b\u0092\u0001\u0000\u0000\u0000\u009b\u0093\u0001\u0000\u0000"+
		"\u0000\u009b\u0094\u0001\u0000\u0000\u0000\u009b\u0095\u0001\u0000\u0000"+
		"\u0000\u009b\u0096\u0001\u0000\u0000\u0000\u009b\u0097\u0001\u0000\u0000"+
		"\u0000\u009b\u0098\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000"+
		"\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u0003\u0001\u0000\u0000"+
		"\u0000\u009d\u009f\u0005\u0007\u0000\u0000\u009e\u00a0\u0003\u0006\u0003"+
		"\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005\b\u0000\u0000"+
		"\u00a2\u0005\u0001\u0000\u0000\u0000\u00a3\u00a5\u0003\u0002\u0001\u0000"+
		"\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a7\u0007\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005N\u0000\u0000\u00a9"+
		"\u00aa\u0003\n\u0005\u0000\u00aa\t\u0001\u0000\u0000\u0000\u00ab\u00ad"+
		"\u0003\u0010\b\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001"+
		"\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00b1\u0003"+
		"\u0012\t\u0000\u00af\u00b1\u0003\f\u0006\u0000\u00b0\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0003\u0014\n\u0000\u00b3\u00b4\u0003\u0084B"+
		"\u0000\u00b4\u00b8\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005R\u0000\u0000"+
		"\u00b6\u00b8\u0003\u0084B\u0000\u00b7\u00ac\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b8\u000b\u0001\u0000\u0000\u0000\u00b9"+
		"\u00bf\u0005\u0007\u0000\u0000\u00ba\u00bb\u0003\u000e\u0007\u0000\u00bb"+
		"\u00bc\u0005\n\u0000\u0000\u00bc\u00be\u0001\u0000\u0000\u0000\u00bd\u00ba"+
		"\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c4"+
		"\u0003\u000e\u0007\u0000\u00c3\u00c5\u0005\n\u0000\u0000\u00c4\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c2\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005"+
		"\b\u0000\u0000\u00c9\r\u0001\u0000\u0000\u0000\u00ca\u00cd\u0005Q\u0000"+
		"\u0000\u00cb\u00cc\u0005G\u0000\u0000\u00cc\u00ce\u0005Q\u0000\u0000\u00cd"+
		"\u00cb\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce"+
		"\u000f\u0001\u0000\u0000\u0000\u00cf\u00d0\u0003\u0016\u000b\u0000\u00d0"+
		"\u00d1\u0005\n\u0000\u0000\u00d1\u0011\u0001\u0000\u0000\u0000\u00d2\u00d5"+
		"\u0007\u0000\u0000\u0000\u00d3\u00d4\u0005G\u0000\u0000\u00d4\u00d6\u0005"+
		"Q\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d6\u0013\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005H\u0000"+
		"\u0000\u00d8\u00d9\u0005R\u0000\u0000\u00d9\u0015\u0001\u0000\u0000\u0000"+
		"\u00da\u00dd\u0005Q\u0000\u0000\u00db\u00dc\u0005G\u0000\u0000\u00dc\u00de"+
		"\u0005Q\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00de\u0001"+
		"\u0000\u0000\u0000\u00de\u0017\u0001\u0000\u0000\u0000\u00df\u00e1\u0005"+
		"M\u0000\u0000\u00e0\u00e2\u0005@\u0000\u0000\u00e1\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e6\u0003\u001a\r\u0000\u00e4\u00e6\u0003 \u0010\u0000"+
		"\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e8\u0003\u0084B\u0000\u00e8"+
		"\u00ef\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005M\u0000\u0000\u00ea\u00eb"+
		"\u0005@\u0000\u0000\u00eb\u00ec\u0003n7\u0000\u00ec\u00ed\u0003\u0084"+
		"B\u0000\u00ed\u00ef\u0001\u0000\u0000\u0000\u00ee\u00df\u0001\u0000\u0000"+
		"\u0000\u00ee\u00e9\u0001\u0000\u0000\u0000\u00ef\u0019\u0001\u0000\u0000"+
		"\u0000\u00f0\u00f2\u0003\u001c\u000e\u0000\u00f1\u00f3\u0003\u0014\n\u0000"+
		"\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f5\u0003\u0084B\u0000\u00f5"+
		"\u001b\u0001\u0000\u0000\u0000\u00f6\u00fc\u0005\u0007\u0000\u0000\u00f7"+
		"\u00f8\u0003\u001e\u000f\u0000\u00f8\u00f9\u0005\n\u0000\u0000\u00f9\u00fb"+
		"\u0001\u0000\u0000\u0000\u00fa\u00f7\u0001\u0000\u0000\u0000\u00fb\u00fe"+
		"\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fd"+
		"\u0001\u0000\u0000\u0000\u00fd\u0103\u0001\u0000\u0000\u0000\u00fe\u00fc"+
		"\u0001\u0000\u0000\u0000\u00ff\u0101\u0003\u001e\u000f\u0000\u0100\u0102"+
		"\u0005\n\u0000\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0101\u0102\u0001"+
		"\u0000\u0000\u0000\u0102\u0104\u0001\u0000\u0000\u0000\u0103\u00ff\u0001"+
		"\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0105\u0001"+
		"\u0000\u0000\u0000\u0105\u0106\u0005\b\u0000\u0000\u0106\u001d\u0001\u0000"+
		"\u0000\u0000\u0107\u010a\u0005Q\u0000\u0000\u0108\u0109\u0005G\u0000\u0000"+
		"\u0109\u010b\u0005Q\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a"+
		"\u010b\u0001\u0000\u0000\u0000\u010b\u001f\u0001\u0000\u0000\u0000\u010c"+
		"\u0110\u0003\"\u0011\u0000\u010d\u0110\u0003J%\u0000\u010e\u0110\u0003"+
		"H$\u0000\u010f\u010c\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000"+
		"\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u0110!\u0001\u0000\u0000\u0000"+
		"\u0111\u0112\u0003$\u0012\u0000\u0112\u0113\u0003\u0084B\u0000\u0113#"+
		"\u0001\u0000\u0000\u0000\u0114\u0115\u0003.\u0017\u0000\u0115\u011a\u0003"+
		"&\u0013\u0000\u0116\u0117\u0005\n\u0000\u0000\u0117\u0119\u0003&\u0013"+
		"\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0119\u011c\u0001\u0000\u0000"+
		"\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000"+
		"\u0000\u011b%\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000"+
		"\u011d\u0120\u0003r9\u0000\u011e\u011f\u0005\u000b\u0000\u0000\u011f\u0121"+
		"\u0003n7\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000"+
		"\u0000\u0000\u0121\'\u0001\u0000\u0000\u0000\u0122\u0123\u0003l6\u0000"+
		"\u0123\u0124\u0003\u0084B\u0000\u0124)\u0001\u0000\u0000\u0000\u0125\u0126"+
		"\u0005A\u0000\u0000\u0126\u0127\u0005\u0005\u0000\u0000\u0127\u0128\u0003"+
		"l6\u0000\u0128\u0129\u0005\u0006\u0000\u0000\u0129\u012c\u0003\u0002\u0001"+
		"\u0000\u012a\u012b\u00054\u0000\u0000\u012b\u012d\u0003\u0002\u0001\u0000"+
		"\u012c\u012a\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000"+
		"\u012d+\u0001\u0000\u0000\u0000\u012e\u012f\u00051\u0000\u0000\u012f\u0130"+
		"\u0003\u0002\u0001\u0000\u0130\u0131\u0005=\u0000\u0000\u0131\u0132\u0005"+
		"\u0005\u0000\u0000\u0132\u0133\u0003l6\u0000\u0133\u0134\u0005\u0006\u0000"+
		"\u0000\u0134\u0135\u0003\u0084B\u0000\u0135\u0163\u0001\u0000\u0000\u0000"+
		"\u0136\u0137\u0005=\u0000\u0000\u0137\u0138\u0005\u0005\u0000\u0000\u0138"+
		"\u0139\u0003l6\u0000\u0139\u013a\u0005\u0006\u0000\u0000\u013a\u013b\u0003"+
		"\u0002\u0001\u0000\u013b\u0163\u0001\u0000\u0000\u0000\u013c\u013d\u0005"+
		";\u0000\u0000\u013d\u0140\u0005\u0005\u0000\u0000\u013e\u0141\u0003l6"+
		"\u0000\u013f\u0141\u0003$\u0012\u0000\u0140\u013e\u0001\u0000\u0000\u0000"+
		"\u0140\u013f\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000"+
		"\u0141\u0142\u0001\u0000\u0000\u0000\u0142\u0144\u0005\t\u0000\u0000\u0143"+
		"\u0145\u0003l6\u0000\u0144\u0143\u0001\u0000\u0000\u0000\u0144\u0145\u0001"+
		"\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0148\u0005"+
		"\t\u0000\u0000\u0147\u0149\u0003l6\u0000\u0148\u0147\u0001\u0000\u0000"+
		"\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000"+
		"\u0000\u014a\u014b\u0005\u0006\u0000\u0000\u014b\u0163\u0003\u0002\u0001"+
		"\u0000\u014c\u014d\u0005;\u0000\u0000\u014d\u0150\u0005\u0005\u0000\u0000"+
		"\u014e\u0151\u0003n7\u0000\u014f\u0151\u0003$\u0012\u0000\u0150\u014e"+
		"\u0001\u0000\u0000\u0000\u0150\u014f\u0001\u0000\u0000\u0000\u0151\u0152"+
		"\u0001\u0000\u0000\u0000\u0152\u0153\u0005D\u0000\u0000\u0153\u0154\u0003"+
		"l6\u0000\u0154\u0155\u0005\u0006\u0000\u0000\u0155\u0156\u0003\u0002\u0001"+
		"\u0000\u0156\u0163\u0001\u0000\u0000\u0000\u0157\u0158\u0005;\u0000\u0000"+
		"\u0158\u015b\u0005\u0005\u0000\u0000\u0159\u015c\u0003n7\u0000\u015a\u015c"+
		"\u0003$\u0012\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015b\u015a\u0001"+
		"\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015e\u0005"+
		"E\u0000\u0000\u015e\u015f\u0003l6\u0000\u015f\u0160\u0005\u0006\u0000"+
		"\u0000\u0160\u0161\u0003\u0002\u0001\u0000\u0161\u0163\u0001\u0000\u0000"+
		"\u0000\u0162\u012e\u0001\u0000\u0000\u0000\u0162\u0136\u0001\u0000\u0000"+
		"\u0000\u0162\u013c\u0001\u0000\u0000\u0000\u0162\u014c\u0001\u0000\u0000"+
		"\u0000\u0162\u0157\u0001\u0000\u0000\u0000\u0163-\u0001\u0000\u0000\u0000"+
		"\u0164\u0168\u00056\u0000\u0000\u0165\u0168\u0005O\u0000\u0000\u0166\u0168"+
		"\u0005L\u0000\u0000\u0167\u0164\u0001\u0000\u0000\u0000\u0167\u0165\u0001"+
		"\u0000\u0000\u0000\u0167\u0166\u0001\u0000\u0000\u0000\u0168/\u0001\u0000"+
		"\u0000\u0000\u0169\u016a\u0005:\u0000\u0000\u016a\u016b\u0003\u0084B\u0000"+
		"\u016b1\u0001\u0000\u0000\u0000\u016c\u016d\u00050\u0000\u0000\u016d\u016e"+
		"\u0003\u0084B\u0000\u016e3\u0001\u0000\u0000\u0000\u016f\u0171\u00059"+
		"\u0000\u0000\u0170\u0172\u0003l6\u0000\u0171\u0170\u0001\u0000\u0000\u0000"+
		"\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000"+
		"\u0173\u0174\u0003\u0084B\u0000\u01745\u0001\u0000\u0000\u0000\u0175\u0176"+
		"\u0005<\u0000\u0000\u0176\u0177\u0005\u0005\u0000\u0000\u0177\u0178\u0003"+
		"l6\u0000\u0178\u0179\u0005\u0006\u0000\u0000\u0179\u017a\u00038\u001c"+
		"\u0000\u017a7\u0001\u0000\u0000\u0000\u017b\u017d\u0005\u0007\u0000\u0000"+
		"\u017c\u017e\u0003:\u001d\u0000\u017d\u017c\u0001\u0000\u0000\u0000\u017d"+
		"\u017e\u0001\u0000\u0000\u0000\u017e\u0183\u0001\u0000\u0000\u0000\u017f"+
		"\u0181\u0003>\u001f\u0000\u0180\u0182\u0003:\u001d\u0000\u0181\u0180\u0001"+
		"\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0184\u0001"+
		"\u0000\u0000\u0000\u0183\u017f\u0001\u0000\u0000\u0000\u0183\u0184\u0001"+
		"\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0186\u0005"+
		"\b\u0000\u0000\u01869\u0001\u0000\u0000\u0000\u0187\u0189\u0003<\u001e"+
		"\u0000\u0188\u0187\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000"+
		"\u0000\u018a\u0188\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000"+
		"\u0000\u018b;\u0001\u0000\u0000\u0000\u018c\u018d\u00053\u0000\u0000\u018d"+
		"\u018e\u0003l6\u0000\u018e\u0190\u0005\u000e\u0000\u0000\u018f\u0191\u0003"+
		"\u0006\u0003\u0000\u0190\u018f\u0001\u0000\u0000\u0000\u0190\u0191\u0001"+
		"\u0000\u0000\u0000\u0191=\u0001\u0000\u0000\u0000\u0192\u0193\u0005@\u0000"+
		"\u0000\u0193\u0195\u0005\u000e\u0000\u0000\u0194\u0196\u0003\u0006\u0003"+
		"\u0000\u0195\u0194\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000"+
		"\u0000\u0196?\u0001\u0000\u0000\u0000\u0197\u0198\u0005B\u0000\u0000\u0198"+
		"\u0199\u0003l6\u0000\u0199\u019a\u0003\u0084B\u0000\u019aA\u0001\u0000"+
		"\u0000\u0000\u019b\u019c\u0005F\u0000\u0000\u019c\u01a2\u0003\u0004\u0002"+
		"\u0000\u019d\u019f\u0003D\"\u0000\u019e\u01a0\u0003F#\u0000\u019f\u019e"+
		"\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0\u01a3"+
		"\u0001\u0000\u0000\u0000\u01a1\u01a3\u0003F#\u0000\u01a2\u019d\u0001\u0000"+
		"\u0000\u0000\u01a2\u01a1\u0001\u0000\u0000\u0000\u01a3C\u0001\u0000\u0000"+
		"\u0000\u01a4\u01aa\u00057\u0000\u0000\u01a5\u01a7\u0005\u0005\u0000\u0000"+
		"\u01a6\u01a8\u0003r9\u0000\u01a7\u01a6\u0001\u0000\u0000\u0000\u01a7\u01a8"+
		"\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01ab"+
		"\u0005\u0006\u0000\u0000\u01aa\u01a5\u0001\u0000\u0000\u0000\u01aa\u01ab"+
		"\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\u01ad"+
		"\u0003\u0004\u0002\u0000\u01adE\u0001\u0000\u0000\u0000\u01ae\u01af\u0005"+
		"8\u0000\u0000\u01af\u01b0\u0003\u0004\u0002\u0000\u01b0G\u0001\u0000\u0000"+
		"\u0000\u01b1\u01b2\u0005>\u0000\u0000\u01b2\u01b3\u0005Q\u0000\u0000\u01b3"+
		"\u01b5\u0005\u0005\u0000\u0000\u01b4\u01b6\u0003T*\u0000\u01b5\u01b4\u0001"+
		"\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001"+
		"\u0000\u0000\u0000\u01b7\u01b8\u0005\u0006\u0000\u0000\u01b8\u01b9\u0003"+
		"Z-\u0000\u01b9I\u0001\u0000\u0000\u0000\u01ba\u01bb\u0005I\u0000\u0000"+
		"\u01bb\u01bc\u0005Q\u0000\u0000\u01bc\u01bd\u0003L&\u0000\u01bdK\u0001"+
		"\u0000\u0000\u0000\u01be\u01bf\u0005J\u0000\u0000\u01bf\u01c1\u0003n7"+
		"\u0000\u01c0\u01be\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000"+
		"\u0000\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2\u01c6\u0005\u0007\u0000"+
		"\u0000\u01c3\u01c5\u0003N\'\u0000\u01c4\u01c3\u0001\u0000\u0000\u0000"+
		"\u01c5\u01c8\u0001\u0000\u0000\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000"+
		"\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7\u01c9\u0001\u0000\u0000\u0000"+
		"\u01c8\u01c6\u0001\u0000\u0000\u0000\u01c9\u01ca\u0005\b\u0000\u0000\u01ca"+
		"M\u0001\u0000\u0000\u0000\u01cb\u01cd\u0007\u0001\u0000\u0000\u01cc\u01cb"+
		"\u0001\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cd\u01ce"+
		"\u0001\u0000\u0000\u0000\u01ce\u01d5\u0003P(\u0000\u01cf\u01d1\u0007\u0001"+
		"\u0000\u0000\u01d0\u01cf\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000"+
		"\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2\u01d5\u0003R)\u0000"+
		"\u01d3\u01d5\u0005\t\u0000\u0000\u01d4\u01cc\u0001\u0000\u0000\u0000\u01d4"+
		"\u01d0\u0001\u0000\u0000\u0000\u01d4\u01d3\u0001\u0000\u0000\u0000\u01d5"+
		"O\u0001\u0000\u0000\u0000\u01d6\u01d7\u0003f3\u0000\u01d7\u01d9\u0005"+
		"\u0005\u0000\u0000\u01d8\u01da\u0003T*\u0000\u01d9\u01d8\u0001\u0000\u0000"+
		"\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000"+
		"\u0000\u01db\u01dc\u0005\u0006\u0000\u0000\u01dc\u01dd\u0003Z-\u0000\u01dd"+
		"Q\u0001\u0000\u0000\u0000\u01de\u01e0\u0003f3\u0000\u01df\u01e1\u0003"+
		"p8\u0000\u01e0\u01df\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001\u0000\u0000"+
		"\u0000\u01e1S\u0001\u0000\u0000\u0000\u01e2\u01e7\u0003V+\u0000\u01e3"+
		"\u01e4\u0005\n\u0000\u0000\u01e4\u01e6\u0003V+\u0000\u01e5\u01e3\u0001"+
		"\u0000\u0000\u0000\u01e6\u01e9\u0001\u0000\u0000\u0000\u01e7\u01e5\u0001"+
		"\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8\u01ec\u0001"+
		"\u0000\u0000\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000\u01ea\u01eb\u0005"+
		"\n\u0000\u0000\u01eb\u01ed\u0003X,\u0000\u01ec\u01ea\u0001\u0000\u0000"+
		"\u0000\u01ec\u01ed\u0001\u0000\u0000\u0000\u01ed\u01f0\u0001\u0000\u0000"+
		"\u0000\u01ee\u01f0\u0003X,\u0000\u01ef\u01e2\u0001\u0000\u0000\u0000\u01ef"+
		"\u01ee\u0001\u0000\u0000\u0000\u01f0U\u0001\u0000\u0000\u0000\u01f1\u01f4"+
		"\u0003r9\u0000\u01f2\u01f3\u0005\u000b\u0000\u0000\u01f3\u01f5\u0003n"+
		"7\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000"+
		"\u0000\u01f5W\u0001\u0000\u0000\u0000\u01f6\u01f7\u0005\u000f\u0000\u0000"+
		"\u01f7\u01f8\u0003n7\u0000\u01f8Y\u0001\u0000\u0000\u0000\u01f9\u01fb"+
		"\u0005\u0007\u0000\u0000\u01fa\u01fc\u0003\\.\u0000\u01fb\u01fa\u0001"+
		"\u0000\u0000\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001"+
		"\u0000\u0000\u0000\u01fd\u01fe\u0005\b\u0000\u0000\u01fe[\u0001\u0000"+
		"\u0000\u0000\u01ff\u0201\u0003\u0002\u0001\u0000\u0200\u01ff\u0001\u0000"+
		"\u0000\u0000\u0201\u0202\u0001\u0000\u0000\u0000\u0202\u0200\u0001\u0000"+
		"\u0000\u0000\u0202\u0203\u0001\u0000\u0000\u0000\u0203]\u0001\u0000\u0000"+
		"\u0000\u0204\u0205\u0005\u0003\u0000\u0000\u0205\u0206\u0003`0\u0000\u0206"+
		"\u0207\u0005\u0004\u0000\u0000\u0207_\u0001\u0000\u0000\u0000\u0208\u020a"+
		"\u0005\n\u0000\u0000\u0209\u0208\u0001\u0000\u0000\u0000\u020a\u020d\u0001"+
		"\u0000\u0000\u0000\u020b\u0209\u0001\u0000\u0000\u0000\u020b\u020c\u0001"+
		"\u0000\u0000\u0000\u020c\u020f\u0001\u0000\u0000\u0000\u020d\u020b\u0001"+
		"\u0000\u0000\u0000\u020e\u0210\u0003b1\u0000\u020f\u020e\u0001\u0000\u0000"+
		"\u0000\u020f\u0210\u0001\u0000\u0000\u0000\u0210\u0219\u0001\u0000\u0000"+
		"\u0000\u0211\u0213\u0005\n\u0000\u0000\u0212\u0211\u0001\u0000\u0000\u0000"+
		"\u0213\u0214\u0001\u0000\u0000\u0000\u0214\u0212\u0001\u0000\u0000\u0000"+
		"\u0214\u0215\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000\u0000\u0000"+
		"\u0216\u0218\u0003b1\u0000\u0217\u0212\u0001\u0000\u0000\u0000\u0218\u021b"+
		"\u0001\u0000\u0000\u0000\u0219\u0217\u0001\u0000\u0000\u0000\u0219\u021a"+
		"\u0001\u0000\u0000\u0000\u021a\u021f\u0001\u0000\u0000\u0000\u021b\u0219"+
		"\u0001\u0000\u0000\u0000\u021c\u021e\u0005\n\u0000\u0000\u021d\u021c\u0001"+
		"\u0000\u0000\u0000\u021e\u0221\u0001\u0000\u0000\u0000\u021f\u021d\u0001"+
		"\u0000\u0000\u0000\u021f\u0220\u0001\u0000\u0000\u0000\u0220a\u0001\u0000"+
		"\u0000\u0000\u0221\u021f\u0001\u0000\u0000\u0000\u0222\u0224\u0005\u000f"+
		"\u0000\u0000\u0223\u0222\u0001\u0000\u0000\u0000\u0223\u0224\u0001\u0000"+
		"\u0000\u0000\u0224\u0225\u0001\u0000\u0000\u0000\u0225\u0226\u0003n7\u0000"+
		"\u0226c\u0001\u0000\u0000\u0000\u0227\u0228\u0003f3\u0000\u0228\u0229"+
		"\u0005\u000e\u0000\u0000\u0229\u022a\u0003n7\u0000\u022a\u023e\u0001\u0000"+
		"\u0000\u0000\u022b\u022c\u0005\u0003\u0000\u0000\u022c\u022d\u0003n7\u0000"+
		"\u022d\u022e\u0005\u0004\u0000\u0000\u022e\u022f\u0005\u000e\u0000\u0000"+
		"\u022f\u0230\u0003n7\u0000\u0230\u023e\u0001\u0000\u0000\u0000\u0231\u0232"+
		"\u0003f3\u0000\u0232\u0234\u0005\u0005\u0000\u0000\u0233\u0235\u0003T"+
		"*\u0000\u0234\u0233\u0001\u0000\u0000\u0000\u0234\u0235\u0001\u0000\u0000"+
		"\u0000\u0235\u0236\u0001\u0000\u0000\u0000\u0236\u0237\u0005\u0006\u0000"+
		"\u0000\u0237\u0238\u0003Z-\u0000\u0238\u023e\u0001\u0000\u0000\u0000\u0239"+
		"\u023b\u0005\u000f\u0000\u0000\u023a\u0239\u0001\u0000\u0000\u0000\u023a"+
		"\u023b\u0001\u0000\u0000\u0000\u023b\u023c\u0001\u0000\u0000\u0000\u023c"+
		"\u023e\u0003n7\u0000\u023d\u0227\u0001\u0000\u0000\u0000\u023d\u022b\u0001"+
		"\u0000\u0000\u0000\u023d\u0231\u0001\u0000\u0000\u0000\u023d\u023a\u0001"+
		"\u0000\u0000\u0000\u023ee\u0001\u0000\u0000\u0000\u023f\u0247\u0005Q\u0000"+
		"\u0000\u0240\u0247\u0005R\u0000\u0000\u0241\u0247\u0005/\u0000\u0000\u0242"+
		"\u0243\u0005\u0003\u0000\u0000\u0243\u0244\u0003n7\u0000\u0244\u0245\u0005"+
		"\u0004\u0000\u0000\u0245\u0247\u0001\u0000\u0000\u0000\u0246\u023f\u0001"+
		"\u0000\u0000\u0000\u0246\u0240\u0001\u0000\u0000\u0000\u0246\u0241\u0001"+
		"\u0000\u0000\u0000\u0246\u0242\u0001\u0000\u0000\u0000\u0247g\u0001\u0000"+
		"\u0000\u0000\u0248\u0254\u0005\u0005\u0000\u0000\u0249\u024e\u0003j5\u0000"+
		"\u024a\u024b\u0005\n\u0000\u0000\u024b\u024d\u0003j5\u0000\u024c\u024a"+
		"\u0001\u0000\u0000\u0000\u024d\u0250\u0001\u0000\u0000\u0000\u024e\u024c"+
		"\u0001\u0000\u0000\u0000\u024e\u024f\u0001\u0000\u0000\u0000\u024f\u0252"+
		"\u0001\u0000\u0000\u0000\u0250\u024e\u0001\u0000\u0000\u0000\u0251\u0253"+
		"\u0005\n\u0000\u0000\u0252\u0251\u0001\u0000\u0000\u0000\u0252\u0253\u0001"+
		"\u0000\u0000\u0000\u0253\u0255\u0001\u0000\u0000\u0000\u0254\u0249\u0001"+
		"\u0000\u0000\u0000\u0254\u0255\u0001\u0000\u0000\u0000\u0255\u0256\u0001"+
		"\u0000\u0000\u0000\u0256\u0257\u0005\u0006\u0000\u0000\u0257i\u0001\u0000"+
		"\u0000\u0000\u0258\u025a\u0005\u000f\u0000\u0000\u0259\u0258\u0001\u0000"+
		"\u0000\u0000\u0259\u025a\u0001\u0000\u0000\u0000\u025a\u025d\u0001\u0000"+
		"\u0000\u0000\u025b\u025e\u0003n7\u0000\u025c\u025e\u0005Q\u0000\u0000"+
		"\u025d\u025b\u0001\u0000\u0000\u0000\u025d\u025c\u0001\u0000\u0000\u0000"+
		"\u025ek\u0001\u0000\u0000\u0000\u025f\u0264\u0003n7\u0000\u0260\u0261"+
		"\u0005\n\u0000\u0000\u0261\u0263\u0003n7\u0000\u0262\u0260\u0001\u0000"+
		"\u0000\u0000\u0263\u0266\u0001\u0000\u0000\u0000\u0264\u0262\u0001\u0000"+
		"\u0000\u0000\u0264\u0265\u0001\u0000\u0000\u0000\u0265m\u0001\u0000\u0000"+
		"\u0000\u0266\u0264\u0001\u0000\u0000\u0000\u0267\u0268\u00067\uffff\uffff"+
		"\u0000\u0268\u0298\u0003v;\u0000\u0269\u026b\u0005I\u0000\u0000\u026a"+
		"\u026c\u0005Q\u0000\u0000\u026b\u026a\u0001\u0000\u0000\u0000\u026b\u026c"+
		"\u0001\u0000\u0000\u0000\u026c\u026d\u0001\u0000\u0000\u0000\u026d\u0298"+
		"\u0003L&\u0000\u026e\u026f\u00055\u0000\u0000\u026f\u0270\u0005Q\u0000"+
		"\u0000\u0270\u0298\u0003h4\u0000\u0271\u0272\u00055\u0000\u0000\u0272"+
		"\u0273\u0003n7\u0000\u0273\u0274\u0003h4\u0000\u0274\u0298\u0001\u0000"+
		"\u0000\u0000\u0275\u0276\u00055\u0000\u0000\u0276\u0298\u0003n7!\u0277"+
		"\u0278\u00055\u0000\u0000\u0278\u0279\u0005\u0010\u0000\u0000\u0279\u0298"+
		"\u0005Q\u0000\u0000\u027a\u027b\u0005C\u0000\u0000\u027b\u0298\u0003n"+
		"7\u001c\u027c\u027d\u00052\u0000\u0000\u027d\u0298\u0003n7\u001b\u027e"+
		"\u027f\u0005\u0011\u0000\u0000\u027f\u0298\u0003n7\u001a\u0280\u0281\u0005"+
		"\u0012\u0000\u0000\u0281\u0298\u0003n7\u0019\u0282\u0283\u0005\u0013\u0000"+
		"\u0000\u0283\u0298\u0003n7\u0018\u0284\u0285\u0005\u0014\u0000\u0000\u0285"+
		"\u0298\u0003n7\u0017\u0286\u0287\u0005\u0015\u0000\u0000\u0287\u0298\u0003"+
		"n7\u0016\u0288\u0289\u0005N\u0000\u0000\u0289\u028a\u0005\u0005\u0000"+
		"\u0000\u028a\u028b\u0003n7\u0000\u028b\u028c\u0005\u0006\u0000\u0000\u028c"+
		"\u0298\u0001\u0000\u0000\u0000\u028d\u0298\u0005?\u0000\u0000\u028e\u0298"+
		"\u0005Q\u0000\u0000\u028f\u0298\u0005K\u0000\u0000\u0290\u0298\u0003~"+
		"?\u0000\u0291\u0298\u0003^/\u0000\u0292\u0298\u0003t:\u0000\u0293\u0294"+
		"\u0005\u0005\u0000\u0000\u0294\u0295\u0003l6\u0000\u0295\u0296\u0005\u0006"+
		"\u0000\u0000\u0296\u0298\u0001\u0000\u0000\u0000\u0297\u0267\u0001\u0000"+
		"\u0000\u0000\u0297\u0269\u0001\u0000\u0000\u0000\u0297\u026e\u0001\u0000"+
		"\u0000\u0000\u0297\u0271\u0001\u0000\u0000\u0000\u0297\u0275\u0001\u0000"+
		"\u0000\u0000\u0297\u0277\u0001\u0000\u0000\u0000\u0297\u027a\u0001\u0000"+
		"\u0000\u0000\u0297\u027c\u0001\u0000\u0000\u0000\u0297\u027e\u0001\u0000"+
		"\u0000\u0000\u0297\u0280\u0001\u0000\u0000\u0000\u0297\u0282\u0001\u0000"+
		"\u0000\u0000\u0297\u0284\u0001\u0000\u0000\u0000\u0297\u0286\u0001\u0000"+
		"\u0000\u0000\u0297\u0288\u0001\u0000\u0000\u0000\u0297\u028d\u0001\u0000"+
		"\u0000\u0000\u0297\u028e\u0001\u0000\u0000\u0000\u0297\u028f\u0001\u0000"+
		"\u0000\u0000\u0297\u0290\u0001\u0000\u0000\u0000\u0297\u0291\u0001\u0000"+
		"\u0000\u0000\u0297\u0292\u0001\u0000\u0000\u0000\u0297\u0293\u0001\u0000"+
		"\u0000\u0000\u0298\u02dc\u0001\u0000\u0000\u0000\u0299\u029a\n&\u0000"+
		"\u0000\u029a\u029b\u0005\r\u0000\u0000\u029b\u02db\u0003n7\'\u029c\u029d"+
		"\n\u0015\u0000\u0000\u029d\u029e\u0005\u0019\u0000\u0000\u029e\u02db\u0003"+
		"n7\u0015\u029f\u02a0\n\u0014\u0000\u0000\u02a0\u02a1\u0007\u0002\u0000"+
		"\u0000\u02a1\u02db\u0003n7\u0015\u02a2\u02a3\n\u0013\u0000\u0000\u02a3"+
		"\u02a4\u0007\u0003\u0000\u0000\u02a4\u02db\u0003n7\u0014\u02a5\u02a6\n"+
		"\u0012\u0000\u0000\u02a6\u02a7\u0005\u001a\u0000\u0000\u02a7\u02db\u0003"+
		"n7\u0013\u02a8\u02a9\n\u0011\u0000\u0000\u02a9\u02aa\u0007\u0004\u0000"+
		"\u0000\u02aa\u02db\u0003n7\u0012\u02ab\u02ac\n\u0010\u0000\u0000\u02ac"+
		"\u02ad\u0005D\u0000\u0000\u02ad\u02db\u0003n7\u0011\u02ae\u02af\n\u000f"+
		"\u0000\u0000\u02af\u02b0\u0007\u0005\u0000\u0000\u02b0\u02db\u0003n7\u0010"+
		"\u02b1\u02b2\n\u000e\u0000\u0000\u02b2\u02b3\u0005#\u0000\u0000\u02b3"+
		"\u02db\u0003n7\u000f\u02b4\u02b5\n\r\u0000\u0000\u02b5\u02b6\u0005$\u0000"+
		"\u0000\u02b6\u02db\u0003n7\u000e\u02b7\u02b8\n\f\u0000\u0000\u02b8\u02b9"+
		"\u0005\f\u0000\u0000\u02b9\u02ba\u0003n7\u0000\u02ba\u02bb\u0005\u000e"+
		"\u0000\u0000\u02bb\u02bc\u0003n7\r\u02bc\u02db\u0001\u0000\u0000\u0000"+
		"\u02bd\u02be\n\u000b\u0000\u0000\u02be\u02bf\u0005\u000b\u0000\u0000\u02bf"+
		"\u02db\u0003n7\u000b\u02c0\u02c1\n\n\u0000\u0000\u02c1\u02c2\u0003|>\u0000"+
		"\u02c2\u02c3\u0003n7\n\u02c3\u02db\u0001\u0000\u0000\u0000\u02c4\u02c6"+
		"\n%\u0000\u0000\u02c5\u02c7\u0005\r\u0000\u0000\u02c6\u02c5\u0001\u0000"+
		"\u0000\u0000\u02c6\u02c7\u0001\u0000\u0000\u0000\u02c7\u02c8\u0001\u0000"+
		"\u0000\u0000\u02c8\u02c9\u0005\u0003\u0000\u0000\u02c9\u02ca\u0003l6\u0000"+
		"\u02ca\u02cb\u0005\u0004\u0000\u0000\u02cb\u02db\u0001\u0000\u0000\u0000"+
		"\u02cc\u02ce\n$\u0000\u0000\u02cd\u02cf\u0005\f\u0000\u0000\u02ce\u02cd"+
		"\u0001\u0000\u0000\u0000\u02ce\u02cf\u0001\u0000\u0000\u0000\u02cf\u02d0"+
		"\u0001\u0000\u0000\u0000\u02d0\u02d1\u0005\u0010\u0000\u0000\u02d1\u02db"+
		"\u0005Q\u0000\u0000\u02d2\u02d3\n \u0000\u0000\u02d3\u02db\u0003h4\u0000"+
		"\u02d4\u02d5\n\u001e\u0000\u0000\u02d5\u02db\u0005\u0011\u0000\u0000\u02d6"+
		"\u02d7\n\u001d\u0000\u0000\u02d7\u02db\u0005\u0012\u0000\u0000\u02d8\u02d9"+
		"\n\b\u0000\u0000\u02d9\u02db\u0003\u0080@\u0000\u02da\u0299\u0001\u0000"+
		"\u0000\u0000\u02da\u029c\u0001\u0000\u0000\u0000\u02da\u029f\u0001\u0000"+
		"\u0000\u0000\u02da\u02a2\u0001\u0000\u0000\u0000\u02da\u02a5\u0001\u0000"+
		"\u0000\u0000\u02da\u02a8\u0001\u0000\u0000\u0000\u02da\u02ab\u0001\u0000"+
		"\u0000\u0000\u02da\u02ae\u0001\u0000\u0000\u0000\u02da\u02b1\u0001\u0000"+
		"\u0000\u0000\u02da\u02b4\u0001\u0000\u0000\u0000\u02da\u02b7\u0001\u0000"+
		"\u0000\u0000\u02da\u02bd\u0001\u0000\u0000\u0000\u02da\u02c0\u0001\u0000"+
		"\u0000\u0000\u02da\u02c4\u0001\u0000\u0000\u0000\u02da\u02cc\u0001\u0000"+
		"\u0000\u0000\u02da\u02d2\u0001\u0000\u0000\u0000\u02da\u02d4\u0001\u0000"+
		"\u0000\u0000\u02da\u02d6\u0001\u0000\u0000\u0000\u02da\u02d8\u0001\u0000"+
		"\u0000\u0000\u02db\u02de\u0001\u0000\u0000\u0000\u02dc\u02da\u0001\u0000"+
		"\u0000\u0000\u02dc\u02dd\u0001\u0000\u0000\u0000\u02ddo\u0001\u0000\u0000"+
		"\u0000\u02de\u02dc\u0001\u0000\u0000\u0000\u02df\u02e0\u0005\u000b\u0000"+
		"\u0000\u02e0\u02e1\u0003n7\u0000\u02e1q\u0001\u0000\u0000\u0000\u02e2"+
		"\u02e6\u0005Q\u0000\u0000\u02e3\u02e6\u0003^/\u0000\u02e4\u02e6\u0003"+
		"t:\u0000\u02e5\u02e2\u0001\u0000\u0000\u0000\u02e5\u02e3\u0001\u0000\u0000"+
		"\u0000\u02e5\u02e4\u0001\u0000\u0000\u0000\u02e6s\u0001\u0000\u0000\u0000"+
		"\u02e7\u02f3\u0005\u0007\u0000\u0000\u02e8\u02ed\u0003d2\u0000\u02e9\u02ea"+
		"\u0005\n\u0000\u0000\u02ea\u02ec\u0003d2\u0000\u02eb\u02e9\u0001\u0000"+
		"\u0000\u0000\u02ec\u02ef\u0001\u0000\u0000\u0000\u02ed\u02eb\u0001\u0000"+
		"\u0000\u0000\u02ed\u02ee\u0001\u0000\u0000\u0000\u02ee\u02f1\u0001\u0000"+
		"\u0000\u0000\u02ef\u02ed\u0001\u0000\u0000\u0000\u02f0\u02f2\u0005\n\u0000"+
		"\u0000\u02f1\u02f0\u0001\u0000\u0000\u0000\u02f1\u02f2\u0001\u0000\u0000"+
		"\u0000\u02f2\u02f4\u0001\u0000\u0000\u0000\u02f3\u02e8\u0001\u0000\u0000"+
		"\u0000\u02f3\u02f4\u0001\u0000\u0000\u0000\u02f4\u02f5\u0001\u0000\u0000"+
		"\u0000\u02f5\u02f6\u0005\b\u0000\u0000\u02f6u\u0001\u0000\u0000\u0000"+
		"\u02f7\u02f8\u0005>\u0000\u0000\u02f8\u02fa\u0005\u0005\u0000\u0000\u02f9"+
		"\u02fb\u0003T*\u0000\u02fa\u02f9\u0001\u0000\u0000\u0000\u02fa\u02fb\u0001"+
		"\u0000\u0000\u0000\u02fb\u02fc\u0001\u0000\u0000\u0000\u02fc\u02fd\u0005"+
		"\u0006\u0000\u0000\u02fd\u0303\u0003Z-\u0000\u02fe\u02ff\u0003x<\u0000"+
		"\u02ff\u0300\u0005,\u0000\u0000\u0300\u0301\u0003z=\u0000\u0301\u0303"+
		"\u0001\u0000\u0000\u0000\u0302\u02f7\u0001\u0000\u0000\u0000\u0302\u02fe"+
		"\u0001\u0000\u0000\u0000\u0303w\u0001\u0000\u0000\u0000\u0304\u030b\u0005"+
		"Q\u0000\u0000\u0305\u0307\u0005\u0005\u0000\u0000\u0306\u0308\u0003T*"+
		"\u0000\u0307\u0306\u0001\u0000\u0000\u0000\u0307\u0308\u0001\u0000\u0000"+
		"\u0000\u0308\u0309\u0001\u0000\u0000\u0000\u0309\u030b\u0005\u0006\u0000"+
		"\u0000\u030a\u0304\u0001\u0000\u0000\u0000\u030a\u0305\u0001\u0000\u0000"+
		"\u0000\u030by\u0001\u0000\u0000\u0000\u030c\u030f\u0003n7\u0000\u030d"+
		"\u030f\u0003Z-\u0000\u030e\u030c\u0001\u0000\u0000\u0000\u030e\u030d\u0001"+
		"\u0000\u0000\u0000\u030f{\u0001\u0000\u0000\u0000\u0310\u0318\u0005%\u0000"+
		"\u0000\u0311\u0318\u0005&\u0000\u0000\u0312\u0318\u0005\'\u0000\u0000"+
		"\u0313\u0318\u0005(\u0000\u0000\u0314\u0318\u0005)\u0000\u0000\u0315\u0318"+
		"\u0005*\u0000\u0000\u0316\u0318\u0005+\u0000\u0000\u0317\u0310\u0001\u0000"+
		"\u0000\u0000\u0317\u0311\u0001\u0000\u0000\u0000\u0317\u0312\u0001\u0000"+
		"\u0000\u0000\u0317\u0313\u0001\u0000\u0000\u0000\u0317\u0314\u0001\u0000"+
		"\u0000\u0000\u0317\u0315\u0001\u0000\u0000\u0000\u0317\u0316\u0001\u0000"+
		"\u0000\u0000\u0318}\u0001\u0000\u0000\u0000\u0319\u031f\u0005-\u0000\u0000"+
		"\u031a\u031f\u0005.\u0000\u0000\u031b\u031f\u0005R\u0000\u0000\u031c\u031f"+
		"\u0003\u0080@\u0000\u031d\u031f\u0005/\u0000\u0000\u031e\u0319\u0001\u0000"+
		"\u0000\u0000\u031e\u031a\u0001\u0000\u0000\u0000\u031e\u031b\u0001\u0000"+
		"\u0000\u0000\u031e\u031c\u0001\u0000\u0000\u0000\u031e\u031d\u0001\u0000"+
		"\u0000\u0000\u031f\u007f\u0001\u0000\u0000\u0000\u0320\u0324\u0005S\u0000"+
		"\u0000\u0321\u0323\u0003\u0082A\u0000\u0322\u0321\u0001\u0000\u0000\u0000"+
		"\u0323\u0326\u0001\u0000\u0000\u0000\u0324\u0322\u0001\u0000\u0000\u0000"+
		"\u0324\u0325\u0001\u0000\u0000\u0000\u0325\u0327\u0001\u0000\u0000\u0000"+
		"\u0326\u0324\u0001\u0000\u0000\u0000\u0327\u0328\u0005S\u0000\u0000\u0328"+
		"\u0081\u0001\u0000\u0000\u0000\u0329\u032f\u0005X\u0000\u0000\u032a\u032b"+
		"\u0005W\u0000\u0000\u032b\u032c\u0003n7\u0000\u032c\u032d\u0005\b\u0000"+
		"\u0000\u032d\u032f\u0001\u0000\u0000\u0000\u032e\u0329\u0001\u0000\u0000"+
		"\u0000\u032e\u032a\u0001\u0000\u0000\u0000\u032f\u0083\u0001\u0000\u0000"+
		"\u0000\u0330\u0331\u0007\u0006\u0000\u0000\u0331\u0085\u0001\u0000\u0000"+
		"\u0000\\\u0087\u009b\u009f\u00a6\u00ac\u00b0\u00b7\u00bf\u00c4\u00c6\u00cd"+
		"\u00d5\u00dd\u00e1\u00e5\u00ee\u00f2\u00fc\u0101\u0103\u010a\u010f\u011a"+
		"\u0120\u012c\u0140\u0144\u0148\u0150\u015b\u0162\u0167\u0171\u017d\u0181"+
		"\u0183\u018a\u0190\u0195\u019f\u01a2\u01a7\u01aa\u01b5\u01c0\u01c6\u01cc"+
		"\u01d0\u01d4\u01d9\u01e0\u01e7\u01ec\u01ef\u01f4\u01fb\u0202\u020b\u020f"+
		"\u0214\u0219\u021f\u0223\u0234\u023a\u023d\u0246\u024e\u0252\u0254\u0259"+
		"\u025d\u0264\u026b\u0297\u02c6\u02ce\u02da\u02dc\u02e5\u02ed\u02f1\u02f3"+
		"\u02fa\u0302\u0307\u030a\u030e\u0317\u031e\u0324\u032e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}