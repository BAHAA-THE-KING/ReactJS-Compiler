grammar asd;

html: '<'HtmlTagName attrib*'>'.*?'</'HtmlTagName'>';
attrib: AttributeName'="'.*?'"';

HtmlTagName: HtmlTagNameFirstChar+ HtmlTagNameNumber?;
AttributeName: AttributeNameFirstChar AttributeNameRest*;

HtmlTagNameFirstChar: [a-z];
HtmlTagNameNumber: [1-6];

AttributeNameFirstChar: [a-zA-Z];
AttributeNameRest: AttributeNameFirstChar | [0-9] | '_' | '-';