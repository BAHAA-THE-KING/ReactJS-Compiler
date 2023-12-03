// Generated from C:/Users/ASUS/Desktop/GitHub/ReactJS-Compiler/Compiler Project/src/rules/ReactJSParser.g4 by ANTLR 4.13.1
package antlrReactJS;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ReactJSParser extends JavaScriptParserBase {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MultiLineComment=1, SingleLineComment=2, OpenBracket=3, CloseBracket=4, 
		OpenParen=5, CloseParen=6, OpenBrace=7, CloseBrace=8, TemplateCloseBrace=9, 
		SemiColon=10, Comma=11, Assign=12, QuestionMark=13, QuestionMarkDot=14, 
		Colon=15, Ellipsis=16, Dot=17, PlusPlus=18, MinusMinus=19, Plus=20, Minus=21, 
		Not=22, Multiply=23, Divide=24, Modulus=25, Power=26, NullCoalesce=27, 
		LessThan=28, MoreThan=29, LessThanEquals=30, GreaterThanEquals=31, Equals_=32, 
		NotEquals=33, IdentityEquals=34, IdentityNotEquals=35, And=36, Or=37, 
		MultiplyAssign=38, DivideAssign=39, ModulusAssign=40, PlusAssign=41, MinusAssign=42, 
		PowerAssign=43, NullishCoalescingAssign=44, ARROW=45, NullLiteral=46, 
		BooleanLiteral=47, DecimalLiteral=48, Break=49, Do=50, Typeof=51, Case=52, 
		Else=53, New=54, Var=55, Catch=56, Finally=57, Return=58, Continue=59, 
		For=60, Switch=61, While=62, Function_=63, This=64, Default=65, If=66, 
		Throw=67, Delete=68, In=69, Of=70, Try=71, As=72, From=73, Class=74, Extends=75, 
		Super=76, Const=77, Export=78, Import=79, StrictLet=80, NonStrictLet=81, 
		Static=82, Identifier=83, StringLiteral=84, BackTick=85, WhiteSpaces=86, 
		LineTerminator=87, UnexpectedCharacter=88, TemplateStringStartExpression=89, 
		TemplateStringAtom=90, DOCTYPE=91, HTML_COMMENT=92, SEA_WS=93, TAG_OPEN=94, 
		HTML_TEXT=95, TAG_CLOSE=96, TAG_SLASH_CLOSE=97, TAG_SLASH=98, TAG_EQUALS=99, 
		TAG_NAME=100, TAG_WHITESPACE=101, ATTVALUE_VALUE=102, ATTRIBUTE=103;
	public static final int
		RULE_file = 0, RULE_program = 1, RULE_statement = 2, RULE_block = 3, RULE_statementList = 4, 
		RULE_importStatement = 5, RULE_importModuleItems = 6, RULE_importNamespace = 7, 
		RULE_aliasName = 8, RULE_exportStatement = 9, RULE_exportFromBlock = 10, 
		RULE_exportModuleItems = 11, RULE_exportAliasName = 12, RULE_declaration = 13, 
		RULE_variableStatement = 14, RULE_variableDeclarationList = 15, RULE_variableDeclaration = 16, 
		RULE_expressionStatement = 17, RULE_ifStatement = 18, RULE_iterationStatement = 19, 
		RULE_varModifier = 20, RULE_continueStatement = 21, RULE_breakStatement = 22, 
		RULE_returnStatement = 23, RULE_switchStatement = 24, RULE_caseBlock = 25, 
		RULE_caseClauses = 26, RULE_caseClause = 27, RULE_defaultClause = 28, 
		RULE_throwStatement = 29, RULE_tryStatement = 30, RULE_catchProduction = 31, 
		RULE_finallyProduction = 32, RULE_functionDeclaration = 33, RULE_classDeclaration = 34, 
		RULE_classTail = 35, RULE_classElements = 36, RULE_classElement = 37, 
		RULE_methodDefinition = 38, RULE_fieldDefinition = 39, RULE_formalParameterList = 40, 
		RULE_formalParameterArg = 41, RULE_lastFormalParameterArg = 42, RULE_functionBody = 43, 
		RULE_arrayLiteral = 44, RULE_elementList = 45, RULE_arrayElement = 46, 
		RULE_propertyAssignment = 47, RULE_propertyName = 48, RULE_arguments = 49, 
		RULE_argument = 50, RULE_expressionSequence = 51, RULE_singleExpression = 52, 
		RULE_assignable = 53, RULE_objectLiteral = 54, RULE_anonymousFunction = 55, 
		RULE_arrowFunctionParameters = 56, RULE_arrowFunctionBody = 57, RULE_assignmentOperator = 58, 
		RULE_literal = 59, RULE_templateStringLiteral = 60, RULE_templateStringAtom = 61, 
		RULE_let_ = 62, RULE_eos = 63, RULE_htmlDocument = 64, RULE_htmlElement = 65, 
		RULE_htmlContent = 66, RULE_htmlAttribute = 67, RULE_htmlChardata = 68, 
		RULE_mixedText = 69, RULE_htmlMisc = 70, RULE_htmlComment = 71;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "program", "statement", "block", "statementList", "importStatement", 
			"importModuleItems", "importNamespace", "aliasName", "exportStatement", 
			"exportFromBlock", "exportModuleItems", "exportAliasName", "declaration", 
			"variableStatement", "variableDeclarationList", "variableDeclaration", 
			"expressionStatement", "ifStatement", "iterationStatement", "varModifier", 
			"continueStatement", "breakStatement", "returnStatement", "switchStatement", 
			"caseBlock", "caseClauses", "caseClause", "defaultClause", "throwStatement", 
			"tryStatement", "catchProduction", "finallyProduction", "functionDeclaration", 
			"classDeclaration", "classTail", "classElements", "classElement", "methodDefinition", 
			"fieldDefinition", "formalParameterList", "formalParameterArg", "lastFormalParameterArg", 
			"functionBody", "arrayLiteral", "elementList", "arrayElement", "propertyAssignment", 
			"propertyName", "arguments", "argument", "expressionSequence", "singleExpression", 
			"assignable", "objectLiteral", "anonymousFunction", "arrowFunctionParameters", 
			"arrowFunctionBody", "assignmentOperator", "literal", "templateStringLiteral", 
			"templateStringAtom", "let_", "eos", "htmlDocument", "htmlElement", "htmlContent", 
			"htmlAttribute", "htmlChardata", "mixedText", "htmlMisc", "htmlComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'['", "']'", "'('", "')'", "'{'", "'}'", null, "';'", 
			"','", null, "'?'", "'?.'", "':'", "'...'", "'.'", "'++'", "'--'", "'+'", 
			"'-'", "'!'", "'*'", null, "'%'", "'**'", "'??'", null, null, "'<='", 
			"'>='", "'=='", "'!='", "'==='", "'!=='", "'&&'", "'||'", "'*='", "'/='", 
			"'%='", "'+='", "'-='", "'**='", "'??='", "'=>'", "'null'", null, null, 
			"'break'", "'do'", "'typeof'", "'case'", "'else'", "'new'", "'var'", 
			"'catch'", "'finally'", "'return'", "'continue'", "'for'", "'switch'", 
			"'while'", "'function'", "'this'", "'default'", "'if'", "'throw'", "'delete'", 
			"'in'", "'of'", "'try'", "'as'", "'from'", "'class'", "'extends'", "'super'", 
			"'const'", "'export'", "'import'", null, null, "'static'", null, null, 
			null, null, null, null, "'${'", null, "'<!DOCTYPE html>'", null, null, 
			null, null, null, "'/>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MultiLineComment", "SingleLineComment", "OpenBracket", "CloseBracket", 
			"OpenParen", "CloseParen", "OpenBrace", "CloseBrace", "TemplateCloseBrace", 
			"SemiColon", "Comma", "Assign", "QuestionMark", "QuestionMarkDot", "Colon", 
			"Ellipsis", "Dot", "PlusPlus", "MinusMinus", "Plus", "Minus", "Not", 
			"Multiply", "Divide", "Modulus", "Power", "NullCoalesce", "LessThan", 
			"MoreThan", "LessThanEquals", "GreaterThanEquals", "Equals_", "NotEquals", 
			"IdentityEquals", "IdentityNotEquals", "And", "Or", "MultiplyAssign", 
			"DivideAssign", "ModulusAssign", "PlusAssign", "MinusAssign", "PowerAssign", 
			"NullishCoalescingAssign", "ARROW", "NullLiteral", "BooleanLiteral", 
			"DecimalLiteral", "Break", "Do", "Typeof", "Case", "Else", "New", "Var", 
			"Catch", "Finally", "Return", "Continue", "For", "Switch", "While", "Function_", 
			"This", "Default", "If", "Throw", "Delete", "In", "Of", "Try", "As", 
			"From", "Class", "Extends", "Super", "Const", "Export", "Import", "StrictLet", 
			"NonStrictLet", "Static", "Identifier", "StringLiteral", "BackTick", 
			"WhiteSpaces", "LineTerminator", "UnexpectedCharacter", "TemplateStringStartExpression", 
			"TemplateStringAtom", "DOCTYPE", "HTML_COMMENT", "SEA_WS", "TAG_OPEN", 
			"HTML_TEXT", "TAG_CLOSE", "TAG_SLASH_CLOSE", "TAG_SLASH", "TAG_EQUALS", 
			"TAG_NAME", "TAG_WHITESPACE", "ATTVALUE_VALUE", "ATTRIBUTE"
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

	public ReactJSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FileContext extends ParserRuleContext {
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
	 
		public FileContext() { }
		public void copyFrom(FileContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HTMLFileContext extends FileContext {
		public HtmlDocumentContext htmlDocument() {
			return getRuleContext(HtmlDocumentContext.class,0);
		}
		public HTMLFileContext(FileContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterHTMLFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitHTMLFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitHTMLFile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JSFileContext extends FileContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public JSFileContext(FileContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterJSFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitJSFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitJSFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new JSFileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				program();
				}
				break;
			case 2:
				_localctx = new HTMLFileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				htmlDocument();
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
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ReactJSParser.EOF, 0); }
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ExportStatementContext> exportStatement() {
			return getRuleContexts(ExportStatementContext.class);
		}
		public ExportStatementContext exportStatement(int i) {
			return getRuleContext(ExportStatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(148);
					importStatement();
					}
					} 
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(154);
					statement();
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Export) {
				{
				{
				setState(160);
				exportStatement();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
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
	public static class EmptyChunkContext extends StatementContext {
		public TerminalNode SemiColon() { return getToken(ReactJSParser.SemiColon, 0); }
		public EmptyChunkContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterEmptyChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitEmptyChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitEmptyChunk(this);
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterFunctionDeclarationChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitFunctionDeclarationChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitFunctionDeclarationChunk(this);
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterContinueChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitContinueChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitContinueChunk(this);
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterLoopChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitLoopChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitLoopChunk(this);
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterVariableDeclerationChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitVariableDeclerationChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitVariableDeclerationChunk(this);
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterBlockChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitBlockChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitBlockChunk(this);
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterExpressionChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitExpressionChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitExpressionChunk(this);
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterThrowChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitThrowChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitThrowChunk(this);
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterTryChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitTryChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitTryChunk(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationChunkContext extends StatementContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ClassDeclarationChunkContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterClassDeclarationChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitClassDeclarationChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitClassDeclarationChunk(this);
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterConditionalChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitConditionalChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitConditionalChunk(this);
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterSwitchChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitSwitchChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitSwitchChunk(this);
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterBreakChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitBreakChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitBreakChunk(this);
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterReturnChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitReturnChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitReturnChunk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new BlockChunkContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				block();
				}
				break;
			case 2:
				_localctx = new VariableDeclerationChunkContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				variableStatement();
				}
				break;
			case 3:
				_localctx = new EmptyChunkContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				match(SemiColon);
				}
				break;
			case 4:
				_localctx = new ClassDeclarationChunkContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				classDeclaration();
				}
				break;
			case 5:
				_localctx = new FunctionDeclarationChunkContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				functionDeclaration();
				}
				break;
			case 6:
				_localctx = new ExpressionChunkContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(173);
				expressionStatement();
				}
				break;
			case 7:
				_localctx = new ConditionalChunkContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(174);
				ifStatement();
				}
				break;
			case 8:
				_localctx = new LoopChunkContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(175);
				iterationStatement();
				}
				break;
			case 9:
				_localctx = new ContinueChunkContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(176);
				continueStatement();
				}
				break;
			case 10:
				_localctx = new BreakChunkContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(177);
				breakStatement();
				}
				break;
			case 11:
				_localctx = new ReturnChunkContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(178);
				returnStatement();
				}
				break;
			case 12:
				_localctx = new SwitchChunkContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(179);
				switchStatement();
				}
				break;
			case 13:
				_localctx = new ThrowChunkContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(180);
				throwStatement();
				}
				break;
			case 14:
				_localctx = new TryChunkContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(181);
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
		public TerminalNode OpenBrace() { return getToken(ReactJSParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ReactJSParser.CloseBrace, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(OpenBrace);
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(185);
				statementList();
				}
				break;
			}
			setState(188);
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitStatementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statementList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(191); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(190);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(193); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public TerminalNode Import() { return getToken(ReactJSParser.Import, 0); }
		public ImportModuleItemsContext importModuleItems() {
			return getRuleContext(ImportModuleItemsContext.class,0);
		}
		public TerminalNode From() { return getToken(ReactJSParser.From, 0); }
		public TerminalNode StringLiteral() { return getToken(ReactJSParser.StringLiteral, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ImportNamespaceContext importNamespace() {
			return getRuleContext(ImportNamespaceContext.class,0);
		}
		public TerminalNode Comma() { return getToken(ReactJSParser.Comma, 0); }
		public ObjectImportBlockContext(ImportStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterObjectImportBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitObjectImportBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitObjectImportBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FileImportBlockContext extends ImportStatementContext {
		public TerminalNode Import() { return getToken(ReactJSParser.Import, 0); }
		public TerminalNode StringLiteral() { return getToken(ReactJSParser.StringLiteral, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public FileImportBlockContext(ImportStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterFileImportBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitFileImportBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitFileImportBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeafultAsImportBlockContext extends ImportStatementContext {
		public TerminalNode Import() { return getToken(ReactJSParser.Import, 0); }
		public ImportNamespaceContext importNamespace() {
			return getRuleContext(ImportNamespaceContext.class,0);
		}
		public TerminalNode From() { return getToken(ReactJSParser.From, 0); }
		public TerminalNode StringLiteral() { return getToken(ReactJSParser.StringLiteral, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public DeafultAsImportBlockContext(ImportStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterDeafultAsImportBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitDeafultAsImportBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitDeafultAsImportBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_importStatement);
		int _la;
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new FileImportBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(Import);
				setState(196);
				match(StringLiteral);
				setState(197);
				eos();
				}
				break;
			case 2:
				_localctx = new DeafultAsImportBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(Import);
				setState(199);
				importNamespace();
				setState(200);
				match(From);
				setState(201);
				match(StringLiteral);
				setState(202);
				eos();
				}
				break;
			case 3:
				_localctx = new ObjectImportBlockContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				match(Import);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Multiply || _la==Identifier) {
					{
					setState(205);
					importNamespace();
					setState(206);
					match(Comma);
					}
				}

				setState(210);
				importModuleItems();
				setState(211);
				match(From);
				setState(212);
				match(StringLiteral);
				setState(213);
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
		public TerminalNode OpenBrace() { return getToken(ReactJSParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ReactJSParser.CloseBrace, 0); }
		public List<AliasNameContext> aliasName() {
			return getRuleContexts(AliasNameContext.class);
		}
		public AliasNameContext aliasName(int i) {
			return getRuleContext(AliasNameContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ReactJSParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactJSParser.Comma, i);
		}
		public ImportModuleItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importModuleItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterImportModuleItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitImportModuleItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitImportModuleItems(this);
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
			setState(217);
			match(OpenBrace);
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(218);
					aliasName();
					setState(219);
					match(Comma);
					}
					} 
				}
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(226);
				aliasName();
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(227);
					match(Comma);
					}
				}

				}
			}

			setState(232);
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
		public TerminalNode Multiply() { return getToken(ReactJSParser.Multiply, 0); }
		public List<TerminalNode> Identifier() { return getTokens(ReactJSParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ReactJSParser.Identifier, i);
		}
		public TerminalNode As() { return getToken(ReactJSParser.As, 0); }
		public ImportNamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importNamespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterImportNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitImportNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitImportNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportNamespaceContext importNamespace() throws RecognitionException {
		ImportNamespaceContext _localctx = new ImportNamespaceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_importNamespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_la = _input.LA(1);
			if ( !(_la==Multiply || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(235);
				match(As);
				setState(236);
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
		public List<TerminalNode> Identifier() { return getTokens(ReactJSParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ReactJSParser.Identifier, i);
		}
		public TerminalNode As() { return getToken(ReactJSParser.As, 0); }
		public AliasNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterAliasName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitAliasName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitAliasName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasNameContext aliasName() throws RecognitionException {
		AliasNameContext _localctx = new AliasNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_aliasName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(Identifier);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(240);
				match(As);
				setState(241);
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
		public TerminalNode Export() { return getToken(ReactJSParser.Export, 0); }
		public TerminalNode Default() { return getToken(ReactJSParser.Default, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExportDefaultDeclarationContext(ExportStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterExportDefaultDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitExportDefaultDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitExportDefaultDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExportBlockContext extends ExportStatementContext {
		public TerminalNode Export() { return getToken(ReactJSParser.Export, 0); }
		public ExportFromBlockContext exportFromBlock() {
			return getRuleContext(ExportFromBlockContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode Default() { return getToken(ReactJSParser.Default, 0); }
		public ExportBlockContext(ExportStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterExportBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitExportBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitExportBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExportDeclarationContext extends ExportStatementContext {
		public TerminalNode Export() { return getToken(ReactJSParser.Export, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode Default() { return getToken(ReactJSParser.Default, 0); }
		public ExportDeclarationContext(ExportStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterExportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitExportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitExportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportStatementContext exportStatement() throws RecognitionException {
		ExportStatementContext _localctx = new ExportStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exportStatement);
		int _la;
		try {
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new ExportDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(Export);
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Default) {
					{
					setState(245);
					match(Default);
					}
				}

				setState(248);
				declaration();
				setState(249);
				eos();
				}
				break;
			case 2:
				_localctx = new ExportBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(Export);
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Default) {
					{
					setState(252);
					match(Default);
					}
				}

				setState(255);
				exportFromBlock();
				setState(256);
				eos();
				}
				break;
			case 3:
				_localctx = new ExportDefaultDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				match(Export);
				setState(259);
				match(Default);
				setState(260);
				singleExpression(0);
				setState(261);
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
		public TerminalNode From() { return getToken(ReactJSParser.From, 0); }
		public TerminalNode StringLiteral() { return getToken(ReactJSParser.StringLiteral, 0); }
		public ExportFromBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportFromBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterExportFromBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitExportFromBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitExportFromBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportFromBlockContext exportFromBlock() throws RecognitionException {
		ExportFromBlockContext _localctx = new ExportFromBlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exportFromBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			exportModuleItems();
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(266);
				match(From);
				setState(267);
				match(StringLiteral);
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
	public static class ExportModuleItemsContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(ReactJSParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ReactJSParser.CloseBrace, 0); }
		public List<ExportAliasNameContext> exportAliasName() {
			return getRuleContexts(ExportAliasNameContext.class);
		}
		public ExportAliasNameContext exportAliasName(int i) {
			return getRuleContext(ExportAliasNameContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ReactJSParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactJSParser.Comma, i);
		}
		public ExportModuleItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportModuleItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterExportModuleItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitExportModuleItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitExportModuleItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportModuleItemsContext exportModuleItems() throws RecognitionException {
		ExportModuleItemsContext _localctx = new ExportModuleItemsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exportModuleItems);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(OpenBrace);
			setState(276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(271);
					exportAliasName();
					setState(272);
					match(Comma);
					}
					} 
				}
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(279);
				exportAliasName();
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(280);
					match(Comma);
					}
				}

				}
			}

			setState(285);
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
		public List<TerminalNode> Identifier() { return getTokens(ReactJSParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ReactJSParser.Identifier, i);
		}
		public TerminalNode As() { return getToken(ReactJSParser.As, 0); }
		public ExportAliasNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportAliasName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterExportAliasName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitExportAliasName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitExportAliasName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportAliasNameContext exportAliasName() throws RecognitionException {
		ExportAliasNameContext _localctx = new ExportAliasNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_exportAliasName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(Identifier);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(288);
				match(As);
				setState(289);
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterFunctionDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitFunctionDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitFunctionDeclare(this);
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterVariableDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitVariableDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitVariableDeclare(this);
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterClassDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitClassDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitClassDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declaration);
		try {
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
			case Const:
			case StrictLet:
			case NonStrictLet:
				_localctx = new VariableDeclareContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				variableStatement();
				}
				break;
			case Class:
				_localctx = new ClassDeclareContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				classDeclaration();
				}
				break;
			case Function_:
				_localctx = new FunctionDeclareContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitVariableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitVariableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableStatementContext variableStatement() throws RecognitionException {
		VariableStatementContext _localctx = new VariableStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			variableDeclarationList();
			setState(298);
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
		public List<TerminalNode> Comma() { return getTokens(ReactJSParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactJSParser.Comma, i);
		}
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterVariableDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitVariableDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitVariableDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variableDeclarationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			varModifier();
			setState(301);
			variableDeclaration();
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(302);
					match(Comma);
					setState(303);
					variableDeclaration();
					}
					} 
				}
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		public TerminalNode Assign() { return getToken(ReactJSParser.Assign, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			assignable();
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(310);
				match(Assign);
				setState(311);
				singleExpression(0);
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			if (!(this.notOpenBraceAndNotFunction())) throw new FailedPredicateException(this, "this.notOpenBraceAndNotFunction()");
			setState(315);
			expressionSequence();
			setState(316);
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
		public TerminalNode If() { return getToken(ReactJSParser.If, 0); }
		public TerminalNode OpenParen() { return getToken(ReactJSParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactJSParser.CloseParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(ReactJSParser.Else, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(If);
			setState(319);
			match(OpenParen);
			setState(320);
			expressionSequence();
			setState(321);
			match(CloseParen);
			setState(322);
			statement();
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(323);
				match(Else);
				setState(324);
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
		public TerminalNode While() { return getToken(ReactJSParser.While, 0); }
		public TerminalNode OpenParen() { return getToken(ReactJSParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactJSParser.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(ReactJSParser.For, 0); }
		public TerminalNode OpenParen() { return getToken(ReactJSParser.OpenParen, 0); }
		public List<TerminalNode> SemiColon() { return getTokens(ReactJSParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(ReactJSParser.SemiColon, i);
		}
		public TerminalNode CloseParen() { return getToken(ReactJSParser.CloseParen, 0); }
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileStatementContext extends IterationStatementContext {
		public TerminalNode Do() { return getToken(ReactJSParser.Do, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode While() { return getToken(ReactJSParser.While, 0); }
		public TerminalNode OpenParen() { return getToken(ReactJSParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactJSParser.CloseParen, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public DoWhileStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForInStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(ReactJSParser.For, 0); }
		public TerminalNode OpenParen() { return getToken(ReactJSParser.OpenParen, 0); }
		public TerminalNode In() { return getToken(ReactJSParser.In, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactJSParser.CloseParen, 0); }
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterForInStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitForInStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitForInStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForOfStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(ReactJSParser.For, 0); }
		public TerminalNode OpenParen() { return getToken(ReactJSParser.OpenParen, 0); }
		public TerminalNode Of() { return getToken(ReactJSParser.Of, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactJSParser.CloseParen, 0); }
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterForOfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitForOfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitForOfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_iterationStatement);
		int _la;
		try {
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				_localctx = new DoWhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				match(Do);
				setState(328);
				statement();
				setState(329);
				match(While);
				setState(330);
				match(OpenParen);
				setState(331);
				expressionSequence();
				setState(332);
				match(CloseParen);
				setState(333);
				eos();
				}
				break;
			case 2:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				match(While);
				setState(336);
				match(OpenParen);
				setState(337);
				expressionSequence();
				setState(338);
				match(CloseParen);
				setState(339);
				statement();
				}
				break;
			case 3:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(341);
				match(For);
				setState(342);
				match(OpenParen);
				setState(345);
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
				case Function_:
				case This:
				case Delete:
				case Class:
				case Super:
				case Identifier:
				case StringLiteral:
				case BackTick:
				case TAG_OPEN:
					{
					setState(343);
					expressionSequence();
					}
					break;
				case Var:
				case Const:
				case StrictLet:
				case NonStrictLet:
					{
					setState(344);
					variableDeclarationList();
					}
					break;
				case SemiColon:
					break;
				default:
					break;
				}
				setState(347);
				match(SemiColon);
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9202613257314238296L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1077416977L) != 0)) {
					{
					setState(348);
					expressionSequence();
					}
				}

				setState(351);
				match(SemiColon);
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9202613257314238296L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1077416977L) != 0)) {
					{
					setState(352);
					expressionSequence();
					}
				}

				setState(355);
				match(CloseParen);
				setState(356);
				statement();
				}
				break;
			case 4:
				_localctx = new ForInStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(357);
				match(For);
				setState(358);
				match(OpenParen);
				setState(361);
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
				case Function_:
				case This:
				case Delete:
				case Class:
				case Super:
				case Identifier:
				case StringLiteral:
				case BackTick:
				case TAG_OPEN:
					{
					setState(359);
					singleExpression(0);
					}
					break;
				case Var:
				case Const:
				case StrictLet:
				case NonStrictLet:
					{
					setState(360);
					variableDeclarationList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(363);
				match(In);
				setState(364);
				expressionSequence();
				setState(365);
				match(CloseParen);
				setState(366);
				statement();
				}
				break;
			case 5:
				_localctx = new ForOfStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(368);
				match(For);
				setState(369);
				match(OpenParen);
				setState(372);
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
				case Function_:
				case This:
				case Delete:
				case Class:
				case Super:
				case Identifier:
				case StringLiteral:
				case BackTick:
				case TAG_OPEN:
					{
					setState(370);
					singleExpression(0);
					}
					break;
				case Var:
				case Const:
				case StrictLet:
				case NonStrictLet:
					{
					setState(371);
					variableDeclarationList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(374);
				match(Of);
				setState(375);
				expressionSequence();
				setState(376);
				match(CloseParen);
				setState(377);
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
		public TerminalNode Var() { return getToken(ReactJSParser.Var, 0); }
		public Let_Context let_() {
			return getRuleContext(Let_Context.class,0);
		}
		public TerminalNode Const() { return getToken(ReactJSParser.Const, 0); }
		public VarModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterVarModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitVarModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitVarModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarModifierContext varModifier() throws RecognitionException {
		VarModifierContext _localctx = new VarModifierContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_varModifier);
		try {
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				match(Var);
				}
				break;
			case StrictLet:
			case NonStrictLet:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				let_();
				}
				break;
			case Const:
				enterOuterAlt(_localctx, 3);
				{
				setState(383);
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
		public TerminalNode Continue() { return getToken(ReactJSParser.Continue, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ReactJSParser.Identifier, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(Continue);
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(387);
				if (!(this.notLineTerminator())) throw new FailedPredicateException(this, "this.notLineTerminator()");
				setState(388);
				match(Identifier);
				}
				break;
			}
			setState(391);
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
		public TerminalNode Break() { return getToken(ReactJSParser.Break, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ReactJSParser.Identifier, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(Break);
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(394);
				if (!(this.notLineTerminator())) throw new FailedPredicateException(this, "this.notLineTerminator()");
				setState(395);
				match(Identifier);
				}
				break;
			}
			setState(398);
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
		public TerminalNode Return() { return getToken(ReactJSParser.Return, 0); }
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(Return);
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(401);
				if (!(this.notLineTerminator())) throw new FailedPredicateException(this, "this.notLineTerminator()");
				setState(402);
				expressionSequence();
				}
				break;
			}
			setState(405);
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
		public TerminalNode Switch() { return getToken(ReactJSParser.Switch, 0); }
		public TerminalNode OpenParen() { return getToken(ReactJSParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactJSParser.CloseParen, 0); }
		public CaseBlockContext caseBlock() {
			return getRuleContext(CaseBlockContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(Switch);
			setState(408);
			match(OpenParen);
			setState(409);
			expressionSequence();
			setState(410);
			match(CloseParen);
			setState(411);
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
		public TerminalNode OpenBrace() { return getToken(ReactJSParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ReactJSParser.CloseBrace, 0); }
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterCaseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitCaseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitCaseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseBlockContext caseBlock() throws RecognitionException {
		CaseBlockContext _localctx = new CaseBlockContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_caseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(OpenBrace);
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Case) {
				{
				setState(414);
				caseClauses();
				}
			}

			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Default) {
				{
				setState(417);
				defaultClause();
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Case) {
					{
					setState(418);
					caseClauses();
					}
				}

				}
			}

			setState(423);
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterCaseClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitCaseClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitCaseClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseClausesContext caseClauses() throws RecognitionException {
		CaseClausesContext _localctx = new CaseClausesContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_caseClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(425);
				caseClause();
				}
				}
				setState(428); 
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
		public TerminalNode Case() { return getToken(ReactJSParser.Case, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode Colon() { return getToken(ReactJSParser.Colon, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public CaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterCaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitCaseClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitCaseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseClauseContext caseClause() throws RecognitionException {
		CaseClauseContext _localctx = new CaseClauseContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_caseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(Case);
			setState(431);
			expressionSequence();
			setState(432);
			match(Colon);
			setState(434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(433);
				statementList();
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
	public static class DefaultClauseContext extends ParserRuleContext {
		public TerminalNode Default() { return getToken(ReactJSParser.Default, 0); }
		public TerminalNode Colon() { return getToken(ReactJSParser.Colon, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public DefaultClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterDefaultClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitDefaultClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitDefaultClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultClauseContext defaultClause() throws RecognitionException {
		DefaultClauseContext _localctx = new DefaultClauseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_defaultClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(Default);
			setState(437);
			match(Colon);
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(438);
				statementList();
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
	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(ReactJSParser.Throw, 0); }
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(Throw);
			setState(442);
			if (!(this.notLineTerminator())) throw new FailedPredicateException(this, "this.notLineTerminator()");
			setState(443);
			expressionSequence();
			setState(444);
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
		public TerminalNode Try() { return getToken(ReactJSParser.Try, 0); }
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitTryStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitTryStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_tryStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(Try);
			setState(447);
			block();
			setState(453);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Catch:
				{
				setState(448);
				catchProduction();
				setState(450);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(449);
					finallyProduction();
					}
					break;
				}
				}
				break;
			case Finally:
				{
				setState(452);
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
		public TerminalNode Catch() { return getToken(ReactJSParser.Catch, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(ReactJSParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ReactJSParser.CloseParen, 0); }
		public AssignableContext assignable() {
			return getRuleContext(AssignableContext.class,0);
		}
		public CatchProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchProduction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterCatchProduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitCatchProduction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitCatchProduction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchProductionContext catchProduction() throws RecognitionException {
		CatchProductionContext _localctx = new CatchProductionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_catchProduction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(Catch);
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenParen) {
				{
				setState(456);
				match(OpenParen);
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OpenBracket || _la==OpenBrace || _la==Identifier) {
					{
					setState(457);
					assignable();
					}
				}

				setState(460);
				match(CloseParen);
				}
			}

			setState(463);
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
		public TerminalNode Finally() { return getToken(ReactJSParser.Finally, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyProduction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterFinallyProduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitFinallyProduction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitFinallyProduction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyProductionContext finallyProduction() throws RecognitionException {
		FinallyProductionContext _localctx = new FinallyProductionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_finallyProduction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(Finally);
			setState(466);
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
		public TerminalNode Function_() { return getToken(ReactJSParser.Function_, 0); }
		public TerminalNode Identifier() { return getToken(ReactJSParser.Identifier, 0); }
		public TerminalNode OpenParen() { return getToken(ReactJSParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ReactJSParser.CloseParen, 0); }
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(Function_);
			setState(469);
			match(Identifier);
			setState(470);
			match(OpenParen);
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 65672L) != 0) || _la==Identifier) {
				{
				setState(471);
				formalParameterList();
				}
			}

			setState(474);
			match(CloseParen);
			setState(475);
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
		public TerminalNode Class() { return getToken(ReactJSParser.Class, 0); }
		public TerminalNode Identifier() { return getToken(ReactJSParser.Identifier, 0); }
		public ClassTailContext classTail() {
			return getRuleContext(ClassTailContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_classDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(Class);
			setState(478);
			match(Identifier);
			setState(479);
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
		public TerminalNode OpenBrace() { return getToken(ReactJSParser.OpenBrace, 0); }
		public ClassElementsContext classElements() {
			return getRuleContext(ClassElementsContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(ReactJSParser.CloseBrace, 0); }
		public TerminalNode Extends() { return getToken(ReactJSParser.Extends, 0); }
		public TerminalNode Identifier() { return getToken(ReactJSParser.Identifier, 0); }
		public ClassTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterClassTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitClassTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitClassTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTailContext classTail() throws RecognitionException {
		ClassTailContext _localctx = new ClassTailContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_classTail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(481);
				match(Extends);
				setState(482);
				match(Identifier);
				}
			}

			setState(485);
			match(OpenBrace);
			setState(486);
			classElements();
			setState(487);
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
	public static class ClassElementsContext extends ParserRuleContext {
		public List<ClassElementContext> classElement() {
			return getRuleContexts(ClassElementContext.class);
		}
		public ClassElementContext classElement(int i) {
			return getRuleContext(ClassElementContext.class,i);
		}
		public ClassElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterClassElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitClassElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitClassElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassElementsContext classElements() throws RecognitionException {
		ClassElementsContext _localctx = new ClassElementsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_classElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 281474976711688L) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & 7L) != 0)) {
				{
				{
				setState(489);
				classElement();
				}
				}
				setState(494);
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
		public TerminalNode Static() { return getToken(ReactJSParser.Static, 0); }
		public ClassFieldDefinitionContext(ClassElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterClassFieldDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitClassFieldDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitClassFieldDefinition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassMethodDefinitionContext extends ClassElementContext {
		public MethodDefinitionContext methodDefinition() {
			return getRuleContext(MethodDefinitionContext.class,0);
		}
		public TerminalNode Static() { return getToken(ReactJSParser.Static, 0); }
		public ClassMethodDefinitionContext(ClassElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterClassMethodDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitClassMethodDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitClassMethodDefinition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassEmptyStatementContext extends ClassElementContext {
		public TerminalNode SemiColon() { return getToken(ReactJSParser.SemiColon, 0); }
		public ClassEmptyStatementContext(ClassElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterClassEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitClassEmptyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitClassEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassElementContext classElement() throws RecognitionException {
		ClassElementContext _localctx = new ClassElementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_classElement);
		int _la;
		try {
			setState(504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				_localctx = new ClassMethodDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Static) {
					{
					setState(495);
					match(Static);
					}
				}

				setState(498);
				methodDefinition();
				}
				break;
			case 2:
				_localctx = new ClassFieldDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Static) {
					{
					setState(499);
					match(Static);
					}
				}

				setState(502);
				fieldDefinition();
				}
				break;
			case 3:
				_localctx = new ClassEmptyStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(503);
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
		public TerminalNode OpenParen() { return getToken(ReactJSParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ReactJSParser.CloseParen, 0); }
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterMethodDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitMethodDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitMethodDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDefinitionContext methodDefinition() throws RecognitionException {
		MethodDefinitionContext _localctx = new MethodDefinitionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_methodDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			propertyName();
			setState(507);
			match(OpenParen);
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 65672L) != 0) || _la==Identifier) {
				{
				setState(508);
				formalParameterList();
				}
			}

			setState(511);
			match(CloseParen);
			setState(512);
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
		public TerminalNode Assign() { return getToken(ReactJSParser.Assign, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public FieldDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterFieldDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitFieldDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitFieldDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDefinitionContext fieldDefinition() throws RecognitionException {
		FieldDefinitionContext _localctx = new FieldDefinitionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_fieldDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			propertyName();
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(515);
				match(Assign);
				setState(516);
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
	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterArgContext> formalParameterArg() {
			return getRuleContexts(FormalParameterArgContext.class);
		}
		public FormalParameterArgContext formalParameterArg(int i) {
			return getRuleContext(FormalParameterArgContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ReactJSParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactJSParser.Comma, i);
		}
		public LastFormalParameterArgContext lastFormalParameterArg() {
			return getRuleContext(LastFormalParameterArgContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(532);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBracket:
			case OpenBrace:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(519);
				formalParameterArg();
				setState(524);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(520);
						match(Comma);
						setState(521);
						formalParameterArg();
						}
						} 
					}
					setState(526);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				}
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(527);
					match(Comma);
					setState(528);
					lastFormalParameterArg();
					}
				}

				}
				break;
			case Ellipsis:
				enterOuterAlt(_localctx, 2);
				{
				setState(531);
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
		public TerminalNode Assign() { return getToken(ReactJSParser.Assign, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public FormalParameterArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterFormalParameterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitFormalParameterArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitFormalParameterArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterArgContext formalParameterArg() throws RecognitionException {
		FormalParameterArgContext _localctx = new FormalParameterArgContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_formalParameterArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			assignable();
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(535);
				match(Assign);
				setState(536);
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
		public TerminalNode Ellipsis() { return getToken(ReactJSParser.Ellipsis, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public LastFormalParameterArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameterArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterLastFormalParameterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitLastFormalParameterArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitLastFormalParameterArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParameterArgContext lastFormalParameterArg() throws RecognitionException {
		LastFormalParameterArgContext _localctx = new LastFormalParameterArgContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_lastFormalParameterArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(Ellipsis);
			setState(540);
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
		public TerminalNode OpenBrace() { return getToken(ReactJSParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ReactJSParser.CloseBrace, 0); }
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_functionBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(OpenBrace);
			setState(548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(544); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(543);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(546); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
			setState(550);
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
		public TerminalNode OpenBracket() { return getToken(ReactJSParser.OpenBracket, 0); }
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(ReactJSParser.CloseBracket, 0); }
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_arrayLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(552);
			match(OpenBracket);
			setState(553);
			elementList();
			setState(554);
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
		public List<TerminalNode> Comma() { return getTokens(ReactJSParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactJSParser.Comma, i);
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitElementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitElementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_elementList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(556);
					match(Comma);
					}
					} 
				}
				setState(561);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9202613257314172760L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1077416977L) != 0)) {
				{
				setState(562);
				arrayElement();
				}
			}

			setState(573);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(566); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(565);
						match(Comma);
						}
						}
						setState(568); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Comma );
					setState(570);
					arrayElement();
					}
					} 
				}
				setState(575);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(576);
				match(Comma);
				}
				}
				setState(581);
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
		public TerminalNode Ellipsis() { return getToken(ReactJSParser.Ellipsis, 0); }
		public ArrayElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterArrayElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitArrayElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitArrayElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayElementContext arrayElement() throws RecognitionException {
		ArrayElementContext _localctx = new ArrayElementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_arrayElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(582);
				match(Ellipsis);
				}
			}

			setState(585);
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
		public TerminalNode Colon() { return getToken(ReactJSParser.Colon, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PropertyExpressionAssignmentContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterPropertyExpressionAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitPropertyExpressionAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitPropertyExpressionAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComputedPropertyExpressionAssignmentContext extends PropertyAssignmentContext {
		public TerminalNode OpenBracket() { return getToken(ReactJSParser.OpenBracket, 0); }
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode CloseBracket() { return getToken(ReactJSParser.CloseBracket, 0); }
		public TerminalNode Colon() { return getToken(ReactJSParser.Colon, 0); }
		public ComputedPropertyExpressionAssignmentContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterComputedPropertyExpressionAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitComputedPropertyExpressionAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitComputedPropertyExpressionAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyShorthandContext extends PropertyAssignmentContext {
		public TerminalNode Ellipsis() { return getToken(ReactJSParser.Ellipsis, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PropertyShorthandContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterPropertyShorthand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitPropertyShorthand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitPropertyShorthand(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyIdentifierShorthandContext extends PropertyAssignmentContext {
		public TerminalNode Identifier() { return getToken(ReactJSParser.Identifier, 0); }
		public PropertyIdentifierShorthandContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterPropertyIdentifierShorthand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitPropertyIdentifierShorthand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitPropertyIdentifierShorthand(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionPropertyContext extends PropertyAssignmentContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(ReactJSParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ReactJSParser.CloseParen, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionPropertyContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterFunctionProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitFunctionProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitFunctionProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyAssignmentContext propertyAssignment() throws RecognitionException {
		PropertyAssignmentContext _localctx = new PropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_propertyAssignment);
		int _la;
		try {
			setState(608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				_localctx = new PropertyExpressionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(587);
				propertyName();
				setState(588);
				match(Colon);
				setState(589);
				singleExpression(0);
				}
				break;
			case 2:
				_localctx = new ComputedPropertyExpressionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(591);
				match(OpenBracket);
				setState(592);
				singleExpression(0);
				setState(593);
				match(CloseBracket);
				setState(594);
				match(Colon);
				setState(595);
				singleExpression(0);
				}
				break;
			case 3:
				_localctx = new FunctionPropertyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(597);
				propertyName();
				setState(598);
				match(OpenParen);
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 65672L) != 0) || _la==Identifier) {
					{
					setState(599);
					formalParameterList();
					}
				}

				setState(602);
				match(CloseParen);
				setState(603);
				functionBody();
				}
				break;
			case 4:
				_localctx = new PropertyIdentifierShorthandContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(605);
				match(Identifier);
				}
				break;
			case 5:
				_localctx = new PropertyShorthandContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(606);
				match(Ellipsis);
				setState(607);
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
		public TerminalNode StringLiteral() { return getToken(ReactJSParser.StringLiteral, 0); }
		public PropertyByStringContext(PropertyNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterPropertyByString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitPropertyByString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitPropertyByString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyByExpressionContext extends PropertyNameContext {
		public TerminalNode OpenBracket() { return getToken(ReactJSParser.OpenBracket, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(ReactJSParser.CloseBracket, 0); }
		public PropertyByExpressionContext(PropertyNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterPropertyByExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitPropertyByExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitPropertyByExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyByNumberContext extends PropertyNameContext {
		public TerminalNode DecimalLiteral() { return getToken(ReactJSParser.DecimalLiteral, 0); }
		public PropertyByNumberContext(PropertyNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterPropertyByNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitPropertyByNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitPropertyByNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyByNameContext extends PropertyNameContext {
		public TerminalNode Identifier() { return getToken(ReactJSParser.Identifier, 0); }
		public PropertyByNameContext(PropertyNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterPropertyByName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitPropertyByName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitPropertyByName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyNameContext propertyName() throws RecognitionException {
		PropertyNameContext _localctx = new PropertyNameContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_propertyName);
		try {
			setState(617);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				_localctx = new PropertyByNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(610);
				match(Identifier);
				}
				break;
			case StringLiteral:
				_localctx = new PropertyByStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(611);
				match(StringLiteral);
				}
				break;
			case DecimalLiteral:
				_localctx = new PropertyByNumberContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(612);
				match(DecimalLiteral);
				}
				break;
			case OpenBracket:
				_localctx = new PropertyByExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(613);
				match(OpenBracket);
				setState(614);
				singleExpression(0);
				setState(615);
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
		public TerminalNode OpenParen() { return getToken(ReactJSParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ReactJSParser.CloseParen, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ReactJSParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactJSParser.Comma, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_arguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			match(OpenParen);
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9202613257314172760L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1077416977L) != 0)) {
				{
				setState(620);
				argument();
				setState(625);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(621);
						match(Comma);
						setState(622);
						argument();
						}
						} 
					}
					setState(627);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				}
				setState(629);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(628);
					match(Comma);
					}
				}

				}
			}

			setState(633);
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
		public TerminalNode Identifier() { return getToken(ReactJSParser.Identifier, 0); }
		public TerminalNode Ellipsis() { return getToken(ReactJSParser.Ellipsis, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(635);
				match(Ellipsis);
				}
			}

			setState(640);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(638);
				singleExpression(0);
				}
				break;
			case 2:
				{
				setState(639);
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
		public List<TerminalNode> Comma() { return getTokens(ReactJSParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactJSParser.Comma, i);
		}
		public ExpressionSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterExpressionSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitExpressionSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitExpressionSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionSequenceContext expressionSequence() throws RecognitionException {
		ExpressionSequenceContext _localctx = new ExpressionSequenceContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_expressionSequence);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			singleExpression(0);
			setState(647);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(643);
					match(Comma);
					setState(644);
					singleExpression(0);
					}
					} 
				}
				setState(649);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterTemplateStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitTemplateStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitTemplateStringExpression(this);
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
		public TerminalNode QuestionMark() { return getToken(ReactJSParser.QuestionMark, 0); }
		public TerminalNode Colon() { return getToken(ReactJSParser.Colon, 0); }
		public TernaryExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitTernaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitTernaryExpression(this);
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
		public TerminalNode And() { return getToken(ReactJSParser.And, 0); }
		public LogicalAndExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
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
		public TerminalNode Power() { return getToken(ReactJSParser.Power, 0); }
		public PowerExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterPowerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitPowerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitPowerExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PreIncrementExpressionContext extends SingleExpressionContext {
		public TerminalNode PlusPlus() { return getToken(ReactJSParser.PlusPlus, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PreIncrementExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterPreIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitPreIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitPreIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JSXExpressionContext extends SingleExpressionContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public JSXExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterJSXExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitJSXExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitJSXExpression(this);
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterObjectLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitObjectLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitObjectLiteralExpression(this);
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
		public TerminalNode Or() { return getToken(ReactJSParser.Or, 0); }
		public LogicalOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
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
		public TerminalNode QuestionMarkDot() { return getToken(ReactJSParser.QuestionMarkDot, 0); }
		public OptionalChainExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterOptionalChainExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitOptionalChainExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitOptionalChainExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExpressionContext extends SingleExpressionContext {
		public TerminalNode Not() { return getToken(ReactJSParser.Not, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public NotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PreDecreaseExpressionContext extends SingleExpressionContext {
		public TerminalNode MinusMinus() { return getToken(ReactJSParser.MinusMinus, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PreDecreaseExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterPreDecreaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitPreDecreaseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitPreDecreaseExpression(this);
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterArgumentsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitArgumentsExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitArgumentsExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThisExpressionContext extends SingleExpressionContext {
		public TerminalNode This() { return getToken(ReactJSParser.This, 0); }
		public ThisExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterThisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitThisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitThisExpression(this);
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitFunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitFunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryMinusExpressionContext extends SingleExpressionContext {
		public TerminalNode Minus() { return getToken(ReactJSParser.Minus, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public UnaryMinusExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterUnaryMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitUnaryMinusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitUnaryMinusExpression(this);
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
		public TerminalNode Assign() { return getToken(ReactJSParser.Assign, 0); }
		public AssignmentExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostDecreaseExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode MinusMinus() { return getToken(ReactJSParser.MinusMinus, 0); }
		public PostDecreaseExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterPostDecreaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitPostDecreaseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitPostDecreaseExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeofExpressionContext extends SingleExpressionContext {
		public TerminalNode Typeof() { return getToken(ReactJSParser.Typeof, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TypeofExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterTypeofExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitTypeofExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitTypeofExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryPlusExpressionContext extends SingleExpressionContext {
		public TerminalNode Plus() { return getToken(ReactJSParser.Plus, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public UnaryPlusExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterUnaryPlusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitUnaryPlusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitUnaryPlusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeleteExpressionContext extends SingleExpressionContext {
		public TerminalNode Delete() { return getToken(ReactJSParser.Delete, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public DeleteExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterDeleteExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitDeleteExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitDeleteExpression(this);
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
		public TerminalNode Equals_() { return getToken(ReactJSParser.Equals_, 0); }
		public TerminalNode NotEquals() { return getToken(ReactJSParser.NotEquals, 0); }
		public TerminalNode IdentityEquals() { return getToken(ReactJSParser.IdentityEquals, 0); }
		public TerminalNode IdentityNotEquals() { return getToken(ReactJSParser.IdentityNotEquals, 0); }
		public EqualityExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SuperExpressionContext extends SingleExpressionContext {
		public TerminalNode Super() { return getToken(ReactJSParser.Super, 0); }
		public SuperExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterSuperExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitSuperExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitSuperExpression(this);
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
		public TerminalNode Multiply() { return getToken(ReactJSParser.Multiply, 0); }
		public TerminalNode Divide() { return getToken(ReactJSParser.Divide, 0); }
		public TerminalNode Modulus() { return getToken(ReactJSParser.Modulus, 0); }
		public MultiplicativeExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedExpressionContext extends SingleExpressionContext {
		public TerminalNode OpenParen() { return getToken(ReactJSParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactJSParser.CloseParen, 0); }
		public ParenthesizedExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
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
		public TerminalNode Plus() { return getToken(ReactJSParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(ReactJSParser.Minus, 0); }
		public AdditiveExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
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
		public TerminalNode LessThan() { return getToken(ReactJSParser.LessThan, 0); }
		public TerminalNode MoreThan() { return getToken(ReactJSParser.MoreThan, 0); }
		public TerminalNode LessThanEquals() { return getToken(ReactJSParser.LessThanEquals, 0); }
		public TerminalNode GreaterThanEquals() { return getToken(ReactJSParser.GreaterThanEquals, 0); }
		public RelationalExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostIncrementExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(ReactJSParser.PlusPlus, 0); }
		public PostIncrementExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterPostIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitPostIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitPostIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewExpressionContext extends SingleExpressionContext {
		public TerminalNode New() { return getToken(ReactJSParser.New, 0); }
		public TerminalNode Identifier() { return getToken(ReactJSParser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public NewExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitNewExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitNewExpression(this);
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitLiteralExpression(this);
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterArrayLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitArrayLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitArrayLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberDotExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode Dot() { return getToken(ReactJSParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(ReactJSParser.Identifier, 0); }
		public TerminalNode QuestionMark() { return getToken(ReactJSParser.QuestionMark, 0); }
		public MemberDotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterMemberDotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitMemberDotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitMemberDotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassExpressionContext extends SingleExpressionContext {
		public TerminalNode Class() { return getToken(ReactJSParser.Class, 0); }
		public ClassTailContext classTail() {
			return getRuleContext(ClassTailContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ReactJSParser.Identifier, 0); }
		public ClassExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterClassExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitClassExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitClassExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberIndexExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode OpenBracket() { return getToken(ReactJSParser.OpenBracket, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(ReactJSParser.CloseBracket, 0); }
		public TerminalNode QuestionMarkDot() { return getToken(ReactJSParser.QuestionMarkDot, 0); }
		public MemberIndexExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterMemberIndexExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitMemberIndexExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitMemberIndexExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierExpressionContext extends SingleExpressionContext {
		public TerminalNode Identifier() { return getToken(ReactJSParser.Identifier, 0); }
		public IdentifierExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitIdentifierExpression(this);
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterAssignmentOperatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitAssignmentOperatorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitAssignmentOperatorExpression(this);
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
		public TerminalNode NullCoalesce() { return getToken(ReactJSParser.NullCoalesce, 0); }
		public CoalesceExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterCoalesceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitCoalesceExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitCoalesceExpression(this);
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
		int _startState = 104;
		enterRecursionRule(_localctx, 104, RULE_singleExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				_localctx = new FunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(651);
				anonymousFunction();
				}
				break;
			case 2:
				{
				_localctx = new ClassExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(652);
				match(Class);
				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(653);
					match(Identifier);
					}
				}

				setState(656);
				classTail();
				}
				break;
			case 3:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(657);
				match(New);
				setState(658);
				match(Identifier);
				setState(659);
				arguments();
				}
				break;
			case 4:
				{
				_localctx = new DeleteExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(660);
				match(Delete);
				setState(661);
				singleExpression(27);
				}
				break;
			case 5:
				{
				_localctx = new TypeofExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(662);
				match(Typeof);
				setState(663);
				singleExpression(26);
				}
				break;
			case 6:
				{
				_localctx = new PreIncrementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(664);
				match(PlusPlus);
				setState(665);
				singleExpression(25);
				}
				break;
			case 7:
				{
				_localctx = new PreDecreaseExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(666);
				match(MinusMinus);
				setState(667);
				singleExpression(24);
				}
				break;
			case 8:
				{
				_localctx = new UnaryPlusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(668);
				match(Plus);
				setState(669);
				singleExpression(23);
				}
				break;
			case 9:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(670);
				match(Minus);
				setState(671);
				singleExpression(22);
				}
				break;
			case 10:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(672);
				match(Not);
				setState(673);
				singleExpression(21);
				}
				break;
			case 11:
				{
				_localctx = new ThisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(674);
				match(This);
				}
				break;
			case 12:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(675);
				match(Identifier);
				}
				break;
			case 13:
				{
				_localctx = new SuperExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(676);
				match(Super);
				}
				break;
			case 14:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(677);
				literal();
				}
				break;
			case 15:
				{
				_localctx = new ArrayLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(678);
				arrayLiteral();
				}
				break;
			case 16:
				{
				_localctx = new ObjectLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(679);
				objectLiteral();
				}
				break;
			case 17:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(680);
				match(OpenParen);
				setState(681);
				expressionSequence();
				setState(682);
				match(CloseParen);
				}
				break;
			case 18:
				{
				_localctx = new JSXExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(684);
				htmlElement();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(751);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(749);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
					case 1:
						{
						_localctx = new OptionalChainExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(687);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(688);
						match(QuestionMarkDot);
						setState(689);
						singleExpression(35);
						}
						break;
					case 2:
						{
						_localctx = new PowerExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(690);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(691);
						match(Power);
						setState(692);
						singleExpression(20);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(693);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(694);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 58720256L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(695);
						singleExpression(20);
						}
						break;
					case 4:
						{
						_localctx = new AdditiveExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(696);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(697);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(698);
						singleExpression(19);
						}
						break;
					case 5:
						{
						_localctx = new CoalesceExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(699);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(700);
						match(NullCoalesce);
						setState(701);
						singleExpression(18);
						}
						break;
					case 6:
						{
						_localctx = new RelationalExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(702);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(703);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4026531840L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(704);
						singleExpression(17);
						}
						break;
					case 7:
						{
						_localctx = new EqualityExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(705);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(706);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 64424509440L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(707);
						singleExpression(16);
						}
						break;
					case 8:
						{
						_localctx = new LogicalAndExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(708);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(709);
						match(And);
						setState(710);
						singleExpression(15);
						}
						break;
					case 9:
						{
						_localctx = new LogicalOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(711);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(712);
						match(Or);
						setState(713);
						singleExpression(14);
						}
						break;
					case 10:
						{
						_localctx = new TernaryExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(714);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(715);
						match(QuestionMark);
						setState(716);
						singleExpression(0);
						setState(717);
						match(Colon);
						setState(718);
						singleExpression(13);
						}
						break;
					case 11:
						{
						_localctx = new AssignmentExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(720);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(721);
						match(Assign);
						setState(722);
						singleExpression(11);
						}
						break;
					case 12:
						{
						_localctx = new AssignmentOperatorExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(723);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(724);
						assignmentOperator();
						setState(725);
						singleExpression(10);
						}
						break;
					case 13:
						{
						_localctx = new MemberIndexExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(727);
						if (!(precpred(_ctx, 33))) throw new FailedPredicateException(this, "precpred(_ctx, 33)");
						setState(729);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==QuestionMarkDot) {
							{
							setState(728);
							match(QuestionMarkDot);
							}
						}

						setState(731);
						match(OpenBracket);
						setState(732);
						expressionSequence();
						setState(733);
						match(CloseBracket);
						}
						break;
					case 14:
						{
						_localctx = new MemberDotExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(735);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(737);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==QuestionMark) {
							{
							setState(736);
							match(QuestionMark);
							}
						}

						setState(739);
						match(Dot);
						setState(740);
						match(Identifier);
						}
						break;
					case 15:
						{
						_localctx = new ArgumentsExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(741);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(742);
						arguments();
						}
						break;
					case 16:
						{
						_localctx = new PostIncrementExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(743);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(744);
						match(PlusPlus);
						}
						break;
					case 17:
						{
						_localctx = new PostDecreaseExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(745);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(746);
						match(MinusMinus);
						}
						break;
					case 18:
						{
						_localctx = new TemplateStringExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(747);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(748);
						templateStringLiteral();
						}
						break;
					}
					} 
				}
				setState(753);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterVariableByObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitVariableByObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitVariableByObject(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableByNameContext extends AssignableContext {
		public TerminalNode Identifier() { return getToken(ReactJSParser.Identifier, 0); }
		public VariableByNameContext(AssignableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterVariableByName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitVariableByName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitVariableByName(this);
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterVariableByArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitVariableByArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitVariableByArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignableContext assignable() throws RecognitionException {
		AssignableContext _localctx = new AssignableContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_assignable);
		try {
			setState(757);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				_localctx = new VariableByNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(754);
				match(Identifier);
				}
				break;
			case OpenBracket:
				_localctx = new VariableByArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(755);
				arrayLiteral();
				}
				break;
			case OpenBrace:
				_localctx = new VariableByObjectContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(756);
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
		public TerminalNode OpenBrace() { return getToken(ReactJSParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ReactJSParser.CloseBrace, 0); }
		public List<PropertyAssignmentContext> propertyAssignment() {
			return getRuleContexts(PropertyAssignmentContext.class);
		}
		public PropertyAssignmentContext propertyAssignment(int i) {
			return getRuleContext(PropertyAssignmentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ReactJSParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactJSParser.Comma, i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitObjectLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitObjectLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_objectLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			match(OpenBrace);
			setState(771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 281474976776200L) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(760);
				propertyAssignment();
				setState(765);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(761);
						match(Comma);
						setState(762);
						propertyAssignment();
						}
						} 
					}
					setState(767);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				}
				setState(769);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(768);
					match(Comma);
					}
				}

				}
			}

			setState(773);
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
		public TerminalNode Function_() { return getToken(ReactJSParser.Function_, 0); }
		public TerminalNode OpenParen() { return getToken(ReactJSParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ReactJSParser.CloseParen, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public AnonymousFunctionDeclContext(AnonymousFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterAnonymousFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitAnonymousFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitAnonymousFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrowFunctionContext extends AnonymousFunctionContext {
		public ArrowFunctionParametersContext arrowFunctionParameters() {
			return getRuleContext(ArrowFunctionParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(ReactJSParser.ARROW, 0); }
		public ArrowFunctionBodyContext arrowFunctionBody() {
			return getRuleContext(ArrowFunctionBodyContext.class,0);
		}
		public ArrowFunctionContext(AnonymousFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterArrowFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitArrowFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitArrowFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnonymousFunctionContext anonymousFunction() throws RecognitionException {
		AnonymousFunctionContext _localctx = new AnonymousFunctionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_anonymousFunction);
		int _la;
		try {
			setState(786);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function_:
				_localctx = new AnonymousFunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(775);
				match(Function_);
				setState(776);
				match(OpenParen);
				setState(778);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 65672L) != 0) || _la==Identifier) {
					{
					setState(777);
					formalParameterList();
					}
				}

				setState(780);
				match(CloseParen);
				setState(781);
				functionBody();
				}
				break;
			case OpenParen:
			case Identifier:
				_localctx = new ArrowFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(782);
				arrowFunctionParameters();
				setState(783);
				match(ARROW);
				setState(784);
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
		public TerminalNode Identifier() { return getToken(ReactJSParser.Identifier, 0); }
		public TerminalNode OpenParen() { return getToken(ReactJSParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ReactJSParser.CloseParen, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ArrowFunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunctionParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterArrowFunctionParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitArrowFunctionParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitArrowFunctionParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowFunctionParametersContext arrowFunctionParameters() throws RecognitionException {
		ArrowFunctionParametersContext _localctx = new ArrowFunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_arrowFunctionParameters);
		int _la;
		try {
			setState(794);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(788);
				match(Identifier);
				}
				break;
			case OpenParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(789);
				match(OpenParen);
				setState(791);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 65672L) != 0) || _la==Identifier) {
					{
					setState(790);
					formalParameterList();
					}
				}

				setState(793);
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
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public ArrowFunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunctionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterArrowFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitArrowFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitArrowFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowFunctionBodyContext arrowFunctionBody() throws RecognitionException {
		ArrowFunctionBodyContext _localctx = new ArrowFunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_arrowFunctionBody);
		try {
			setState(798);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(796);
				singleExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(797);
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
		public TerminalNode MultiplyAssign() { return getToken(ReactJSParser.MultiplyAssign, 0); }
		public MultiplyOperatorContext(AssignmentOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterMultiplyOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitMultiplyOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitMultiplyOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivideOperatorContext extends AssignmentOperatorContext {
		public TerminalNode DivideAssign() { return getToken(ReactJSParser.DivideAssign, 0); }
		public DivideOperatorContext(AssignmentOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterDivideOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitDivideOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitDivideOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowerOperatorContext extends AssignmentOperatorContext {
		public TerminalNode PowerAssign() { return getToken(ReactJSParser.PowerAssign, 0); }
		public PowerOperatorContext(AssignmentOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterPowerOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitPowerOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitPowerOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullishOperatorContext extends AssignmentOperatorContext {
		public TerminalNode NullishCoalescingAssign() { return getToken(ReactJSParser.NullishCoalescingAssign, 0); }
		public NullishOperatorContext(AssignmentOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterNullishOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitNullishOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitNullishOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinusOperatorContext extends AssignmentOperatorContext {
		public TerminalNode MinusAssign() { return getToken(ReactJSParser.MinusAssign, 0); }
		public MinusOperatorContext(AssignmentOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterMinusOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitMinusOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitMinusOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModulusOperatorContext extends AssignmentOperatorContext {
		public TerminalNode ModulusAssign() { return getToken(ReactJSParser.ModulusAssign, 0); }
		public ModulusOperatorContext(AssignmentOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterModulusOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitModulusOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitModulusOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusOperatorContext extends AssignmentOperatorContext {
		public TerminalNode PlusAssign() { return getToken(ReactJSParser.PlusAssign, 0); }
		public PlusOperatorContext(AssignmentOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterPlusOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitPlusOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitPlusOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_assignmentOperator);
		try {
			setState(807);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MultiplyAssign:
				_localctx = new MultiplyOperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(800);
				match(MultiplyAssign);
				}
				break;
			case DivideAssign:
				_localctx = new DivideOperatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(801);
				match(DivideAssign);
				}
				break;
			case ModulusAssign:
				_localctx = new ModulusOperatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(802);
				match(ModulusAssign);
				}
				break;
			case PlusAssign:
				_localctx = new PlusOperatorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(803);
				match(PlusAssign);
				}
				break;
			case MinusAssign:
				_localctx = new MinusOperatorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(804);
				match(MinusAssign);
				}
				break;
			case PowerAssign:
				_localctx = new PowerOperatorContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(805);
				match(PowerAssign);
				}
				break;
			case NullishCoalescingAssign:
				_localctx = new NullishOperatorContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(806);
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterTemplateString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitTemplateString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitTemplateString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullContext extends LiteralContext {
		public TerminalNode NullLiteral() { return getToken(ReactJSParser.NullLiteral, 0); }
		public NullContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitNull(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends LiteralContext {
		public TerminalNode DecimalLiteral() { return getToken(ReactJSParser.DecimalLiteral, 0); }
		public NumberContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends LiteralContext {
		public TerminalNode StringLiteral() { return getToken(ReactJSParser.StringLiteral, 0); }
		public StringContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanContext extends LiteralContext {
		public TerminalNode BooleanLiteral() { return getToken(ReactJSParser.BooleanLiteral, 0); }
		public BooleanContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_literal);
		try {
			setState(814);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NullLiteral:
				_localctx = new NullContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(809);
				match(NullLiteral);
				}
				break;
			case BooleanLiteral:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(810);
				match(BooleanLiteral);
				}
				break;
			case StringLiteral:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(811);
				match(StringLiteral);
				}
				break;
			case BackTick:
				_localctx = new TemplateStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(812);
				templateStringLiteral();
				}
				break;
			case DecimalLiteral:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(813);
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
		public List<TerminalNode> BackTick() { return getTokens(ReactJSParser.BackTick); }
		public TerminalNode BackTick(int i) {
			return getToken(ReactJSParser.BackTick, i);
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterTemplateStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitTemplateStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitTemplateStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateStringLiteralContext templateStringLiteral() throws RecognitionException {
		TemplateStringLiteralContext _localctx = new TemplateStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_templateStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			match(BackTick);
			setState(820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TemplateStringStartExpression || _la==TemplateStringAtom) {
				{
				{
				setState(817);
				templateStringAtom();
				}
				}
				setState(822);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(823);
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
		public TerminalNode TemplateStringAtom() { return getToken(ReactJSParser.TemplateStringAtom, 0); }
		public TemplateStringCharacterContext(TemplateStringAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterTemplateStringCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitTemplateStringCharacter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitTemplateStringCharacter(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateStringJSExpressionContext extends TemplateStringAtomContext {
		public TerminalNode TemplateStringStartExpression() { return getToken(ReactJSParser.TemplateStringStartExpression, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode TemplateCloseBrace() { return getToken(ReactJSParser.TemplateCloseBrace, 0); }
		public TemplateStringJSExpressionContext(TemplateStringAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterTemplateStringJSExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitTemplateStringJSExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitTemplateStringJSExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateStringAtomContext templateStringAtom() throws RecognitionException {
		TemplateStringAtomContext _localctx = new TemplateStringAtomContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_templateStringAtom);
		try {
			setState(830);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TemplateStringAtom:
				_localctx = new TemplateStringCharacterContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(825);
				match(TemplateStringAtom);
				}
				break;
			case TemplateStringStartExpression:
				_localctx = new TemplateStringJSExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(826);
				match(TemplateStringStartExpression);
				setState(827);
				singleExpression(0);
				setState(828);
				match(TemplateCloseBrace);
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
	public static class Let_Context extends ParserRuleContext {
		public TerminalNode NonStrictLet() { return getToken(ReactJSParser.NonStrictLet, 0); }
		public TerminalNode StrictLet() { return getToken(ReactJSParser.StrictLet, 0); }
		public Let_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterLet_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitLet_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitLet_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Let_Context let_() throws RecognitionException {
		Let_Context _localctx = new Let_Context(_ctx, getState());
		enterRule(_localctx, 124, RULE_let_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			_la = _input.LA(1);
			if ( !(_la==StrictLet || _la==NonStrictLet) ) {
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
	public static class EosContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(ReactJSParser.SemiColon, 0); }
		public TerminalNode EOF() { return getToken(ReactJSParser.EOF, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitEos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitEos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_eos);
		try {
			setState(838);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(834);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(835);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(836);
				if (!(this.lineTerminatorAhead())) throw new FailedPredicateException(this, "this.lineTerminatorAhead()");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(837);
				if (!(this.closeBrace())) throw new FailedPredicateException(this, "this.closeBrace()");
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
	public static class HtmlDocumentContext extends ParserRuleContext {
		public TerminalNode DOCTYPE() { return getToken(ReactJSParser.DOCTYPE, 0); }
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterHtmlDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitHtmlDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitHtmlDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlDocumentContext htmlDocument() throws RecognitionException {
		HtmlDocumentContext _localctx = new HtmlDocumentContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_htmlDocument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOCTYPE) {
				{
				setState(840);
				match(DOCTYPE);
				}
			}

			setState(844);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HTML_COMMENT || _la==SEA_WS) {
				{
				setState(843);
				htmlMisc();
				}
			}

			setState(852);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_OPEN) {
				{
				{
				setState(846);
				htmlElement();
				setState(848);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HTML_COMMENT || _la==SEA_WS) {
					{
					setState(847);
					htmlMisc();
					}
				}

				}
				}
				setState(854);
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
		public TerminalNode TAG_OPEN() { return getToken(ReactJSParser.TAG_OPEN, 0); }
		public TerminalNode TAG_NAME() { return getToken(ReactJSParser.TAG_NAME, 0); }
		public TerminalNode TAG_SLASH_CLOSE() { return getToken(ReactJSParser.TAG_SLASH_CLOSE, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public SelfClosedElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterSelfClosedElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitSelfClosedElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitSelfClosedElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalElementContext extends HtmlElementContext {
		public List<TerminalNode> TAG_OPEN() { return getTokens(ReactJSParser.TAG_OPEN); }
		public TerminalNode TAG_OPEN(int i) {
			return getToken(ReactJSParser.TAG_OPEN, i);
		}
		public List<TerminalNode> TAG_NAME() { return getTokens(ReactJSParser.TAG_NAME); }
		public TerminalNode TAG_NAME(int i) {
			return getToken(ReactJSParser.TAG_NAME, i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(ReactJSParser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(ReactJSParser.TAG_CLOSE, i);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public TerminalNode TAG_SLASH() { return getToken(ReactJSParser.TAG_SLASH, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public NormalElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
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

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_htmlElement);
		int _la;
		try {
			setState(879);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				_localctx = new NormalElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(855);
				match(TAG_OPEN);
				setState(856);
				match(TAG_NAME);
				setState(860);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_NAME) {
					{
					{
					setState(857);
					htmlAttribute();
					}
					}
					setState(862);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(863);
				match(TAG_CLOSE);
				setState(864);
				htmlContent();
				setState(865);
				match(TAG_OPEN);
				setState(866);
				match(TAG_SLASH);
				setState(867);
				match(TAG_NAME);
				setState(868);
				match(TAG_CLOSE);
				}
				break;
			case 2:
				_localctx = new SelfClosedElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(870);
				match(TAG_OPEN);
				setState(871);
				match(TAG_NAME);
				setState(875);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_NAME) {
					{
					{
					setState(872);
					htmlAttribute();
					}
					}
					setState(877);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(878);
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
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_htmlContent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenBrace || _la==SEA_WS || _la==HTML_TEXT) {
				{
				setState(881);
				htmlChardata();
				}
			}

			setState(893);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(886);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TAG_OPEN:
						{
						setState(884);
						htmlElement();
						}
						break;
					case HTML_COMMENT:
						{
						setState(885);
						htmlComment();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(889);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OpenBrace || _la==SEA_WS || _la==HTML_TEXT) {
						{
						setState(888);
						htmlChardata();
						}
					}

					}
					} 
				}
				setState(895);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
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
		public TerminalNode TAG_NAME() { return getToken(ReactJSParser.TAG_NAME, 0); }
		public TerminalNode TAG_EQUALS() { return getToken(ReactJSParser.TAG_EQUALS, 0); }
		public TerminalNode ATTVALUE_VALUE() { return getToken(ReactJSParser.ATTVALUE_VALUE, 0); }
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterHtmlAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitHtmlAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitHtmlAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_htmlAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(896);
			match(TAG_NAME);
			setState(899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAG_EQUALS) {
				{
				setState(897);
				match(TAG_EQUALS);
				setState(898);
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
		public List<MixedTextContext> mixedText() {
			return getRuleContexts(MixedTextContext.class);
		}
		public MixedTextContext mixedText(int i) {
			return getRuleContext(MixedTextContext.class,i);
		}
		public TerminalNode SEA_WS() { return getToken(ReactJSParser.SEA_WS, 0); }
		public HtmlChardataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlChardata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterHtmlChardata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitHtmlChardata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitHtmlChardata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlChardataContext htmlChardata() throws RecognitionException {
		HtmlChardataContext _localctx = new HtmlChardataContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_htmlChardata);
		int _la;
		try {
			setState(907);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBrace:
			case HTML_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(902); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(901);
					mixedText();
					}
					}
					setState(904); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OpenBrace || _la==HTML_TEXT );
				}
				break;
			case SEA_WS:
				enterOuterAlt(_localctx, 2);
				{
				setState(906);
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
	public static class MixedTextContext extends ParserRuleContext {
		public TerminalNode HTML_TEXT() { return getToken(ReactJSParser.HTML_TEXT, 0); }
		public TerminalNode OpenBrace() { return getToken(ReactJSParser.OpenBrace, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(ReactJSParser.CloseBrace, 0); }
		public MixedTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mixedText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterMixedText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitMixedText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitMixedText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MixedTextContext mixedText() throws RecognitionException {
		MixedTextContext _localctx = new MixedTextContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_mixedText);
		try {
			setState(914);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(909);
				match(HTML_TEXT);
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(910);
				match(OpenBrace);
				setState(911);
				singleExpression(0);
				setState(912);
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
	public static class HtmlMiscContext extends ParserRuleContext {
		public HtmlCommentContext htmlComment() {
			return getRuleContext(HtmlCommentContext.class,0);
		}
		public TerminalNode SEA_WS() { return getToken(ReactJSParser.SEA_WS, 0); }
		public HtmlMiscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlMisc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterHtmlMisc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitHtmlMisc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitHtmlMisc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlMiscContext htmlMisc() throws RecognitionException {
		HtmlMiscContext _localctx = new HtmlMiscContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_htmlMisc);
		try {
			setState(918);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(916);
				htmlComment();
				}
				break;
			case SEA_WS:
				enterOuterAlt(_localctx, 2);
				{
				setState(917);
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
		public TerminalNode HTML_COMMENT() { return getToken(ReactJSParser.HTML_COMMENT, 0); }
		public HtmlCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).enterHtmlComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactJSParserListener ) ((ReactJSParserListener)listener).exitHtmlComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactJSParserVisitor ) return ((ReactJSParserVisitor<? extends T>)visitor).visitHtmlComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlCommentContext htmlComment() throws RecognitionException {
		HtmlCommentContext _localctx = new HtmlCommentContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_htmlComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
			match(HTML_COMMENT);
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
		case 17:
			return expressionStatement_sempred((ExpressionStatementContext)_localctx, predIndex);
		case 21:
			return continueStatement_sempred((ContinueStatementContext)_localctx, predIndex);
		case 22:
			return breakStatement_sempred((BreakStatementContext)_localctx, predIndex);
		case 23:
			return returnStatement_sempred((ReturnStatementContext)_localctx, predIndex);
		case 29:
			return throwStatement_sempred((ThrowStatementContext)_localctx, predIndex);
		case 52:
			return singleExpression_sempred((SingleExpressionContext)_localctx, predIndex);
		case 63:
			return eos_sempred((EosContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressionStatement_sempred(ExpressionStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return this.notOpenBraceAndNotFunction();
		}
		return true;
	}
	private boolean continueStatement_sempred(ContinueStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return this.notLineTerminator();
		}
		return true;
	}
	private boolean breakStatement_sempred(BreakStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return this.notLineTerminator();
		}
		return true;
	}
	private boolean returnStatement_sempred(ReturnStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return this.notLineTerminator();
		}
		return true;
	}
	private boolean throwStatement_sempred(ThrowStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return this.notLineTerminator();
		}
		return true;
	}
	private boolean singleExpression_sempred(SingleExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 34);
		case 6:
			return precpred(_ctx, 20);
		case 7:
			return precpred(_ctx, 19);
		case 8:
			return precpred(_ctx, 18);
		case 9:
			return precpred(_ctx, 17);
		case 10:
			return precpred(_ctx, 16);
		case 11:
			return precpred(_ctx, 15);
		case 12:
			return precpred(_ctx, 14);
		case 13:
			return precpred(_ctx, 13);
		case 14:
			return precpred(_ctx, 12);
		case 15:
			return precpred(_ctx, 11);
		case 16:
			return precpred(_ctx, 10);
		case 17:
			return precpred(_ctx, 33);
		case 18:
			return precpred(_ctx, 32);
		case 19:
			return precpred(_ctx, 30);
		case 20:
			return precpred(_ctx, 29);
		case 21:
			return precpred(_ctx, 28);
		case 22:
			return precpred(_ctx, 9);
		}
		return true;
	}
	private boolean eos_sempred(EosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return this.lineTerminatorAhead();
		case 24:
			return this.closeBrace();
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001g\u039b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0001\u0000\u0001\u0000\u0003\u0000\u0093\b\u0000"+
		"\u0001\u0001\u0005\u0001\u0096\b\u0001\n\u0001\f\u0001\u0099\t\u0001\u0001"+
		"\u0001\u0005\u0001\u009c\b\u0001\n\u0001\f\u0001\u009f\t\u0001\u0001\u0001"+
		"\u0005\u0001\u00a2\b\u0001\n\u0001\f\u0001\u00a5\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00b7\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u00bb\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0004"+
		"\u0004\u00c0\b\u0004\u000b\u0004\f\u0004\u00c1\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u00d1\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u00d8\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u00de\b\u0006\n\u0006\f\u0006\u00e1\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u00e5\b\u0006\u0003\u0006\u00e7\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00ee\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0003\b\u00f3\b\b\u0001\t\u0001\t\u0003\t\u00f7"+
		"\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00fe\b\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0108"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0003\n\u010d\b\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u0113\b\u000b\n\u000b\f\u000b\u0116"+
		"\t\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u011a\b\u000b\u0003\u000b"+
		"\u011c\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0003\f"+
		"\u0123\b\f\u0001\r\u0001\r\u0001\r\u0003\r\u0128\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u0131\b\u000f\n\u000f\f\u000f\u0134\t\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u0139\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u0146\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u015a\b\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u015e\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u0162\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u016a\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u0175\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u017c\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u0181\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u0186\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u018d\b\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u0194\b\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u01a0\b\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u01a4\b\u0019\u0003\u0019\u01a6\b\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0004\u001a\u01ab\b\u001a\u000b\u001a\f\u001a\u01ac"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01b3\b\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01b8\b\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u01c3\b\u001e\u0001\u001e\u0003\u001e"+
		"\u01c6\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01cb\b"+
		"\u001f\u0001\u001f\u0003\u001f\u01ce\b\u001f\u0001\u001f\u0001\u001f\u0001"+
		" \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0003!\u01d9\b!\u0001!\u0001"+
		"!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0003#\u01e4\b"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001$\u0005$\u01eb\b$\n$\f$\u01ee\t$\u0001"+
		"%\u0003%\u01f1\b%\u0001%\u0001%\u0003%\u01f5\b%\u0001%\u0001%\u0003%\u01f9"+
		"\b%\u0001&\u0001&\u0001&\u0003&\u01fe\b&\u0001&\u0001&\u0001&\u0001\'"+
		"\u0001\'\u0001\'\u0003\'\u0206\b\'\u0001(\u0001(\u0001(\u0005(\u020b\b"+
		"(\n(\f(\u020e\t(\u0001(\u0001(\u0003(\u0212\b(\u0001(\u0003(\u0215\b("+
		"\u0001)\u0001)\u0001)\u0003)\u021a\b)\u0001*\u0001*\u0001*\u0001+\u0001"+
		"+\u0004+\u0221\b+\u000b+\f+\u0222\u0003+\u0225\b+\u0001+\u0001+\u0001"+
		",\u0001,\u0001,\u0001,\u0001-\u0005-\u022e\b-\n-\f-\u0231\t-\u0001-\u0003"+
		"-\u0234\b-\u0001-\u0004-\u0237\b-\u000b-\f-\u0238\u0001-\u0005-\u023c"+
		"\b-\n-\f-\u023f\t-\u0001-\u0005-\u0242\b-\n-\f-\u0245\t-\u0001.\u0003"+
		".\u0248\b.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u0259\b/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0003/\u0261\b/\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00030\u026a\b0\u00011\u00011\u00011\u00011\u0005"+
		"1\u0270\b1\n1\f1\u0273\t1\u00011\u00031\u0276\b1\u00031\u0278\b1\u0001"+
		"1\u00011\u00012\u00032\u027d\b2\u00012\u00012\u00032\u0281\b2\u00013\u0001"+
		"3\u00013\u00053\u0286\b3\n3\f3\u0289\t3\u00014\u00014\u00014\u00014\u0003"+
		"4\u028f\b4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00034\u02ae\b4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00034\u02da\b4\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00034\u02e2\b4\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00054\u02ee\b4\n4\f4\u02f1\t4\u00015\u0001"+
		"5\u00015\u00035\u02f6\b5\u00016\u00016\u00016\u00016\u00056\u02fc\b6\n"+
		"6\f6\u02ff\t6\u00016\u00036\u0302\b6\u00036\u0304\b6\u00016\u00016\u0001"+
		"7\u00017\u00017\u00037\u030b\b7\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00037\u0313\b7\u00018\u00018\u00018\u00038\u0318\b8\u00018\u00038\u031b"+
		"\b8\u00019\u00019\u00039\u031f\b9\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0003:\u0328\b:\u0001;\u0001;\u0001;\u0001;\u0001;\u0003;\u032f"+
		"\b;\u0001<\u0001<\u0005<\u0333\b<\n<\f<\u0336\t<\u0001<\u0001<\u0001="+
		"\u0001=\u0001=\u0001=\u0001=\u0003=\u033f\b=\u0001>\u0001>\u0001?\u0001"+
		"?\u0001?\u0001?\u0003?\u0347\b?\u0001@\u0003@\u034a\b@\u0001@\u0003@\u034d"+
		"\b@\u0001@\u0001@\u0003@\u0351\b@\u0005@\u0353\b@\n@\f@\u0356\t@\u0001"+
		"A\u0001A\u0001A\u0005A\u035b\bA\nA\fA\u035e\tA\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0005A\u036a\bA\nA\fA\u036d"+
		"\tA\u0001A\u0003A\u0370\bA\u0001B\u0003B\u0373\bB\u0001B\u0001B\u0003"+
		"B\u0377\bB\u0001B\u0003B\u037a\bB\u0005B\u037c\bB\nB\fB\u037f\tB\u0001"+
		"C\u0001C\u0001C\u0003C\u0384\bC\u0001D\u0004D\u0387\bD\u000bD\fD\u0388"+
		"\u0001D\u0003D\u038c\bD\u0001E\u0001E\u0001E\u0001E\u0001E\u0003E\u0393"+
		"\bE\u0001F\u0001F\u0003F\u0397\bF\u0001G\u0001G\u0001G\u0000\u0001hH\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0000\u0006\u0002\u0000\u0017\u0017SS\u0001"+
		"\u0000\u0017\u0019\u0001\u0000\u0014\u0015\u0001\u0000\u001c\u001f\u0001"+
		"\u0000 #\u0001\u0000PQ\u0406\u0000\u0092\u0001\u0000\u0000\u0000\u0002"+
		"\u0097\u0001\u0000\u0000\u0000\u0004\u00b6\u0001\u0000\u0000\u0000\u0006"+
		"\u00b8\u0001\u0000\u0000\u0000\b\u00bf\u0001\u0000\u0000\u0000\n\u00d7"+
		"\u0001\u0000\u0000\u0000\f\u00d9\u0001\u0000\u0000\u0000\u000e\u00ea\u0001"+
		"\u0000\u0000\u0000\u0010\u00ef\u0001\u0000\u0000\u0000\u0012\u0107\u0001"+
		"\u0000\u0000\u0000\u0014\u0109\u0001\u0000\u0000\u0000\u0016\u010e\u0001"+
		"\u0000\u0000\u0000\u0018\u011f\u0001\u0000\u0000\u0000\u001a\u0127\u0001"+
		"\u0000\u0000\u0000\u001c\u0129\u0001\u0000\u0000\u0000\u001e\u012c\u0001"+
		"\u0000\u0000\u0000 \u0135\u0001\u0000\u0000\u0000\"\u013a\u0001\u0000"+
		"\u0000\u0000$\u013e\u0001\u0000\u0000\u0000&\u017b\u0001\u0000\u0000\u0000"+
		"(\u0180\u0001\u0000\u0000\u0000*\u0182\u0001\u0000\u0000\u0000,\u0189"+
		"\u0001\u0000\u0000\u0000.\u0190\u0001\u0000\u0000\u00000\u0197\u0001\u0000"+
		"\u0000\u00002\u019d\u0001\u0000\u0000\u00004\u01aa\u0001\u0000\u0000\u0000"+
		"6\u01ae\u0001\u0000\u0000\u00008\u01b4\u0001\u0000\u0000\u0000:\u01b9"+
		"\u0001\u0000\u0000\u0000<\u01be\u0001\u0000\u0000\u0000>\u01c7\u0001\u0000"+
		"\u0000\u0000@\u01d1\u0001\u0000\u0000\u0000B\u01d4\u0001\u0000\u0000\u0000"+
		"D\u01dd\u0001\u0000\u0000\u0000F\u01e3\u0001\u0000\u0000\u0000H\u01ec"+
		"\u0001\u0000\u0000\u0000J\u01f8\u0001\u0000\u0000\u0000L\u01fa\u0001\u0000"+
		"\u0000\u0000N\u0202\u0001\u0000\u0000\u0000P\u0214\u0001\u0000\u0000\u0000"+
		"R\u0216\u0001\u0000\u0000\u0000T\u021b\u0001\u0000\u0000\u0000V\u021e"+
		"\u0001\u0000\u0000\u0000X\u0228\u0001\u0000\u0000\u0000Z\u022f\u0001\u0000"+
		"\u0000\u0000\\\u0247\u0001\u0000\u0000\u0000^\u0260\u0001\u0000\u0000"+
		"\u0000`\u0269\u0001\u0000\u0000\u0000b\u026b\u0001\u0000\u0000\u0000d"+
		"\u027c\u0001\u0000\u0000\u0000f\u0282\u0001\u0000\u0000\u0000h\u02ad\u0001"+
		"\u0000\u0000\u0000j\u02f5\u0001\u0000\u0000\u0000l\u02f7\u0001\u0000\u0000"+
		"\u0000n\u0312\u0001\u0000\u0000\u0000p\u031a\u0001\u0000\u0000\u0000r"+
		"\u031e\u0001\u0000\u0000\u0000t\u0327\u0001\u0000\u0000\u0000v\u032e\u0001"+
		"\u0000\u0000\u0000x\u0330\u0001\u0000\u0000\u0000z\u033e\u0001\u0000\u0000"+
		"\u0000|\u0340\u0001\u0000\u0000\u0000~\u0346\u0001\u0000\u0000\u0000\u0080"+
		"\u0349\u0001\u0000\u0000\u0000\u0082\u036f\u0001\u0000\u0000\u0000\u0084"+
		"\u0372\u0001\u0000\u0000\u0000\u0086\u0380\u0001\u0000\u0000\u0000\u0088"+
		"\u038b\u0001\u0000\u0000\u0000\u008a\u0392\u0001\u0000\u0000\u0000\u008c"+
		"\u0396\u0001\u0000\u0000\u0000\u008e\u0398\u0001\u0000\u0000\u0000\u0090"+
		"\u0093\u0003\u0002\u0001\u0000\u0091\u0093\u0003\u0080@\u0000\u0092\u0090"+
		"\u0001\u0000\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0001"+
		"\u0001\u0000\u0000\u0000\u0094\u0096\u0003\n\u0005\u0000\u0095\u0094\u0001"+
		"\u0000\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u009d\u0001"+
		"\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009c\u0003"+
		"\u0004\u0002\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u009f\u0001"+
		"\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001"+
		"\u0000\u0000\u0000\u009e\u00a3\u0001\u0000\u0000\u0000\u009f\u009d\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a2\u0003\u0012\t\u0000\u00a1\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u0000"+
		"\u0000\u0001\u00a7\u0003\u0001\u0000\u0000\u0000\u00a8\u00b7\u0003\u0006"+
		"\u0003\u0000\u00a9\u00b7\u0003\u001c\u000e\u0000\u00aa\u00b7\u0005\n\u0000"+
		"\u0000\u00ab\u00b7\u0003D\"\u0000\u00ac\u00b7\u0003B!\u0000\u00ad\u00b7"+
		"\u0003\"\u0011\u0000\u00ae\u00b7\u0003$\u0012\u0000\u00af\u00b7\u0003"+
		"&\u0013\u0000\u00b0\u00b7\u0003*\u0015\u0000\u00b1\u00b7\u0003,\u0016"+
		"\u0000\u00b2\u00b7\u0003.\u0017\u0000\u00b3\u00b7\u00030\u0018\u0000\u00b4"+
		"\u00b7\u0003:\u001d\u0000\u00b5\u00b7\u0003<\u001e\u0000\u00b6\u00a8\u0001"+
		"\u0000\u0000\u0000\u00b6\u00a9\u0001\u0000\u0000\u0000\u00b6\u00aa\u0001"+
		"\u0000\u0000\u0000\u00b6\u00ab\u0001\u0000\u0000\u0000\u00b6\u00ac\u0001"+
		"\u0000\u0000\u0000\u00b6\u00ad\u0001\u0000\u0000\u0000\u00b6\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b6\u00af\u0001\u0000\u0000\u0000\u00b6\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b1\u0001\u0000\u0000\u0000\u00b6\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u0005\u0001"+
		"\u0000\u0000\u0000\u00b8\u00ba\u0005\u0007\u0000\u0000\u00b9\u00bb\u0003"+
		"\b\u0004\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005\b\u0000"+
		"\u0000\u00bd\u0007\u0001\u0000\u0000\u0000\u00be\u00c0\u0003\u0004\u0002"+
		"\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c2\t\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005O\u0000\u0000"+
		"\u00c4\u00c5\u0005T\u0000\u0000\u00c5\u00d8\u0003~?\u0000\u00c6\u00c7"+
		"\u0005O\u0000\u0000\u00c7\u00c8\u0003\u000e\u0007\u0000\u00c8\u00c9\u0005"+
		"I\u0000\u0000\u00c9\u00ca\u0005T\u0000\u0000\u00ca\u00cb\u0003~?\u0000"+
		"\u00cb\u00d8\u0001\u0000\u0000\u0000\u00cc\u00d0\u0005O\u0000\u0000\u00cd"+
		"\u00ce\u0003\u000e\u0007\u0000\u00ce\u00cf\u0005\u000b\u0000\u0000\u00cf"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d0\u00cd\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d3\u0003\f\u0006\u0000\u00d3\u00d4\u0005I\u0000\u0000\u00d4\u00d5"+
		"\u0005T\u0000\u0000\u00d5\u00d6\u0003~?\u0000\u00d6\u00d8\u0001\u0000"+
		"\u0000\u0000\u00d7\u00c3\u0001\u0000\u0000\u0000\u00d7\u00c6\u0001\u0000"+
		"\u0000\u0000\u00d7\u00cc\u0001\u0000\u0000\u0000\u00d8\u000b\u0001\u0000"+
		"\u0000\u0000\u00d9\u00df\u0005\u0007\u0000\u0000\u00da\u00db\u0003\u0010"+
		"\b\u0000\u00db\u00dc\u0005\u000b\u0000\u0000\u00dc\u00de\u0001\u0000\u0000"+
		"\u0000\u00dd\u00da\u0001\u0000\u0000\u0000\u00de\u00e1\u0001\u0000\u0000"+
		"\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e6\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e4\u0003\u0010\b\u0000\u00e3\u00e5\u0005\u000b\u0000\u0000"+
		"\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e7\u0001\u0000\u0000\u0000\u00e6\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e9\u0005\b\u0000\u0000\u00e9\r\u0001\u0000\u0000\u0000\u00ea"+
		"\u00ed\u0007\u0000\u0000\u0000\u00eb\u00ec\u0005H\u0000\u0000\u00ec\u00ee"+
		"\u0005S\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001"+
		"\u0000\u0000\u0000\u00ee\u000f\u0001\u0000\u0000\u0000\u00ef\u00f2\u0005"+
		"S\u0000\u0000\u00f0\u00f1\u0005H\u0000\u0000\u00f1\u00f3\u0005S\u0000"+
		"\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f3\u0011\u0001\u0000\u0000\u0000\u00f4\u00f6\u0005N\u0000\u0000"+
		"\u00f5\u00f7\u0005A\u0000\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f9\u0003\u001a\r\u0000\u00f9\u00fa\u0003~?\u0000\u00fa\u0108\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fd\u0005N\u0000\u0000\u00fc\u00fe\u0005A\u0000"+
		"\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000"+
		"\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0100\u0003\u0014\n\u0000"+
		"\u0100\u0101\u0003~?\u0000\u0101\u0108\u0001\u0000\u0000\u0000\u0102\u0103"+
		"\u0005N\u0000\u0000\u0103\u0104\u0005A\u0000\u0000\u0104\u0105\u0003h"+
		"4\u0000\u0105\u0106\u0003~?\u0000\u0106\u0108\u0001\u0000\u0000\u0000"+
		"\u0107\u00f4\u0001\u0000\u0000\u0000\u0107\u00fb\u0001\u0000\u0000\u0000"+
		"\u0107\u0102\u0001\u0000\u0000\u0000\u0108\u0013\u0001\u0000\u0000\u0000"+
		"\u0109\u010c\u0003\u0016\u000b\u0000\u010a\u010b\u0005I\u0000\u0000\u010b"+
		"\u010d\u0005T\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010c\u010d"+
		"\u0001\u0000\u0000\u0000\u010d\u0015\u0001\u0000\u0000\u0000\u010e\u0114"+
		"\u0005\u0007\u0000\u0000\u010f\u0110\u0003\u0018\f\u0000\u0110\u0111\u0005"+
		"\u000b\u0000\u0000\u0111\u0113\u0001\u0000\u0000\u0000\u0112\u010f\u0001"+
		"\u0000\u0000\u0000\u0113\u0116\u0001\u0000\u0000\u0000\u0114\u0112\u0001"+
		"\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u011b\u0001"+
		"\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0117\u0119\u0003"+
		"\u0018\f\u0000\u0118\u011a\u0005\u000b\u0000\u0000\u0119\u0118\u0001\u0000"+
		"\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011c\u0001\u0000"+
		"\u0000\u0000\u011b\u0117\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000"+
		"\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011e\u0005\b\u0000"+
		"\u0000\u011e\u0017\u0001\u0000\u0000\u0000\u011f\u0122\u0005S\u0000\u0000"+
		"\u0120\u0121\u0005H\u0000\u0000\u0121\u0123\u0005S\u0000\u0000\u0122\u0120"+
		"\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0019"+
		"\u0001\u0000\u0000\u0000\u0124\u0128\u0003\u001c\u000e\u0000\u0125\u0128"+
		"\u0003D\"\u0000\u0126\u0128\u0003B!\u0000\u0127\u0124\u0001\u0000\u0000"+
		"\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0127\u0126\u0001\u0000\u0000"+
		"\u0000\u0128\u001b\u0001\u0000\u0000\u0000\u0129\u012a\u0003\u001e\u000f"+
		"\u0000\u012a\u012b\u0003~?\u0000\u012b\u001d\u0001\u0000\u0000\u0000\u012c"+
		"\u012d\u0003(\u0014\u0000\u012d\u0132\u0003 \u0010\u0000\u012e\u012f\u0005"+
		"\u000b\u0000\u0000\u012f\u0131\u0003 \u0010\u0000\u0130\u012e\u0001\u0000"+
		"\u0000\u0000\u0131\u0134\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000"+
		"\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u001f\u0001\u0000"+
		"\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0135\u0138\u0003j5\u0000"+
		"\u0136\u0137\u0005\f\u0000\u0000\u0137\u0139\u0003h4\u0000\u0138\u0136"+
		"\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139!\u0001"+
		"\u0000\u0000\u0000\u013a\u013b\u0004\u0011\u0000\u0000\u013b\u013c\u0003"+
		"f3\u0000\u013c\u013d\u0003~?\u0000\u013d#\u0001\u0000\u0000\u0000\u013e"+
		"\u013f\u0005B\u0000\u0000\u013f\u0140\u0005\u0005\u0000\u0000\u0140\u0141"+
		"\u0003f3\u0000\u0141\u0142\u0005\u0006\u0000\u0000\u0142\u0145\u0003\u0004"+
		"\u0002\u0000\u0143\u0144\u00055\u0000\u0000\u0144\u0146\u0003\u0004\u0002"+
		"\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000"+
		"\u0000\u0146%\u0001\u0000\u0000\u0000\u0147\u0148\u00052\u0000\u0000\u0148"+
		"\u0149\u0003\u0004\u0002\u0000\u0149\u014a\u0005>\u0000\u0000\u014a\u014b"+
		"\u0005\u0005\u0000\u0000\u014b\u014c\u0003f3\u0000\u014c\u014d\u0005\u0006"+
		"\u0000\u0000\u014d\u014e\u0003~?\u0000\u014e\u017c\u0001\u0000\u0000\u0000"+
		"\u014f\u0150\u0005>\u0000\u0000\u0150\u0151\u0005\u0005\u0000\u0000\u0151"+
		"\u0152\u0003f3\u0000\u0152\u0153\u0005\u0006\u0000\u0000\u0153\u0154\u0003"+
		"\u0004\u0002\u0000\u0154\u017c\u0001\u0000\u0000\u0000\u0155\u0156\u0005"+
		"<\u0000\u0000\u0156\u0159\u0005\u0005\u0000\u0000\u0157\u015a\u0003f3"+
		"\u0000\u0158\u015a\u0003\u001e\u000f\u0000\u0159\u0157\u0001\u0000\u0000"+
		"\u0000\u0159\u0158\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000"+
		"\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u015d\u0005\n\u0000\u0000"+
		"\u015c\u015e\u0003f3\u0000\u015d\u015c\u0001\u0000\u0000\u0000\u015d\u015e"+
		"\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u0161"+
		"\u0005\n\u0000\u0000\u0160\u0162\u0003f3\u0000\u0161\u0160\u0001\u0000"+
		"\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000"+
		"\u0000\u0000\u0163\u0164\u0005\u0006\u0000\u0000\u0164\u017c\u0003\u0004"+
		"\u0002\u0000\u0165\u0166\u0005<\u0000\u0000\u0166\u0169\u0005\u0005\u0000"+
		"\u0000\u0167\u016a\u0003h4\u0000\u0168\u016a\u0003\u001e\u000f\u0000\u0169"+
		"\u0167\u0001\u0000\u0000\u0000\u0169\u0168\u0001\u0000\u0000\u0000\u016a"+
		"\u016b\u0001\u0000\u0000\u0000\u016b\u016c\u0005E\u0000\u0000\u016c\u016d"+
		"\u0003f3\u0000\u016d\u016e\u0005\u0006\u0000\u0000\u016e\u016f\u0003\u0004"+
		"\u0002\u0000\u016f\u017c\u0001\u0000\u0000\u0000\u0170\u0171\u0005<\u0000"+
		"\u0000\u0171\u0174\u0005\u0005\u0000\u0000\u0172\u0175\u0003h4\u0000\u0173"+
		"\u0175\u0003\u001e\u000f\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0174"+
		"\u0173\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176"+
		"\u0177\u0005F\u0000\u0000\u0177\u0178\u0003f3\u0000\u0178\u0179\u0005"+
		"\u0006\u0000\u0000\u0179\u017a\u0003\u0004\u0002\u0000\u017a\u017c\u0001"+
		"\u0000\u0000\u0000\u017b\u0147\u0001\u0000\u0000\u0000\u017b\u014f\u0001"+
		"\u0000\u0000\u0000\u017b\u0155\u0001\u0000\u0000\u0000\u017b\u0165\u0001"+
		"\u0000\u0000\u0000\u017b\u0170\u0001\u0000\u0000\u0000\u017c\'\u0001\u0000"+
		"\u0000\u0000\u017d\u0181\u00057\u0000\u0000\u017e\u0181\u0003|>\u0000"+
		"\u017f\u0181\u0005M\u0000\u0000\u0180\u017d\u0001\u0000\u0000\u0000\u0180"+
		"\u017e\u0001\u0000\u0000\u0000\u0180\u017f\u0001\u0000\u0000\u0000\u0181"+
		")\u0001\u0000\u0000\u0000\u0182\u0185\u0005;\u0000\u0000\u0183\u0184\u0004"+
		"\u0015\u0001\u0000\u0184\u0186\u0005S\u0000\u0000\u0185\u0183\u0001\u0000"+
		"\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000"+
		"\u0000\u0000\u0187\u0188\u0003~?\u0000\u0188+\u0001\u0000\u0000\u0000"+
		"\u0189\u018c\u00051\u0000\u0000\u018a\u018b\u0004\u0016\u0002\u0000\u018b"+
		"\u018d\u0005S\u0000\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018c\u018d"+
		"\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u018f"+
		"\u0003~?\u0000\u018f-\u0001\u0000\u0000\u0000\u0190\u0193\u0005:\u0000"+
		"\u0000\u0191\u0192\u0004\u0017\u0003\u0000\u0192\u0194\u0003f3\u0000\u0193"+
		"\u0191\u0001\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000\u0000\u0194"+
		"\u0195\u0001\u0000\u0000\u0000\u0195\u0196\u0003~?\u0000\u0196/\u0001"+
		"\u0000\u0000\u0000\u0197\u0198\u0005=\u0000\u0000\u0198\u0199\u0005\u0005"+
		"\u0000\u0000\u0199\u019a\u0003f3\u0000\u019a\u019b\u0005\u0006\u0000\u0000"+
		"\u019b\u019c\u00032\u0019\u0000\u019c1\u0001\u0000\u0000\u0000\u019d\u019f"+
		"\u0005\u0007\u0000\u0000\u019e\u01a0\u00034\u001a\u0000\u019f\u019e\u0001"+
		"\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0\u01a5\u0001"+
		"\u0000\u0000\u0000\u01a1\u01a3\u00038\u001c\u0000\u01a2\u01a4\u00034\u001a"+
		"\u0000\u01a3\u01a2\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000"+
		"\u0000\u01a4\u01a6\u0001\u0000\u0000\u0000\u01a5\u01a1\u0001\u0000\u0000"+
		"\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000"+
		"\u0000\u01a7\u01a8\u0005\b\u0000\u0000\u01a83\u0001\u0000\u0000\u0000"+
		"\u01a9\u01ab\u00036\u001b\u0000\u01aa\u01a9\u0001\u0000\u0000\u0000\u01ab"+
		"\u01ac\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ac"+
		"\u01ad\u0001\u0000\u0000\u0000\u01ad5\u0001\u0000\u0000\u0000\u01ae\u01af"+
		"\u00054\u0000\u0000\u01af\u01b0\u0003f3\u0000\u01b0\u01b2\u0005\u000f"+
		"\u0000\u0000\u01b1\u01b3\u0003\b\u0004\u0000\u01b2\u01b1\u0001\u0000\u0000"+
		"\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b37\u0001\u0000\u0000\u0000"+
		"\u01b4\u01b5\u0005A\u0000\u0000\u01b5\u01b7\u0005\u000f\u0000\u0000\u01b6"+
		"\u01b8\u0003\b\u0004\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000\u01b7\u01b8"+
		"\u0001\u0000\u0000\u0000\u01b89\u0001\u0000\u0000\u0000\u01b9\u01ba\u0005"+
		"C\u0000\u0000\u01ba\u01bb\u0004\u001d\u0004\u0000\u01bb\u01bc\u0003f3"+
		"\u0000\u01bc\u01bd\u0003~?\u0000\u01bd;\u0001\u0000\u0000\u0000\u01be"+
		"\u01bf\u0005G\u0000\u0000\u01bf\u01c5\u0003\u0006\u0003\u0000\u01c0\u01c2"+
		"\u0003>\u001f\u0000\u01c1\u01c3\u0003@ \u0000\u01c2\u01c1\u0001\u0000"+
		"\u0000\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000\u01c3\u01c6\u0001\u0000"+
		"\u0000\u0000\u01c4\u01c6\u0003@ \u0000\u01c5\u01c0\u0001\u0000\u0000\u0000"+
		"\u01c5\u01c4\u0001\u0000\u0000\u0000\u01c6=\u0001\u0000\u0000\u0000\u01c7"+
		"\u01cd\u00058\u0000\u0000\u01c8\u01ca\u0005\u0005\u0000\u0000\u01c9\u01cb"+
		"\u0003j5\u0000\u01ca\u01c9\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000"+
		"\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000\u01cc\u01ce\u0005\u0006"+
		"\u0000\u0000\u01cd\u01c8\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000"+
		"\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf\u01d0\u0003\u0006"+
		"\u0003\u0000\u01d0?\u0001\u0000\u0000\u0000\u01d1\u01d2\u00059\u0000\u0000"+
		"\u01d2\u01d3\u0003\u0006\u0003\u0000\u01d3A\u0001\u0000\u0000\u0000\u01d4"+
		"\u01d5\u0005?\u0000\u0000\u01d5\u01d6\u0005S\u0000\u0000\u01d6\u01d8\u0005"+
		"\u0005\u0000\u0000\u01d7\u01d9\u0003P(\u0000\u01d8\u01d7\u0001\u0000\u0000"+
		"\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9\u01da\u0001\u0000\u0000"+
		"\u0000\u01da\u01db\u0005\u0006\u0000\u0000\u01db\u01dc\u0003V+\u0000\u01dc"+
		"C\u0001\u0000\u0000\u0000\u01dd\u01de\u0005J\u0000\u0000\u01de\u01df\u0005"+
		"S\u0000\u0000\u01df\u01e0\u0003F#\u0000\u01e0E\u0001\u0000\u0000\u0000"+
		"\u01e1\u01e2\u0005K\u0000\u0000\u01e2\u01e4\u0005S\u0000\u0000\u01e3\u01e1"+
		"\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4\u01e5"+
		"\u0001\u0000\u0000\u0000\u01e5\u01e6\u0005\u0007\u0000\u0000\u01e6\u01e7"+
		"\u0003H$\u0000\u01e7\u01e8\u0005\b\u0000\u0000\u01e8G\u0001\u0000\u0000"+
		"\u0000\u01e9\u01eb\u0003J%\u0000\u01ea\u01e9\u0001\u0000\u0000\u0000\u01eb"+
		"\u01ee\u0001\u0000\u0000\u0000\u01ec\u01ea\u0001\u0000\u0000\u0000\u01ec"+
		"\u01ed\u0001\u0000\u0000\u0000\u01edI\u0001\u0000\u0000\u0000\u01ee\u01ec"+
		"\u0001\u0000\u0000\u0000\u01ef\u01f1\u0005R\u0000\u0000\u01f0\u01ef\u0001"+
		"\u0000\u0000\u0000\u01f0\u01f1\u0001\u0000\u0000\u0000\u01f1\u01f2\u0001"+
		"\u0000\u0000\u0000\u01f2\u01f9\u0003L&\u0000\u01f3\u01f5\u0005R\u0000"+
		"\u0000\u01f4\u01f3\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000"+
		"\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000\u01f6\u01f9\u0003N\'\u0000"+
		"\u01f7\u01f9\u0005\n\u0000\u0000\u01f8\u01f0\u0001\u0000\u0000\u0000\u01f8"+
		"\u01f4\u0001\u0000\u0000\u0000\u01f8\u01f7\u0001\u0000\u0000\u0000\u01f9"+
		"K\u0001\u0000\u0000\u0000\u01fa\u01fb\u0003`0\u0000\u01fb\u01fd\u0005"+
		"\u0005\u0000\u0000\u01fc\u01fe\u0003P(\u0000\u01fd\u01fc\u0001\u0000\u0000"+
		"\u0000\u01fd\u01fe\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000"+
		"\u0000\u01ff\u0200\u0005\u0006\u0000\u0000\u0200\u0201\u0003V+\u0000\u0201"+
		"M\u0001\u0000\u0000\u0000\u0202\u0205\u0003`0\u0000\u0203\u0204\u0005"+
		"\f\u0000\u0000\u0204\u0206\u0003h4\u0000\u0205\u0203\u0001\u0000\u0000"+
		"\u0000\u0205\u0206\u0001\u0000\u0000\u0000\u0206O\u0001\u0000\u0000\u0000"+
		"\u0207\u020c\u0003R)\u0000\u0208\u0209\u0005\u000b\u0000\u0000\u0209\u020b"+
		"\u0003R)\u0000\u020a\u0208\u0001\u0000\u0000\u0000\u020b\u020e\u0001\u0000"+
		"\u0000\u0000\u020c\u020a\u0001\u0000\u0000\u0000\u020c\u020d\u0001\u0000"+
		"\u0000\u0000\u020d\u0211\u0001\u0000\u0000\u0000\u020e\u020c\u0001\u0000"+
		"\u0000\u0000\u020f\u0210\u0005\u000b\u0000\u0000\u0210\u0212\u0003T*\u0000"+
		"\u0211\u020f\u0001\u0000\u0000\u0000\u0211\u0212\u0001\u0000\u0000\u0000"+
		"\u0212\u0215\u0001\u0000\u0000\u0000\u0213\u0215\u0003T*\u0000\u0214\u0207"+
		"\u0001\u0000\u0000\u0000\u0214\u0213\u0001\u0000\u0000\u0000\u0215Q\u0001"+
		"\u0000\u0000\u0000\u0216\u0219\u0003j5\u0000\u0217\u0218\u0005\f\u0000"+
		"\u0000\u0218\u021a\u0003h4\u0000\u0219\u0217\u0001\u0000\u0000\u0000\u0219"+
		"\u021a\u0001\u0000\u0000\u0000\u021aS\u0001\u0000\u0000\u0000\u021b\u021c"+
		"\u0005\u0010\u0000\u0000\u021c\u021d\u0003h4\u0000\u021dU\u0001\u0000"+
		"\u0000\u0000\u021e\u0224\u0005\u0007\u0000\u0000\u021f\u0221\u0003\u0004"+
		"\u0002\u0000\u0220\u021f\u0001\u0000\u0000\u0000\u0221\u0222\u0001\u0000"+
		"\u0000\u0000\u0222\u0220\u0001\u0000\u0000\u0000\u0222\u0223\u0001\u0000"+
		"\u0000\u0000\u0223\u0225\u0001\u0000\u0000\u0000\u0224\u0220\u0001\u0000"+
		"\u0000\u0000\u0224\u0225\u0001\u0000\u0000\u0000\u0225\u0226\u0001\u0000"+
		"\u0000\u0000\u0226\u0227\u0005\b\u0000\u0000\u0227W\u0001\u0000\u0000"+
		"\u0000\u0228\u0229\u0005\u0003\u0000\u0000\u0229\u022a\u0003Z-\u0000\u022a"+
		"\u022b\u0005\u0004\u0000\u0000\u022bY\u0001\u0000\u0000\u0000\u022c\u022e"+
		"\u0005\u000b\u0000\u0000\u022d\u022c\u0001\u0000\u0000\u0000\u022e\u0231"+
		"\u0001\u0000\u0000\u0000\u022f\u022d\u0001\u0000\u0000\u0000\u022f\u0230"+
		"\u0001\u0000\u0000\u0000\u0230\u0233\u0001\u0000\u0000\u0000\u0231\u022f"+
		"\u0001\u0000\u0000\u0000\u0232\u0234\u0003\\.\u0000\u0233\u0232\u0001"+
		"\u0000\u0000\u0000\u0233\u0234\u0001\u0000\u0000\u0000\u0234\u023d\u0001"+
		"\u0000\u0000\u0000\u0235\u0237\u0005\u000b\u0000\u0000\u0236\u0235\u0001"+
		"\u0000\u0000\u0000\u0237\u0238\u0001\u0000\u0000\u0000\u0238\u0236\u0001"+
		"\u0000\u0000\u0000\u0238\u0239\u0001\u0000\u0000\u0000\u0239\u023a\u0001"+
		"\u0000\u0000\u0000\u023a\u023c\u0003\\.\u0000\u023b\u0236\u0001\u0000"+
		"\u0000\u0000\u023c\u023f\u0001\u0000\u0000\u0000\u023d\u023b\u0001\u0000"+
		"\u0000\u0000\u023d\u023e\u0001\u0000\u0000\u0000\u023e\u0243\u0001\u0000"+
		"\u0000\u0000\u023f\u023d\u0001\u0000\u0000\u0000\u0240\u0242\u0005\u000b"+
		"\u0000\u0000\u0241\u0240\u0001\u0000\u0000\u0000\u0242\u0245\u0001\u0000"+
		"\u0000\u0000\u0243\u0241\u0001\u0000\u0000\u0000\u0243\u0244\u0001\u0000"+
		"\u0000\u0000\u0244[\u0001\u0000\u0000\u0000\u0245\u0243\u0001\u0000\u0000"+
		"\u0000\u0246\u0248\u0005\u0010\u0000\u0000\u0247\u0246\u0001\u0000\u0000"+
		"\u0000\u0247\u0248\u0001\u0000\u0000\u0000\u0248\u0249\u0001\u0000\u0000"+
		"\u0000\u0249\u024a\u0003h4\u0000\u024a]\u0001\u0000\u0000\u0000\u024b"+
		"\u024c\u0003`0\u0000\u024c\u024d\u0005\u000f\u0000\u0000\u024d\u024e\u0003"+
		"h4\u0000\u024e\u0261\u0001\u0000\u0000\u0000\u024f\u0250\u0005\u0003\u0000"+
		"\u0000\u0250\u0251\u0003h4\u0000\u0251\u0252\u0005\u0004\u0000\u0000\u0252"+
		"\u0253\u0005\u000f\u0000\u0000\u0253\u0254\u0003h4\u0000\u0254\u0261\u0001"+
		"\u0000\u0000\u0000\u0255\u0256\u0003`0\u0000\u0256\u0258\u0005\u0005\u0000"+
		"\u0000\u0257\u0259\u0003P(\u0000\u0258\u0257\u0001\u0000\u0000\u0000\u0258"+
		"\u0259\u0001\u0000\u0000\u0000\u0259\u025a\u0001\u0000\u0000\u0000\u025a"+
		"\u025b\u0005\u0006\u0000\u0000\u025b\u025c\u0003V+\u0000\u025c\u0261\u0001"+
		"\u0000\u0000\u0000\u025d\u0261\u0005S\u0000\u0000\u025e\u025f\u0005\u0010"+
		"\u0000\u0000\u025f\u0261\u0003h4\u0000\u0260\u024b\u0001\u0000\u0000\u0000"+
		"\u0260\u024f\u0001\u0000\u0000\u0000\u0260\u0255\u0001\u0000\u0000\u0000"+
		"\u0260\u025d\u0001\u0000\u0000\u0000\u0260\u025e\u0001\u0000\u0000\u0000"+
		"\u0261_\u0001\u0000\u0000\u0000\u0262\u026a\u0005S\u0000\u0000\u0263\u026a"+
		"\u0005T\u0000\u0000\u0264\u026a\u00050\u0000\u0000\u0265\u0266\u0005\u0003"+
		"\u0000\u0000\u0266\u0267\u0003h4\u0000\u0267\u0268\u0005\u0004\u0000\u0000"+
		"\u0268\u026a\u0001\u0000\u0000\u0000\u0269\u0262\u0001\u0000\u0000\u0000"+
		"\u0269\u0263\u0001\u0000\u0000\u0000\u0269\u0264\u0001\u0000\u0000\u0000"+
		"\u0269\u0265\u0001\u0000\u0000\u0000\u026aa\u0001\u0000\u0000\u0000\u026b"+
		"\u0277\u0005\u0005\u0000\u0000\u026c\u0271\u0003d2\u0000\u026d\u026e\u0005"+
		"\u000b\u0000\u0000\u026e\u0270\u0003d2\u0000\u026f\u026d\u0001\u0000\u0000"+
		"\u0000\u0270\u0273\u0001\u0000\u0000\u0000\u0271\u026f\u0001\u0000\u0000"+
		"\u0000\u0271\u0272\u0001\u0000\u0000\u0000\u0272\u0275\u0001\u0000\u0000"+
		"\u0000\u0273\u0271\u0001\u0000\u0000\u0000\u0274\u0276\u0005\u000b\u0000"+
		"\u0000\u0275\u0274\u0001\u0000\u0000\u0000\u0275\u0276\u0001\u0000\u0000"+
		"\u0000\u0276\u0278\u0001\u0000\u0000\u0000\u0277\u026c\u0001\u0000\u0000"+
		"\u0000\u0277\u0278\u0001\u0000\u0000\u0000\u0278\u0279\u0001\u0000\u0000"+
		"\u0000\u0279\u027a\u0005\u0006\u0000\u0000\u027ac\u0001\u0000\u0000\u0000"+
		"\u027b\u027d\u0005\u0010\u0000\u0000\u027c\u027b\u0001\u0000\u0000\u0000"+
		"\u027c\u027d\u0001\u0000\u0000\u0000\u027d\u0280\u0001\u0000\u0000\u0000"+
		"\u027e\u0281\u0003h4\u0000\u027f\u0281\u0005S\u0000\u0000\u0280\u027e"+
		"\u0001\u0000\u0000\u0000\u0280\u027f\u0001\u0000\u0000\u0000\u0281e\u0001"+
		"\u0000\u0000\u0000\u0282\u0287\u0003h4\u0000\u0283\u0284\u0005\u000b\u0000"+
		"\u0000\u0284\u0286\u0003h4\u0000\u0285\u0283\u0001\u0000\u0000\u0000\u0286"+
		"\u0289\u0001\u0000\u0000\u0000\u0287\u0285\u0001\u0000\u0000\u0000\u0287"+
		"\u0288\u0001\u0000\u0000\u0000\u0288g\u0001\u0000\u0000\u0000\u0289\u0287"+
		"\u0001\u0000\u0000\u0000\u028a\u028b\u00064\uffff\uffff\u0000\u028b\u02ae"+
		"\u0003n7\u0000\u028c\u028e\u0005J\u0000\u0000\u028d\u028f\u0005S\u0000"+
		"\u0000\u028e\u028d\u0001\u0000\u0000\u0000\u028e\u028f\u0001\u0000\u0000"+
		"\u0000\u028f\u0290\u0001\u0000\u0000\u0000\u0290\u02ae\u0003F#\u0000\u0291"+
		"\u0292\u00056\u0000\u0000\u0292\u0293\u0005S\u0000\u0000\u0293\u02ae\u0003"+
		"b1\u0000\u0294\u0295\u0005D\u0000\u0000\u0295\u02ae\u0003h4\u001b\u0296"+
		"\u0297\u00053\u0000\u0000\u0297\u02ae\u0003h4\u001a\u0298\u0299\u0005"+
		"\u0012\u0000\u0000\u0299\u02ae\u0003h4\u0019\u029a\u029b\u0005\u0013\u0000"+
		"\u0000\u029b\u02ae\u0003h4\u0018\u029c\u029d\u0005\u0014\u0000\u0000\u029d"+
		"\u02ae\u0003h4\u0017\u029e\u029f\u0005\u0015\u0000\u0000\u029f\u02ae\u0003"+
		"h4\u0016\u02a0\u02a1\u0005\u0016\u0000\u0000\u02a1\u02ae\u0003h4\u0015"+
		"\u02a2\u02ae\u0005@\u0000\u0000\u02a3\u02ae\u0005S\u0000\u0000\u02a4\u02ae"+
		"\u0005L\u0000\u0000\u02a5\u02ae\u0003v;\u0000\u02a6\u02ae\u0003X,\u0000"+
		"\u02a7\u02ae\u0003l6\u0000\u02a8\u02a9\u0005\u0005\u0000\u0000\u02a9\u02aa"+
		"\u0003f3\u0000\u02aa\u02ab\u0005\u0006\u0000\u0000\u02ab\u02ae\u0001\u0000"+
		"\u0000\u0000\u02ac\u02ae\u0003\u0082A\u0000\u02ad\u028a\u0001\u0000\u0000"+
		"\u0000\u02ad\u028c\u0001\u0000\u0000\u0000\u02ad\u0291\u0001\u0000\u0000"+
		"\u0000\u02ad\u0294\u0001\u0000\u0000\u0000\u02ad\u0296\u0001\u0000\u0000"+
		"\u0000\u02ad\u0298\u0001\u0000\u0000\u0000\u02ad\u029a\u0001\u0000\u0000"+
		"\u0000\u02ad\u029c\u0001\u0000\u0000\u0000\u02ad\u029e\u0001\u0000\u0000"+
		"\u0000\u02ad\u02a0\u0001\u0000\u0000\u0000\u02ad\u02a2\u0001\u0000\u0000"+
		"\u0000\u02ad\u02a3\u0001\u0000\u0000\u0000\u02ad\u02a4\u0001\u0000\u0000"+
		"\u0000\u02ad\u02a5\u0001\u0000\u0000\u0000\u02ad\u02a6\u0001\u0000\u0000"+
		"\u0000\u02ad\u02a7\u0001\u0000\u0000\u0000\u02ad\u02a8\u0001\u0000\u0000"+
		"\u0000\u02ad\u02ac\u0001\u0000\u0000\u0000\u02ae\u02ef\u0001\u0000\u0000"+
		"\u0000\u02af\u02b0\n\"\u0000\u0000\u02b0\u02b1\u0005\u000e\u0000\u0000"+
		"\u02b1\u02ee\u0003h4#\u02b2\u02b3\n\u0014\u0000\u0000\u02b3\u02b4\u0005"+
		"\u001a\u0000\u0000\u02b4\u02ee\u0003h4\u0014\u02b5\u02b6\n\u0013\u0000"+
		"\u0000\u02b6\u02b7\u0007\u0001\u0000\u0000\u02b7\u02ee\u0003h4\u0014\u02b8"+
		"\u02b9\n\u0012\u0000\u0000\u02b9\u02ba\u0007\u0002\u0000\u0000\u02ba\u02ee"+
		"\u0003h4\u0013\u02bb\u02bc\n\u0011\u0000\u0000\u02bc\u02bd\u0005\u001b"+
		"\u0000\u0000\u02bd\u02ee\u0003h4\u0012\u02be\u02bf\n\u0010\u0000\u0000"+
		"\u02bf\u02c0\u0007\u0003\u0000\u0000\u02c0\u02ee\u0003h4\u0011\u02c1\u02c2"+
		"\n\u000f\u0000\u0000\u02c2\u02c3\u0007\u0004\u0000\u0000\u02c3\u02ee\u0003"+
		"h4\u0010\u02c4\u02c5\n\u000e\u0000\u0000\u02c5\u02c6\u0005$\u0000\u0000"+
		"\u02c6\u02ee\u0003h4\u000f\u02c7\u02c8\n\r\u0000\u0000\u02c8\u02c9\u0005"+
		"%\u0000\u0000\u02c9\u02ee\u0003h4\u000e\u02ca\u02cb\n\f\u0000\u0000\u02cb"+
		"\u02cc\u0005\r\u0000\u0000\u02cc\u02cd\u0003h4\u0000\u02cd\u02ce\u0005"+
		"\u000f\u0000\u0000\u02ce\u02cf\u0003h4\r\u02cf\u02ee\u0001\u0000\u0000"+
		"\u0000\u02d0\u02d1\n\u000b\u0000\u0000\u02d1\u02d2\u0005\f\u0000\u0000"+
		"\u02d2\u02ee\u0003h4\u000b\u02d3\u02d4\n\n\u0000\u0000\u02d4\u02d5\u0003"+
		"t:\u0000\u02d5\u02d6\u0003h4\n\u02d6\u02ee\u0001\u0000\u0000\u0000\u02d7"+
		"\u02d9\n!\u0000\u0000\u02d8\u02da\u0005\u000e\u0000\u0000\u02d9\u02d8"+
		"\u0001\u0000\u0000\u0000\u02d9\u02da\u0001\u0000\u0000\u0000\u02da\u02db"+
		"\u0001\u0000\u0000\u0000\u02db\u02dc\u0005\u0003\u0000\u0000\u02dc\u02dd"+
		"\u0003f3\u0000\u02dd\u02de\u0005\u0004\u0000\u0000\u02de\u02ee\u0001\u0000"+
		"\u0000\u0000\u02df\u02e1\n \u0000\u0000\u02e0\u02e2\u0005\r\u0000\u0000"+
		"\u02e1\u02e0\u0001\u0000\u0000\u0000\u02e1\u02e2\u0001\u0000\u0000\u0000"+
		"\u02e2\u02e3\u0001\u0000\u0000\u0000\u02e3\u02e4\u0005\u0011\u0000\u0000"+
		"\u02e4\u02ee\u0005S\u0000\u0000\u02e5\u02e6\n\u001e\u0000\u0000\u02e6"+
		"\u02ee\u0003b1\u0000\u02e7\u02e8\n\u001d\u0000\u0000\u02e8\u02ee\u0005"+
		"\u0012\u0000\u0000\u02e9\u02ea\n\u001c\u0000\u0000\u02ea\u02ee\u0005\u0013"+
		"\u0000\u0000\u02eb\u02ec\n\t\u0000\u0000\u02ec\u02ee\u0003x<\u0000\u02ed"+
		"\u02af\u0001\u0000\u0000\u0000\u02ed\u02b2\u0001\u0000\u0000\u0000\u02ed"+
		"\u02b5\u0001\u0000\u0000\u0000\u02ed\u02b8\u0001\u0000\u0000\u0000\u02ed"+
		"\u02bb\u0001\u0000\u0000\u0000\u02ed\u02be\u0001\u0000\u0000\u0000\u02ed"+
		"\u02c1\u0001\u0000\u0000\u0000\u02ed\u02c4\u0001\u0000\u0000\u0000\u02ed"+
		"\u02c7\u0001\u0000\u0000\u0000\u02ed\u02ca\u0001\u0000\u0000\u0000\u02ed"+
		"\u02d0\u0001\u0000\u0000\u0000\u02ed\u02d3\u0001\u0000\u0000\u0000\u02ed"+
		"\u02d7\u0001\u0000\u0000\u0000\u02ed\u02df\u0001\u0000\u0000\u0000\u02ed"+
		"\u02e5\u0001\u0000\u0000\u0000\u02ed\u02e7\u0001\u0000\u0000\u0000\u02ed"+
		"\u02e9\u0001\u0000\u0000\u0000\u02ed\u02eb\u0001\u0000\u0000\u0000\u02ee"+
		"\u02f1\u0001\u0000\u0000\u0000\u02ef\u02ed\u0001\u0000\u0000\u0000\u02ef"+
		"\u02f0\u0001\u0000\u0000\u0000\u02f0i\u0001\u0000\u0000\u0000\u02f1\u02ef"+
		"\u0001\u0000\u0000\u0000\u02f2\u02f6\u0005S\u0000\u0000\u02f3\u02f6\u0003"+
		"X,\u0000\u02f4\u02f6\u0003l6\u0000\u02f5\u02f2\u0001\u0000\u0000\u0000"+
		"\u02f5\u02f3\u0001\u0000\u0000\u0000\u02f5\u02f4\u0001\u0000\u0000\u0000"+
		"\u02f6k\u0001\u0000\u0000\u0000\u02f7\u0303\u0005\u0007\u0000\u0000\u02f8"+
		"\u02fd\u0003^/\u0000\u02f9\u02fa\u0005\u000b\u0000\u0000\u02fa\u02fc\u0003"+
		"^/\u0000\u02fb\u02f9\u0001\u0000\u0000\u0000\u02fc\u02ff\u0001\u0000\u0000"+
		"\u0000\u02fd\u02fb\u0001\u0000\u0000\u0000\u02fd\u02fe\u0001\u0000\u0000"+
		"\u0000\u02fe\u0301\u0001\u0000\u0000\u0000\u02ff\u02fd\u0001\u0000\u0000"+
		"\u0000\u0300\u0302\u0005\u000b\u0000\u0000\u0301\u0300\u0001\u0000\u0000"+
		"\u0000\u0301\u0302\u0001\u0000\u0000\u0000\u0302\u0304\u0001\u0000\u0000"+
		"\u0000\u0303\u02f8\u0001\u0000\u0000\u0000\u0303\u0304\u0001\u0000\u0000"+
		"\u0000\u0304\u0305\u0001\u0000\u0000\u0000\u0305\u0306\u0005\b\u0000\u0000"+
		"\u0306m\u0001\u0000\u0000\u0000\u0307\u0308\u0005?\u0000\u0000\u0308\u030a"+
		"\u0005\u0005\u0000\u0000\u0309\u030b\u0003P(\u0000\u030a\u0309\u0001\u0000"+
		"\u0000\u0000\u030a\u030b\u0001\u0000\u0000\u0000\u030b\u030c\u0001\u0000"+
		"\u0000\u0000\u030c\u030d\u0005\u0006\u0000\u0000\u030d\u0313\u0003V+\u0000"+
		"\u030e\u030f\u0003p8\u0000\u030f\u0310\u0005-\u0000\u0000\u0310\u0311"+
		"\u0003r9\u0000\u0311\u0313\u0001\u0000\u0000\u0000\u0312\u0307\u0001\u0000"+
		"\u0000\u0000\u0312\u030e\u0001\u0000\u0000\u0000\u0313o\u0001\u0000\u0000"+
		"\u0000\u0314\u031b\u0005S\u0000\u0000\u0315\u0317\u0005\u0005\u0000\u0000"+
		"\u0316\u0318\u0003P(\u0000\u0317\u0316\u0001\u0000\u0000\u0000\u0317\u0318"+
		"\u0001\u0000\u0000\u0000\u0318\u0319\u0001\u0000\u0000\u0000\u0319\u031b"+
		"\u0005\u0006\u0000\u0000\u031a\u0314\u0001\u0000\u0000\u0000\u031a\u0315"+
		"\u0001\u0000\u0000\u0000\u031bq\u0001\u0000\u0000\u0000\u031c\u031f\u0003"+
		"h4\u0000\u031d\u031f\u0003V+\u0000\u031e\u031c\u0001\u0000\u0000\u0000"+
		"\u031e\u031d\u0001\u0000\u0000\u0000\u031fs\u0001\u0000\u0000\u0000\u0320"+
		"\u0328\u0005&\u0000\u0000\u0321\u0328\u0005\'\u0000\u0000\u0322\u0328"+
		"\u0005(\u0000\u0000\u0323\u0328\u0005)\u0000\u0000\u0324\u0328\u0005*"+
		"\u0000\u0000\u0325\u0328\u0005+\u0000\u0000\u0326\u0328\u0005,\u0000\u0000"+
		"\u0327\u0320\u0001\u0000\u0000\u0000\u0327\u0321\u0001\u0000\u0000\u0000"+
		"\u0327\u0322\u0001\u0000\u0000\u0000\u0327\u0323\u0001\u0000\u0000\u0000"+
		"\u0327\u0324\u0001\u0000\u0000\u0000\u0327\u0325\u0001\u0000\u0000\u0000"+
		"\u0327\u0326\u0001\u0000\u0000\u0000\u0328u\u0001\u0000\u0000\u0000\u0329"+
		"\u032f\u0005.\u0000\u0000\u032a\u032f\u0005/\u0000\u0000\u032b\u032f\u0005"+
		"T\u0000\u0000\u032c\u032f\u0003x<\u0000\u032d\u032f\u00050\u0000\u0000"+
		"\u032e\u0329\u0001\u0000\u0000\u0000\u032e\u032a\u0001\u0000\u0000\u0000"+
		"\u032e\u032b\u0001\u0000\u0000\u0000\u032e\u032c\u0001\u0000\u0000\u0000"+
		"\u032e\u032d\u0001\u0000\u0000\u0000\u032fw\u0001\u0000\u0000\u0000\u0330"+
		"\u0334\u0005U\u0000\u0000\u0331\u0333\u0003z=\u0000\u0332\u0331\u0001"+
		"\u0000\u0000\u0000\u0333\u0336\u0001\u0000\u0000\u0000\u0334\u0332\u0001"+
		"\u0000\u0000\u0000\u0334\u0335\u0001\u0000\u0000\u0000\u0335\u0337\u0001"+
		"\u0000\u0000\u0000\u0336\u0334\u0001\u0000\u0000\u0000\u0337\u0338\u0005"+
		"U\u0000\u0000\u0338y\u0001\u0000\u0000\u0000\u0339\u033f\u0005Z\u0000"+
		"\u0000\u033a\u033b\u0005Y\u0000\u0000\u033b\u033c\u0003h4\u0000\u033c"+
		"\u033d\u0005\t\u0000\u0000\u033d\u033f\u0001\u0000\u0000\u0000\u033e\u0339"+
		"\u0001\u0000\u0000\u0000\u033e\u033a\u0001\u0000\u0000\u0000\u033f{\u0001"+
		"\u0000\u0000\u0000\u0340\u0341\u0007\u0005\u0000\u0000\u0341}\u0001\u0000"+
		"\u0000\u0000\u0342\u0347\u0005\n\u0000\u0000\u0343\u0347\u0005\u0000\u0000"+
		"\u0001\u0344\u0347\u0004?\u0017\u0000\u0345\u0347\u0004?\u0018\u0000\u0346"+
		"\u0342\u0001\u0000\u0000\u0000\u0346\u0343\u0001\u0000\u0000\u0000\u0346"+
		"\u0344\u0001\u0000\u0000\u0000\u0346\u0345\u0001\u0000\u0000\u0000\u0347"+
		"\u007f\u0001\u0000\u0000\u0000\u0348\u034a\u0005[\u0000\u0000\u0349\u0348"+
		"\u0001\u0000\u0000\u0000\u0349\u034a\u0001\u0000\u0000\u0000\u034a\u034c"+
		"\u0001\u0000\u0000\u0000\u034b\u034d\u0003\u008cF\u0000\u034c\u034b\u0001"+
		"\u0000\u0000\u0000\u034c\u034d\u0001\u0000\u0000\u0000\u034d\u0354\u0001"+
		"\u0000\u0000\u0000\u034e\u0350\u0003\u0082A\u0000\u034f\u0351\u0003\u008c"+
		"F\u0000\u0350\u034f\u0001\u0000\u0000\u0000\u0350\u0351\u0001\u0000\u0000"+
		"\u0000\u0351\u0353\u0001\u0000\u0000\u0000\u0352\u034e\u0001\u0000\u0000"+
		"\u0000\u0353\u0356\u0001\u0000\u0000\u0000\u0354\u0352\u0001\u0000\u0000"+
		"\u0000\u0354\u0355\u0001\u0000\u0000\u0000\u0355\u0081\u0001\u0000\u0000"+
		"\u0000\u0356\u0354\u0001\u0000\u0000\u0000\u0357\u0358\u0005^\u0000\u0000"+
		"\u0358\u035c\u0005d\u0000\u0000\u0359\u035b\u0003\u0086C\u0000\u035a\u0359"+
		"\u0001\u0000\u0000\u0000\u035b\u035e\u0001\u0000\u0000\u0000\u035c\u035a"+
		"\u0001\u0000\u0000\u0000\u035c\u035d\u0001\u0000\u0000\u0000\u035d\u035f"+
		"\u0001\u0000\u0000\u0000\u035e\u035c\u0001\u0000\u0000\u0000\u035f\u0360"+
		"\u0005`\u0000\u0000\u0360\u0361\u0003\u0084B\u0000\u0361\u0362\u0005^"+
		"\u0000\u0000\u0362\u0363\u0005b\u0000\u0000\u0363\u0364\u0005d\u0000\u0000"+
		"\u0364\u0365\u0005`\u0000\u0000\u0365\u0370\u0001\u0000\u0000\u0000\u0366"+
		"\u0367\u0005^\u0000\u0000\u0367\u036b\u0005d\u0000\u0000\u0368\u036a\u0003"+
		"\u0086C\u0000\u0369\u0368\u0001\u0000\u0000\u0000\u036a\u036d\u0001\u0000"+
		"\u0000\u0000\u036b\u0369\u0001\u0000\u0000\u0000\u036b\u036c\u0001\u0000"+
		"\u0000\u0000\u036c\u036e\u0001\u0000\u0000\u0000\u036d\u036b\u0001\u0000"+
		"\u0000\u0000\u036e\u0370\u0005a\u0000\u0000\u036f\u0357\u0001\u0000\u0000"+
		"\u0000\u036f\u0366\u0001\u0000\u0000\u0000\u0370\u0083\u0001\u0000\u0000"+
		"\u0000\u0371\u0373\u0003\u0088D\u0000\u0372\u0371\u0001\u0000\u0000\u0000"+
		"\u0372\u0373\u0001\u0000\u0000\u0000\u0373\u037d\u0001\u0000\u0000\u0000"+
		"\u0374\u0377\u0003\u0082A\u0000\u0375\u0377\u0003\u008eG\u0000\u0376\u0374"+
		"\u0001\u0000\u0000\u0000\u0376\u0375\u0001\u0000\u0000\u0000\u0377\u0379"+
		"\u0001\u0000\u0000\u0000\u0378\u037a\u0003\u0088D\u0000\u0379\u0378\u0001"+
		"\u0000\u0000\u0000\u0379\u037a\u0001\u0000\u0000\u0000\u037a\u037c\u0001"+
		"\u0000\u0000\u0000\u037b\u0376\u0001\u0000\u0000\u0000\u037c\u037f\u0001"+
		"\u0000\u0000\u0000\u037d\u037b\u0001\u0000\u0000\u0000\u037d\u037e\u0001"+
		"\u0000\u0000\u0000\u037e\u0085\u0001\u0000\u0000\u0000\u037f\u037d\u0001"+
		"\u0000\u0000\u0000\u0380\u0383\u0005d\u0000\u0000\u0381\u0382\u0005c\u0000"+
		"\u0000\u0382\u0384\u0005f\u0000\u0000\u0383\u0381\u0001\u0000\u0000\u0000"+
		"\u0383\u0384\u0001\u0000\u0000\u0000\u0384\u0087\u0001\u0000\u0000\u0000"+
		"\u0385\u0387\u0003\u008aE\u0000\u0386\u0385\u0001\u0000\u0000\u0000\u0387"+
		"\u0388\u0001\u0000\u0000\u0000\u0388\u0386\u0001\u0000\u0000\u0000\u0388"+
		"\u0389\u0001\u0000\u0000\u0000\u0389\u038c\u0001\u0000\u0000\u0000\u038a"+
		"\u038c\u0005]\u0000\u0000\u038b\u0386\u0001\u0000\u0000\u0000\u038b\u038a"+
		"\u0001\u0000\u0000\u0000\u038c\u0089\u0001\u0000\u0000\u0000\u038d\u0393"+
		"\u0005_\u0000\u0000\u038e\u038f\u0005\u0007\u0000\u0000\u038f\u0390\u0003"+
		"h4\u0000\u0390\u0391\u0005\b\u0000\u0000\u0391\u0393\u0001\u0000\u0000"+
		"\u0000\u0392\u038d\u0001\u0000\u0000\u0000\u0392\u038e\u0001\u0000\u0000"+
		"\u0000\u0393\u008b\u0001\u0000\u0000\u0000\u0394\u0397\u0003\u008eG\u0000"+
		"\u0395\u0397\u0005]\u0000\u0000\u0396\u0394\u0001\u0000\u0000\u0000\u0396"+
		"\u0395\u0001\u0000\u0000\u0000\u0397\u008d\u0001\u0000\u0000\u0000\u0398"+
		"\u0399\u0005\\\u0000\u0000\u0399\u008f\u0001\u0000\u0000\u0000o\u0092"+
		"\u0097\u009d\u00a3\u00b6\u00ba\u00c1\u00d0\u00d7\u00df\u00e4\u00e6\u00ed"+
		"\u00f2\u00f6\u00fd\u0107\u010c\u0114\u0119\u011b\u0122\u0127\u0132\u0138"+
		"\u0145\u0159\u015d\u0161\u0169\u0174\u017b\u0180\u0185\u018c\u0193\u019f"+
		"\u01a3\u01a5\u01ac\u01b2\u01b7\u01c2\u01c5\u01ca\u01cd\u01d8\u01e3\u01ec"+
		"\u01f0\u01f4\u01f8\u01fd\u0205\u020c\u0211\u0214\u0219\u0222\u0224\u022f"+
		"\u0233\u0238\u023d\u0243\u0247\u0258\u0260\u0269\u0271\u0275\u0277\u027c"+
		"\u0280\u0287\u028e\u02ad\u02d9\u02e1\u02ed\u02ef\u02f5\u02fd\u0301\u0303"+
		"\u030a\u0312\u0317\u031a\u031e\u0327\u032e\u0334\u033e\u0346\u0349\u034c"+
		"\u0350\u0354\u035c\u036b\u036f\u0372\u0376\u0379\u037d\u0383\u0388\u038b"+
		"\u0392\u0396";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}