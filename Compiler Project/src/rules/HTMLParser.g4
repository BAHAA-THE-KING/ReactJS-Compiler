parser grammar HTMLParser;

options { tokenVocab=HTMLLexer; }

htmlDocument
    : htmlElements*
    ;

//htmlElements
//    : htmlMisc* htmlElement htmlMisc*
//    ;

htmlElement
    : TAG_OPEN TAG_NAME htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE #NormalElement
    | TAG_OPEN TAG_NAME htmlAttribute* TAG_SLASH_CLOSE                                             #SelfClosedElement
    ;

htmlContent
    : htmlChardata? ((htmlElement | htmlComment) htmlChardata?)*
    ;

htmlAttribute
    : TAG_NAME (TAG_EQUALS ATTVALUE_VALUE)?
    ;

htmlChardata
    : HTML_TEXT
    | SEA_WS
    ;

htmlMisc
    : htmlComment
    | SEA_WS
    ;

htmlComment
    : HTML_COMMENT
    ;