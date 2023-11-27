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
		RULE_importStatement = 4, RULE_importModuleItems = 5, RULE_importNamespace = 6, 
		RULE_aliasName = 7, RULE_exportStatement = 8, RULE_exportFromBlock = 9, 
		RULE_exportModuleItems = 10, RULE_exportAliasName = 11, RULE_declaration = 12, 
		RULE_variableStatement = 13, RULE_variableDeclarationList = 14, RULE_variableDeclaration = 15, 
		RULE_expressionStatement = 16, RULE_ifStatement = 17, RULE_iterationStatement = 18, 
		RULE_varModifier = 19, RULE_continueStatement = 20, RULE_breakStatement = 21, 
		RULE_returnStatement = 22, RULE_switchStatement = 23, RULE_caseBlock = 24, 
		RULE_caseClauses = 25, RULE_caseClause = 26, RULE_defaultClause = 27, 
		RULE_throwStatement = 28, RULE_tryStatement = 29, RULE_catchProduction = 30, 
		RULE_finallyProduction = 31, RULE_functionDeclaration = 32, RULE_classDeclaration = 33, 
		RULE_classTail = 34, RULE_classElement = 35, RULE_methodDefinition = 36, 
		RULE_fieldDefinition = 37, RULE_formalParameterList = 38, RULE_formalParameterArg = 39, 
		RULE_lastFormalParameterArg = 40, RULE_functionBody = 41, RULE_arrayLiteral = 42, 
		RULE_elementList = 43, RULE_arrayElement = 44, RULE_propertyAssignment = 45, 
		RULE_propertyName = 46, RULE_arguments = 47, RULE_argument = 48, RULE_expressionSequence = 49, 
		RULE_singleExpression = 50, RULE_initializer = 51, RULE_assignable = 52, 
		RULE_objectLiteral = 53, RULE_anonymousFunction = 54, RULE_arrowFunctionParameters = 55, 
		RULE_arrowFunctionBody = 56, RULE_assignmentOperator = 57, RULE_literal = 58, 
		RULE_templateStringLiteral = 59, RULE_templateStringAtom = 60, RULE_eos = 61;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "block", "statementList", "importStatement", 
			"importModuleItems", "importNamespace", "aliasName", "exportStatement", 
			"exportFromBlock", "exportModuleItems", "exportAliasName", "declaration", 
			"variableStatement", "variableDeclarationList", "variableDeclaration", 
			"expressionStatement", "ifStatement", "iterationStatement", "varModifier", 
			"continueStatement", "breakStatement", "returnStatement", "switchStatement", 
			"caseBlock", "caseClauses", "caseClause", "defaultClause", "throwStatement", 
			"tryStatement", "catchProduction", "finallyProduction", "functionDeclaration", 
			"classDeclaration", "classTail", "classElement", "methodDefinition", 
			"fieldDefinition", "formalParameterList", "formalParameterArg", "lastFormalParameterArg", 
			"functionBody", "arrayLiteral", "elementList", "arrayElement", "propertyAssignment", 
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -114876974865972568L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 490791L) != 0)) {
				{
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(124);
					statement();
					}
					}
					setState(127); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -114876974865972568L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 490791L) != 0) );
				}
			}

			setState(131);
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
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new BlockChunkContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				block();
				}
				break;
			case 2:
				_localctx = new VariableDeclerationChunkContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				variableStatement();
				}
				break;
			case 3:
				_localctx = new ImportChunkContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				importStatement();
				}
				break;
			case 4:
				_localctx = new ExportChunkContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				exportStatement();
				}
				break;
			case 5:
				_localctx = new EmptyChunkContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(137);
				match(SemiColon);
				}
				break;
			case 6:
				_localctx = new ClassDeclerationChunkContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(138);
				classDeclaration();
				}
				break;
			case 7:
				_localctx = new FunctionDeclarationChunkContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(139);
				functionDeclaration();
				}
				break;
			case 8:
				_localctx = new ExpressionChunkContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(140);
				expressionStatement();
				}
				break;
			case 9:
				_localctx = new ConditionalChunkContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(141);
				ifStatement();
				}
				break;
			case 10:
				_localctx = new LoopChunkContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(142);
				iterationStatement();
				}
				break;
			case 11:
				_localctx = new ContinueChunkContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(143);
				continueStatement();
				}
				break;
			case 12:
				_localctx = new BreakChunkContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(144);
				breakStatement();
				}
				break;
			case 13:
				_localctx = new ReturnChunkContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(145);
				returnStatement();
				}
				break;
			case 14:
				_localctx = new SwitchChunkContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(146);
				switchStatement();
				}
				break;
			case 15:
				_localctx = new ThrowChunkContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(147);
				throwStatement();
				}
				break;
			case 16:
				_localctx = new TryChunkContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(148);
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
			setState(151);
			match(OpenBrace);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -114876974865972568L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 490791L) != 0)) {
				{
				setState(152);
				statementList();
				}
			}

			setState(155);
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
			setState(158); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(157);
				statement();
				}
				}
				setState(160); 
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
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
	 
		public ImportStatementContext() { }
		public void copyFrom(ImportStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectImportBlockContext extends ImportStatementContext {
		public TerminalNode Import() { return getToken(JSParser.Import, 0); }
		public ImportModuleItemsContext importModuleItems() {
			return getRuleContext(ImportModuleItemsContext.class,0);
		}
		public TerminalNode From() { return getToken(JSParser.From, 0); }
		public TerminalNode StringLiteral() { return getToken(JSParser.StringLiteral, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ImportNamespaceContext importNamespace() {
			return getRuleContext(ImportNamespaceContext.class,0);
		}
		public TerminalNode Comma() { return getToken(JSParser.Comma, 0); }
		public ObjectImportBlockContext(ImportStatementContext ctx) { copyFrom(ctx); }
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
	public static class FileImportBlockContext extends ImportStatementContext {
		public TerminalNode Import() { return getToken(JSParser.Import, 0); }
		public TerminalNode StringLiteral() { return getToken(JSParser.StringLiteral, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public FileImportBlockContext(ImportStatementContext ctx) { copyFrom(ctx); }
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
	@SuppressWarnings("CheckReturnValue")
	public static class DeafultAsImportBlockContext extends ImportStatementContext {
		public TerminalNode Import() { return getToken(JSParser.Import, 0); }
		public ImportNamespaceContext importNamespace() {
			return getRuleContext(ImportNamespaceContext.class,0);
		}
		public TerminalNode From() { return getToken(JSParser.From, 0); }
		public TerminalNode StringLiteral() { return getToken(JSParser.StringLiteral, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public DeafultAsImportBlockContext(ImportStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).enterDeafultAsImportBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSParserListener ) ((JSParserListener)listener).exitDeafultAsImportBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSParserVisitor ) return ((JSParserVisitor<? extends T>)visitor).visitDeafultAsImportBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importStatement);
		int _la;
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new FileImportBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(Import);
				setState(163);
				match(StringLiteral);
				setState(164);
				eos();
				}
				break;
			case 2:
				_localctx = new ObjectImportBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(Import);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Multiply || _la==Identifier) {
					{
					setState(166);
					importNamespace();
					setState(167);
					match(Comma);
					}
				}

				setState(171);
				importModuleItems();
				setState(172);
				match(From);
				setState(173);
				match(StringLiteral);
				setState(174);
				eos();
				}
				break;
			case 3:
				_localctx = new DeafultAsImportBlockContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				match(Import);
				setState(177);
				importNamespace();
				setState(178);
				match(From);
				setState(179);
				match(StringLiteral);
				setState(180);
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
	public static class ImportModuleItemsContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(JSParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(JSParser.CloseBrace, 0); }
		public List<AliasNameContext> aliasName() {
			return getRuleContexts(AliasNameContext.class);
		}
		public AliasNameContext aliasName(int i) {
			return getRuleContext(AliasNameContext.class,i);
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
		enterRule(_localctx, 10, RULE_importModuleItems);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(OpenBrace);
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(185);
					aliasName();
					setState(186);
					match(Comma);
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(193);
				aliasName();
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(194);
					match(Comma);
					}
				}

				}
			}

			setState(199);
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
		enterRule(_localctx, 12, RULE_importNamespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_la = _input.LA(1);
			if ( !(_la==Multiply || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(202);
				match(As);
				setState(203);
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
		enterRule(_localctx, 14, RULE_aliasName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(Identifier);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(207);
				match(As);
				setState(208);
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
		enterRule(_localctx, 16, RULE_exportStatement);
		int _la;
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new ExportDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(Export);
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Default) {
					{
					setState(212);
					match(Default);
					}
				}

				setState(217);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBrace:
					{
					setState(215);
					exportFromBlock();
					}
					break;
				case Var:
				case Function:
				case Class:
				case Const:
				case Let:
					{
					setState(216);
					declaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(219);
				eos();
				}
				break;
			case 2:
				_localctx = new ExportDefaultDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(Export);
				setState(222);
				match(Default);
				setState(223);
				singleExpression(0);
				setState(224);
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
		public TerminalNode From() { return getToken(JSParser.From, 0); }
		public TerminalNode StringLiteral() { return getToken(JSParser.StringLiteral, 0); }
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
		enterRule(_localctx, 18, RULE_exportFromBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			exportModuleItems();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==From) {
				{
				setState(229);
				match(From);
				setState(230);
				match(StringLiteral);
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
		enterRule(_localctx, 20, RULE_exportModuleItems);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(OpenBrace);
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(234);
					exportAliasName();
					setState(235);
					match(Comma);
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(242);
				exportAliasName();
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(243);
					match(Comma);
					}
				}

				}
			}

			setState(248);
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
		enterRule(_localctx, 22, RULE_exportAliasName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(Identifier);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(251);
				match(As);
				setState(252);
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
		enterRule(_localctx, 24, RULE_declaration);
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
			case Const:
			case Let:
				_localctx = new VariableDeclareContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				variableStatement();
				}
				break;
			case Class:
				_localctx = new ClassDeclareContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				classDeclaration();
				}
				break;
			case Function:
				_localctx = new FunctionDeclareContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
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
		enterRule(_localctx, 26, RULE_variableStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			variableDeclarationList();
			setState(261);
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
		enterRule(_localctx, 28, RULE_variableDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			varModifier();
			setState(264);
			variableDeclaration();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(265);
				match(Comma);
				setState(266);
				variableDeclaration();
				}
				}
				setState(271);
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
		enterRule(_localctx, 30, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			assignable();
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(273);
				match(Assign);
				setState(274);
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
		enterRule(_localctx, 32, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			expressionSequence();
			setState(278);
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
		enterRule(_localctx, 34, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(If);
			setState(281);
			match(OpenParen);
			setState(282);
			expressionSequence();
			setState(283);
			match(CloseParen);
			setState(284);
			statement();
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(285);
				match(Else);
				setState(286);
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
		enterRule(_localctx, 36, RULE_iterationStatement);
		int _la;
		try {
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new DoWhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(Do);
				setState(290);
				statement();
				setState(291);
				match(While);
				setState(292);
				match(OpenParen);
				setState(293);
				expressionSequence();
				setState(294);
				match(CloseParen);
				setState(295);
				eos();
				}
				break;
			case 2:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				match(While);
				setState(298);
				match(OpenParen);
				setState(299);
				expressionSequence();
				setState(300);
				match(CloseParen);
				setState(301);
				statement();
				}
				break;
			case 3:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(303);
				match(For);
				setState(304);
				match(OpenParen);
				setState(307);
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
					setState(305);
					expressionSequence();
					}
					break;
				case Var:
				case Const:
				case Let:
					{
					setState(306);
					variableDeclarationList();
					}
					break;
				case SemiColon:
					break;
				default:
					break;
				}
				setState(309);
				match(SemiColon);
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4601306628657119064L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 117057L) != 0)) {
					{
					setState(310);
					expressionSequence();
					}
				}

				setState(313);
				match(SemiColon);
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4601306628657119064L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 117057L) != 0)) {
					{
					setState(314);
					expressionSequence();
					}
				}

				setState(317);
				match(CloseParen);
				setState(318);
				statement();
				}
				break;
			case 4:
				_localctx = new ForInStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(319);
				match(For);
				setState(320);
				match(OpenParen);
				setState(323);
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
					setState(321);
					singleExpression(0);
					}
					break;
				case Var:
				case Const:
				case Let:
					{
					setState(322);
					variableDeclarationList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(325);
				match(In);
				setState(326);
				expressionSequence();
				setState(327);
				match(CloseParen);
				setState(328);
				statement();
				}
				break;
			case 5:
				_localctx = new ForOfStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(330);
				match(For);
				setState(331);
				match(OpenParen);
				setState(334);
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
					setState(332);
					singleExpression(0);
					}
					break;
				case Var:
				case Const:
				case Let:
					{
					setState(333);
					variableDeclarationList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(336);
				match(Of);
				setState(337);
				expressionSequence();
				setState(338);
				match(CloseParen);
				setState(339);
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
		enterRule(_localctx, 38, RULE_varModifier);
		try {
			setState(346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				_localctx = new VarKeywordContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				match(Var);
				}
				break;
			case Let:
				_localctx = new LetKeywordContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				match(Let);
				}
				break;
			case Const:
				_localctx = new ConstKeywordContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(345);
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
		enterRule(_localctx, 40, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(Continue);
			setState(349);
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
		enterRule(_localctx, 42, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(Break);
			setState(352);
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
		enterRule(_localctx, 44, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(Return);
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4601306628657119064L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 117057L) != 0)) {
				{
				setState(355);
				expressionSequence();
				}
			}

			setState(358);
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
		enterRule(_localctx, 46, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(Switch);
			setState(361);
			match(OpenParen);
			setState(362);
			expressionSequence();
			setState(363);
			match(CloseParen);
			setState(364);
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
		enterRule(_localctx, 48, RULE_caseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(OpenBrace);
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Case) {
				{
				setState(367);
				caseClauses();
				}
			}

			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Default) {
				{
				setState(370);
				defaultClause();
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Case) {
					{
					setState(371);
					caseClauses();
					}
				}

				}
			}

			setState(376);
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
		enterRule(_localctx, 50, RULE_caseClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(378);
				caseClause();
				}
				}
				setState(381); 
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
		enterRule(_localctx, 52, RULE_caseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(Case);
			setState(384);
			expressionSequence();
			setState(385);
			match(Colon);
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -114876974865972568L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 490791L) != 0)) {
				{
				setState(386);
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
		enterRule(_localctx, 54, RULE_defaultClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(Default);
			setState(390);
			match(Colon);
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -114876974865972568L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 490791L) != 0)) {
				{
				setState(391);
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
		enterRule(_localctx, 56, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(Throw);
			setState(395);
			expressionSequence();
			setState(396);
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
		enterRule(_localctx, 58, RULE_tryStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(Try);
			setState(399);
			block();
			setState(405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Catch:
				{
				setState(400);
				catchProduction();
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Finally) {
					{
					setState(401);
					finallyProduction();
					}
				}

				}
				break;
			case Finally:
				{
				setState(404);
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
		enterRule(_localctx, 60, RULE_catchProduction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(Catch);
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenParen) {
				{
				setState(408);
				match(OpenParen);
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OpenBracket || _la==OpenBrace || _la==Identifier) {
					{
					setState(409);
					assignable();
					}
				}

				setState(412);
				match(CloseParen);
				}
			}

			setState(415);
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
		enterRule(_localctx, 62, RULE_finallyProduction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(Finally);
			setState(418);
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
		enterRule(_localctx, 64, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(Function);
			setState(421);
			match(Identifier);
			setState(422);
			match(OpenParen);
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32904L) != 0) || _la==Identifier) {
				{
				setState(423);
				formalParameterList();
				}
			}

			setState(426);
			match(CloseParen);
			setState(427);
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
		enterRule(_localctx, 66, RULE_classDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(Class);
			setState(430);
			match(Identifier);
			setState(431);
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
		enterRule(_localctx, 68, RULE_classTail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(433);
				match(Extends);
				setState(434);
				singleExpression(0);
				}
			}

			setState(437);
			match(OpenBrace);
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140737488355848L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 7L) != 0)) {
				{
				{
				setState(438);
				classElement();
				}
				}
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(444);
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
		enterRule(_localctx, 70, RULE_classElement);
		int _la;
		try {
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				_localctx = new ClassMethodDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(446);
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
				setState(449);
				methodDefinition();
				}
				break;
			case 2:
				_localctx = new ClassFieldDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(450);
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
				setState(453);
				fieldDefinition();
				}
				break;
			case 3:
				_localctx = new ClassEmptyStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(454);
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
		enterRule(_localctx, 72, RULE_methodDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			propertyName();
			setState(458);
			match(OpenParen);
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32904L) != 0) || _la==Identifier) {
				{
				setState(459);
				formalParameterList();
				}
			}

			setState(462);
			match(CloseParen);
			setState(463);
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
		enterRule(_localctx, 74, RULE_fieldDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			propertyName();
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(466);
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
		enterRule(_localctx, 76, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(482);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBracket:
			case OpenBrace:
			case Identifier:
				_localctx = new NormalParametersContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				formalParameterArg();
				setState(474);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(470);
						match(Comma);
						setState(471);
						formalParameterArg();
						}
						} 
					}
					setState(476);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(477);
					match(Comma);
					setState(478);
					lastFormalParameterArg();
					}
				}

				}
				break;
			case Ellipsis:
				_localctx = new RestParametersContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
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
		enterRule(_localctx, 78, RULE_formalParameterArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			assignable();
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(485);
				match(Assign);
				setState(486);
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
		enterRule(_localctx, 80, RULE_lastFormalParameterArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(Ellipsis);
			setState(490);
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		enterRule(_localctx, 82, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(OpenBrace);
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -114876974865972568L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 490791L) != 0)) {
				{
				setState(494); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(493);
					statement();
					}
					}
					setState(496); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -114876974865972568L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 490791L) != 0) );
				}
			}

			setState(500);
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
		enterRule(_localctx, 84, RULE_arrayLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(502);
			match(OpenBracket);
			setState(503);
			elementList();
			setState(504);
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
		enterRule(_localctx, 86, RULE_elementList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(506);
					match(Comma);
					}
					} 
				}
				setState(511);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4601306628657086296L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 117057L) != 0)) {
				{
				setState(512);
				arrayElement();
				}
			}

			setState(523);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(516); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(515);
						match(Comma);
						}
						}
						setState(518); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Comma );
					setState(520);
					arrayElement();
					}
					} 
				}
				setState(525);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(526);
				match(Comma);
				}
				}
				setState(531);
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
		enterRule(_localctx, 88, RULE_arrayElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(532);
				match(Ellipsis);
				}
			}

			setState(535);
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
		enterRule(_localctx, 90, RULE_propertyAssignment);
		int _la;
		try {
			setState(559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				_localctx = new PropertyExpressionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(537);
				propertyName();
				setState(538);
				match(Colon);
				setState(539);
				singleExpression(0);
				}
				break;
			case 2:
				_localctx = new ComputedPropertyExpressionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(541);
				match(OpenBracket);
				setState(542);
				singleExpression(0);
				setState(543);
				match(CloseBracket);
				setState(544);
				match(Colon);
				setState(545);
				singleExpression(0);
				}
				break;
			case 3:
				_localctx = new FunctionPropertyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(547);
				propertyName();
				setState(548);
				match(OpenParen);
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32904L) != 0) || _la==Identifier) {
					{
					setState(549);
					formalParameterList();
					}
				}

				setState(552);
				match(CloseParen);
				setState(553);
				functionBody();
				}
				break;
			case 4:
				_localctx = new PropertyShorthandContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(555);
					match(Ellipsis);
					}
				}

				setState(558);
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
		enterRule(_localctx, 92, RULE_propertyName);
		try {
			setState(568);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				_localctx = new PropertyByNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(561);
				match(Identifier);
				}
				break;
			case StringLiteral:
				_localctx = new PropertyByStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(562);
				match(StringLiteral);
				}
				break;
			case DecimalLiteral:
				_localctx = new PropertyByNumberContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(563);
				match(DecimalLiteral);
				}
				break;
			case OpenBracket:
				_localctx = new PropertyByExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(564);
				match(OpenBracket);
				setState(565);
				singleExpression(0);
				setState(566);
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
		enterRule(_localctx, 94, RULE_arguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			match(OpenParen);
			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4601306628657086296L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 117057L) != 0)) {
				{
				setState(571);
				argument();
				setState(576);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(572);
						match(Comma);
						setState(573);
						argument();
						}
						} 
					}
					setState(578);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				}
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(579);
					match(Comma);
					}
				}

				}
			}

			setState(584);
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
		enterRule(_localctx, 96, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(586);
				match(Ellipsis);
				}
			}

			setState(591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(589);
				singleExpression(0);
				}
				break;
			case 2:
				{
				setState(590);
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
		enterRule(_localctx, 98, RULE_expressionSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			singleExpression(0);
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(594);
				match(Comma);
				setState(595);
				singleExpression(0);
				}
				}
				setState(600);
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
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_singleExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				_localctx = new FunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(602);
				anonymousFunction();
				}
				break;
			case 2:
				{
				_localctx = new ClassExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(603);
				match(Class);
				setState(605);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(604);
					match(Identifier);
					}
				}

				setState(607);
				classTail();
				}
				break;
			case 3:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(608);
				match(New);
				setState(609);
				match(Identifier);
				setState(610);
				arguments();
				}
				break;
			case 4:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(611);
				match(New);
				setState(612);
				singleExpression(0);
				setState(613);
				arguments();
				}
				break;
			case 5:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(615);
				match(New);
				setState(616);
				singleExpression(33);
				}
				break;
			case 6:
				{
				_localctx = new MetaExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(617);
				match(New);
				setState(618);
				match(Dot);
				setState(619);
				match(Identifier);
				}
				break;
			case 7:
				{
				_localctx = new DeleteExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(620);
				match(Delete);
				setState(621);
				singleExpression(28);
				}
				break;
			case 8:
				{
				_localctx = new TypeofExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(622);
				match(Typeof);
				setState(623);
				singleExpression(27);
				}
				break;
			case 9:
				{
				_localctx = new PreIncrementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(624);
				match(PlusPlus);
				setState(625);
				singleExpression(26);
				}
				break;
			case 10:
				{
				_localctx = new PreDecreaseExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(626);
				match(MinusMinus);
				setState(627);
				singleExpression(25);
				}
				break;
			case 11:
				{
				_localctx = new UnaryPlusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(628);
				match(Plus);
				setState(629);
				singleExpression(24);
				}
				break;
			case 12:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(630);
				match(Minus);
				setState(631);
				singleExpression(23);
				}
				break;
			case 13:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(632);
				match(Not);
				setState(633);
				singleExpression(22);
				}
				break;
			case 14:
				{
				_localctx = new ImportExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(634);
				match(Import);
				setState(635);
				match(OpenParen);
				setState(636);
				singleExpression(0);
				setState(637);
				match(CloseParen);
				}
				break;
			case 15:
				{
				_localctx = new ThisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(639);
				match(This);
				}
				break;
			case 16:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(640);
				match(Identifier);
				}
				break;
			case 17:
				{
				_localctx = new SuperExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(641);
				match(Super);
				}
				break;
			case 18:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(642);
				literal();
				}
				break;
			case 19:
				{
				_localctx = new ArrayLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(643);
				arrayLiteral();
				}
				break;
			case 20:
				{
				_localctx = new ObjectLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(644);
				objectLiteral();
				}
				break;
			case 21:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(645);
				match(OpenParen);
				setState(646);
				expressionSequence();
				setState(647);
				match(CloseParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(718);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(716);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
					case 1:
						{
						_localctx = new OptionalChainExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(651);
						if (!(precpred(_ctx, 38))) throw new FailedPredicateException(this, "precpred(_ctx, 38)");
						setState(652);
						match(QuestionMarkDot);
						setState(653);
						singleExpression(39);
						}
						break;
					case 2:
						{
						_localctx = new PowerExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(654);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(655);
						match(Power);
						setState(656);
						singleExpression(21);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(657);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(658);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(659);
						singleExpression(21);
						}
						break;
					case 4:
						{
						_localctx = new AdditiveExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(660);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(661);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(662);
						singleExpression(20);
						}
						break;
					case 5:
						{
						_localctx = new CoalesceExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(663);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(664);
						match(NullCoalesce);
						setState(665);
						singleExpression(19);
						}
						break;
					case 6:
						{
						_localctx = new RelationalExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(666);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(667);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2013265920L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(668);
						singleExpression(18);
						}
						break;
					case 7:
						{
						_localctx = new InExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(669);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(670);
						match(In);
						setState(671);
						singleExpression(17);
						}
						break;
					case 8:
						{
						_localctx = new EqualityExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(672);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(673);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32212254720L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(674);
						singleExpression(16);
						}
						break;
					case 9:
						{
						_localctx = new LogicalAndExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(675);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(676);
						match(And);
						setState(677);
						singleExpression(15);
						}
						break;
					case 10:
						{
						_localctx = new LogicalOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(678);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(679);
						match(Or);
						setState(680);
						singleExpression(14);
						}
						break;
					case 11:
						{
						_localctx = new TernaryExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(681);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(682);
						match(QuestionMark);
						setState(683);
						singleExpression(0);
						setState(684);
						match(Colon);
						setState(685);
						singleExpression(13);
						}
						break;
					case 12:
						{
						_localctx = new AssignmentExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(687);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(688);
						match(Assign);
						setState(689);
						singleExpression(11);
						}
						break;
					case 13:
						{
						_localctx = new AssignmentOperatorExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(690);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(691);
						assignmentOperator();
						setState(692);
						singleExpression(10);
						}
						break;
					case 14:
						{
						_localctx = new MemberIndexExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(694);
						if (!(precpred(_ctx, 37))) throw new FailedPredicateException(this, "precpred(_ctx, 37)");
						setState(696);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==QuestionMarkDot) {
							{
							setState(695);
							match(QuestionMarkDot);
							}
						}

						setState(698);
						match(OpenBracket);
						setState(699);
						expressionSequence();
						setState(700);
						match(CloseBracket);
						}
						break;
					case 15:
						{
						_localctx = new MemberDotExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(702);
						if (!(precpred(_ctx, 36))) throw new FailedPredicateException(this, "precpred(_ctx, 36)");
						setState(704);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==QuestionMark) {
							{
							setState(703);
							match(QuestionMark);
							}
						}

						setState(706);
						match(Dot);
						setState(707);
						match(Identifier);
						}
						break;
					case 16:
						{
						_localctx = new ArgumentsExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(708);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(709);
						arguments();
						}
						break;
					case 17:
						{
						_localctx = new PostIncrementExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(710);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(711);
						match(PlusPlus);
						}
						break;
					case 18:
						{
						_localctx = new PostDecreaseExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(712);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(713);
						match(MinusMinus);
						}
						break;
					case 19:
						{
						_localctx = new TemplateStringExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(714);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(715);
						templateStringLiteral();
						}
						break;
					}
					} 
				}
				setState(720);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
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
		enterRule(_localctx, 102, RULE_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			match(Assign);
			setState(722);
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
		enterRule(_localctx, 104, RULE_assignable);
		try {
			setState(727);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				_localctx = new VariableByNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(724);
				match(Identifier);
				}
				break;
			case OpenBracket:
				_localctx = new VariableByArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(725);
				arrayLiteral();
				}
				break;
			case OpenBrace:
				_localctx = new VariableByObjectContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(726);
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
		enterRule(_localctx, 106, RULE_objectLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			match(OpenBrace);
			setState(741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4601306628657086296L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 117057L) != 0)) {
				{
				setState(730);
				propertyAssignment();
				setState(735);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(731);
						match(Comma);
						setState(732);
						propertyAssignment();
						}
						} 
					}
					setState(737);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				}
				setState(739);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(738);
					match(Comma);
					}
				}

				}
			}

			setState(743);
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
		enterRule(_localctx, 108, RULE_anonymousFunction);
		int _la;
		try {
			setState(756);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function:
				_localctx = new AnonymousFunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(745);
				match(Function);
				setState(746);
				match(OpenParen);
				setState(748);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32904L) != 0) || _la==Identifier) {
					{
					setState(747);
					formalParameterList();
					}
				}

				setState(750);
				match(CloseParen);
				setState(751);
				functionBody();
				}
				break;
			case OpenParen:
			case Identifier:
				_localctx = new ArrowFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(752);
				arrowFunctionParameters();
				setState(753);
				match(ARROW);
				setState(754);
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
		enterRule(_localctx, 110, RULE_arrowFunctionParameters);
		int _la;
		try {
			setState(764);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				_localctx = new OneParameterContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(758);
				match(Identifier);
				}
				break;
			case OpenParen:
				_localctx = new ManyParametersContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(759);
				match(OpenParen);
				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32904L) != 0) || _la==Identifier) {
					{
					setState(760);
					formalParameterList();
					}
				}

				setState(763);
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
		enterRule(_localctx, 112, RULE_arrowFunctionBody);
		try {
			setState(768);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				_localctx = new OneExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(766);
				singleExpression(0);
				}
				break;
			case 2:
				_localctx = new ManyExpressionsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(767);
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
		enterRule(_localctx, 114, RULE_assignmentOperator);
		try {
			setState(777);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MultiplyAssign:
				_localctx = new MultiplyOperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(770);
				match(MultiplyAssign);
				}
				break;
			case DivideAssign:
				_localctx = new DivideOperatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(771);
				match(DivideAssign);
				}
				break;
			case ModulusAssign:
				_localctx = new ModulusOperatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(772);
				match(ModulusAssign);
				}
				break;
			case PlusAssign:
				_localctx = new PlusOperatorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(773);
				match(PlusAssign);
				}
				break;
			case MinusAssign:
				_localctx = new MinusOperatorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(774);
				match(MinusAssign);
				}
				break;
			case PowerAssign:
				_localctx = new PowerOperatorContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(775);
				match(PowerAssign);
				}
				break;
			case NullishCoalescingAssign:
				_localctx = new NullishOperatorContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(776);
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
		enterRule(_localctx, 116, RULE_literal);
		try {
			setState(784);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NullLiteral:
				_localctx = new NullContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(779);
				match(NullLiteral);
				}
				break;
			case BooleanLiteral:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(780);
				match(BooleanLiteral);
				}
				break;
			case StringLiteral:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(781);
				match(StringLiteral);
				}
				break;
			case BackTick:
				_localctx = new TemplateStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(782);
				templateStringLiteral();
				}
				break;
			case DecimalLiteral:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(783);
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
		enterRule(_localctx, 118, RULE_templateStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			match(BackTick);
			setState(790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TemplateStringStartExpression || _la==TemplateStringAtom) {
				{
				{
				setState(787);
				templateStringAtom();
				}
				}
				setState(792);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(793);
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
		enterRule(_localctx, 120, RULE_templateStringAtom);
		try {
			setState(800);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TemplateStringAtom:
				_localctx = new TemplateStringCharacterContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(795);
				match(TemplateStringAtom);
				}
				break;
			case TemplateStringStartExpression:
				_localctx = new TemplateStringJSExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(796);
				match(TemplateStringStartExpression);
				setState(797);
				singleExpression(0);
				setState(798);
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
		enterRule(_localctx, 122, RULE_eos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
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
		case 50:
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
		"\u0004\u0001X\u0325\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"<\u0007<\u0002=\u0007=\u0001\u0000\u0004\u0000~\b\u0000\u000b\u0000\f"+
		"\u0000\u007f\u0003\u0000\u0082\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0096\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u009a\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0004\u0003\u009f\b\u0003\u000b\u0003\f\u0003\u00a0\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u00aa\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u00b7\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005\u00bd\b\u0005\n\u0005\f\u0005\u00c0\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u00c4\b\u0005\u0003\u0005\u00c6\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00cd"+
		"\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00d2\b\u0007"+
		"\u0001\b\u0001\b\u0003\b\u00d6\b\b\u0001\b\u0001\b\u0003\b\u00da\b\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00e3\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u00e8\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u00ee\b\n\n\n\f\n\u00f1\t\n\u0001\n\u0001\n\u0003\n\u00f5\b\n\u0003"+
		"\n\u00f7\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u00fe\b\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u0103\b\f\u0001\r"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u010c\b\u000e\n\u000e\f\u000e\u010f\t\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u0114\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u0120\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0134\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u0138\b\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u013c\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u0144\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u014f\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u0156\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u015b\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u0165\b\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u0171\b\u0018"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u0175\b\u0018\u0003\u0018\u0177\b"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0004\u0019\u017c\b\u0019\u000b"+
		"\u0019\f\u0019\u017d\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u0184\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0189"+
		"\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0193\b\u001d\u0001\u001d\u0003"+
		"\u001d\u0196\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u019b"+
		"\b\u001e\u0001\u001e\u0003\u001e\u019e\b\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0003"+
		" \u01a9\b \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001\"\u0001"+
		"\"\u0003\"\u01b4\b\"\u0001\"\u0001\"\u0005\"\u01b8\b\"\n\"\f\"\u01bb\t"+
		"\"\u0001\"\u0001\"\u0001#\u0003#\u01c0\b#\u0001#\u0001#\u0003#\u01c4\b"+
		"#\u0001#\u0001#\u0003#\u01c8\b#\u0001$\u0001$\u0001$\u0003$\u01cd\b$\u0001"+
		"$\u0001$\u0001$\u0001%\u0001%\u0003%\u01d4\b%\u0001&\u0001&\u0001&\u0005"+
		"&\u01d9\b&\n&\f&\u01dc\t&\u0001&\u0001&\u0003&\u01e0\b&\u0001&\u0003&"+
		"\u01e3\b&\u0001\'\u0001\'\u0001\'\u0003\'\u01e8\b\'\u0001(\u0001(\u0001"+
		"(\u0001)\u0001)\u0004)\u01ef\b)\u000b)\f)\u01f0\u0003)\u01f3\b)\u0001"+
		")\u0001)\u0001*\u0001*\u0001*\u0001*\u0001+\u0005+\u01fc\b+\n+\f+\u01ff"+
		"\t+\u0001+\u0003+\u0202\b+\u0001+\u0004+\u0205\b+\u000b+\f+\u0206\u0001"+
		"+\u0005+\u020a\b+\n+\f+\u020d\t+\u0001+\u0005+\u0210\b+\n+\f+\u0213\t"+
		"+\u0001,\u0003,\u0216\b,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u0227"+
		"\b-\u0001-\u0001-\u0001-\u0001-\u0003-\u022d\b-\u0001-\u0003-\u0230\b"+
		"-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u0239\b.\u0001"+
		"/\u0001/\u0001/\u0001/\u0005/\u023f\b/\n/\f/\u0242\t/\u0001/\u0003/\u0245"+
		"\b/\u0003/\u0247\b/\u0001/\u0001/\u00010\u00030\u024c\b0\u00010\u0001"+
		"0\u00030\u0250\b0\u00011\u00011\u00011\u00051\u0255\b1\n1\f1\u0258\t1"+
		"\u00012\u00012\u00012\u00012\u00032\u025e\b2\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00032\u028a"+
		"\b2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00032\u02b9\b2\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00032\u02c1\b2\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00052\u02cd\b2\n2\f2\u02d0\t2\u0001"+
		"3\u00013\u00013\u00014\u00014\u00014\u00034\u02d8\b4\u00015\u00015\u0001"+
		"5\u00015\u00055\u02de\b5\n5\f5\u02e1\t5\u00015\u00035\u02e4\b5\u00035"+
		"\u02e6\b5\u00015\u00015\u00016\u00016\u00016\u00036\u02ed\b6\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00036\u02f5\b6\u00017\u00017\u00017\u0003"+
		"7\u02fa\b7\u00017\u00037\u02fd\b7\u00018\u00018\u00038\u0301\b8\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00019\u00039\u030a\b9\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0003:\u0311\b:\u0001;\u0001;\u0005;\u0315\b;\n"+
		";\f;\u0318\t;\u0001;\u0001;\u0001<\u0001<\u0001<\u0001<\u0001<\u0003<"+
		"\u0321\b<\u0001=\u0001=\u0001=\u0000\u0001d>\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz\u0000\u0007\u0002\u0000\u0016\u0016"+
		"QQ\u0001\u0000PQ\u0001\u0000\u0016\u0018\u0001\u0000\u0013\u0014\u0001"+
		"\u0000\u001b\u001e\u0001\u0000\u001f\"\u0001\u0001\t\t\u0388\u0000\u0081"+
		"\u0001\u0000\u0000\u0000\u0002\u0095\u0001\u0000\u0000\u0000\u0004\u0097"+
		"\u0001\u0000\u0000\u0000\u0006\u009e\u0001\u0000\u0000\u0000\b\u00b6\u0001"+
		"\u0000\u0000\u0000\n\u00b8\u0001\u0000\u0000\u0000\f\u00c9\u0001\u0000"+
		"\u0000\u0000\u000e\u00ce\u0001\u0000\u0000\u0000\u0010\u00e2\u0001\u0000"+
		"\u0000\u0000\u0012\u00e4\u0001\u0000\u0000\u0000\u0014\u00e9\u0001\u0000"+
		"\u0000\u0000\u0016\u00fa\u0001\u0000\u0000\u0000\u0018\u0102\u0001\u0000"+
		"\u0000\u0000\u001a\u0104\u0001\u0000\u0000\u0000\u001c\u0107\u0001\u0000"+
		"\u0000\u0000\u001e\u0110\u0001\u0000\u0000\u0000 \u0115\u0001\u0000\u0000"+
		"\u0000\"\u0118\u0001\u0000\u0000\u0000$\u0155\u0001\u0000\u0000\u0000"+
		"&\u015a\u0001\u0000\u0000\u0000(\u015c\u0001\u0000\u0000\u0000*\u015f"+
		"\u0001\u0000\u0000\u0000,\u0162\u0001\u0000\u0000\u0000.\u0168\u0001\u0000"+
		"\u0000\u00000\u016e\u0001\u0000\u0000\u00002\u017b\u0001\u0000\u0000\u0000"+
		"4\u017f\u0001\u0000\u0000\u00006\u0185\u0001\u0000\u0000\u00008\u018a"+
		"\u0001\u0000\u0000\u0000:\u018e\u0001\u0000\u0000\u0000<\u0197\u0001\u0000"+
		"\u0000\u0000>\u01a1\u0001\u0000\u0000\u0000@\u01a4\u0001\u0000\u0000\u0000"+
		"B\u01ad\u0001\u0000\u0000\u0000D\u01b3\u0001\u0000\u0000\u0000F\u01c7"+
		"\u0001\u0000\u0000\u0000H\u01c9\u0001\u0000\u0000\u0000J\u01d1\u0001\u0000"+
		"\u0000\u0000L\u01e2\u0001\u0000\u0000\u0000N\u01e4\u0001\u0000\u0000\u0000"+
		"P\u01e9\u0001\u0000\u0000\u0000R\u01ec\u0001\u0000\u0000\u0000T\u01f6"+
		"\u0001\u0000\u0000\u0000V\u01fd\u0001\u0000\u0000\u0000X\u0215\u0001\u0000"+
		"\u0000\u0000Z\u022f\u0001\u0000\u0000\u0000\\\u0238\u0001\u0000\u0000"+
		"\u0000^\u023a\u0001\u0000\u0000\u0000`\u024b\u0001\u0000\u0000\u0000b"+
		"\u0251\u0001\u0000\u0000\u0000d\u0289\u0001\u0000\u0000\u0000f\u02d1\u0001"+
		"\u0000\u0000\u0000h\u02d7\u0001\u0000\u0000\u0000j\u02d9\u0001\u0000\u0000"+
		"\u0000l\u02f4\u0001\u0000\u0000\u0000n\u02fc\u0001\u0000\u0000\u0000p"+
		"\u0300\u0001\u0000\u0000\u0000r\u0309\u0001\u0000\u0000\u0000t\u0310\u0001"+
		"\u0000\u0000\u0000v\u0312\u0001\u0000\u0000\u0000x\u0320\u0001\u0000\u0000"+
		"\u0000z\u0322\u0001\u0000\u0000\u0000|~\u0003\u0002\u0001\u0000}|\u0001"+
		"\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0082\u0001\u0000\u0000"+
		"\u0000\u0081}\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u0000\u0000\u0001"+
		"\u0084\u0001\u0001\u0000\u0000\u0000\u0085\u0096\u0003\u0004\u0002\u0000"+
		"\u0086\u0096\u0003\u001a\r\u0000\u0087\u0096\u0003\b\u0004\u0000\u0088"+
		"\u0096\u0003\u0010\b\u0000\u0089\u0096\u0005\t\u0000\u0000\u008a\u0096"+
		"\u0003B!\u0000\u008b\u0096\u0003@ \u0000\u008c\u0096\u0003 \u0010\u0000"+
		"\u008d\u0096\u0003\"\u0011\u0000\u008e\u0096\u0003$\u0012\u0000\u008f"+
		"\u0096\u0003(\u0014\u0000\u0090\u0096\u0003*\u0015\u0000\u0091\u0096\u0003"+
		",\u0016\u0000\u0092\u0096\u0003.\u0017\u0000\u0093\u0096\u00038\u001c"+
		"\u0000\u0094\u0096\u0003:\u001d\u0000\u0095\u0085\u0001\u0000\u0000\u0000"+
		"\u0095\u0086\u0001\u0000\u0000\u0000\u0095\u0087\u0001\u0000\u0000\u0000"+
		"\u0095\u0088\u0001\u0000\u0000\u0000\u0095\u0089\u0001\u0000\u0000\u0000"+
		"\u0095\u008a\u0001\u0000\u0000\u0000\u0095\u008b\u0001\u0000\u0000\u0000"+
		"\u0095\u008c\u0001\u0000\u0000\u0000\u0095\u008d\u0001\u0000\u0000\u0000"+
		"\u0095\u008e\u0001\u0000\u0000\u0000\u0095\u008f\u0001\u0000\u0000\u0000"+
		"\u0095\u0090\u0001\u0000\u0000\u0000\u0095\u0091\u0001\u0000\u0000\u0000"+
		"\u0095\u0092\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000"+
		"\u0095\u0094\u0001\u0000\u0000\u0000\u0096\u0003\u0001\u0000\u0000\u0000"+
		"\u0097\u0099\u0005\u0007\u0000\u0000\u0098\u009a\u0003\u0006\u0003\u0000"+
		"\u0099\u0098\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009c\u0005\b\u0000\u0000\u009c"+
		"\u0005\u0001\u0000\u0000\u0000\u009d\u009f\u0003\u0002\u0001\u0000\u009e"+
		"\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0"+
		"\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1"+
		"\u0007\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005N\u0000\u0000\u00a3\u00a4"+
		"\u0005R\u0000\u0000\u00a4\u00b7\u0003z=\u0000\u00a5\u00a9\u0005N\u0000"+
		"\u0000\u00a6\u00a7\u0003\f\u0006\u0000\u00a7\u00a8\u0005\n\u0000\u0000"+
		"\u00a8\u00aa\u0001\u0000\u0000\u0000\u00a9\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ac\u0003\n\u0005\u0000\u00ac\u00ad\u0005H\u0000\u0000\u00ad"+
		"\u00ae\u0005R\u0000\u0000\u00ae\u00af\u0003z=\u0000\u00af\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0005N\u0000\u0000\u00b1\u00b2\u0003\f"+
		"\u0006\u0000\u00b2\u00b3\u0005H\u0000\u0000\u00b3\u00b4\u0005R\u0000\u0000"+
		"\u00b4\u00b5\u0003z=\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6\u00a2"+
		"\u0001\u0000\u0000\u0000\u00b6\u00a5\u0001\u0000\u0000\u0000\u00b6\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b7\t\u0001\u0000\u0000\u0000\u00b8\u00be\u0005"+
		"\u0007\u0000\u0000\u00b9\u00ba\u0003\u000e\u0007\u0000\u00ba\u00bb\u0005"+
		"\n\u0000\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc\u00b9\u0001\u0000"+
		"\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00c3\u0003\u000e"+
		"\u0007\u0000\u00c2\u00c4\u0005\n\u0000\u0000\u00c3\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c1\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\b\u0000\u0000"+
		"\u00c8\u000b\u0001\u0000\u0000\u0000\u00c9\u00cc\u0007\u0000\u0000\u0000"+
		"\u00ca\u00cb\u0005G\u0000\u0000\u00cb\u00cd\u0005Q\u0000\u0000\u00cc\u00ca"+
		"\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\r\u0001"+
		"\u0000\u0000\u0000\u00ce\u00d1\u0005Q\u0000\u0000\u00cf\u00d0\u0005G\u0000"+
		"\u0000\u00d0\u00d2\u0005Q\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u000f\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d5\u0005M\u0000\u0000\u00d4\u00d6\u0005@\u0000\u0000\u00d5\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d9"+
		"\u0001\u0000\u0000\u0000\u00d7\u00da\u0003\u0012\t\u0000\u00d8\u00da\u0003"+
		"\u0018\f\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00d8\u0001\u0000"+
		"\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dc\u0003z=\u0000"+
		"\u00dc\u00e3\u0001\u0000\u0000\u0000\u00dd\u00de\u0005M\u0000\u0000\u00de"+
		"\u00df\u0005@\u0000\u0000\u00df\u00e0\u0003d2\u0000\u00e0\u00e1\u0003"+
		"z=\u0000\u00e1\u00e3\u0001\u0000\u0000\u0000\u00e2\u00d3\u0001\u0000\u0000"+
		"\u0000\u00e2\u00dd\u0001\u0000\u0000\u0000\u00e3\u0011\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e7\u0003\u0014\n\u0000\u00e5\u00e6\u0005H\u0000\u0000"+
		"\u00e6\u00e8\u0005R\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e8\u0001\u0000\u0000\u0000\u00e8\u0013\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ef\u0005\u0007\u0000\u0000\u00ea\u00eb\u0003\u0016\u000b\u0000\u00eb"+
		"\u00ec\u0005\n\u0000\u0000\u00ec\u00ee\u0001\u0000\u0000\u0000\u00ed\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef\u00ed"+
		"\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f2\u00f4"+
		"\u0003\u0016\u000b\u0000\u00f3\u00f5\u0005\n\u0000\u0000\u00f4\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f2\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005"+
		"\b\u0000\u0000\u00f9\u0015\u0001\u0000\u0000\u0000\u00fa\u00fd\u0005Q"+
		"\u0000\u0000\u00fb\u00fc\u0005G\u0000\u0000\u00fc\u00fe\u0005Q\u0000\u0000"+
		"\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000"+
		"\u00fe\u0017\u0001\u0000\u0000\u0000\u00ff\u0103\u0003\u001a\r\u0000\u0100"+
		"\u0103\u0003B!\u0000\u0101\u0103\u0003@ \u0000\u0102\u00ff\u0001\u0000"+
		"\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0101\u0001\u0000"+
		"\u0000\u0000\u0103\u0019\u0001\u0000\u0000\u0000\u0104\u0105\u0003\u001c"+
		"\u000e\u0000\u0105\u0106\u0003z=\u0000\u0106\u001b\u0001\u0000\u0000\u0000"+
		"\u0107\u0108\u0003&\u0013\u0000\u0108\u010d\u0003\u001e\u000f\u0000\u0109"+
		"\u010a\u0005\n\u0000\u0000\u010a\u010c\u0003\u001e\u000f\u0000\u010b\u0109"+
		"\u0001\u0000\u0000\u0000\u010c\u010f\u0001\u0000\u0000\u0000\u010d\u010b"+
		"\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u001d"+
		"\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u0110\u0113"+
		"\u0003h4\u0000\u0111\u0112\u0005\u000b\u0000\u0000\u0112\u0114\u0003d"+
		"2\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000"+
		"\u0000\u0114\u001f\u0001\u0000\u0000\u0000\u0115\u0116\u0003b1\u0000\u0116"+
		"\u0117\u0003z=\u0000\u0117!\u0001\u0000\u0000\u0000\u0118\u0119\u0005"+
		"A\u0000\u0000\u0119\u011a\u0005\u0005\u0000\u0000\u011a\u011b\u0003b1"+
		"\u0000\u011b\u011c\u0005\u0006\u0000\u0000\u011c\u011f\u0003\u0002\u0001"+
		"\u0000\u011d\u011e\u00054\u0000\u0000\u011e\u0120\u0003\u0002\u0001\u0000"+
		"\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000"+
		"\u0120#\u0001\u0000\u0000\u0000\u0121\u0122\u00051\u0000\u0000\u0122\u0123"+
		"\u0003\u0002\u0001\u0000\u0123\u0124\u0005=\u0000\u0000\u0124\u0125\u0005"+
		"\u0005\u0000\u0000\u0125\u0126\u0003b1\u0000\u0126\u0127\u0005\u0006\u0000"+
		"\u0000\u0127\u0128\u0003z=\u0000\u0128\u0156\u0001\u0000\u0000\u0000\u0129"+
		"\u012a\u0005=\u0000\u0000\u012a\u012b\u0005\u0005\u0000\u0000\u012b\u012c"+
		"\u0003b1\u0000\u012c\u012d\u0005\u0006\u0000\u0000\u012d\u012e\u0003\u0002"+
		"\u0001\u0000\u012e\u0156\u0001\u0000\u0000\u0000\u012f\u0130\u0005;\u0000"+
		"\u0000\u0130\u0133\u0005\u0005\u0000\u0000\u0131\u0134\u0003b1\u0000\u0132"+
		"\u0134\u0003\u001c\u000e\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0133"+
		"\u0132\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134"+
		"\u0135\u0001\u0000\u0000\u0000\u0135\u0137\u0005\t\u0000\u0000\u0136\u0138"+
		"\u0003b1\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000"+
		"\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u013b\u0005\t\u0000"+
		"\u0000\u013a\u013c\u0003b1\u0000\u013b\u013a\u0001\u0000\u0000\u0000\u013b"+
		"\u013c\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d"+
		"\u013e\u0005\u0006\u0000\u0000\u013e\u0156\u0003\u0002\u0001\u0000\u013f"+
		"\u0140\u0005;\u0000\u0000\u0140\u0143\u0005\u0005\u0000\u0000\u0141\u0144"+
		"\u0003d2\u0000\u0142\u0144\u0003\u001c\u000e\u0000\u0143\u0141\u0001\u0000"+
		"\u0000\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000"+
		"\u0000\u0000\u0145\u0146\u0005D\u0000\u0000\u0146\u0147\u0003b1\u0000"+
		"\u0147\u0148\u0005\u0006\u0000\u0000\u0148\u0149\u0003\u0002\u0001\u0000"+
		"\u0149\u0156\u0001\u0000\u0000\u0000\u014a\u014b\u0005;\u0000\u0000\u014b"+
		"\u014e\u0005\u0005\u0000\u0000\u014c\u014f\u0003d2\u0000\u014d\u014f\u0003"+
		"\u001c\u000e\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014e\u014d\u0001"+
		"\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u0151\u0005"+
		"E\u0000\u0000\u0151\u0152\u0003b1\u0000\u0152\u0153\u0005\u0006\u0000"+
		"\u0000\u0153\u0154\u0003\u0002\u0001\u0000\u0154\u0156\u0001\u0000\u0000"+
		"\u0000\u0155\u0121\u0001\u0000\u0000\u0000\u0155\u0129\u0001\u0000\u0000"+
		"\u0000\u0155\u012f\u0001\u0000\u0000\u0000\u0155\u013f\u0001\u0000\u0000"+
		"\u0000\u0155\u014a\u0001\u0000\u0000\u0000\u0156%\u0001\u0000\u0000\u0000"+
		"\u0157\u015b\u00056\u0000\u0000\u0158\u015b\u0005O\u0000\u0000\u0159\u015b"+
		"\u0005L\u0000\u0000\u015a\u0157\u0001\u0000\u0000\u0000\u015a\u0158\u0001"+
		"\u0000\u0000\u0000\u015a\u0159\u0001\u0000\u0000\u0000\u015b\'\u0001\u0000"+
		"\u0000\u0000\u015c\u015d\u0005:\u0000\u0000\u015d\u015e\u0003z=\u0000"+
		"\u015e)\u0001\u0000\u0000\u0000\u015f\u0160\u00050\u0000\u0000\u0160\u0161"+
		"\u0003z=\u0000\u0161+\u0001\u0000\u0000\u0000\u0162\u0164\u00059\u0000"+
		"\u0000\u0163\u0165\u0003b1\u0000\u0164\u0163\u0001\u0000\u0000\u0000\u0164"+
		"\u0165\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166"+
		"\u0167\u0003z=\u0000\u0167-\u0001\u0000\u0000\u0000\u0168\u0169\u0005"+
		"<\u0000\u0000\u0169\u016a\u0005\u0005\u0000\u0000\u016a\u016b\u0003b1"+
		"\u0000\u016b\u016c\u0005\u0006\u0000\u0000\u016c\u016d\u00030\u0018\u0000"+
		"\u016d/\u0001\u0000\u0000\u0000\u016e\u0170\u0005\u0007\u0000\u0000\u016f"+
		"\u0171\u00032\u0019\u0000\u0170\u016f\u0001\u0000\u0000\u0000\u0170\u0171"+
		"\u0001\u0000\u0000\u0000\u0171\u0176\u0001\u0000\u0000\u0000\u0172\u0174"+
		"\u00036\u001b\u0000\u0173\u0175\u00032\u0019\u0000\u0174\u0173\u0001\u0000"+
		"\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u0177\u0001\u0000"+
		"\u0000\u0000\u0176\u0172\u0001\u0000\u0000\u0000\u0176\u0177\u0001\u0000"+
		"\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000\u0178\u0179\u0005\b\u0000"+
		"\u0000\u01791\u0001\u0000\u0000\u0000\u017a\u017c\u00034\u001a\u0000\u017b"+
		"\u017a\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d"+
		"\u017b\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e"+
		"3\u0001\u0000\u0000\u0000\u017f\u0180\u00053\u0000\u0000\u0180\u0181\u0003"+
		"b1\u0000\u0181\u0183\u0005\u000e\u0000\u0000\u0182\u0184\u0003\u0006\u0003"+
		"\u0000\u0183\u0182\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000"+
		"\u0000\u01845\u0001\u0000\u0000\u0000\u0185\u0186\u0005@\u0000\u0000\u0186"+
		"\u0188\u0005\u000e\u0000\u0000\u0187\u0189\u0003\u0006\u0003\u0000\u0188"+
		"\u0187\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189"+
		"7\u0001\u0000\u0000\u0000\u018a\u018b\u0005B\u0000\u0000\u018b\u018c\u0003"+
		"b1\u0000\u018c\u018d\u0003z=\u0000\u018d9\u0001\u0000\u0000\u0000\u018e"+
		"\u018f\u0005F\u0000\u0000\u018f\u0195\u0003\u0004\u0002\u0000\u0190\u0192"+
		"\u0003<\u001e\u0000\u0191\u0193\u0003>\u001f\u0000\u0192\u0191\u0001\u0000"+
		"\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193\u0196\u0001\u0000"+
		"\u0000\u0000\u0194\u0196\u0003>\u001f\u0000\u0195\u0190\u0001\u0000\u0000"+
		"\u0000\u0195\u0194\u0001\u0000\u0000\u0000\u0196;\u0001\u0000\u0000\u0000"+
		"\u0197\u019d\u00057\u0000\u0000\u0198\u019a\u0005\u0005\u0000\u0000\u0199"+
		"\u019b\u0003h4\u0000\u019a\u0199\u0001\u0000\u0000\u0000\u019a\u019b\u0001"+
		"\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c\u019e\u0005"+
		"\u0006\u0000\u0000\u019d\u0198\u0001\u0000\u0000\u0000\u019d\u019e\u0001"+
		"\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a0\u0003"+
		"\u0004\u0002\u0000\u01a0=\u0001\u0000\u0000\u0000\u01a1\u01a2\u00058\u0000"+
		"\u0000\u01a2\u01a3\u0003\u0004\u0002\u0000\u01a3?\u0001\u0000\u0000\u0000"+
		"\u01a4\u01a5\u0005>\u0000\u0000\u01a5\u01a6\u0005Q\u0000\u0000\u01a6\u01a8"+
		"\u0005\u0005\u0000\u0000\u01a7\u01a9\u0003L&\u0000\u01a8\u01a7\u0001\u0000"+
		"\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000"+
		"\u0000\u0000\u01aa\u01ab\u0005\u0006\u0000\u0000\u01ab\u01ac\u0003R)\u0000"+
		"\u01acA\u0001\u0000\u0000\u0000\u01ad\u01ae\u0005I\u0000\u0000\u01ae\u01af"+
		"\u0005Q\u0000\u0000\u01af\u01b0\u0003D\"\u0000\u01b0C\u0001\u0000\u0000"+
		"\u0000\u01b1\u01b2\u0005J\u0000\u0000\u01b2\u01b4\u0003d2\u0000\u01b3"+
		"\u01b1\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000\u01b4"+
		"\u01b5\u0001\u0000\u0000\u0000\u01b5\u01b9\u0005\u0007\u0000\u0000\u01b6"+
		"\u01b8\u0003F#\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000\u01b8\u01bb\u0001"+
		"\u0000\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001"+
		"\u0000\u0000\u0000\u01ba\u01bc\u0001\u0000\u0000\u0000\u01bb\u01b9\u0001"+
		"\u0000\u0000\u0000\u01bc\u01bd\u0005\b\u0000\u0000\u01bdE\u0001\u0000"+
		"\u0000\u0000\u01be\u01c0\u0007\u0001\u0000\u0000\u01bf\u01be\u0001\u0000"+
		"\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000"+
		"\u0000\u0000\u01c1\u01c8\u0003H$\u0000\u01c2\u01c4\u0007\u0001\u0000\u0000"+
		"\u01c3\u01c2\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000"+
		"\u01c4\u01c5\u0001\u0000\u0000\u0000\u01c5\u01c8\u0003J%\u0000\u01c6\u01c8"+
		"\u0005\t\u0000\u0000\u01c7\u01bf\u0001\u0000\u0000\u0000\u01c7\u01c3\u0001"+
		"\u0000\u0000\u0000\u01c7\u01c6\u0001\u0000\u0000\u0000\u01c8G\u0001\u0000"+
		"\u0000\u0000\u01c9\u01ca\u0003\\.\u0000\u01ca\u01cc\u0005\u0005\u0000"+
		"\u0000\u01cb\u01cd\u0003L&\u0000\u01cc\u01cb\u0001\u0000\u0000\u0000\u01cc"+
		"\u01cd\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce"+
		"\u01cf\u0005\u0006\u0000\u0000\u01cf\u01d0\u0003R)\u0000\u01d0I\u0001"+
		"\u0000\u0000\u0000\u01d1\u01d3\u0003\\.\u0000\u01d2\u01d4\u0003f3\u0000"+
		"\u01d3\u01d2\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000"+
		"\u01d4K\u0001\u0000\u0000\u0000\u01d5\u01da\u0003N\'\u0000\u01d6\u01d7"+
		"\u0005\n\u0000\u0000\u01d7\u01d9\u0003N\'\u0000\u01d8\u01d6\u0001\u0000"+
		"\u0000\u0000\u01d9\u01dc\u0001\u0000\u0000\u0000\u01da\u01d8\u0001\u0000"+
		"\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01db\u01df\u0001\u0000"+
		"\u0000\u0000\u01dc\u01da\u0001\u0000\u0000\u0000\u01dd\u01de\u0005\n\u0000"+
		"\u0000\u01de\u01e0\u0003P(\u0000\u01df\u01dd\u0001\u0000\u0000\u0000\u01df"+
		"\u01e0\u0001\u0000\u0000\u0000\u01e0\u01e3\u0001\u0000\u0000\u0000\u01e1"+
		"\u01e3\u0003P(\u0000\u01e2\u01d5\u0001\u0000\u0000\u0000\u01e2\u01e1\u0001"+
		"\u0000\u0000\u0000\u01e3M\u0001\u0000\u0000\u0000\u01e4\u01e7\u0003h4"+
		"\u0000\u01e5\u01e6\u0005\u000b\u0000\u0000\u01e6\u01e8\u0003d2\u0000\u01e7"+
		"\u01e5\u0001\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8"+
		"O\u0001\u0000\u0000\u0000\u01e9\u01ea\u0005\u000f\u0000\u0000\u01ea\u01eb"+
		"\u0003d2\u0000\u01ebQ\u0001\u0000\u0000\u0000\u01ec\u01f2\u0005\u0007"+
		"\u0000\u0000\u01ed\u01ef\u0003\u0002\u0001\u0000\u01ee\u01ed\u0001\u0000"+
		"\u0000\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0\u01ee\u0001\u0000"+
		"\u0000\u0000\u01f0\u01f1\u0001\u0000\u0000\u0000\u01f1\u01f3\u0001\u0000"+
		"\u0000\u0000\u01f2\u01ee\u0001\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000"+
		"\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f5\u0005\b\u0000"+
		"\u0000\u01f5S\u0001\u0000\u0000\u0000\u01f6\u01f7\u0005\u0003\u0000\u0000"+
		"\u01f7\u01f8\u0003V+\u0000\u01f8\u01f9\u0005\u0004\u0000\u0000\u01f9U"+
		"\u0001\u0000\u0000\u0000\u01fa\u01fc\u0005\n\u0000\u0000\u01fb\u01fa\u0001"+
		"\u0000\u0000\u0000\u01fc\u01ff\u0001\u0000\u0000\u0000\u01fd\u01fb\u0001"+
		"\u0000\u0000\u0000\u01fd\u01fe\u0001\u0000\u0000\u0000\u01fe\u0201\u0001"+
		"\u0000\u0000\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000\u0200\u0202\u0003"+
		"X,\u0000\u0201\u0200\u0001\u0000\u0000\u0000\u0201\u0202\u0001\u0000\u0000"+
		"\u0000\u0202\u020b\u0001\u0000\u0000\u0000\u0203\u0205\u0005\n\u0000\u0000"+
		"\u0204\u0203\u0001\u0000\u0000\u0000\u0205\u0206\u0001\u0000\u0000\u0000"+
		"\u0206\u0204\u0001\u0000\u0000\u0000\u0206\u0207\u0001\u0000\u0000\u0000"+
		"\u0207\u0208\u0001\u0000\u0000\u0000\u0208\u020a\u0003X,\u0000\u0209\u0204"+
		"\u0001\u0000\u0000\u0000\u020a\u020d\u0001\u0000\u0000\u0000\u020b\u0209"+
		"\u0001\u0000\u0000\u0000\u020b\u020c\u0001\u0000\u0000\u0000\u020c\u0211"+
		"\u0001\u0000\u0000\u0000\u020d\u020b\u0001\u0000\u0000\u0000\u020e\u0210"+
		"\u0005\n\u0000\u0000\u020f\u020e\u0001\u0000\u0000\u0000\u0210\u0213\u0001"+
		"\u0000\u0000\u0000\u0211\u020f\u0001\u0000\u0000\u0000\u0211\u0212\u0001"+
		"\u0000\u0000\u0000\u0212W\u0001\u0000\u0000\u0000\u0213\u0211\u0001\u0000"+
		"\u0000\u0000\u0214\u0216\u0005\u000f\u0000\u0000\u0215\u0214\u0001\u0000"+
		"\u0000\u0000\u0215\u0216\u0001\u0000\u0000\u0000\u0216\u0217\u0001\u0000"+
		"\u0000\u0000\u0217\u0218\u0003d2\u0000\u0218Y\u0001\u0000\u0000\u0000"+
		"\u0219\u021a\u0003\\.\u0000\u021a\u021b\u0005\u000e\u0000\u0000\u021b"+
		"\u021c\u0003d2\u0000\u021c\u0230\u0001\u0000\u0000\u0000\u021d\u021e\u0005"+
		"\u0003\u0000\u0000\u021e\u021f\u0003d2\u0000\u021f\u0220\u0005\u0004\u0000"+
		"\u0000\u0220\u0221\u0005\u000e\u0000\u0000\u0221\u0222\u0003d2\u0000\u0222"+
		"\u0230\u0001\u0000\u0000\u0000\u0223\u0224\u0003\\.\u0000\u0224\u0226"+
		"\u0005\u0005\u0000\u0000\u0225\u0227\u0003L&\u0000\u0226\u0225\u0001\u0000"+
		"\u0000\u0000\u0226\u0227\u0001\u0000\u0000\u0000\u0227\u0228\u0001\u0000"+
		"\u0000\u0000\u0228\u0229\u0005\u0006\u0000\u0000\u0229\u022a\u0003R)\u0000"+
		"\u022a\u0230\u0001\u0000\u0000\u0000\u022b\u022d\u0005\u000f\u0000\u0000"+
		"\u022c\u022b\u0001\u0000\u0000\u0000\u022c\u022d\u0001\u0000\u0000\u0000"+
		"\u022d\u022e\u0001\u0000\u0000\u0000\u022e\u0230\u0003d2\u0000\u022f\u0219"+
		"\u0001\u0000\u0000\u0000\u022f\u021d\u0001\u0000\u0000\u0000\u022f\u0223"+
		"\u0001\u0000\u0000\u0000\u022f\u022c\u0001\u0000\u0000\u0000\u0230[\u0001"+
		"\u0000\u0000\u0000\u0231\u0239\u0005Q\u0000\u0000\u0232\u0239\u0005R\u0000"+
		"\u0000\u0233\u0239\u0005/\u0000\u0000\u0234\u0235\u0005\u0003\u0000\u0000"+
		"\u0235\u0236\u0003d2\u0000\u0236\u0237\u0005\u0004\u0000\u0000\u0237\u0239"+
		"\u0001\u0000\u0000\u0000\u0238\u0231\u0001\u0000\u0000\u0000\u0238\u0232"+
		"\u0001\u0000\u0000\u0000\u0238\u0233\u0001\u0000\u0000\u0000\u0238\u0234"+
		"\u0001\u0000\u0000\u0000\u0239]\u0001\u0000\u0000\u0000\u023a\u0246\u0005"+
		"\u0005\u0000\u0000\u023b\u0240\u0003`0\u0000\u023c\u023d\u0005\n\u0000"+
		"\u0000\u023d\u023f\u0003`0\u0000\u023e\u023c\u0001\u0000\u0000\u0000\u023f"+
		"\u0242\u0001\u0000\u0000\u0000\u0240\u023e\u0001\u0000\u0000\u0000\u0240"+
		"\u0241\u0001\u0000\u0000\u0000\u0241\u0244\u0001\u0000\u0000\u0000\u0242"+
		"\u0240\u0001\u0000\u0000\u0000\u0243\u0245\u0005\n\u0000\u0000\u0244\u0243"+
		"\u0001\u0000\u0000\u0000\u0244\u0245\u0001\u0000\u0000\u0000\u0245\u0247"+
		"\u0001\u0000\u0000\u0000\u0246\u023b\u0001\u0000\u0000\u0000\u0246\u0247"+
		"\u0001\u0000\u0000\u0000\u0247\u0248\u0001\u0000\u0000\u0000\u0248\u0249"+
		"\u0005\u0006\u0000\u0000\u0249_\u0001\u0000\u0000\u0000\u024a\u024c\u0005"+
		"\u000f\u0000\u0000\u024b\u024a\u0001\u0000\u0000\u0000\u024b\u024c\u0001"+
		"\u0000\u0000\u0000\u024c\u024f\u0001\u0000\u0000\u0000\u024d\u0250\u0003"+
		"d2\u0000\u024e\u0250\u0005Q\u0000\u0000\u024f\u024d\u0001\u0000\u0000"+
		"\u0000\u024f\u024e\u0001\u0000\u0000\u0000\u0250a\u0001\u0000\u0000\u0000"+
		"\u0251\u0256\u0003d2\u0000\u0252\u0253\u0005\n\u0000\u0000\u0253\u0255"+
		"\u0003d2\u0000\u0254\u0252\u0001\u0000\u0000\u0000\u0255\u0258\u0001\u0000"+
		"\u0000\u0000\u0256\u0254\u0001\u0000\u0000\u0000\u0256\u0257\u0001\u0000"+
		"\u0000\u0000\u0257c\u0001\u0000\u0000\u0000\u0258\u0256\u0001\u0000\u0000"+
		"\u0000\u0259\u025a\u00062\uffff\uffff\u0000\u025a\u028a\u0003l6\u0000"+
		"\u025b\u025d\u0005I\u0000\u0000\u025c\u025e\u0005Q\u0000\u0000\u025d\u025c"+
		"\u0001\u0000\u0000\u0000\u025d\u025e\u0001\u0000\u0000\u0000\u025e\u025f"+
		"\u0001\u0000\u0000\u0000\u025f\u028a\u0003D\"\u0000\u0260\u0261\u0005"+
		"5\u0000\u0000\u0261\u0262\u0005Q\u0000\u0000\u0262\u028a\u0003^/\u0000"+
		"\u0263\u0264\u00055\u0000\u0000\u0264\u0265\u0003d2\u0000\u0265\u0266"+
		"\u0003^/\u0000\u0266\u028a\u0001\u0000\u0000\u0000\u0267\u0268\u00055"+
		"\u0000\u0000\u0268\u028a\u0003d2!\u0269\u026a\u00055\u0000\u0000\u026a"+
		"\u026b\u0005\u0010\u0000\u0000\u026b\u028a\u0005Q\u0000\u0000\u026c\u026d"+
		"\u0005C\u0000\u0000\u026d\u028a\u0003d2\u001c\u026e\u026f\u00052\u0000"+
		"\u0000\u026f\u028a\u0003d2\u001b\u0270\u0271\u0005\u0011\u0000\u0000\u0271"+
		"\u028a\u0003d2\u001a\u0272\u0273\u0005\u0012\u0000\u0000\u0273\u028a\u0003"+
		"d2\u0019\u0274\u0275\u0005\u0013\u0000\u0000\u0275\u028a\u0003d2\u0018"+
		"\u0276\u0277\u0005\u0014\u0000\u0000\u0277\u028a\u0003d2\u0017\u0278\u0279"+
		"\u0005\u0015\u0000\u0000\u0279\u028a\u0003d2\u0016\u027a\u027b\u0005N"+
		"\u0000\u0000\u027b\u027c\u0005\u0005\u0000\u0000\u027c\u027d\u0003d2\u0000"+
		"\u027d\u027e\u0005\u0006\u0000\u0000\u027e\u028a\u0001\u0000\u0000\u0000"+
		"\u027f\u028a\u0005?\u0000\u0000\u0280\u028a\u0005Q\u0000\u0000\u0281\u028a"+
		"\u0005K\u0000\u0000\u0282\u028a\u0003t:\u0000\u0283\u028a\u0003T*\u0000"+
		"\u0284\u028a\u0003j5\u0000\u0285\u0286\u0005\u0005\u0000\u0000\u0286\u0287"+
		"\u0003b1\u0000\u0287\u0288\u0005\u0006\u0000\u0000\u0288\u028a\u0001\u0000"+
		"\u0000\u0000\u0289\u0259\u0001\u0000\u0000\u0000\u0289\u025b\u0001\u0000"+
		"\u0000\u0000\u0289\u0260\u0001\u0000\u0000\u0000\u0289\u0263\u0001\u0000"+
		"\u0000\u0000\u0289\u0267\u0001\u0000\u0000\u0000\u0289\u0269\u0001\u0000"+
		"\u0000\u0000\u0289\u026c\u0001\u0000\u0000\u0000\u0289\u026e\u0001\u0000"+
		"\u0000\u0000\u0289\u0270\u0001\u0000\u0000\u0000\u0289\u0272\u0001\u0000"+
		"\u0000\u0000\u0289\u0274\u0001\u0000\u0000\u0000\u0289\u0276\u0001\u0000"+
		"\u0000\u0000\u0289\u0278\u0001\u0000\u0000\u0000\u0289\u027a\u0001\u0000"+
		"\u0000\u0000\u0289\u027f\u0001\u0000\u0000\u0000\u0289\u0280\u0001\u0000"+
		"\u0000\u0000\u0289\u0281\u0001\u0000\u0000\u0000\u0289\u0282\u0001\u0000"+
		"\u0000\u0000\u0289\u0283\u0001\u0000\u0000\u0000\u0289\u0284\u0001\u0000"+
		"\u0000\u0000\u0289\u0285\u0001\u0000\u0000\u0000\u028a\u02ce\u0001\u0000"+
		"\u0000\u0000\u028b\u028c\n&\u0000\u0000\u028c\u028d\u0005\r\u0000\u0000"+
		"\u028d\u02cd\u0003d2\'\u028e\u028f\n\u0015\u0000\u0000\u028f\u0290\u0005"+
		"\u0019\u0000\u0000\u0290\u02cd\u0003d2\u0015\u0291\u0292\n\u0014\u0000"+
		"\u0000\u0292\u0293\u0007\u0002\u0000\u0000\u0293\u02cd\u0003d2\u0015\u0294"+
		"\u0295\n\u0013\u0000\u0000\u0295\u0296\u0007\u0003\u0000\u0000\u0296\u02cd"+
		"\u0003d2\u0014\u0297\u0298\n\u0012\u0000\u0000\u0298\u0299\u0005\u001a"+
		"\u0000\u0000\u0299\u02cd\u0003d2\u0013\u029a\u029b\n\u0011\u0000\u0000"+
		"\u029b\u029c\u0007\u0004\u0000\u0000\u029c\u02cd\u0003d2\u0012\u029d\u029e"+
		"\n\u0010\u0000\u0000\u029e\u029f\u0005D\u0000\u0000\u029f\u02cd\u0003"+
		"d2\u0011\u02a0\u02a1\n\u000f\u0000\u0000\u02a1\u02a2\u0007\u0005\u0000"+
		"\u0000\u02a2\u02cd\u0003d2\u0010\u02a3\u02a4\n\u000e\u0000\u0000\u02a4"+
		"\u02a5\u0005#\u0000\u0000\u02a5\u02cd\u0003d2\u000f\u02a6\u02a7\n\r\u0000"+
		"\u0000\u02a7\u02a8\u0005$\u0000\u0000\u02a8\u02cd\u0003d2\u000e\u02a9"+
		"\u02aa\n\f\u0000\u0000\u02aa\u02ab\u0005\f\u0000\u0000\u02ab\u02ac\u0003"+
		"d2\u0000\u02ac\u02ad\u0005\u000e\u0000\u0000\u02ad\u02ae\u0003d2\r\u02ae"+
		"\u02cd\u0001\u0000\u0000\u0000\u02af\u02b0\n\u000b\u0000\u0000\u02b0\u02b1"+
		"\u0005\u000b\u0000\u0000\u02b1\u02cd\u0003d2\u000b\u02b2\u02b3\n\n\u0000"+
		"\u0000\u02b3\u02b4\u0003r9\u0000\u02b4\u02b5\u0003d2\n\u02b5\u02cd\u0001"+
		"\u0000\u0000\u0000\u02b6\u02b8\n%\u0000\u0000\u02b7\u02b9\u0005\r\u0000"+
		"\u0000\u02b8\u02b7\u0001\u0000\u0000\u0000\u02b8\u02b9\u0001\u0000\u0000"+
		"\u0000\u02b9\u02ba\u0001\u0000\u0000\u0000\u02ba\u02bb\u0005\u0003\u0000"+
		"\u0000\u02bb\u02bc\u0003b1\u0000\u02bc\u02bd\u0005\u0004\u0000\u0000\u02bd"+
		"\u02cd\u0001\u0000\u0000\u0000\u02be\u02c0\n$\u0000\u0000\u02bf\u02c1"+
		"\u0005\f\u0000\u0000\u02c0\u02bf\u0001\u0000\u0000\u0000\u02c0\u02c1\u0001"+
		"\u0000\u0000\u0000\u02c1\u02c2\u0001\u0000\u0000\u0000\u02c2\u02c3\u0005"+
		"\u0010\u0000\u0000\u02c3\u02cd\u0005Q\u0000\u0000\u02c4\u02c5\n \u0000"+
		"\u0000\u02c5\u02cd\u0003^/\u0000\u02c6\u02c7\n\u001e\u0000\u0000\u02c7"+
		"\u02cd\u0005\u0011\u0000\u0000\u02c8\u02c9\n\u001d\u0000\u0000\u02c9\u02cd"+
		"\u0005\u0012\u0000\u0000\u02ca\u02cb\n\b\u0000\u0000\u02cb\u02cd\u0003"+
		"v;\u0000\u02cc\u028b\u0001\u0000\u0000\u0000\u02cc\u028e\u0001\u0000\u0000"+
		"\u0000\u02cc\u0291\u0001\u0000\u0000\u0000\u02cc\u0294\u0001\u0000\u0000"+
		"\u0000\u02cc\u0297\u0001\u0000\u0000\u0000\u02cc\u029a\u0001\u0000\u0000"+
		"\u0000\u02cc\u029d\u0001\u0000\u0000\u0000\u02cc\u02a0\u0001\u0000\u0000"+
		"\u0000\u02cc\u02a3\u0001\u0000\u0000\u0000\u02cc\u02a6\u0001\u0000\u0000"+
		"\u0000\u02cc\u02a9\u0001\u0000\u0000\u0000\u02cc\u02af\u0001\u0000\u0000"+
		"\u0000\u02cc\u02b2\u0001\u0000\u0000\u0000\u02cc\u02b6\u0001\u0000\u0000"+
		"\u0000\u02cc\u02be\u0001\u0000\u0000\u0000\u02cc\u02c4\u0001\u0000\u0000"+
		"\u0000\u02cc\u02c6\u0001\u0000\u0000\u0000\u02cc\u02c8\u0001\u0000\u0000"+
		"\u0000\u02cc\u02ca\u0001\u0000\u0000\u0000\u02cd\u02d0\u0001\u0000\u0000"+
		"\u0000\u02ce\u02cc\u0001\u0000\u0000\u0000\u02ce\u02cf\u0001\u0000\u0000"+
		"\u0000\u02cfe\u0001\u0000\u0000\u0000\u02d0\u02ce\u0001\u0000\u0000\u0000"+
		"\u02d1\u02d2\u0005\u000b\u0000\u0000\u02d2\u02d3\u0003d2\u0000\u02d3g"+
		"\u0001\u0000\u0000\u0000\u02d4\u02d8\u0005Q\u0000\u0000\u02d5\u02d8\u0003"+
		"T*\u0000\u02d6\u02d8\u0003j5\u0000\u02d7\u02d4\u0001\u0000\u0000\u0000"+
		"\u02d7\u02d5\u0001\u0000\u0000\u0000\u02d7\u02d6\u0001\u0000\u0000\u0000"+
		"\u02d8i\u0001\u0000\u0000\u0000\u02d9\u02e5\u0005\u0007\u0000\u0000\u02da"+
		"\u02df\u0003Z-\u0000\u02db\u02dc\u0005\n\u0000\u0000\u02dc\u02de\u0003"+
		"Z-\u0000\u02dd\u02db\u0001\u0000\u0000\u0000\u02de\u02e1\u0001\u0000\u0000"+
		"\u0000\u02df\u02dd\u0001\u0000\u0000\u0000\u02df\u02e0\u0001\u0000\u0000"+
		"\u0000\u02e0\u02e3\u0001\u0000\u0000\u0000\u02e1\u02df\u0001\u0000\u0000"+
		"\u0000\u02e2\u02e4\u0005\n\u0000\u0000\u02e3\u02e2\u0001\u0000\u0000\u0000"+
		"\u02e3\u02e4\u0001\u0000\u0000\u0000\u02e4\u02e6\u0001\u0000\u0000\u0000"+
		"\u02e5\u02da\u0001\u0000\u0000\u0000\u02e5\u02e6\u0001\u0000\u0000\u0000"+
		"\u02e6\u02e7\u0001\u0000\u0000\u0000\u02e7\u02e8\u0005\b\u0000\u0000\u02e8"+
		"k\u0001\u0000\u0000\u0000\u02e9\u02ea\u0005>\u0000\u0000\u02ea\u02ec\u0005"+
		"\u0005\u0000\u0000\u02eb\u02ed\u0003L&\u0000\u02ec\u02eb\u0001\u0000\u0000"+
		"\u0000\u02ec\u02ed\u0001\u0000\u0000\u0000\u02ed\u02ee\u0001\u0000\u0000"+
		"\u0000\u02ee\u02ef\u0005\u0006\u0000\u0000\u02ef\u02f5\u0003R)\u0000\u02f0"+
		"\u02f1\u0003n7\u0000\u02f1\u02f2\u0005,\u0000\u0000\u02f2\u02f3\u0003"+
		"p8\u0000\u02f3\u02f5\u0001\u0000\u0000\u0000\u02f4\u02e9\u0001\u0000\u0000"+
		"\u0000\u02f4\u02f0\u0001\u0000\u0000\u0000\u02f5m\u0001\u0000\u0000\u0000"+
		"\u02f6\u02fd\u0005Q\u0000\u0000\u02f7\u02f9\u0005\u0005\u0000\u0000\u02f8"+
		"\u02fa\u0003L&\u0000\u02f9\u02f8\u0001\u0000\u0000\u0000\u02f9\u02fa\u0001"+
		"\u0000\u0000\u0000\u02fa\u02fb\u0001\u0000\u0000\u0000\u02fb\u02fd\u0005"+
		"\u0006\u0000\u0000\u02fc\u02f6\u0001\u0000\u0000\u0000\u02fc\u02f7\u0001"+
		"\u0000\u0000\u0000\u02fdo\u0001\u0000\u0000\u0000\u02fe\u0301\u0003d2"+
		"\u0000\u02ff\u0301\u0003R)\u0000\u0300\u02fe\u0001\u0000\u0000\u0000\u0300"+
		"\u02ff\u0001\u0000\u0000\u0000\u0301q\u0001\u0000\u0000\u0000\u0302\u030a"+
		"\u0005%\u0000\u0000\u0303\u030a\u0005&\u0000\u0000\u0304\u030a\u0005\'"+
		"\u0000\u0000\u0305\u030a\u0005(\u0000\u0000\u0306\u030a\u0005)\u0000\u0000"+
		"\u0307\u030a\u0005*\u0000\u0000\u0308\u030a\u0005+\u0000\u0000\u0309\u0302"+
		"\u0001\u0000\u0000\u0000\u0309\u0303\u0001\u0000\u0000\u0000\u0309\u0304"+
		"\u0001\u0000\u0000\u0000\u0309\u0305\u0001\u0000\u0000\u0000\u0309\u0306"+
		"\u0001\u0000\u0000\u0000\u0309\u0307\u0001\u0000\u0000\u0000\u0309\u0308"+
		"\u0001\u0000\u0000\u0000\u030as\u0001\u0000\u0000\u0000\u030b\u0311\u0005"+
		"-\u0000\u0000\u030c\u0311\u0005.\u0000\u0000\u030d\u0311\u0005R\u0000"+
		"\u0000\u030e\u0311\u0003v;\u0000\u030f\u0311\u0005/\u0000\u0000\u0310"+
		"\u030b\u0001\u0000\u0000\u0000\u0310\u030c\u0001\u0000\u0000\u0000\u0310"+
		"\u030d\u0001\u0000\u0000\u0000\u0310\u030e\u0001\u0000\u0000\u0000\u0310"+
		"\u030f\u0001\u0000\u0000\u0000\u0311u\u0001\u0000\u0000\u0000\u0312\u0316"+
		"\u0005S\u0000\u0000\u0313\u0315\u0003x<\u0000\u0314\u0313\u0001\u0000"+
		"\u0000\u0000\u0315\u0318\u0001\u0000\u0000\u0000\u0316\u0314\u0001\u0000"+
		"\u0000\u0000\u0316\u0317\u0001\u0000\u0000\u0000\u0317\u0319\u0001\u0000"+
		"\u0000\u0000\u0318\u0316\u0001\u0000\u0000\u0000\u0319\u031a\u0005S\u0000"+
		"\u0000\u031aw\u0001\u0000\u0000\u0000\u031b\u0321\u0005X\u0000\u0000\u031c"+
		"\u031d\u0005W\u0000\u0000\u031d\u031e\u0003d2\u0000\u031e\u031f\u0005"+
		"\b\u0000\u0000\u031f\u0321\u0001\u0000\u0000\u0000\u0320\u031b\u0001\u0000"+
		"\u0000\u0000\u0320\u031c\u0001\u0000\u0000\u0000\u0321y\u0001\u0000\u0000"+
		"\u0000\u0322\u0323\u0007\u0006\u0000\u0000\u0323{\u0001\u0000\u0000\u0000"+
		"[\u007f\u0081\u0095\u0099\u00a0\u00a9\u00b6\u00be\u00c3\u00c5\u00cc\u00d1"+
		"\u00d5\u00d9\u00e2\u00e7\u00ef\u00f4\u00f6\u00fd\u0102\u010d\u0113\u011f"+
		"\u0133\u0137\u013b\u0143\u014e\u0155\u015a\u0164\u0170\u0174\u0176\u017d"+
		"\u0183\u0188\u0192\u0195\u019a\u019d\u01a8\u01b3\u01b9\u01bf\u01c3\u01c7"+
		"\u01cc\u01d3\u01da\u01df\u01e2\u01e7\u01f0\u01f2\u01fd\u0201\u0206\u020b"+
		"\u0211\u0215\u0226\u022c\u022f\u0238\u0240\u0244\u0246\u024b\u024f\u0256"+
		"\u025d\u0289\u02b8\u02c0\u02cc\u02ce\u02d7\u02df\u02e3\u02e5\u02ec\u02f4"+
		"\u02f9\u02fc\u0300\u0309\u0310\u0316\u0320";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}