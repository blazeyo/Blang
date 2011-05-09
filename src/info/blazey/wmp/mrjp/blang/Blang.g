grammar Blang;

options {
  language = Java;
  output = AST;
  ASTLabelType = CommonTree;
}

tokens {
  NEGATION;
}

@header {
  package info.blazey.wmp.mrjp.blang;
}

@lexer::header {
  package info.blazey.wmp.mrjp.blang;
}

program
  : 'program'!
      statement*
      'return'! expression ';'!
    'endprogram'!
  ;
  
statement
  : assignStatement
  | ifStatement
  | whileStatement
  ;
  
assignStatement
  : IDENT ':='^ expression ';'!
  ;
  
ifStatement
  : 'if' expression 'then'
      statement*
    ('else'
      statement*)?
    'end' 'if'
  ;
    
whileStatement
  : 'while' expression 'do'
      statement*
    'endwhile'
  ;
  
// expressions
  
term
  : IDENT
  | '(' expression ')'
  | INTEGER
  ;
  
unary
  : ('+'! | negation^)* term
  ;

mult
  : unary (('*'^ | '/'^ | 'mod'^) unary)*
  ;
  
expression
  : mult (('+'^ | '-'^) mult)*
  ;
  
negation
  : '-' -> NEGATION
  ;

fragment DIGIT  : ('0'..'9');
fragment LETTER : ('a'..'z' | 'A'..'Z');

INTEGER : DIGIT+;
IDENT :  LETTER (LETTER | DIGIT)*;

WHITESPACE  : (' ' | '\t' | '\r' | '\n' | '\f')* { $channel = HIDDEN; };