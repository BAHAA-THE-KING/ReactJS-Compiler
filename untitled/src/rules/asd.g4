grammar asd;

html: '<'HtmlTagName ' '* attrib* ' '*'>'.*?'</'HtmlTagName'>';
attrib: AttributeName'="'.*?'"';

HtmlTagName: HtmlTagNameFirstChar HtmlTagNameRest* HtmlTagNameNumber?;
AttributeName: AttributeNameFirstChar AttributeNameRest*;

fragment HtmlTagNameFirstChar: [a-z];
fragment HtmlTagNameRest: HtmlTagNameFirstChar;
fragment HtmlTagNameNumber: [1-6];

fragment AttributeNameFirstChar: [a-zA-Z];
fragment AttributeNameRest: AttributeNameFirstChar | [0-9] | '_' |'-';