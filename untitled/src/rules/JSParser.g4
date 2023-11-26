parser grammar JSParser;

// Insert here @header for C++ parser.

options {
    tokenVocab=JSLexer;
}

program
    : statements? EOF
    ;

statement
    : block
    | variableStatement
    | importStatement
    | exportStatement
    | emptyStatement_
    | classDeclaration
    | functionDeclaration
    | expressionStatement
    | ifStatement
    | iterationStatement
    | continueStatement
    | breakStatement
    | returnStatement
    | switchStatement
    | throwStatement
    | tryStatement
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
    : importDefault? (importNamespace | importModuleItems) importFrom eos
    | StringLiteral eos
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

// yield and await are permitted as BindingIdentifier in the grammar
importedBinding
    : Identifier
    ;

importDefault
    : aliasName Comma
    ;

importNamespace
    : ('*' | identifierName) (As identifierName)?
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
    : importNamespace importFrom eos
    | exportModuleItems importFrom? eos
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
    : assignable ('=' singleExpression)? // ECMAScript 6: Array & Object Matching
    ;

emptyStatement_
    : SemiColon
    ;

expressionStatement
    : {this.notOpenBraceAndNotFunction()}? expressionSequence eos
    ;

ifStatement
    : If '(' expressionSequence ')' statement (Else statement)?
    ;


iterationStatement
    : Do statement While '(' expressionSequence ')' eos                                                                       # DoStatement
    | While '(' expressionSequence ')' statement                                                                              # WhileStatement
    | For '(' (expressionSequence | variableDeclarationList)? ';' expressionSequence? ';' expressionSequence? ')' statement   # ForStatement
    | For '(' (singleExpression | variableDeclarationList) In expressionSequence ')' statement                                # ForInStatement
    | For '(' (singleExpression | variableDeclarationList) Of expressionSequence ')' statement                         # ForOfStatement
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
    : Switch '(' expressionSequence ')' caseBlock
    ;

caseBlock
    : OpenBrace caseClauses? (defaultClause caseClauses?)? CloseBrace
    ;

caseClauses
    : caseClause+
    ;

caseClause
    : Case expressionSequence ':' statementList?
    ;

defaultClause
    : Default ':' statementList?
    ;

throwStatement
    : Throw {this.notLineTerminator()}? expressionSequence eos
    ;

tryStatement
    : Try block (catchProduction finallyProduction? | finallyProduction)
    ;

catchProduction
    : Catch ('(' assignable? ')')? block
    ;

finallyProduction
    : Finally block
    ;

functionDeclaration
    : Function identifier '(' formalParameterList? ')' functionBody
    ;

classDeclaration
    : Class identifier classTail
    ;

classTail
    : (Extends singleExpression)? OpenBrace classElement* CloseBrace
    ;

classElement
    : (Static | {this.n("static")}? identifier)? methodDefinition
    | (Static | {this.n("static")}? identifier)? fieldDefinition
    | (Static | {this.n("static")}? identifier) block
    | emptyStatement_
    ;

methodDefinition
    : classElementName '(' formalParameterList? ')' functionBody
    | getter '(' ')' functionBody
    | setter '(' formalParameterList? ')' functionBody
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
    : assignable ('=' singleExpression)?      // ECMAScript 6: Initialization
    ;

lastFormalParameterArg                        // ECMAScript 6: Rest Parameter
    : Ellipsis singleExpression
    ;

functionBody
    : OpenBrace statements? CloseBrace
    ;

statements
    : statement+
    ;

arrayLiteral
    : ('[' elementList ']')
    ;

elementList
    : Comma* arrayElement? (Comma+ arrayElement)* Comma* // Yes, everything is optional
    ;

arrayElement
    : Ellipsis? singleExpression
    ;

propertyAssignment
    : propertyName ':' singleExpression                                             # PropertyExpressionAssignment
    | '[' singleExpression ']' ':' singleExpression                                 # ComputedPropertyExpressionAssignment
    | propertyName '(' formalParameterList?  ')'  functionBody  # FunctionProperty
    | getter '(' ')' functionBody                                           # PropertyGetter
    | setter '(' formalParameterArg ')' functionBody                        # PropertySetter
    | Ellipsis? singleExpression                                                    # PropertyShorthand
    ;

