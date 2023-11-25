grammar ReactJSParser;

import ReactJSLexer;

/*
<div>
</div>

<img/>
*/
prog: element EOF;

body: element           #BodyElement
    | TEXT              #Text
    ;

element: OPEN_BRACKET ELEMENT_NAME listOfAttributes CLOSE_BRACKET body OPEN_SLASH_BRACKET ELEMENT_NAME CLOSE_BRACKET    #NormalElement
        | OPEN_BRACKET ELEMENT_NAME attribute* CLOSE_SLASH_BRACKET                                                #SelfElement
        ;

listOfAttributes:
                attribute*  #Attributes
                ;

attribute: ATTRIBUTE_NAME '=' TEXT
        | ATTRIBUTE_NAME '=' '\'' TEXT '\''
        | ATTRIBUTE_NAME '=' '"' TEXT '"'
        | attributeWithoutEqual
        ;

attributeWithoutEqual: ATTRIBUTE_NAME;