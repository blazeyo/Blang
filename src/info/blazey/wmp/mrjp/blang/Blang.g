grammar Blang;

options {
  language = Java;
  output = AST;
  ASTLabelType = CommonTree;
  backtrack = true;
}

tokens {
  NEGATION;
  BLOCK;
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
      returnStatement
    'endprogram'!
  ;
  
returnStatement
  : 'return'^ expression ';'!
  ;
  
statement
  : assignStatement
  | ifStatement
  | whileStatement
  ;
  
assignStatement
  : IDENT ASSIGN^ expression ';'!
  ;
  
ifStatement
  : IF^ expression 'then'!
      block
    ('else'!
      block)?
    'end'! 'if'! ';'!
  ;
  
whileStatement
  : WHILE^ expression 'do'!
      block
    'end'! 'while'! ';'!
  ;
  
block
  : statement* -> ^(BLOCK statement*)
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
  : unary ((MULT^ | DIV^ | MOD^) unary)*
  ;
  
expression
  : mult ((PLUS^ | MINUS^) mult)*
  ;
  
negation
  : '-' -> NEGATION
  ;

fragment DIGIT  : ('0'..'9');
fragment LETTER : ('a'..'z' | 'A'..'Z');

PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '\\';
MOD : 'mod';

ASSIGN : ':=';
IF : 'if';
WHILE : 'while';

INTEGER : DIGIT+;
IDENT :  LETTER (LETTER | DIGIT)*;

WHITESPACE  : (' ' | '\t' | '\r' | '\n' | '\f')* { $channel = HIDDEN; };