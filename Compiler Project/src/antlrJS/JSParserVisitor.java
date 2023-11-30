// Generated from D:/GitHub/ReactJS-Compiler/Compiler Project/src/rules/JSParser.g4 by ANTLR 4.13.1
package antlrJS;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JSParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JSParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JSParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(JSParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockChunk(JSParser.BlockChunkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclerationChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclerationChunk(JSParser.VariableDeclerationChunkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportChunk(JSParser.ImportChunkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExportChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportChunk(JSParser.ExportChunkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyChunk(JSParser.EmptyChunkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassDeclerationChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclerationChunk(JSParser.ClassDeclerationChunkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDeclarationChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclarationChunk(JSParser.FunctionDeclarationChunkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionChunk(JSParser.ExpressionChunkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionalChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalChunk(JSParser.ConditionalChunkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LoopChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopChunk(JSParser.LoopChunkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContinueChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueChunk(JSParser.ContinueChunkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BreakChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakChunk(JSParser.BreakChunkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnChunk(JSParser.ReturnChunkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SwitchChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchChunk(JSParser.SwitchChunkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThrowChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowChunk(JSParser.ThrowChunkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TryChunk}
	 * labeled alternative in {@link JSParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryChunk(JSParser.TryChunkContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JSParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(JSParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FileImportBlock}
	 * labeled alternative in {@link JSParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileImportBlock(JSParser.FileImportBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeafultAsImportBlock}
	 * labeled alternative in {@link JSParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeafultAsImportBlock(JSParser.DeafultAsImportBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectImportBlock}
	 * labeled alternative in {@link JSParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectImportBlock(JSParser.ObjectImportBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#importModuleItems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportModuleItems(JSParser.ImportModuleItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#importNamespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportNamespace(JSParser.ImportNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#aliasName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasName(JSParser.AliasNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExportDeclaration}
	 * labeled alternative in {@link JSParser#exportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportDeclaration(JSParser.ExportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExportBlock}
	 * labeled alternative in {@link JSParser#exportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportBlock(JSParser.ExportBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExportDefaultDeclaration}
	 * labeled alternative in {@link JSParser#exportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportDefaultDeclaration(JSParser.ExportDefaultDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#exportFromBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportFromBlock(JSParser.ExportFromBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#exportModuleItems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportModuleItems(JSParser.ExportModuleItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#exportAliasName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportAliasName(JSParser.ExportAliasNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclare}
	 * labeled alternative in {@link JSParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclare(JSParser.VariableDeclareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassDeclare}
	 * labeled alternative in {@link JSParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclare(JSParser.ClassDeclareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDeclare}
	 * labeled alternative in {@link JSParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclare(JSParser.FunctionDeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#variableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableStatement(JSParser.VariableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationList(JSParser.VariableDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(JSParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(JSParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(JSParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoWhileStatement}
	 * labeled alternative in {@link JSParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(JSParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link JSParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(JSParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link JSParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(JSParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForInStatement}
	 * labeled alternative in {@link JSParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInStatement(JSParser.ForInStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForOfStatement}
	 * labeled alternative in {@link JSParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForOfStatement(JSParser.ForOfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarKeyword}
	 * labeled alternative in {@link JSParser#varModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarKeyword(JSParser.VarKeywordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LetKeyword}
	 * labeled alternative in {@link JSParser#varModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetKeyword(JSParser.LetKeywordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstKeyword}
	 * labeled alternative in {@link JSParser#varModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstKeyword(JSParser.ConstKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(JSParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(JSParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(JSParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(JSParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#caseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBlock(JSParser.CaseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#caseClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseClauses(JSParser.CaseClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#caseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseClause(JSParser.CaseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#defaultClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultClause(JSParser.DefaultClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(JSParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(JSParser.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#catchProduction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchProduction(JSParser.CatchProductionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#finallyProduction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyProduction(JSParser.FinallyProductionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(JSParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(JSParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#classTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassTail(JSParser.ClassTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#classElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassElements(JSParser.ClassElementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassMethodDefinition}
	 * labeled alternative in {@link JSParser#classElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMethodDefinition(JSParser.ClassMethodDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassFieldDefinition}
	 * labeled alternative in {@link JSParser#classElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassFieldDefinition(JSParser.ClassFieldDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassEmptyStatement}
	 * labeled alternative in {@link JSParser#classElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassEmptyStatement(JSParser.ClassEmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#methodDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDefinition(JSParser.MethodDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#fieldDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDefinition(JSParser.FieldDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalParameters}
	 * labeled alternative in {@link JSParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalParameters(JSParser.NormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RestParameters}
	 * labeled alternative in {@link JSParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestParameters(JSParser.RestParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#formalParameterArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterArg(JSParser.FormalParameterArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#lastFormalParameterArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameterArg(JSParser.LastFormalParameterArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(JSParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(JSParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#elementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementList(JSParser.ElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#arrayElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElement(JSParser.ArrayElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyExpressionAssignment}
	 * labeled alternative in {@link JSParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyExpressionAssignment(JSParser.PropertyExpressionAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComputedPropertyExpressionAssignment}
	 * labeled alternative in {@link JSParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComputedPropertyExpressionAssignment(JSParser.ComputedPropertyExpressionAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionProperty}
	 * labeled alternative in {@link JSParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionProperty(JSParser.FunctionPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyShorthand}
	 * labeled alternative in {@link JSParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyShorthand(JSParser.PropertyShorthandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyByName}
	 * labeled alternative in {@link JSParser#propertyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyByName(JSParser.PropertyByNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyByString}
	 * labeled alternative in {@link JSParser#propertyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyByString(JSParser.PropertyByStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyByNumber}
	 * labeled alternative in {@link JSParser#propertyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyByNumber(JSParser.PropertyByNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyByExpression}
	 * labeled alternative in {@link JSParser#propertyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyByExpression(JSParser.PropertyByExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(JSParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(JSParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#expressionSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionSequence(JSParser.ExpressionSequenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateStringExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateStringExpression(JSParser.TemplateStringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpression(JSParser.TernaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(JSParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PowerExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerExpression(JSParser.PowerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PreIncrementExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementExpression(JSParser.PreIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteralExpression(JSParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(JSParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OptionalChainExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalChainExpression(JSParser.OptionalChainExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(JSParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PreDecreaseExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecreaseExpression(JSParser.PreDecreaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgumentsExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentsExpression(JSParser.ArgumentsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpression(JSParser.ThisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpression(JSParser.FunctionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryMinusExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpression(JSParser.UnaryMinusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(JSParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostDecreaseExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecreaseExpression(JSParser.PostDecreaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeofExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeofExpression(JSParser.TypeofExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryPlusExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPlusExpression(JSParser.UnaryPlusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeleteExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteExpression(JSParser.DeleteExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportExpression(JSParser.ImportExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(JSParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SuperExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperExpression(JSParser.SuperExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(JSParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(JSParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(JSParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(JSParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(JSParser.PostIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpression(JSParser.NewExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpression(JSParser.LiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteralExpression(JSParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDotExpression(JSParser.MemberDotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassExpression(JSParser.ClassExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberIndexExpression(JSParser.MemberIndexExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(JSParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentOperatorExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperatorExpression(JSParser.AssignmentOperatorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CoalesceExpression}
	 * labeled alternative in {@link JSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoalesceExpression(JSParser.CoalesceExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableByName}
	 * labeled alternative in {@link JSParser#assignable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableByName(JSParser.VariableByNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableByArray}
	 * labeled alternative in {@link JSParser#assignable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableByArray(JSParser.VariableByArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableByObject}
	 * labeled alternative in {@link JSParser#assignable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableByObject(JSParser.VariableByObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(JSParser.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnonymousFunctionDecl}
	 * labeled alternative in {@link JSParser#anonymousFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousFunctionDecl(JSParser.AnonymousFunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrowFunction}
	 * labeled alternative in {@link JSParser#anonymousFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunction(JSParser.ArrowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OneParameter}
	 * labeled alternative in {@link JSParser#arrowFunctionParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneParameter(JSParser.OneParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ManyParameters}
	 * labeled alternative in {@link JSParser#arrowFunctionParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitManyParameters(JSParser.ManyParametersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OneExpression}
	 * labeled alternative in {@link JSParser#arrowFunctionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneExpression(JSParser.OneExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ManyExpressions}
	 * labeled alternative in {@link JSParser#arrowFunctionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitManyExpressions(JSParser.ManyExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplyOperator}
	 * labeled alternative in {@link JSParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyOperator(JSParser.MultiplyOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivideOperator}
	 * labeled alternative in {@link JSParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivideOperator(JSParser.DivideOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModulusOperator}
	 * labeled alternative in {@link JSParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulusOperator(JSParser.ModulusOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlusOperator}
	 * labeled alternative in {@link JSParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusOperator(JSParser.PlusOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinusOperator}
	 * labeled alternative in {@link JSParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusOperator(JSParser.MinusOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PowerOperator}
	 * labeled alternative in {@link JSParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerOperator(JSParser.PowerOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NullishOperator}
	 * labeled alternative in {@link JSParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullishOperator(JSParser.NullishOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Null}
	 * labeled alternative in {@link JSParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull(JSParser.NullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link JSParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(JSParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link JSParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(JSParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateString}
	 * labeled alternative in {@link JSParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateString(JSParser.TemplateStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link JSParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(JSParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#templateStringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateStringLiteral(JSParser.TemplateStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateStringCharacter}
	 * labeled alternative in {@link JSParser#templateStringAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateStringCharacter(JSParser.TemplateStringCharacterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateStringJSExpression}
	 * labeled alternative in {@link JSParser#templateStringAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateStringJSExpression(JSParser.TemplateStringJSExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSParser#eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEos(JSParser.EosContext ctx);
}