propertyName
    : identifierName
    | StringLiteral
    | numericLiteral
    | '[' singleExpression ']'
    ;

arguments
    : '('(argument (Comma argument)* Comma?)?')'
    ;

argument
    : Ellipsis? (singleExpression | identifier)
    ;

expressionSequence
    : singleExpression (Comma singleExpression)*
    ;

singleExpression
    : anonymousFunction                                                     # FunctionExpression
    | Class identifier? classTail                                           # ClassExpression
    | singleExpression '?.' singleExpression                                # OptionalChainExpression
    | singleExpression '?.'? '[' expressionSequence ']'                     # MemberIndexExpression
    | singleExpression '?'? '.' identifierName                         # MemberDotExpression
    | New identifier arguments                                              # NewExpression
    | New singleExpression arguments                                        # NewExpression
    | New singleExpression                                                  # NewExpression
    | singleExpression arguments                                            # ArgumentsExpression
    | New '.' identifier                                                    # MetaExpression // new.target
    | singleExpression '++'                     # PostIncrementExpression
    | singleExpression '--'                     # PostDecreaseExpression
    | Delete singleExpression                                               # DeleteExpression
    | Typeof singleExpression                                               # TypeofExpression
    | '++' singleExpression                                                 # PreIncrementExpression
    | '--' singleExpression                                                 # PreDecreaseExpression
    | '+' singleExpression                                                  # UnaryPlusExpression
    | '-' singleExpression                                                  # UnaryMinusExpression
    | '!' singleExpression                                                  # NotExpression
    | <assoc=right> singleExpression '**' singleExpression                  # PowerExpression
    | singleExpression ('*' | '/' | '%') singleExpression                   # MultiplicativeExpression
    | singleExpression ('+' | '-') singleExpression                         # AdditiveExpression
    | singleExpression '??' singleExpression                                # CoalesceExpression
    | singleExpression ('<' | '>' | '<=' | '>=') singleExpression           # RelationalExpression
    | singleExpression In singleExpression                                  # InExpression
    | singleExpression ('==' | '!=' | '===' | '!==') singleExpression       # EqualityExpression
    | singleExpression '&&' singleExpression                                # LogicalAndExpression
    | singleExpression '||' singleExpression                                # LogicalOrExpression
    | singleExpression '?' singleExpression ':' singleExpression            # TernaryExpression
    | <assoc=right> singleExpression '=' singleExpression                   # AssignmentExpression
    | <assoc=right> singleExpression assignmentOperator singleExpression    # AssignmentOperatorExpression
    | Import '(' singleExpression ')'                                       # ImportExpression
    | singleExpression templateStringLiteral                                # TemplateStringExpression  // ECMAScript 6
    | This                                                                  # ThisExpression
    | identifier                                                            # IdentifierExpression
    | Super                                                                 # SuperExpression
    | literal                                                               # LiteralExpression
    | arrayLiteral                                                          # ArrayLiteralExpression
    | objectLiteral                                                         # ObjectLiteralExpression
    | '(' expressionSequence ')'                                            # ParenthesizedExpression
    ;

initializer
    : '=' singleExpression
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
    : Function '(' formalParameterList? ')' functionBody    # AnonymousFunctionDecl
    | arrowFunctionParameters '=>' arrowFunctionBody                     # ArrowFunction
    ;

arrowFunctionParameters
    : identifier
    | '(' formalParameterList? ')'
    ;

arrowFunctionBody
    : singleExpression
    | functionBody
    ;

assignmentOperator
    : '*='
    | '/='
    | '%='
    | '+='
    | '-='
    | '**='
    | '??='
    ;

literal
    : NullLiteral
    | BooleanLiteral
    | StringLiteral
    | templateStringLiteral
    | numericLiteral
    | bigintLiteral
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

bigintLiteral
    : BigDecimalIntegerLiteral
    ;

getter
    : identifier classElementName
    ;

setter
    : identifier classElementName
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
