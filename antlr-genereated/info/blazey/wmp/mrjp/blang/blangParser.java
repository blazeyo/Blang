// $ANTLR 3.3 Nov 30, 2010 12:50:56 /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g 2011-05-06 15:45:07

  package info.blazey.wmp.mrjp.blang;
  import info.blazey.wmp.mrjp.blang.evaluators.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class blangParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENT", "INTEGER", "DIGIT", "LETTER", "WHITESPACE", "'program'", "'body'", "'return'", "';'", "'endbody'", "'endprogram'", "'var'", "':='", "'if'", "'then'", "'else'", "'end'", "'while'", "'do'", "'endwhile'", "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'mod'"
    };
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int IDENT=4;
    public static final int INTEGER=5;
    public static final int DIGIT=6;
    public static final int LETTER=7;
    public static final int WHITESPACE=8;

    // delegates
    // delegators


        public blangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public blangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return blangParser.tokenNames; }
    public String getGrammarFileName() { return "/home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g"; }



    // $ANTLR start "program"
    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:16:1: program returns [Evaluator e] : 'program' ( variable )* 'body' ( statement )* 'return' expression ';' 'endbody' 'endprogram' ;
    public final Evaluator program() throws RecognitionException {
        Evaluator e = null;

        Evaluator expression1 = null;


        try {
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:17:3: ( 'program' ( variable )* 'body' ( statement )* 'return' expression ';' 'endbody' 'endprogram' )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:17:5: 'program' ( variable )* 'body' ( statement )* 'return' expression ';' 'endbody' 'endprogram'
            {
            match(input,9,FOLLOW_9_in_program45); 
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:18:7: ( variable )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:18:7: variable
            	    {
            	    pushFollow(FOLLOW_variable_in_program53);
            	    variable();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(input,10,FOLLOW_10_in_program62); 
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:20:9: ( statement )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IDENT||LA2_0==17||LA2_0==21) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:20:9: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_program72);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match(input,11,FOLLOW_11_in_program83); 
            pushFollow(FOLLOW_expression_in_program85);
            expression1=expression();

            state._fsp--;

            match(input,12,FOLLOW_12_in_program87); 
             e = expression1; 
            match(input,13,FOLLOW_13_in_program97); 
            match(input,14,FOLLOW_14_in_program103); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "program"


    // $ANTLR start "variable"
    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:26:1: variable : 'var' IDENT ( ':=' expression )? ';' ;
    public final void variable() throws RecognitionException {
        try {
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:27:3: ( 'var' IDENT ( ':=' expression )? ';' )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:27:5: 'var' IDENT ( ':=' expression )? ';'
            {
            match(input,15,FOLLOW_15_in_variable119); 
            match(input,IDENT,FOLLOW_IDENT_in_variable121); 
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:27:17: ( ':=' expression )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:27:18: ':=' expression
                    {
                    match(input,16,FOLLOW_16_in_variable124); 
                    pushFollow(FOLLOW_expression_in_variable126);
                    expression();

                    state._fsp--;


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_variable130); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "variable"


    // $ANTLR start "statement"
    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:30:1: statement : ( assignStatement | ifStatement | whileStatement );
    public final void statement() throws RecognitionException {
        try {
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:31:3: ( assignStatement | ifStatement | whileStatement )
            int alt4=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 21:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:31:5: assignStatement
                    {
                    pushFollow(FOLLOW_assignStatement_in_statement145);
                    assignStatement();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:32:5: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement151);
                    ifStatement();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:33:5: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement157);
                    whileStatement();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "statement"


    // $ANTLR start "assignStatement"
    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:36:1: assignStatement : IDENT ':=' expression ';' ;
    public final void assignStatement() throws RecognitionException {
        try {
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:37:3: ( IDENT ':=' expression ';' )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:37:5: IDENT ':=' expression ';'
            {
            match(input,IDENT,FOLLOW_IDENT_in_assignStatement172); 
            match(input,16,FOLLOW_16_in_assignStatement174); 
            pushFollow(FOLLOW_expression_in_assignStatement176);
            expression();

            state._fsp--;

            match(input,12,FOLLOW_12_in_assignStatement178); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "assignStatement"


    // $ANTLR start "ifStatement"
    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:40:1: ifStatement : 'if' expression 'then' ( statement )* ( 'else' ( statement )* )? 'end' 'if' ;
    public final void ifStatement() throws RecognitionException {
        try {
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:41:3: ( 'if' expression 'then' ( statement )* ( 'else' ( statement )* )? 'end' 'if' )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:41:5: 'if' expression 'then' ( statement )* ( 'else' ( statement )* )? 'end' 'if'
            {
            match(input,17,FOLLOW_17_in_ifStatement193); 
            pushFollow(FOLLOW_expression_in_ifStatement195);
            expression();

            state._fsp--;

            match(input,18,FOLLOW_18_in_ifStatement197); 
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:42:7: ( statement )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==IDENT||LA5_0==17||LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:42:7: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_ifStatement205);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:43:5: ( 'else' ( statement )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:43:6: 'else' ( statement )*
                    {
                    match(input,19,FOLLOW_19_in_ifStatement213); 
                    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:44:7: ( statement )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==IDENT||LA6_0==17||LA6_0==21) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:44:7: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_ifStatement221);
                    	    statement();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,20,FOLLOW_20_in_ifStatement230); 
            match(input,17,FOLLOW_17_in_ifStatement232); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ifStatement"


    // $ANTLR start "whileStatement"
    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:48:1: whileStatement : 'while' expression 'do' ( statement )* 'endwhile' ;
    public final void whileStatement() throws RecognitionException {
        try {
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:49:3: ( 'while' expression 'do' ( statement )* 'endwhile' )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:49:5: 'while' expression 'do' ( statement )* 'endwhile'
            {
            match(input,21,FOLLOW_21_in_whileStatement249); 
            pushFollow(FOLLOW_expression_in_whileStatement251);
            expression();

            state._fsp--;

            match(input,22,FOLLOW_22_in_whileStatement253); 
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:50:7: ( statement )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==IDENT||LA8_0==17||LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:50:7: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_whileStatement261);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match(input,23,FOLLOW_23_in_whileStatement268); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "whileStatement"


    // $ANTLR start "term"
    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:56:1: term returns [Evaluator e] : ( IDENT | '(' expression ')' | INTEGER );
    public final Evaluator term() throws RecognitionException {
        Evaluator e = null;

        Token INTEGER3=null;
        Evaluator expression2 = null;


        try {
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:57:3: ( IDENT | '(' expression ')' | INTEGER )
            int alt9=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt9=1;
                }
                break;
            case 24:
                {
                alt9=2;
                }
                break;
            case INTEGER:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:57:5: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_term291); 
                     e = new IntEvaluator(0); 

                    }
                    break;
                case 2 :
                    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:58:5: '(' expression ')'
                    {
                    match(input,24,FOLLOW_24_in_term299); 
                    pushFollow(FOLLOW_expression_in_term301);
                    expression2=expression();

                    state._fsp--;

                    match(input,25,FOLLOW_25_in_term303); 
                     e = expression2; 

                    }
                    break;
                case 3 :
                    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:59:5: INTEGER
                    {
                    INTEGER3=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_term312); 
                     e = new IntEvaluator(Integer.parseInt((INTEGER3!=null?INTEGER3.getText():null))); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "term"


    // $ANTLR start "unary"
    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:62:1: unary returns [Evaluator e] : ( '+' | '-' )* term ;
    public final Evaluator unary() throws RecognitionException {
        Evaluator e = null;

        Evaluator term4 = null;


        try {
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:63:3: ( ( '+' | '-' )* term )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:63:5: ( '+' | '-' )* term
            {
             boolean positive = true; 
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:64:5: ( '+' | '-' )*
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }
                else if ( (LA10_0==27) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:64:6: '+'
            	    {
            	    match(input,26,FOLLOW_26_in_unary340); 

            	    }
            	    break;
            	case 2 :
            	    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:64:12: '-'
            	    {
            	    match(input,27,FOLLOW_27_in_unary344); 
            	     positive = !positive; 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            pushFollow(FOLLOW_term_in_unary350);
            term4=term();

            state._fsp--;


                  e = term4;
                  if (!positive)
                    e = new NegationEvaluator(e);
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "unary"


    // $ANTLR start "mult"
    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:72:1: mult returns [Evaluator e] : op1= unary ( '*' op2= unary | '/' op2= unary | 'mod' op2= unary )* ;
    public final Evaluator mult() throws RecognitionException {
        Evaluator e = null;

        Evaluator op1 = null;

        Evaluator op2 = null;


        try {
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:73:3: (op1= unary ( '*' op2= unary | '/' op2= unary | 'mod' op2= unary )* )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:73:5: op1= unary ( '*' op2= unary | '/' op2= unary | 'mod' op2= unary )*
            {
            pushFollow(FOLLOW_unary_in_mult375);
            op1=unary();

            state._fsp--;

             e = op1; 
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:74:5: ( '*' op2= unary | '/' op2= unary | 'mod' op2= unary )*
            loop11:
            do {
                int alt11=4;
                switch ( input.LA(1) ) {
                case 28:
                    {
                    alt11=1;
                    }
                    break;
                case 29:
                    {
                    alt11=2;
                    }
                    break;
                case 30:
                    {
                    alt11=3;
                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:74:7: '*' op2= unary
            	    {
            	    match(input,28,FOLLOW_28_in_mult385); 
            	    pushFollow(FOLLOW_unary_in_mult389);
            	    op2=unary();

            	    state._fsp--;

            	     e = new TimesEvaluator(op1, op2); 

            	    }
            	    break;
            	case 2 :
            	    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:75:7: '/' op2= unary
            	    {
            	    match(input,29,FOLLOW_29_in_mult400); 
            	    pushFollow(FOLLOW_unary_in_mult404);
            	    op2=unary();

            	    state._fsp--;

            	     e = new DivideEvaluator(op1, op2); 

            	    }
            	    break;
            	case 3 :
            	    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:76:7: 'mod' op2= unary
            	    {
            	    match(input,30,FOLLOW_30_in_mult414); 
            	    pushFollow(FOLLOW_unary_in_mult418);
            	    op2=unary();

            	    state._fsp--;

            	     e = new ModEvaluator(op1, op2); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "mult"


    // $ANTLR start "expression"
    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:80:1: expression returns [Evaluator e] : op1= mult ( '+' op2= mult | '-' op2= mult )* ;
    public final Evaluator expression() throws RecognitionException {
        Evaluator e = null;

        Evaluator op1 = null;

        Evaluator op2 = null;


        try {
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:81:3: (op1= mult ( '+' op2= mult | '-' op2= mult )* )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:81:5: op1= mult ( '+' op2= mult | '-' op2= mult )*
            {
            pushFollow(FOLLOW_mult_in_expression448);
            op1=mult();

            state._fsp--;

             e = op1; 
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:82:5: ( '+' op2= mult | '-' op2= mult )*
            loop12:
            do {
                int alt12=3;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }
                else if ( (LA12_0==27) ) {
                    alt12=2;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:82:7: '+' op2= mult
            	    {
            	    match(input,26,FOLLOW_26_in_expression458); 
            	    pushFollow(FOLLOW_mult_in_expression462);
            	    op2=mult();

            	    state._fsp--;

            	     e = new PlusEvaluator(op1, op2); 

            	    }
            	    break;
            	case 2 :
            	    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:83:7: '-' op2= mult
            	    {
            	    match(input,27,FOLLOW_27_in_expression472); 
            	    pushFollow(FOLLOW_mult_in_expression476);
            	    op2=mult();

            	    state._fsp--;

            	     e = new MinusEvaluator(op1, op2); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "expression"

    // Delegated rules


 

    public static final BitSet FOLLOW_9_in_program45 = new BitSet(new long[]{0x0000000000008400L});
    public static final BitSet FOLLOW_variable_in_program53 = new BitSet(new long[]{0x0000000000008400L});
    public static final BitSet FOLLOW_10_in_program62 = new BitSet(new long[]{0x0000000000220810L});
    public static final BitSet FOLLOW_statement_in_program72 = new BitSet(new long[]{0x0000000000220810L});
    public static final BitSet FOLLOW_11_in_program83 = new BitSet(new long[]{0x000000000D000030L});
    public static final BitSet FOLLOW_expression_in_program85 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_program87 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_program97 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_program103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_variable119 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_variable121 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_16_in_variable124 = new BitSet(new long[]{0x000000000D000030L});
    public static final BitSet FOLLOW_expression_in_variable126 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_variable130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignStatement_in_statement145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_assignStatement172 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_assignStatement174 = new BitSet(new long[]{0x000000000D000030L});
    public static final BitSet FOLLOW_expression_in_assignStatement176 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_assignStatement178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ifStatement193 = new BitSet(new long[]{0x000000000D000030L});
    public static final BitSet FOLLOW_expression_in_ifStatement195 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ifStatement197 = new BitSet(new long[]{0x00000000003A0010L});
    public static final BitSet FOLLOW_statement_in_ifStatement205 = new BitSet(new long[]{0x00000000003A0010L});
    public static final BitSet FOLLOW_19_in_ifStatement213 = new BitSet(new long[]{0x0000000000320010L});
    public static final BitSet FOLLOW_statement_in_ifStatement221 = new BitSet(new long[]{0x0000000000320010L});
    public static final BitSet FOLLOW_20_in_ifStatement230 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ifStatement232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_whileStatement249 = new BitSet(new long[]{0x000000000D000030L});
    public static final BitSet FOLLOW_expression_in_whileStatement251 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_whileStatement253 = new BitSet(new long[]{0x0000000000A20010L});
    public static final BitSet FOLLOW_statement_in_whileStatement261 = new BitSet(new long[]{0x0000000000A20010L});
    public static final BitSet FOLLOW_23_in_whileStatement268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_term291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_term299 = new BitSet(new long[]{0x000000000D000030L});
    public static final BitSet FOLLOW_expression_in_term301 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_term303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_term312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_unary340 = new BitSet(new long[]{0x000000000D000030L});
    public static final BitSet FOLLOW_27_in_unary344 = new BitSet(new long[]{0x000000000D000030L});
    public static final BitSet FOLLOW_term_in_unary350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_mult375 = new BitSet(new long[]{0x0000000070000002L});
    public static final BitSet FOLLOW_28_in_mult385 = new BitSet(new long[]{0x000000000D000030L});
    public static final BitSet FOLLOW_unary_in_mult389 = new BitSet(new long[]{0x0000000070000002L});
    public static final BitSet FOLLOW_29_in_mult400 = new BitSet(new long[]{0x000000000D000030L});
    public static final BitSet FOLLOW_unary_in_mult404 = new BitSet(new long[]{0x0000000070000002L});
    public static final BitSet FOLLOW_30_in_mult414 = new BitSet(new long[]{0x000000000D000030L});
    public static final BitSet FOLLOW_unary_in_mult418 = new BitSet(new long[]{0x0000000070000002L});
    public static final BitSet FOLLOW_mult_in_expression448 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_26_in_expression458 = new BitSet(new long[]{0x000000000D000030L});
    public static final BitSet FOLLOW_mult_in_expression462 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_27_in_expression472 = new BitSet(new long[]{0x000000000D000030L});
    public static final BitSet FOLLOW_mult_in_expression476 = new BitSet(new long[]{0x000000000C000002L});

}