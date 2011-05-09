tree grammar BlangEvaluatorWalker;

options {
  language = Java;
  tokenVocab = Blang;
  ASTLabelType = CommonTree;
}

@header {
  package info.blazey.wmp.mrjp.blang;
  import java.util.Map;
  import java.util.HashMap;
}

@members {
  private Map<String, Integer> variables = new HashMap<String, Integer>();
}

evaluator returns [int result]
  : assignmentStatement* e=expression EOF { result = e; }
  ;
  
assignmentStatement
  : ^(':=' IDENT e=expression)  { variables.put($IDENT.text, e); }
  ;

expression returns [int result]
  : ^('+' op1=expression op2=expression) { result = op1 + op2; }
  | ^('-' op1=expression op2=expression) { result = op1 - op2; }
  | ^('*' op1=expression op2=expression) { result = op1 * op2; }
  | ^('/' eop1=expression op2=expression) { result = op1 / op2; }
  | ^('mod' op1=expression op2=expression) { result = op1 \% op2; }
  | ^(NEGATION e=expression) { result = -e; }
  | IDENT { result = variables.get($IDENT.text); }
  | INTEGER { result = Integer.parseInt($INTEGER.text); }
  ;
