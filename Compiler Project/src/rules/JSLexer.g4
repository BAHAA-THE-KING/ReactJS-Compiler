lexer grammar JSLexer;

channels {
    ERROR
}

options {
    superClass = JavaScriptLexerBase;
}

MultiLineComment: '/*' .*? '*/'             -> channel(HIDDEN);
SingleLineComment: '//' ~[\r\n]* -> channel(HIDDEN);

BackTick: '`';
DollarSign: '$';
OpenBracket: '[';
CloseBracket: ']';
OpenParen: '(';
CloseParen: ')';
OpenBrace: '{' {this.ProcessOpenBrace();};
CloseBrace: '}' {this.ProcessCloseBrace();};
SemiColon: ';';
Comma: ',';
Assign: '=';
QuestionMark: '?';
QuestionMarkDot: '?.';
Colon: ':';
Ellipsis: '...';
Dot: '.';
PlusPlus: '++';
MinusMinus: '--';
Plus: '+';
Minus: '-';
Not: '!';
Multiply: '*';
Divide: '/';
Modulus: '%';
Power: '**';
NullCoalesce: '??';
LessThan: '<';
MoreThan: '>';
LessThanEquals: '<=';
GreaterThanEquals: '>=';
Equals_: '==';
NotEquals: '!=';
IdentityEquals: '===';
IdentityNotEquals: '!==';
And: '&&';
Or: '||';
MultiplyAssign: '*=';
DivideAssign: '/=';
ModulusAssign: '%=';
PlusAssign: '+=';
MinusAssign: '-=';
PowerAssign: '**=';
NullishCoalescingAssign: '??=';
ARROW: '=>';

/// Null Literals

NullLiteral: 'null';

/// Undefined Literals

UndefinedLiteral: 'undefined';

/// Boolean Literals

BooleanLiteral: 'true'
              | 'false';

/// Numeric Literals

DecimalLiteral: DecimalIntegerLiteral '.' [0-9] [0-9_]* ExponentPart?
              | '.' [0-9] [0-9_]* ExponentPart?
              | DecimalIntegerLiteral ExponentPart?
              ;

/// Keywords

Break: 'break';
Do: 'do';
Typeof: 'typeof';
Case: 'case';
Else: 'else';
New: 'new';
Var: 'var';
Catch: 'catch';
Finally: 'finally';
Return: 'return';
Continue: 'continue';
For: 'for';
Switch: 'switch';
While: 'while';
Function_: 'function';
This: 'this';
Default: 'default';
If: 'if';
Throw: 'throw';
Delete: 'delete';
In: 'in';
Of: 'of';
Try: 'try';
As: 'as';
From: 'from';

/// Future Reserved Words

Class: 'class';
Extends: 'extends';
Super: 'super';
Const: 'const';
Export: 'export';
Import: 'import';

/// The following tokens are also considered to be FutureReservedWords
/// when parsing strict mode

StrictLet: 'let' {this.IsStrictMode()}?;
NonStrictLet: 'let' {!this.IsStrictMode()}?;
Static: 'static' {this.IsStrictMode()}?;

///ReactJS Custom Functions Names

UseState: 'useState';
UseEffect: 'useEffect';
UseRef: 'useRef';

/// Identifier Names and Identifiers

Identifier: IdentifierStart IdentifierPart*;

/// String Literals
StringLiteral:
    ('"' DoubleStringCharacter* '"' | '\'' SingleStringCharacter* '\'') {this.ProcessStringLiteral();}
;

WhiteSpaces: [\t]+   -> channel(HIDDEN);

LineTerminator: [\r\n]  -> channel(HIDDEN);

/// Comments

UnexpectedCharacter: .       -> channel(ERROR);

// Fragment rules

fragment DoubleStringCharacter: ~["\\\r\n] | '\\' EscapeSequence | LineContinuation;

fragment SingleStringCharacter: ~['\\\r\n] | '\\' EscapeSequence | LineContinuation;

fragment EscapeSequence
    : CharacterEscapeSequence
    | '0'
    ;

fragment CharacterEscapeSequence: SingleEscapeCharacter | NonEscapeCharacter;

fragment SingleEscapeCharacter: ['"\\bfnrtv];

fragment NonEscapeCharacter: ~['"\\bfnrtv0-9xu\r\n];

fragment EscapeCharacter: SingleEscapeCharacter | [0-9] | [xu];

fragment LineContinuation: '\\' [\r\n]+;

fragment DecimalIntegerLiteral: '0' | [1-9] [0-9_]*;

fragment ExponentPart: [eE] [+-]? [0-9_]+;

fragment IdentifierPart: IdentifierStart | [\p{Mn}] | [\p{Nd}] | [\p{Pc}];

fragment IdentifierStart: [\p{L}] | [$_];