parser grammar JSParser;

options {
    tokenVocab=JSLexer;
}

program
    : statements? EOF
    ;

statement
    : block                     #BlockChunk
    | variableStatement         #VariableDeclerationChunk
    | importStatement           #ImportChunk
    | exportStatement           #ExportChunk
    | emptyStatement            #EmptyChunk
    | classDeclaration          #ClassDeclerationChunk
    | functionDeclaration       #FunctionDeclarationChunk
    | expressionStatement       #ExpressionChunk
    | ifStatement               #ConditionalChunk
    | iterationStatement        #LoopChunk
    | continueStatement         #ContinueChunk
    | breakStatement            #BreakChunk
    | returnStatement           #ReturnChunk
    | switchStatement           #SwitchChunk
    | throwStatement            #ThrowChunk
    | tryStatement              #TryChunk
    ;

block
    : OpenBrace statementList? CloseBrace
    ;

statementList
    : statement+
    ;

importStatement
    : Import importFromBlock
    ;

importFromBlock
    : importDefault? (importNamespace | importModuleItems) importFrom eos   #ObjectImportBlock
    | StringLiteral eos                                                     #FileImportBlock
    ;

importModuleItems
    : OpenBrace (importAliasName Comma)* (importAliasName Comma?)? CloseBrace
    ;

importAliasName
    : moduleExportName (As importedBinding)?
    ;

moduleExportName
    : identifierName
    | StringLiteral
    ;

importedBinding
    : Identifier
    ;

importDefault
    : aliasName Comma
    ;

importNamespace
    : (Multiply | identifierName) (As identifierName)?
    ;

importFrom
    : From StringLiteral
    ;

aliasName
    : identifierName (As identifierName)?
    ;

exportStatement
    : Export Default? (exportFromBlock | declaration) eos    # ExportDeclaration
    | Export Default singleExpression eos                    # ExportDefaultDeclaration
    ;

exportFromBlock
    : exportModuleItems importFrom? eos
    ;

exportModuleItems
    : OpenBrace (exportAliasName Comma)* (exportAliasName Comma?)? CloseBrace
    ;

exportAliasName
    : moduleExportName (As moduleExportName)?
    ;

declaration
    : variableStatement
    | classDeclaration
    | functionDeclaration
    ;

variableStatement
    : variableDeclarationList eos
    ;

variableDeclarationList
    : varModifier variableDeclaration (Comma variableDeclaration)*
    ;

variableDeclaration
    : assignable (Assign singleExpression)?
    ;

emptyStatement
    : SemiColon
    ;

expressionStatement
    : expressionSequence eos
    ;

ifStatement
    : If OpenParen expressionSequence CloseParen statement (Else statement)?
    ;


iterationStatement
    : Do statement While OpenParen expressionSequence CloseParen eos                                                                                    # DoWhileStatement
    | While OpenParen expressionSequence CloseParen statement                                                                                           # WhileStatement
    | For OpenParen (expressionSequence | variableDeclarationList)? SemiColon expressionSequence? SemiColon expressionSequence? CloseParen statement    # ForStatement
    | For OpenParen (singleExpression | variableDeclarationList) In expressionSequence CloseParen statement                                             # ForInStatement
    | For OpenParen (singleExpression | variableDeclarationList) Of expressionSequence CloseParen statement                                             # ForOfStatement
    ;

varModifier
    : Var
    | Let
    | Const
    ;

continueStatement
    : Continue eos
    ;

breakStatement
    : Break eos
    ;

returnStatement
    : Return expressionSequence? eos
    ;

switchStatement
    : Switch OpenParen expressionSequence CloseParen caseBlock
    ;

caseBlock
    : OpenBrace caseClauses? (defaultClause caseClauses?)? CloseBrace
    ;

caseClauses
    : caseClause+
    ;

caseClause
    : Case expressionSequence Colon statementList?
    ;

defaultClause
    : Default Colon statementList?
    ;

throwStatement
    : Throw expressionSequence eos
    ;

tryStatement
    : Try block (catchProduction finallyProduction? | finallyProduction)
    ;

catchProduction
    : Catch (OpenParen assignable? CloseParen)? block
    ;

finallyProduction
    : Finally block
    ;

functionDeclaration
    : Function identifier OpenParen formalParameterList? CloseParen functionBody
    ;

classDeclaration
    : Class identifier classTail
    ;

classTail
    : (Extends singleExpression)? OpenBrace classElement* CloseBrace
    ;

classElement
    : (Static | identifier)? methodDefinition
    | (Static | identifier)? fieldDefinition
    | (Static | identifier) block
    | emptyStatement
    ;

methodDefinition
    : classElementName OpenParen formalParameterList? CloseParen functionBody
    ;

fieldDefinition
    : classElementName initializer?
    ;

classElementName
    : propertyName
    ;


formalParameterList
    : formalParameterArg (Comma formalParameterArg)* (Comma lastFormalParameterArg)?
    | lastFormalParameterArg
    ;

formalParameterArg
    : assignable (Assign singleExpression)?
    ;

lastFormalParameterArg
    : Ellipsis singleExpression
    ;

functionBody
    : OpenBrace statements? CloseBrace
    ;

statements
    : statement+
    ;

arrayLiteral
    : (OpenBracket elementList CloseBracket)
    ;

elementList
    : Comma* arrayElement? (Comma+ arrayElement)* Comma*
    ;

arrayElement
    : Ellipsis? singleExpression
    ;

