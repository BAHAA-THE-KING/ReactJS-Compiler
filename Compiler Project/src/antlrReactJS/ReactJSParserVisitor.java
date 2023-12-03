// Generated from C:/Users/ASUS/Desktop/GitHub/ReactJS-Compiler/Compiler Project/src/rules/ReactJSParser.g4 by ANTLR 4.13.1
package antlrReactJS;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ReactJSParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ReactJSParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code JSFile}
	 * labeled alternative in {@link ReactJSParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJSFile(ReactJSParser.JSFileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HTMLFile}
	 * labeled alternative in {@link ReactJSParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHTMLFile(ReactJSParser.HTMLFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ReactJSParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockChunk}
	 * labeled alternative in {@link ReactJSParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockChunk(ReactJSParser.BlockChunkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclerationChunk}
	 * labeled alternative in {@link ReactJSParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclerationChunk(ReactJSParser.VariableDeclerationChunkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyChunk}
	 * labeled alternative in {@link ReactJSParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyChunk(ReactJSParser.EmptyChunkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassDeclarationChunk}
	 * labeled alternative in {@link ReactJSParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclarationChunk(ReactJSParser.ClassDeclarationChunkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDeclarationChunk}
	 * labeled alternative in {@link ReactJSParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclarationChunk(ReactJSParser.FunctionDeclarationChunkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionChunk}
	 * labeled alternative in {@link ReactJSParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionChunk(ReactJSParser.ExpressionChunkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionalChunk}
	 * labeled alternative in {@link ReactJSParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalChunk(ReactJSParser.ConditionalChunkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LoopChunk}
	 * labeled alternative in {@link ReactJSParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopChunk(ReactJSParser.LoopChunkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContinueChunk}
	 * labeled alternative in {@link ReactJSParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueChunk(ReactJSParser.ContinueChunkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BreakChunk}
	 * labeled alternative in {@link ReactJSParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakChunk(ReactJSParser.BreakChunkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnChunk}
	 * labeled alternative in {@link ReactJSParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnChunk(ReactJSParser.ReturnChunkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SwitchChunk}
	 * labeled alternative in {@link ReactJSParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchChunk(ReactJSParser.SwitchChunkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThrowChunk}
	 * labeled alternative in {@link ReactJSParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowChunk(ReactJSParser.ThrowChunkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TryChunk}
	 * labeled alternative in {@link ReactJSParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryChunk(ReactJSParser.TryChunkContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ReactJSParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(ReactJSParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FileImportBlock}
	 * labeled alternative in {@link ReactJSParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileImportBlock(ReactJSParser.FileImportBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeafultAsImportBlock}
	 * labeled alternative in {@link ReactJSParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeafultAsImportBlock(ReactJSParser.DeafultAsImportBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectImportBlock}
	 * labeled alternative in {@link ReactJSParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectImportBlock(ReactJSParser.ObjectImportBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#importModuleItems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportModuleItems(ReactJSParser.ImportModuleItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#importNamespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportNamespace(ReactJSParser.ImportNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#aliasName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasName(ReactJSParser.AliasNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExportDeclaration}
	 * labeled alternative in {@link ReactJSParser#exportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportDeclaration(ReactJSParser.ExportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExportBlock}
	 * labeled alternative in {@link ReactJSParser#exportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportBlock(ReactJSParser.ExportBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExportDefaultDeclaration}
	 * labeled alternative in {@link ReactJSParser#exportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportDefaultDeclaration(ReactJSParser.ExportDefaultDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#exportFromBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportFromBlock(ReactJSParser.ExportFromBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#exportModuleItems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportModuleItems(ReactJSParser.ExportModuleItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#exportAliasName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportAliasName(ReactJSParser.ExportAliasNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclare}
	 * labeled alternative in {@link ReactJSParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclare(ReactJSParser.VariableDeclareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassDeclare}
	 * labeled alternative in {@link ReactJSParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclare(ReactJSParser.ClassDeclareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDeclare}
	 * labeled alternative in {@link ReactJSParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclare(ReactJSParser.FunctionDeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#variableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableStatement(ReactJSParser.VariableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationList(ReactJSParser.VariableDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(ReactJSParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(ReactJSParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(ReactJSParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoWhileStatement}
	 * labeled alternative in {@link ReactJSParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(ReactJSParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link ReactJSParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(ReactJSParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link ReactJSParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(ReactJSParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForInStatement}
	 * labeled alternative in {@link ReactJSParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInStatement(ReactJSParser.ForInStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForOfStatement}
	 * labeled alternative in {@link ReactJSParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForOfStatement(ReactJSParser.ForOfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#varModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarModifier(ReactJSParser.VarModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(ReactJSParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(ReactJSParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(ReactJSParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(ReactJSParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#caseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBlock(ReactJSParser.CaseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#caseClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseClauses(ReactJSParser.CaseClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#caseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseClause(ReactJSParser.CaseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#defaultClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultClause(ReactJSParser.DefaultClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(ReactJSParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(ReactJSParser.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#catchProduction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchProduction(ReactJSParser.CatchProductionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#finallyProduction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyProduction(ReactJSParser.FinallyProductionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(ReactJSParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(ReactJSParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#classTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassTail(ReactJSParser.ClassTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#classElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassElements(ReactJSParser.ClassElementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassMethodDefinition}
	 * labeled alternative in {@link ReactJSParser#classElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMethodDefinition(ReactJSParser.ClassMethodDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassFieldDefinition}
	 * labeled alternative in {@link ReactJSParser#classElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassFieldDefinition(ReactJSParser.ClassFieldDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassEmptyStatement}
	 * labeled alternative in {@link ReactJSParser#classElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassEmptyStatement(ReactJSParser.ClassEmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#methodDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDefinition(ReactJSParser.MethodDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#fieldDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDefinition(ReactJSParser.FieldDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(ReactJSParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#formalParameterArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterArg(ReactJSParser.FormalParameterArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#lastFormalParameterArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameterArg(ReactJSParser.LastFormalParameterArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(ReactJSParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(ReactJSParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#elementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementList(ReactJSParser.ElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#arrayElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElement(ReactJSParser.ArrayElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyExpressionAssignment}
	 * labeled alternative in {@link ReactJSParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyExpressionAssignment(ReactJSParser.PropertyExpressionAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComputedPropertyExpressionAssignment}
	 * labeled alternative in {@link ReactJSParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComputedPropertyExpressionAssignment(ReactJSParser.ComputedPropertyExpressionAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionProperty}
	 * labeled alternative in {@link ReactJSParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionProperty(ReactJSParser.FunctionPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyIdentifierShorthand}
	 * labeled alternative in {@link ReactJSParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyIdentifierShorthand(ReactJSParser.PropertyIdentifierShorthandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyShorthand}
	 * labeled alternative in {@link ReactJSParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyShorthand(ReactJSParser.PropertyShorthandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyByName}
	 * labeled alternative in {@link ReactJSParser#propertyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyByName(ReactJSParser.PropertyByNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyByString}
	 * labeled alternative in {@link ReactJSParser#propertyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyByString(ReactJSParser.PropertyByStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyByNumber}
	 * labeled alternative in {@link ReactJSParser#propertyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyByNumber(ReactJSParser.PropertyByNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyByExpression}
	 * labeled alternative in {@link ReactJSParser#propertyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyByExpression(ReactJSParser.PropertyByExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(ReactJSParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(ReactJSParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#expressionSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionSequence(ReactJSParser.ExpressionSequenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateStringExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateStringExpression(ReactJSParser.TemplateStringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpression(ReactJSParser.TernaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(ReactJSParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PowerExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerExpression(ReactJSParser.PowerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PreIncrementExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementExpression(ReactJSParser.PreIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JSXExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJSXExpression(ReactJSParser.JSXExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteralExpression(ReactJSParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(ReactJSParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OptionalChainExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalChainExpression(ReactJSParser.OptionalChainExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(ReactJSParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PreDecreaseExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecreaseExpression(ReactJSParser.PreDecreaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgumentsExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentsExpression(ReactJSParser.ArgumentsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpression(ReactJSParser.ThisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpression(ReactJSParser.FunctionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryMinusExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpression(ReactJSParser.UnaryMinusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(ReactJSParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostDecreaseExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecreaseExpression(ReactJSParser.PostDecreaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeofExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeofExpression(ReactJSParser.TypeofExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryPlusExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPlusExpression(ReactJSParser.UnaryPlusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeleteExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteExpression(ReactJSParser.DeleteExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(ReactJSParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SuperExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperExpression(ReactJSParser.SuperExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(ReactJSParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(ReactJSParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(ReactJSParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(ReactJSParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(ReactJSParser.PostIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpression(ReactJSParser.NewExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpression(ReactJSParser.LiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteralExpression(ReactJSParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDotExpression(ReactJSParser.MemberDotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassExpression(ReactJSParser.ClassExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberIndexExpression(ReactJSParser.MemberIndexExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(ReactJSParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentOperatorExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperatorExpression(ReactJSParser.AssignmentOperatorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CoalesceExpression}
	 * labeled alternative in {@link ReactJSParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoalesceExpression(ReactJSParser.CoalesceExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableByName}
	 * labeled alternative in {@link ReactJSParser#assignable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableByName(ReactJSParser.VariableByNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableByArray}
	 * labeled alternative in {@link ReactJSParser#assignable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableByArray(ReactJSParser.VariableByArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableByObject}
	 * labeled alternative in {@link ReactJSParser#assignable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableByObject(ReactJSParser.VariableByObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(ReactJSParser.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnonymousFunctionDecl}
	 * labeled alternative in {@link ReactJSParser#anonymousFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousFunctionDecl(ReactJSParser.AnonymousFunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrowFunction}
	 * labeled alternative in {@link ReactJSParser#anonymousFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunction(ReactJSParser.ArrowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#arrowFunctionParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunctionParameters(ReactJSParser.ArrowFunctionParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#arrowFunctionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunctionBody(ReactJSParser.ArrowFunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplyOperator}
	 * labeled alternative in {@link ReactJSParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyOperator(ReactJSParser.MultiplyOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivideOperator}
	 * labeled alternative in {@link ReactJSParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivideOperator(ReactJSParser.DivideOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModulusOperator}
	 * labeled alternative in {@link ReactJSParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulusOperator(ReactJSParser.ModulusOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlusOperator}
	 * labeled alternative in {@link ReactJSParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusOperator(ReactJSParser.PlusOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinusOperator}
	 * labeled alternative in {@link ReactJSParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusOperator(ReactJSParser.MinusOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PowerOperator}
	 * labeled alternative in {@link ReactJSParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerOperator(ReactJSParser.PowerOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NullishOperator}
	 * labeled alternative in {@link ReactJSParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullishOperator(ReactJSParser.NullishOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Null}
	 * labeled alternative in {@link ReactJSParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull(ReactJSParser.NullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link ReactJSParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(ReactJSParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link ReactJSParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(ReactJSParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateString}
	 * labeled alternative in {@link ReactJSParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateString(ReactJSParser.TemplateStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link ReactJSParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(ReactJSParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#templateStringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateStringLiteral(ReactJSParser.TemplateStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateStringCharacter}
	 * labeled alternative in {@link ReactJSParser#templateStringAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateStringCharacter(ReactJSParser.TemplateStringCharacterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateStringJSExpression}
	 * labeled alternative in {@link ReactJSParser#templateStringAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateStringJSExpression(ReactJSParser.TemplateStringJSExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#let_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet_(ReactJSParser.Let_Context ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEos(ReactJSParser.EosContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#htmlDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDocument(ReactJSParser.HtmlDocumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalElement}
	 * labeled alternative in {@link ReactJSParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalElement(ReactJSParser.NormalElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelfClosedElement}
	 * labeled alternative in {@link ReactJSParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosedElement(ReactJSParser.SelfClosedElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(ReactJSParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(ReactJSParser.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#htmlChardata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlChardata(ReactJSParser.HtmlChardataContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#mixedText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixedText(ReactJSParser.MixedTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#htmlMisc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlMisc(ReactJSParser.HtmlMiscContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactJSParser#htmlComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlComment(ReactJSParser.HtmlCommentContext ctx);
}