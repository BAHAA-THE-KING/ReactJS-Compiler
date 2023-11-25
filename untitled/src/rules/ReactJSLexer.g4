lexer grammar ReactJSLexer;

/* HTML TOKENS */
OPEN_BRACKET: '<';
OPEN_SLASH_BRACKET: '</';
CLOSE_BRACKET: '>';
CLOSE_SLASH_BRACKET:'/>';

ELEMENT_NAME: [a-z]+ [1-6]?;
TEXT: [a-zA-Z0-9_-]*;

ATTRIBUTE_NAME: [a-zA-Z_-] [a-zA-Z0-9_-]*;

ID:[a-zA-Z_] [a-zA-Z0-9]*;
