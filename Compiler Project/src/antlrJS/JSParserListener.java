// Generated from C:/Users/ASUS/Desktop/GitHub/ReactJS-Compiler/Compiler Project/src/rules/JSParser.g4 by ANTLR 4.13.1
package antlrJS;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JSParser}.
 */
public interface JSParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JSParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JSParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(JSParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlockChunk(JSParser.BlockChunkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlockChunk(JSParser.BlockChunkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclerationChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclerationChunk(JSParser.VariableDeclerationChunkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclerationChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclerationChunk(JSParser.VariableDeclerationChunkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterImportChunk(JSParser.ImportChunkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitImportChunk(JSParser.ImportChunkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExportChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExportChunk(JSParser.ExportChunkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExportChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExportChunk(JSParser.ExportChunkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyChunk(JSParser.EmptyChunkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyChunk(JSParser.EmptyChunkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassDeclerationChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclerationChunk(JSParser.ClassDeclerationChunkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassDeclerationChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclerationChunk(JSParser.ClassDeclerationChunkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDeclarationChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclarationChunk(JSParser.FunctionDeclarationChunkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDeclarationChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclarationChunk(JSParser.FunctionDeclarationChunkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionChunk(JSParser.ExpressionChunkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionChunk(JSParser.ExpressionChunkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionalChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalChunk(JSParser.ConditionalChunkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionalChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalChunk(JSParser.ConditionalChunkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LoopChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLoopChunk(JSParser.LoopChunkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LoopChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLoopChunk(JSParser.LoopChunkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContinueChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterContinueChunk(JSParser.ContinueChunkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContinueChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitContinueChunk(JSParser.ContinueChunkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BreakChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBreakChunk(JSParser.BreakChunkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BreakChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBreakChunk(JSParser.BreakChunkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnChunk(JSParser.ReturnChunkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnChunk(JSParser.ReturnChunkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SwitchChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchChunk(JSParser.SwitchChunkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SwitchChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchChunk(JSParser.SwitchChunkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThrowChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterThrowChunk(JSParser.ThrowChunkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThrowChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitThrowChunk(JSParser.ThrowChunkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TryChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTryChunk(JSParser.TryChunkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TryChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTryChunk(JSParser.TryChunkContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JSParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JSParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(JSParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(JSParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FileImportBlock}
	 * labeled alternative in {@link JSParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterFileImportBlock(JSParser.FileImportBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FileImportBlock}
	 * labeled alternative in {@link JSParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitFileImportBlock(JSParser.FileImportBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectImportBlock}
	 * labeled alternative in {@link JSParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterObjectImportBlock(JSParser.ObjectImportBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectImportBlock}
	 * labeled alternative in {@link JSParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitObjectImportBlock(JSParser.ObjectImportBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeafultAsImportBlock}
	 * labeled alternative in {@link JSParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeafultAsImportBlock(JSParser.DeafultAsImportBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeafultAsImportBlock}
	 * labeled alternative in {@link JSParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeafultAsImportBlock(JSParser.DeafultAsImportBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#importModuleItems}.
	 * @param ctx the parse tree
	 */
	void enterImportModuleItems(JSParser.ImportModuleItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#importModuleItems}.
	 * @param ctx the parse tree
	 */
	void exitImportModuleItems(JSParser.ImportModuleItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#importNamespace}.
	 * @param ctx the parse tree
	 */
	void enterImportNamespace(JSParser.ImportNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#importNamespace}.
	 * @param ctx the parse tree
	 */
	void exitImportNamespace(JSParser.ImportNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#aliasName}.
	 * @param ctx the parse tree
	 */
	void enterAliasName(JSParser.AliasNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#aliasName}.
	 * @param ctx the parse tree
	 */
	void exitAliasName(JSParser.AliasNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExportDeclaration}
	 * labeled alternative in {@link JSParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportDeclaration(JSParser.ExportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExportDeclaration}
	 * labeled alternative in {@link JSParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportDeclaration(JSParser.ExportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExportDefaultDeclaration}
	 * labeled alternative in {@link JSParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportDefaultDeclaration(JSParser.ExportDefaultDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExportDefaultDeclaration}
	 * labeled alternative in {@link JSParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportDefaultDeclaration(JSParser.ExportDefaultDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#exportFromBlock}.
	 * @param ctx the parse tree
	 */
	void enterExportFromBlock(JSParser.ExportFromBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#exportFromBlock}.
	 * @param ctx the parse tree
	 */
	void exitExportFromBlock(JSParser.ExportFromBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#exportModuleItems}.
	 * @param ctx the parse tree
	 */
	void enterExportModuleItems(JSParser.ExportModuleItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#exportModuleItems}.
	 * @param ctx the parse tree
	 */
	void exitExportModuleItems(JSParser.ExportModuleItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#exportAliasName}.
	 * @param ctx the parse tree
	 */
	void enterExportAliasName(JSParser.ExportAliasNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#exportAliasName}.
	 * @param ctx the parse tree
	 */
	void exitExportAliasName(JSParser.ExportAliasNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclare}
	 * labeled alternative in {@link JSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclare(JSParser.VariableDeclareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclare}
	 * labeled alternative in {@link JSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclare(JSParser.VariableDeclareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassDeclare}
	 * labeled alternative in {@link JSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclare(JSParser.ClassDeclareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassDeclare}
	 * labeled alternative in {@link JSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclare(JSParser.ClassDeclareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDeclare}
	 * labeled alternative in {@link JSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclare(JSParser.FunctionDeclareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDeclare}
	 * labeled alternative in {@link JSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclare(JSParser.FunctionDeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableStatement(JSParser.VariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableStatement(JSParser.VariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationList(JSParser.VariableDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationList(JSParser.VariableDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(JSParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(JSParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(JSParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(JSParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(JSParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(JSParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoWhileStatement}
	 * labeled alternative in {@link JSParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(JSParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoWhileStatement}
	 * labeled alternative in {@link JSParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(JSParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link JSParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(JSParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link JSParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(JSParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link JSParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(JSParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link JSParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(JSParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForInStatement}
	 * labeled alternative in {@link JSParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForInStatement(JSParser.ForInStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInStatement}
	 * labeled alternative in {@link JSParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForInStatement(JSParser.ForInStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForOfStatement}
	 * labeled alternative in {@link JSParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForOfStatement(JSParser.ForOfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForOfStatement}
	 * labeled alternative in {@link JSParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForOfStatement(JSParser.ForOfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarKeyword}
	 * labeled alternative in {@link JSParser#varModifier}.
	 * @param ctx the parse tree
	 */
	void enterVarKeyword(JSParser.VarKeywordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarKeyword}
	 * labeled alternative in {@link JSParser#varModifier}.
	 * @param ctx the parse tree
	 */
	void exitVarKeyword(JSParser.VarKeywordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LetKeyword}
	 * labeled alternative in {@link JSParser#varModifier}.
	 * @param ctx the parse tree
	 */
	void enterLetKeyword(JSParser.LetKeywordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LetKeyword}
	 * labeled alternative in {@link JSParser#varModifier}.
	 * @param ctx the parse tree
	 */
	void exitLetKeyword(JSParser.LetKeywordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstKeyword}
	 * labeled alternative in {@link JSParser#varModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstKeyword(JSParser.ConstKeywordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstKeyword}
	 * labeled alternative in {@link JSParser#varModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstKeyword(JSParser.ConstKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(JSParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(JSParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(JSParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(JSParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(JSParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(JSParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(JSParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(JSParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void enterCaseBlock(JSParser.CaseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void exitCaseBlock(JSParser.CaseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#caseClauses}.
	 * @param ctx the parse tree
	 */
	void enterCaseClauses(JSParser.CaseClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#caseClauses}.
	 * @param ctx the parse tree
	 */
	void exitCaseClauses(JSParser.CaseClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void enterCaseClause(JSParser.CaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void exitCaseClause(JSParser.CaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	void enterDefaultClause(JSParser.DefaultClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	void exitDefaultClause(JSParser.DefaultClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(JSParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(JSParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(JSParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(JSParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#catchProduction}.
	 * @param ctx the parse tree
	 */
	void enterCatchProduction(JSParser.CatchProductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#catchProduction}.
	 * @param ctx the parse tree
	 */
	void exitCatchProduction(JSParser.CatchProductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#finallyProduction}.
	 * @param ctx the parse tree
	 */
	void enterFinallyProduction(JSParser.FinallyProductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#finallyProduction}.
	 * @param ctx the parse tree
	 */
	void exitFinallyProduction(JSParser.FinallyProductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(JSParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(JSParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JSParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JSParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#classTail}.
	 * @param ctx the parse tree
	 */
	void enterClassTail(JSParser.ClassTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#classTail}.
	 * @param ctx the parse tree
	 */
	void exitClassTail(JSParser.ClassTailContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassMethodDefinition}
	 * labeled alternative in {@link JSParser#classElement}.
	 * @param ctx the parse tree
	 */
	void enterClassMethodDefinition(JSParser.ClassMethodDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassMethodDefinition}
	 * labeled alternative in {@link JSParser#classElement}.
	 * @param ctx the parse tree
	 */
	void exitClassMethodDefinition(JSParser.ClassMethodDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassFieldDefinition}
	 * labeled alternative in {@link JSParser#classElement}.
	 * @param ctx the parse tree
	 */
	void enterClassFieldDefinition(JSParser.ClassFieldDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassFieldDefinition}
	 * labeled alternative in {@link JSParser#classElement}.
	 * @param ctx the parse tree
	 */
	void exitClassFieldDefinition(JSParser.ClassFieldDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassEmptyStatement}
	 * labeled alternative in {@link JSParser#classElement}.
	 * @param ctx the parse tree
	 */
	void enterClassEmptyStatement(JSParser.ClassEmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassEmptyStatement}
	 * labeled alternative in {@link JSParser#classElement}.
	 * @param ctx the parse tree
	 */
	void exitClassEmptyStatement(JSParser.ClassEmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#methodDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMethodDefinition(JSParser.MethodDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#methodDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMethodDefinition(JSParser.MethodDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#fieldDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFieldDefinition(JSParser.FieldDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#fieldDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFieldDefinition(JSParser.FieldDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalParameters}
	 * labeled alternative in {@link JSParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterNormalParameters(JSParser.NormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalParameters}
	 * labeled alternative in {@link JSParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitNormalParameters(JSParser.NormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RestParameters}
	 * labeled alternative in {@link JSParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterRestParameters(JSParser.RestParametersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RestParameters}
	 * labeled alternative in {@link JSParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitRestParameters(JSParser.RestParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#formalParameterArg}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterArg(JSParser.FormalParameterArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#formalParameterArg}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterArg(JSParser.FormalParameterArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#lastFormalParameterArg}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameterArg(JSParser.LastFormalParameterArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#lastFormalParameterArg}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameterArg(JSParser.LastFormalParameterArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(JSParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(JSParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(JSParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(JSParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementList(JSParser.ElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementList(JSParser.ElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void enterArrayElement(JSParser.ArrayElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void exitArrayElement(JSParser.ArrayElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyExpressionAssignment}
	 * labeled alternative in {@link JSParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyExpressionAssignment(JSParser.PropertyExpressionAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyExpressionAssignment}
	 * labeled alternative in {@link JSParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyExpressionAssignment(JSParser.PropertyExpressionAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComputedPropertyExpressionAssignment}
	 * labeled alternative in {@link JSParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterComputedPropertyExpressionAssignment(JSParser.ComputedPropertyExpressionAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComputedPropertyExpressionAssignment}
	 * labeled alternative in {@link JSParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitComputedPropertyExpressionAssignment(JSParser.ComputedPropertyExpressionAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionProperty}
	 * labeled alternative in {@link JSParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterFunctionProperty(JSParser.FunctionPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionProperty}
	 * labeled alternative in {@link JSParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitFunctionProperty(JSParser.FunctionPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyShorthand}
	 * labeled alternative in {@link JSParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyShorthand(JSParser.PropertyShorthandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyShorthand}
	 * labeled alternative in {@link JSParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyShorthand(JSParser.PropertyShorthandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyByName}
	 * labeled alternative in {@link JSParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void enterPropertyByName(JSParser.PropertyByNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyByName}
	 * labeled alternative in {@link JSParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void exitPropertyByName(JSParser.PropertyByNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyByString}
	 * labeled alternative in {@link JSParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void enterPropertyByString(JSParser.PropertyByStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyByString}
	 * labeled alternative in {@link JSParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void exitPropertyByString(JSParser.PropertyByStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyByNumber}
	 * labeled alternative in {@link JSParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void enterPropertyByNumber(JSParser.PropertyByNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyByNumber}
	 * labeled alternative in {@link JSParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void exitPropertyByNumber(JSParser.PropertyByNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyByExpression}
	 * labeled alternative in {@link JSParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void enterPropertyByExpression(JSParser.PropertyByExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyByExpression}
	 * labeled alternative in {@link JSParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void exitPropertyByExpression(JSParser.PropertyByExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(JSParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(JSParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(JSParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(JSParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#expressionSequence}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSequence(JSParser.ExpressionSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#expressionSequence}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSequence(JSParser.ExpressionSequenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateStringExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTemplateStringExpression(JSParser.TemplateStringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateStringExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTemplateStringExpression(JSParser.TemplateStringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(JSParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(JSParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(JSParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(JSParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PowerExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpression(JSParser.PowerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PowerExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpression(JSParser.PowerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreIncrementExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(JSParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreIncrementExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(JSParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteralExpression(JSParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteralExpression(JSParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MetaExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMetaExpression(JSParser.MetaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MetaExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMetaExpression(JSParser.MetaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterInExpression(JSParser.InExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitInExpression(JSParser.InExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(JSParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(JSParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OptionalChainExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterOptionalChainExpression(JSParser.OptionalChainExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OptionalChainExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitOptionalChainExpression(JSParser.OptionalChainExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(JSParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(JSParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreDecreaseExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecreaseExpression(JSParser.PreDecreaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreDecreaseExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecreaseExpression(JSParser.PreDecreaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentsExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsExpression(JSParser.ArgumentsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentsExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsExpression(JSParser.ArgumentsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpression(JSParser.ThisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpression(JSParser.ThisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression(JSParser.FunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression(JSParser.FunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryMinusExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpression(JSParser.UnaryMinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryMinusExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpression(JSParser.UnaryMinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(JSParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(JSParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostDecreaseExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecreaseExpression(JSParser.PostDecreaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostDecreaseExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecreaseExpression(JSParser.PostDecreaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeofExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTypeofExpression(JSParser.TypeofExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeofExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTypeofExpression(JSParser.TypeofExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryPlusExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPlusExpression(JSParser.UnaryPlusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryPlusExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPlusExpression(JSParser.UnaryPlusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeleteExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterDeleteExpression(JSParser.DeleteExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeleteExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitDeleteExpression(JSParser.DeleteExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterImportExpression(JSParser.ImportExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitImportExpression(JSParser.ImportExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(JSParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(JSParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SuperExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSuperExpression(JSParser.SuperExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SuperExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSuperExpression(JSParser.SuperExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(JSParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(JSParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(JSParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(JSParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(JSParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(JSParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(JSParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(JSParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(JSParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(JSParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpression(JSParser.NewExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpression(JSParser.NewExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(JSParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(JSParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteralExpression(JSParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteralExpression(JSParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMemberDotExpression(JSParser.MemberDotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMemberDotExpression(JSParser.MemberDotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassExpression(JSParser.ClassExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassExpression(JSParser.ClassExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMemberIndexExpression(JSParser.MemberIndexExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMemberIndexExpression(JSParser.MemberIndexExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(JSParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(JSParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentOperatorExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperatorExpression(JSParser.AssignmentOperatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentOperatorExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperatorExpression(JSParser.AssignmentOperatorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CoalesceExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterCoalesceExpression(JSParser.CoalesceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CoalesceExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitCoalesceExpression(JSParser.CoalesceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(JSParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(JSParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableByName}
	 * labeled alternative in {@link JSParser#assignable}.
	 * @param ctx the parse tree
	 */
	void enterVariableByName(JSParser.VariableByNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableByName}
	 * labeled alternative in {@link JSParser#assignable}.
	 * @param ctx the parse tree
	 */
	void exitVariableByName(JSParser.VariableByNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableByArray}
	 * labeled alternative in {@link JSParser#assignable}.
	 * @param ctx the parse tree
	 */
	void enterVariableByArray(JSParser.VariableByArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableByArray}
	 * labeled alternative in {@link JSParser#assignable}.
	 * @param ctx the parse tree
	 */
	void exitVariableByArray(JSParser.VariableByArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableByObject}
	 * labeled alternative in {@link JSParser#assignable}.
	 * @param ctx the parse tree
	 */
	void enterVariableByObject(JSParser.VariableByObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableByObject}
	 * labeled alternative in {@link JSParser#assignable}.
	 * @param ctx the parse tree
	 */
	void exitVariableByObject(JSParser.VariableByObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(JSParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(JSParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnonymousFunctionDecl}
	 * labeled alternative in {@link JSParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousFunctionDecl(JSParser.AnonymousFunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnonymousFunctionDecl}
	 * labeled alternative in {@link JSParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousFunctionDecl(JSParser.AnonymousFunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrowFunction}
	 * labeled alternative in {@link JSParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunction(JSParser.ArrowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrowFunction}
	 * labeled alternative in {@link JSParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunction(JSParser.ArrowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OneParameter}
	 * labeled alternative in {@link JSParser#arrowFunctionParameters}.
	 * @param ctx the parse tree
	 */
	void enterOneParameter(JSParser.OneParameterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OneParameter}
	 * labeled alternative in {@link JSParser#arrowFunctionParameters}.
	 * @param ctx the parse tree
	 */
	void exitOneParameter(JSParser.OneParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ManyParameters}
	 * labeled alternative in {@link JSParser#arrowFunctionParameters}.
	 * @param ctx the parse tree
	 */
	void enterManyParameters(JSParser.ManyParametersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ManyParameters}
	 * labeled alternative in {@link JSParser#arrowFunctionParameters}.
	 * @param ctx the parse tree
	 */
	void exitManyParameters(JSParser.ManyParametersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OneExpression}
	 * labeled alternative in {@link JSParser#arrowFunctionBody}.
	 * @param ctx the parse tree
	 */
	void enterOneExpression(JSParser.OneExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OneExpression}
	 * labeled alternative in {@link JSParser#arrowFunctionBody}.
	 * @param ctx the parse tree
	 */
	void exitOneExpression(JSParser.OneExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ManyExpressions}
	 * labeled alternative in {@link JSParser#arrowFunctionBody}.
	 * @param ctx the parse tree
	 */
	void enterManyExpressions(JSParser.ManyExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ManyExpressions}
	 * labeled alternative in {@link JSParser#arrowFunctionBody}.
	 * @param ctx the parse tree
	 */
	void exitManyExpressions(JSParser.ManyExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplyOperator}
	 * labeled alternative in {@link JSParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyOperator(JSParser.MultiplyOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplyOperator}
	 * labeled alternative in {@link JSParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyOperator(JSParser.MultiplyOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivideOperator}
	 * labeled alternative in {@link JSParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterDivideOperator(JSParser.DivideOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivideOperator}
	 * labeled alternative in {@link JSParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitDivideOperator(JSParser.DivideOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModulusOperator}
	 * labeled alternative in {@link JSParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterModulusOperator(JSParser.ModulusOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModulusOperator}
	 * labeled alternative in {@link JSParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitModulusOperator(JSParser.ModulusOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlusOperator}
	 * labeled alternative in {@link JSParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterPlusOperator(JSParser.PlusOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlusOperator}
	 * labeled alternative in {@link JSParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitPlusOperator(JSParser.PlusOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinusOperator}
	 * labeled alternative in {@link JSParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterMinusOperator(JSParser.MinusOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinusOperator}
	 * labeled alternative in {@link JSParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitMinusOperator(JSParser.MinusOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PowerOperator}
	 * labeled alternative in {@link JSParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterPowerOperator(JSParser.PowerOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PowerOperator}
	 * labeled alternative in {@link JSParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitPowerOperator(JSParser.PowerOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NullishOperator}
	 * labeled alternative in {@link JSParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterNullishOperator(JSParser.NullishOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NullishOperator}
	 * labeled alternative in {@link JSParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitNullishOperator(JSParser.NullishOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Null}
	 * labeled alternative in {@link JSParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterNull(JSParser.NullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Null}
	 * labeled alternative in {@link JSParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitNull(JSParser.NullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link JSParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(JSParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link JSParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(JSParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link JSParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterString(JSParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link JSParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitString(JSParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateString}
	 * labeled alternative in {@link JSParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterTemplateString(JSParser.TemplateStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateString}
	 * labeled alternative in {@link JSParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitTemplateString(JSParser.TemplateStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link JSParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterNumber(JSParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link JSParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitNumber(JSParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#templateStringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterTemplateStringLiteral(JSParser.TemplateStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#templateStringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitTemplateStringLiteral(JSParser.TemplateStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateStringCharacter}
	 * labeled alternative in {@link JSParser#templateStringAtom}.
	 * @param ctx the parse tree
	 */
	void enterTemplateStringCharacter(JSParser.TemplateStringCharacterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateStringCharacter}
	 * labeled alternative in {@link JSParser#templateStringAtom}.
	 * @param ctx the parse tree
	 */
	void exitTemplateStringCharacter(JSParser.TemplateStringCharacterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateStringJSExpression}
	 * labeled alternative in {@link JSParser#templateStringAtom}.
	 * @param ctx the parse tree
	 */
	void enterTemplateStringJSExpression(JSParser.TemplateStringJSExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateStringJSExpression}
	 * labeled alternative in {@link JSParser#templateStringAtom}.
	 * @param ctx the parse tree
	 */
	void exitTemplateStringJSExpression(JSParser.TemplateStringJSExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSParser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(JSParser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSParser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(JSParser.EosContext ctx);
}