propertyAssignment
    : propertyName Colon singleExpression                                       # PropertyExpressionAssignment
    | OpenBracket singleExpression CloseBracket Colon singleExpression          # ComputedPropertyExpressionAssignment
    | propertyName OpenParen formalParameterList?  CloseParen  functionBody     # FunctionProperty
    | Ellipsis? singleExpression                                                # PropertyShorthand
    ;

propertyName
    : identifierName
    | StringLiteral
    | numericLiteral
    | OpenBracket singleExpression CloseBracket
    ;

arguments
    : OpenParen(argument (Comma argument)* Comma?)?CloseParen
    ;

argument
    : Ellipsis? (singleExpression | identifier)
    ;

expressionSequence
    : singleExpression (Comma singleExpression)*
    ;

singleExpression
    : anonymousFunction                                                                                 # FunctionExpression
    | Class identifier? classTail                                                                       # ClassExpression
    | singleExpression QuestionMarkDot singleExpression                                                 # OptionalChainExpression
    | singleExpression QuestionMarkDot? OpenBracket expressionSequence CloseBracket                     # MemberIndexExpression
    | singleExpression QuestionMark? Dot identifierName                                                 # MemberDotExpression
    | New identifier arguments                                                                          # NewExpression
    | New singleExpression arguments                                                                    # NewExpression
    | New singleExpression                                                                              # NewExpression
    | singleExpression arguments                                                                        # ArgumentsExpression
    | New Dot identifier                                                                                # MetaExpression // new.target
    | singleExpression PlusPlus                                                                         # PostIncrementExpression
    | singleExpression MinusMinus                                                                       # PostDecreaseExpression
    | Delete singleExpression                                                                           # DeleteExpression
    | Typeof singleExpression                                                                           # TypeofExpression
    | PlusPlus singleExpression                                                                         # PreIncrementExpression
    | MinusMinus singleExpression                                                                       # PreDecreaseExpression
    | Plus singleExpression                                                                             # UnaryPlusExpression
    | Minus singleExpression                                                                            # UnaryMinusExpression
    | Not singleExpression                                                                              # NotExpression
    | <assoc=right> singleExpression Power singleExpression                                             # PowerExpression
    | singleExpression (Multiply | Divide | Modulus) singleExpression                                   # MultiplicativeExpression
    | singleExpression (Plus | Minus) singleExpression                                                  # AdditiveExpression
    | singleExpression NullCoalesce singleExpression                                                    # CoalesceExpression
    | singleExpression (LessThan | MoreThan | LessThanEquals | GreaterThanEquals) singleExpression      # RelationalExpression
    | singleExpression In singleExpression                                                              # InExpression
    | singleExpression (Equals | NotEquals | IdentityEquals | IdentityNotEquals) singleExpression       # EqualityExpression
    | singleExpression And singleExpression                                                             # LogicalAndExpression
    | singleExpression Or singleExpression                                                              # LogicalOrExpression
    | singleExpression QuestionMark singleExpression Colon singleExpression                             # TernaryExpression
    | <assoc=right> singleExpression Assign singleExpression                                            # AssignmentExpression
    | <assoc=right> singleExpression assignmentOperator singleExpression                                # AssignmentOperatorExpression
    | Import OpenParen singleExpression CloseParen                                                      # ImportExpression
    | singleExpression templateStringLiteral                                                            # TemplateStringExpression
    | This                                                                                              # ThisExpression
    | identifier                                                                                        # IdentifierExpression
    | Super                                                                                             # SuperExpression
    | literal                                                                                           # LiteralExpression
    | arrayLiteral                                                                                      # ArrayLiteralExpression
    | objectLiteral                                                                                     # ObjectLiteralExpression
    | OpenParen expressionSequence CloseParen                                                           # ParenthesizedExpression
    ;

initializer
    : Assign singleExpression
    ;

assignable
    : identifier
    | arrayLiteral
    | objectLiteral
    ;

objectLiteral
    : OpenBrace (propertyAssignment (Comma propertyAssignment)* Comma?)? CloseBrace
    ;

anonymousFunction
    : Function OpenParen formalParameterList? CloseParen functionBody       # AnonymousFunctionDecl
    | arrowFunctionParameters ARROW arrowFunctionBody                       # ArrowFunction
    ;

arrowFunctionParameters
    : identifier
    | OpenParen formalParameterList? CloseParen
    ;

arrowFunctionBody
    : singleExpression
    | functionBody
    ;

assignmentOperator
    : MultiplyAssign
    | DivideAssign
    | ModulusAssign
    | PlusAssign
    | MinusAssign
    | PowerAssign
    | NullishCoalescingAssign
    ;

literal
    : NullLiteral
    | BooleanLiteral
    | StringLiteral
    | templateStringLiteral
    | numericLiteral
    ;

templateStringLiteral
    : BackTick templateStringAtom* BackTick
    ;

templateStringAtom
    : TemplateStringAtom
    | TemplateStringStartExpression singleExpression CloseBrace
    ;

numericLiteral
    : DecimalLiteral
    ;

identifierName
    : identifier
    | reservedWord
    ;

identifier
    : Identifier
    | As
    | From
    | Of
    ;

reservedWord
    : keyword
    | NullLiteral
    | BooleanLiteral
    ;

keyword
    : Break
    | Do
    | Typeof
    | Case
    | Else
    | New
    | Var
    | Catch
    | Finally
    | Return
    | Continue
    | For
    | Switch
    | While
    | Function
    | This
    | Default
    | If
    | Throw
    | Delete
    | In
    | Try
    | Class
    | Extends
    | Super
    | Const
    | Export
    | Import
    | Let
    | Static
    | From
    | As
    | Of
    ;

eos
    : SemiColon
    | EOF
    | {this.lineTerminatorAhead()}?
    | {this.closeBrace()}?
    ;
