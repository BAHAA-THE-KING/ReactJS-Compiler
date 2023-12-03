// Generated from C:/Users/ASUS/Desktop/GitHub/ReactJS-Compiler/Compiler Project/src/rules/ReactJSParser.g4 by ANTLR 4.13.1
package antlrReactJS;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ReactJSParser}.
 */
public interface ReactJSParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code JSFile}
	 * labeled alternative in {@link ReactJSParser#file}.
	 * @param ctx the parse tree
	 */
	void enterJSFile(ReactJSParser.JSFileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JSFile}
	 * labeled alternative in {@link ReactJSParser#file}.
	 * @param ctx the parse tree
	 */
	void exitJSFile(ReactJSParser.JSFileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HTMLFile}
	 * labeled alternative in {@link ReactJSParser#file}.
	 * @param ctx the parse tree
	 */
	void enterHTMLFile(ReactJSParser.HTMLFileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HTMLFile}
	 * labeled alternative in {@link ReactJSParser#file}.
	 * @param ctx the parse tree
	 */
	void exitHTMLFile(ReactJSParser.HTMLFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ReactJSParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ReactJSParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockChunk}
	 * labeled alternative in {@link ReactJSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlockChunk(ReactJSParser.BlockChunkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockChunk}
	 * labeled alternative in {@link ReactJSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlockChunk(ReactJSParser.BlockChunkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclerationChunk}
	 * labeled alternative in {@link ReactJSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclerationChunk(ReactJSParser.VariableDeclerationChunkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclerationChunk}
	 * labeled alternative in {@link ReactJSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclerationChunk(ReactJSParser.VariableDeclerationChunkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyChunk}
	 * labeled alternative in {@link ReactJSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyChunk(ReactJSParser.EmptyChunkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyChunk}
	 * labeled alternative in {@link ReactJSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyChunk(ReactJSParser.EmptyChunkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassDeclarationChunk}
	 * labeled alternative in {@link ReactJSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclarationChunk(ReactJSParser.ClassDeclarationChunkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassDeclarationChunk}
	 * labeled alternative in {@link ReactJSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclarationChunk(ReactJSParser.ClassDeclarationChunkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDeclarationChunk}
	 * labeled alternative in {@link ReactJSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclarationChunk(ReactJSParser.FunctionDeclarationChunkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDeclarationChunk}
	 * labeled alternative in {@link ReactJSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclarationChunk(ReactJSParser.FunctionDeclarationChunkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionChunk}
	 * labeled alternative in {@link ReactJSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionChunk(ReactJSParser.ExpressionChunkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionChunk}
	 * labeled alternative in {@link ReactJSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionChunk(ReactJSParser.ExpressionChunkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionalChunk}
	 * labeled alternative in {@link ReactJSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalChunk(ReactJSParser.ConditionalChunkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionalChunk}
	 * labeled alternative in {@link ReactJSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalChunk(ReactJSParser.ConditionalChunkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LoopChunk}
	 * labeled alternative in {@link ReactJSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLoopChunk(ReactJSParser.LoopChunkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LoopChunk}
	 * labeled alternative in {@link ReactJSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLoopChunk(ReactJSParser.LoopChunkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContinueChunk}
	 * labeled alternative in {@link ReactJSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterContinueChunk(ReactJSParser.ContinueChunkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContinueChunk}
	 * labeled alternative in {@link ReactJSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitContinueChunk(ReactJSParser.ContinueChunkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BreakChunk}
	 * labeled alternative in {@link ReactJSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBreakChunk(ReactJSParser.BreakChunkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BreakChunk}
	 * labeled alternative in {@link ReactJSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBreakChunk(ReactJSParser.BreakChunkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnChunk}
	 * labeled alternative in {@link ReactJSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnChunk(ReactJSParser.ReturnChunkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnChunk}
	 * labeled alternative in {@link ReactJSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnChunk(ReactJSParser.ReturnChunkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SwitchChunk}
	 * labeled alternative in {@link ReactJSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchChunk(ReactJSParser.SwitchChunkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SwitchChunk}
	 * labeled alternative in {@link ReactJSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchChunk(ReactJSParser.SwitchChunkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThrowChunk}
	 * labeled alternative in {@link ReactJSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterThrowChunk(ReactJSParser.ThrowChunkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThrowChunk}
	 * labeled alternative in {@link ReactJSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitThrowChunk(ReactJSParser.ThrowChunkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TryChunk}
	 * labeled alternative in {@link ReactJSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTryChunk(ReactJSParser.TryChunkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TryChunk}
	 * labeled alternative in {@link ReactJSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTryChunk(ReactJSParser.TryChunkContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ReactJSParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ReactJSParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(ReactJSParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(ReactJSParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FileImportBlock}
	 * labeled alternative in {@link ReactJSParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterFileImportBlock(ReactJSParser.FileImportBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FileImportBlock}
	 * labeled alternative in {@link ReactJSParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitFileImportBlock(ReactJSParser.FileImportBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeafultAsImportBlock}
	 * labeled alternative in {@link ReactJSParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeafultAsImportBlock(ReactJSParser.DeafultAsImportBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeafultAsImportBlock}
	 * labeled alternative in {@link ReactJSParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeafultAsImportBlock(ReactJSParser.DeafultAsImportBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectImportBlock}
	 * labeled alternative in {@link ReactJSParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterObjectImportBlock(ReactJSParser.ObjectImportBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectImportBlock}
	 * labeled alternative in {@link ReactJSParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitObjectImportBlock(ReactJSParser.ObjectImportBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#importModuleItems}.
	 * @param ctx the parse tree
	 */
	void enterImportModuleItems(ReactJSParser.ImportModuleItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#importModuleItems}.
	 * @param ctx the parse tree
	 */
	void exitImportModuleItems(ReactJSParser.ImportModuleItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#importNamespace}.
	 * @param ctx the parse tree
	 */
	void enterImportNamespace(ReactJSParser.ImportNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#importNamespace}.
	 * @param ctx the parse tree
	 */
	void exitImportNamespace(ReactJSParser.ImportNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#aliasName}.
	 * @param ctx the parse tree
	 */
	void enterAliasName(ReactJSParser.AliasNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#aliasName}.
	 * @param ctx the parse tree
	 */
	void exitAliasName(ReactJSParser.AliasNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExportDeclaration}
	 * labeled alternative in {@link ReactJSParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportDeclaration(ReactJSParser.ExportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExportDeclaration}
	 * labeled alternative in {@link ReactJSParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportDeclaration(ReactJSParser.ExportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExportBlock}
	 * labeled alternative in {@link ReactJSParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportBlock(ReactJSParser.ExportBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExportBlock}
	 * labeled alternative in {@link ReactJSParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportBlock(ReactJSParser.ExportBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExportDefaultDeclaration}
	 * labeled alternative in {@link ReactJSParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportDefaultDeclaration(ReactJSParser.ExportDefaultDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExportDefaultDeclaration}
	 * labeled alternative in {@link ReactJSParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportDefaultDeclaration(ReactJSParser.ExportDefaultDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#exportFromBlock}.
	 * @param ctx the parse tree
	 */
	void enterExportFromBlock(ReactJSParser.ExportFromBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#exportFromBlock}.
	 * @param ctx the parse tree
	 */
	void exitExportFromBlock(ReactJSParser.ExportFromBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#exportModuleItems}.
	 * @param ctx the parse tree
	 */
	void enterExportModuleItems(ReactJSParser.ExportModuleItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#exportModuleItems}.
	 * @param ctx the parse tree
	 */
	void exitExportModuleItems(ReactJSParser.ExportModuleItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#exportAliasName}.
	 * @param ctx the parse tree
	 */
	void enterExportAliasName(ReactJSParser.ExportAliasNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#exportAliasName}.
	 * @param ctx the parse tree
	 */
	void exitExportAliasName(ReactJSParser.ExportAliasNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclare}
	 * labeled alternative in {@link ReactJSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclare(ReactJSParser.VariableDeclareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclare}
	 * labeled alternative in {@link ReactJSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclare(ReactJSParser.VariableDeclareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassDeclare}
	 * labeled alternative in {@link ReactJSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclare(ReactJSParser.ClassDeclareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassDeclare}
	 * labeled alternative in {@link ReactJSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclare(ReactJSParser.ClassDeclareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDeclare}
	 * labeled alternative in {@link ReactJSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclare(ReactJSParser.FunctionDeclareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDeclare}
	 * labeled alternative in {@link ReactJSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclare(ReactJSParser.FunctionDeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableStatement(ReactJSParser.VariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableStatement(ReactJSParser.VariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationList(ReactJSParser.VariableDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationList(ReactJSParser.VariableDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(ReactJSParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(ReactJSParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(ReactJSParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(ReactJSParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ReactJSParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ReactJSParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoWhileStatement}
	 * labeled alternative in {@link ReactJSParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(ReactJSParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoWhileStatement}
	 * labeled alternative in {@link ReactJSParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(ReactJSParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link ReactJSParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(ReactJSParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link ReactJSParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(ReactJSParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link ReactJSParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(ReactJSParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link ReactJSParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(ReactJSParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForInStatement}
	 * labeled alternative in {@link ReactJSParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForInStatement(ReactJSParser.ForInStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInStatement}
	 * labeled alternative in {@link ReactJSParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForInStatement(ReactJSParser.ForInStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForOfStatement}
	 * labeled alternative in {@link ReactJSParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForOfStatement(ReactJSParser.ForOfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForOfStatement}
	 * labeled alternative in {@link ReactJSParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForOfStatement(ReactJSParser.ForOfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#varModifier}.
	 * @param ctx the parse tree
	 */
	void enterVarModifier(ReactJSParser.VarModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#varModifier}.
	 * @param ctx the parse tree
	 */
	void exitVarModifier(ReactJSParser.VarModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(ReactJSParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(ReactJSParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(ReactJSParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(ReactJSParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(ReactJSParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(ReactJSParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(ReactJSParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(ReactJSParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void enterCaseBlock(ReactJSParser.CaseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void exitCaseBlock(ReactJSParser.CaseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#caseClauses}.
	 * @param ctx the parse tree
	 */
	void enterCaseClauses(ReactJSParser.CaseClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#caseClauses}.
	 * @param ctx the parse tree
	 */
	void exitCaseClauses(ReactJSParser.CaseClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void enterCaseClause(ReactJSParser.CaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void exitCaseClause(ReactJSParser.CaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	void enterDefaultClause(ReactJSParser.DefaultClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	void exitDefaultClause(ReactJSParser.DefaultClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(ReactJSParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(ReactJSParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(ReactJSParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(ReactJSParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#catchProduction}.
	 * @param ctx the parse tree
	 */
	void enterCatchProduction(ReactJSParser.CatchProductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#catchProduction}.
	 * @param ctx the parse tree
	 */
	void exitCatchProduction(ReactJSParser.CatchProductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#finallyProduction}.
	 * @param ctx the parse tree
	 */
	void enterFinallyProduction(ReactJSParser.FinallyProductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#finallyProduction}.
	 * @param ctx the parse tree
	 */
	void exitFinallyProduction(ReactJSParser.FinallyProductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(ReactJSParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(ReactJSParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(ReactJSParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(ReactJSParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#classTail}.
	 * @param ctx the parse tree
	 */
	void enterClassTail(ReactJSParser.ClassTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#classTail}.
	 * @param ctx the parse tree
	 */
	void exitClassTail(ReactJSParser.ClassTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#classElements}.
	 * @param ctx the parse tree
	 */
	void enterClassElements(ReactJSParser.ClassElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#classElements}.
	 * @param ctx the parse tree
	 */
	void exitClassElements(ReactJSParser.ClassElementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassMethodDefinition}
	 * labeled alternative in {@link ReactJSParser#classElement}.
	 * @param ctx the parse tree
	 */
	void enterClassMethodDefinition(ReactJSParser.ClassMethodDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassMethodDefinition}
	 * labeled alternative in {@link ReactJSParser#classElement}.
	 * @param ctx the parse tree
	 */
	void exitClassMethodDefinition(ReactJSParser.ClassMethodDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassFieldDefinition}
	 * labeled alternative in {@link ReactJSParser#classElement}.
	 * @param ctx the parse tree
	 */
	void enterClassFieldDefinition(ReactJSParser.ClassFieldDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassFieldDefinition}
	 * labeled alternative in {@link ReactJSParser#classElement}.
	 * @param ctx the parse tree
	 */
	void exitClassFieldDefinition(ReactJSParser.ClassFieldDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassEmptyStatement}
	 * labeled alternative in {@link ReactJSParser#classElement}.
	 * @param ctx the parse tree
	 */
	void enterClassEmptyStatement(ReactJSParser.ClassEmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassEmptyStatement}
	 * labeled alternative in {@link ReactJSParser#classElement}.
	 * @param ctx the parse tree
	 */
	void exitClassEmptyStatement(ReactJSParser.ClassEmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#methodDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMethodDefinition(ReactJSParser.MethodDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#methodDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMethodDefinition(ReactJSParser.MethodDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#fieldDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFieldDefinition(ReactJSParser.FieldDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#fieldDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFieldDefinition(ReactJSParser.FieldDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(ReactJSParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(ReactJSParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#formalParameterArg}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterArg(ReactJSParser.FormalParameterArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#formalParameterArg}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterArg(ReactJSParser.FormalParameterArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#lastFormalParameterArg}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameterArg(ReactJSParser.LastFormalParameterArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#lastFormalParameterArg}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameterArg(ReactJSParser.LastFormalParameterArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(ReactJSParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(ReactJSParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(ReactJSParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(ReactJSParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementList(ReactJSParser.ElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementList(ReactJSParser.ElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void enterArrayElement(ReactJSParser.ArrayElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void exitArrayElement(ReactJSParser.ArrayElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyExpressionAssignment}
	 * labeled alternative in {@link ReactJSParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyExpressionAssignment(ReactJSParser.PropertyExpressionAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyExpressionAssignment}
	 * labeled alternative in {@link ReactJSParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyExpressionAssignment(ReactJSParser.PropertyExpressionAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComputedPropertyExpressionAssignment}
	 * labeled alternative in {@link ReactJSParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterComputedPropertyExpressionAssignment(ReactJSParser.ComputedPropertyExpressionAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComputedPropertyExpressionAssignment}
	 * labeled alternative in {@link ReactJSParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitComputedPropertyExpressionAssignment(ReactJSParser.ComputedPropertyExpressionAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionProperty}
	 * labeled alternative in {@link ReactJSParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterFunctionProperty(ReactJSParser.FunctionPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionProperty}
	 * labeled alternative in {@link ReactJSParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitFunctionProperty(ReactJSParser.FunctionPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyIdentifierShorthand}
	 * labeled alternative in {@link ReactJSParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyIdentifierShorthand(ReactJSParser.PropertyIdentifierShorthandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyIdentifierShorthand}
	 * labeled alternative in {@link ReactJSParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyIdentifierShorthand(ReactJSParser.PropertyIdentifierShorthandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyShorthand}
	 * labeled alternative in {@link ReactJSParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyShorthand(ReactJSParser.PropertyShorthandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyShorthand}
	 * labeled alternative in {@link ReactJSParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyShorthand(ReactJSParser.PropertyShorthandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyByName}
	 * labeled alternative in {@link ReactJSParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void enterPropertyByName(ReactJSParser.PropertyByNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyByName}
	 * labeled alternative in {@link ReactJSParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void exitPropertyByName(ReactJSParser.PropertyByNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyByString}
	 * labeled alternative in {@link ReactJSParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void enterPropertyByString(ReactJSParser.PropertyByStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyByString}
	 * labeled alternative in {@link ReactJSParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void exitPropertyByString(ReactJSParser.PropertyByStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyByNumber}
	 * labeled alternative in {@link ReactJSParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void enterPropertyByNumber(ReactJSParser.PropertyByNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyByNumber}
	 * labeled alternative in {@link ReactJSParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void exitPropertyByNumber(ReactJSParser.PropertyByNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyByExpression}
	 * labeled alternative in {@link ReactJSParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void enterPropertyByExpression(ReactJSParser.PropertyByExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyByExpression}
	 * labeled alternative in {@link ReactJSParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void exitPropertyByExpression(ReactJSParser.PropertyByExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(ReactJSParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(ReactJSParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(ReactJSParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(ReactJSParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#expressionSequence}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSequence(ReactJSParser.ExpressionSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#expressionSequence}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSequence(ReactJSParser.ExpressionSequenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateStringExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTemplateStringExpression(ReactJSParser.TemplateStringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateStringExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTemplateStringExpression(ReactJSParser.TemplateStringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(ReactJSParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(ReactJSParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(ReactJSParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(ReactJSParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PowerExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpression(ReactJSParser.PowerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PowerExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpression(ReactJSParser.PowerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreIncrementExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(ReactJSParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreIncrementExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(ReactJSParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JSXExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterJSXExpression(ReactJSParser.JSXExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JSXExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitJSXExpression(ReactJSParser.JSXExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteralExpression(ReactJSParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteralExpression(ReactJSParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(ReactJSParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(ReactJSParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OptionalChainExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterOptionalChainExpression(ReactJSParser.OptionalChainExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OptionalChainExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitOptionalChainExpression(ReactJSParser.OptionalChainExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(ReactJSParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(ReactJSParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreDecreaseExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecreaseExpression(ReactJSParser.PreDecreaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreDecreaseExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecreaseExpression(ReactJSParser.PreDecreaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentsExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsExpression(ReactJSParser.ArgumentsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentsExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsExpression(ReactJSParser.ArgumentsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpression(ReactJSParser.ThisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpression(ReactJSParser.ThisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression(ReactJSParser.FunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression(ReactJSParser.FunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryMinusExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpression(ReactJSParser.UnaryMinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryMinusExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpression(ReactJSParser.UnaryMinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(ReactJSParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(ReactJSParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostDecreaseExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecreaseExpression(ReactJSParser.PostDecreaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostDecreaseExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecreaseExpression(ReactJSParser.PostDecreaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeofExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTypeofExpression(ReactJSParser.TypeofExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeofExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTypeofExpression(ReactJSParser.TypeofExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryPlusExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPlusExpression(ReactJSParser.UnaryPlusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryPlusExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPlusExpression(ReactJSParser.UnaryPlusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeleteExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterDeleteExpression(ReactJSParser.DeleteExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeleteExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitDeleteExpression(ReactJSParser.DeleteExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(ReactJSParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(ReactJSParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SuperExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSuperExpression(ReactJSParser.SuperExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SuperExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSuperExpression(ReactJSParser.SuperExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(ReactJSParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(ReactJSParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(ReactJSParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(ReactJSParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(ReactJSParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(ReactJSParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(ReactJSParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(ReactJSParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(ReactJSParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(ReactJSParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpression(ReactJSParser.NewExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpression(ReactJSParser.NewExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(ReactJSParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(ReactJSParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteralExpression(ReactJSParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteralExpression(ReactJSParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMemberDotExpression(ReactJSParser.MemberDotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMemberDotExpression(ReactJSParser.MemberDotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassExpression(ReactJSParser.ClassExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassExpression(ReactJSParser.ClassExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMemberIndexExpression(ReactJSParser.MemberIndexExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMemberIndexExpression(ReactJSParser.MemberIndexExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(ReactJSParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(ReactJSParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentOperatorExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperatorExpression(ReactJSParser.AssignmentOperatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentOperatorExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperatorExpression(ReactJSParser.AssignmentOperatorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CoalesceExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterCoalesceExpression(ReactJSParser.CoalesceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CoalesceExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitCoalesceExpression(ReactJSParser.CoalesceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableByName}
	 * labeled alternative in {@link ReactJSParser#assignable}.
	 * @param ctx the parse tree
	 */
	void enterVariableByName(ReactJSParser.VariableByNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableByName}
	 * labeled alternative in {@link ReactJSParser#assignable}.
	 * @param ctx the parse tree
	 */
	void exitVariableByName(ReactJSParser.VariableByNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableByArray}
	 * labeled alternative in {@link ReactJSParser#assignable}.
	 * @param ctx the parse tree
	 */
	void enterVariableByArray(ReactJSParser.VariableByArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableByArray}
	 * labeled alternative in {@link ReactJSParser#assignable}.
	 * @param ctx the parse tree
	 */
	void exitVariableByArray(ReactJSParser.VariableByArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableByObject}
	 * labeled alternative in {@link ReactJSParser#assignable}.
	 * @param ctx the parse tree
	 */
	void enterVariableByObject(ReactJSParser.VariableByObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableByObject}
	 * labeled alternative in {@link ReactJSParser#assignable}.
	 * @param ctx the parse tree
	 */
	void exitVariableByObject(ReactJSParser.VariableByObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(ReactJSParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(ReactJSParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnonymousFunctionDecl}
	 * labeled alternative in {@link ReactJSParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousFunctionDecl(ReactJSParser.AnonymousFunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnonymousFunctionDecl}
	 * labeled alternative in {@link ReactJSParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousFunctionDecl(ReactJSParser.AnonymousFunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrowFunction}
	 * labeled alternative in {@link ReactJSParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunction(ReactJSParser.ArrowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrowFunction}
	 * labeled alternative in {@link ReactJSParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunction(ReactJSParser.ArrowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#arrowFunctionParameters}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionParameters(ReactJSParser.ArrowFunctionParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#arrowFunctionParameters}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionParameters(ReactJSParser.ArrowFunctionParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#arrowFunctionBody}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionBody(ReactJSParser.ArrowFunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#arrowFunctionBody}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionBody(ReactJSParser.ArrowFunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplyOperator}
	 * labeled alternative in {@link ReactJSParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyOperator(ReactJSParser.MultiplyOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplyOperator}
	 * labeled alternative in {@link ReactJSParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyOperator(ReactJSParser.MultiplyOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivideOperator}
	 * labeled alternative in {@link ReactJSParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterDivideOperator(ReactJSParser.DivideOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivideOperator}
	 * labeled alternative in {@link ReactJSParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitDivideOperator(ReactJSParser.DivideOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModulusOperator}
	 * labeled alternative in {@link ReactJSParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterModulusOperator(ReactJSParser.ModulusOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModulusOperator}
	 * labeled alternative in {@link ReactJSParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitModulusOperator(ReactJSParser.ModulusOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlusOperator}
	 * labeled alternative in {@link ReactJSParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterPlusOperator(ReactJSParser.PlusOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlusOperator}
	 * labeled alternative in {@link ReactJSParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitPlusOperator(ReactJSParser.PlusOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinusOperator}
	 * labeled alternative in {@link ReactJSParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterMinusOperator(ReactJSParser.MinusOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinusOperator}
	 * labeled alternative in {@link ReactJSParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitMinusOperator(ReactJSParser.MinusOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PowerOperator}
	 * labeled alternative in {@link ReactJSParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterPowerOperator(ReactJSParser.PowerOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PowerOperator}
	 * labeled alternative in {@link ReactJSParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitPowerOperator(ReactJSParser.PowerOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NullishOperator}
	 * labeled alternative in {@link ReactJSParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterNullishOperator(ReactJSParser.NullishOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NullishOperator}
	 * labeled alternative in {@link ReactJSParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitNullishOperator(ReactJSParser.NullishOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Null}
	 * labeled alternative in {@link ReactJSParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterNull(ReactJSParser.NullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Null}
	 * labeled alternative in {@link ReactJSParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitNull(ReactJSParser.NullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link ReactJSParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(ReactJSParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link ReactJSParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(ReactJSParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link ReactJSParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterString(ReactJSParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link ReactJSParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitString(ReactJSParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateString}
	 * labeled alternative in {@link ReactJSParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterTemplateString(ReactJSParser.TemplateStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateString}
	 * labeled alternative in {@link ReactJSParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitTemplateString(ReactJSParser.TemplateStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link ReactJSParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ReactJSParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link ReactJSParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ReactJSParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#templateStringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterTemplateStringLiteral(ReactJSParser.TemplateStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#templateStringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitTemplateStringLiteral(ReactJSParser.TemplateStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateStringCharacter}
	 * labeled alternative in {@link ReactJSParser#templateStringAtom}.
	 * @param ctx the parse tree
	 */
	void enterTemplateStringCharacter(ReactJSParser.TemplateStringCharacterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateStringCharacter}
	 * labeled alternative in {@link ReactJSParser#templateStringAtom}.
	 * @param ctx the parse tree
	 */
	void exitTemplateStringCharacter(ReactJSParser.TemplateStringCharacterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateStringJSExpression}
	 * labeled alternative in {@link ReactJSParser#templateStringAtom}.
	 * @param ctx the parse tree
	 */
	void enterTemplateStringJSExpression(ReactJSParser.TemplateStringJSExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateStringJSExpression}
	 * labeled alternative in {@link ReactJSParser#templateStringAtom}.
	 * @param ctx the parse tree
	 */
	void exitTemplateStringJSExpression(ReactJSParser.TemplateStringJSExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#let_}.
	 * @param ctx the parse tree
	 */
	void enterLet_(ReactJSParser.Let_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#let_}.
	 * @param ctx the parse tree
	 */
	void exitLet_(ReactJSParser.Let_Context ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(ReactJSParser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(ReactJSParser.EosContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDocument(ReactJSParser.HtmlDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDocument(ReactJSParser.HtmlDocumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalElement}
	 * labeled alternative in {@link ReactJSParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterNormalElement(ReactJSParser.NormalElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalElement}
	 * labeled alternative in {@link ReactJSParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitNormalElement(ReactJSParser.NormalElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelfClosedElement}
	 * labeled alternative in {@link ReactJSParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosedElement(ReactJSParser.SelfClosedElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelfClosedElement}
	 * labeled alternative in {@link ReactJSParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosedElement(ReactJSParser.SelfClosedElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(ReactJSParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(ReactJSParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(ReactJSParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(ReactJSParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void enterHtmlChardata(ReactJSParser.HtmlChardataContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void exitHtmlChardata(ReactJSParser.HtmlChardataContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#mixedText}.
	 * @param ctx the parse tree
	 */
	void enterMixedText(ReactJSParser.MixedTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#mixedText}.
	 * @param ctx the parse tree
	 */
	void exitMixedText(ReactJSParser.MixedTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void enterHtmlMisc(ReactJSParser.HtmlMiscContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void exitHtmlMisc(ReactJSParser.HtmlMiscContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactJSParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void enterHtmlComment(ReactJSParser.HtmlCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactJSParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void exitHtmlComment(ReactJSParser.HtmlCommentContext ctx);
}