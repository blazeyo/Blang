// $ANTLR 3.3 Nov 30, 2010 12:50:56 /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/BlangEvaluatorWalker.g 2011-05-07 13:41:55

  package info.blazey.wmp.mrjp.blang;
  import java.util.Map;
  import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class BlangEvaluatorWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NEGATION", "IDENT", "INTEGER", "DIGIT", "LETTER", "WHITESPACE", "'program'", "'body'", "'return'", "';'", "'endbody'", "'endprogram'", "'var'", "':='", "'if'", "'then'", "'else'", "'end'", "'while'", "'do'", "'endwhile'", "'('", "')'", "'+'", "'*'", "'/'", "'mod'", "'-'"
    };
    public static final int EOF=-1;
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
    public static final int T__31=31;
    public static final int NEGATION=4;
    public static final int IDENT=5;
    public static final int INTEGER=6;
    public static final int DIGIT=7;
    public static final int LETTER=8;
    public static final int WHITESPACE=9;

    // delegates
    // delegators


        public BlangEvaluatorWalker(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public BlangEvaluatorWalker(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return BlangEvaluatorWalker.tokenNames; }
    public String getGrammarFileName() { return "/home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/BlangEvaluatorWalker.g"; }


      private Map<String, Integer> variables = new HashMap<String, Integer>();



    // $ANTLR start "evaluator"
    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/BlangEvaluatorWalker.g:19:1: evaluator returns [int result] : ( assignmentStatement )* e= expression EOF ;
    public final int evaluator() throws RecognitionException {
        int result = 0;

        int e = 0;


        try {
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/BlangEvaluatorWalker.g:20:3: ( ( assignmentStatement )* e= expression EOF )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/BlangEvaluatorWalker.g:20:5: ( assignmentStatement )* e= expression EOF
            {
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/BlangEvaluatorWalker.g:20:5: ( assignmentStatement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/BlangEvaluatorWalker.g:20:5: assignmentStatement
            	    {
            	    pushFollow(FOLLOW_assignmentStatement_in_evaluator62);
            	    assignmentStatement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            pushFollow(FOLLOW_expression_in_evaluator67);
            e=expression();

            state._fsp--;

            match(input,EOF,FOLLOW_EOF_in_evaluator69); 
             result = e; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "evaluator"


    // $ANTLR start "assignmentStatement"
    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/BlangEvaluatorWalker.g:23:1: assignmentStatement : ^( ':=' IDENT e= expression ) ;
    public final void assignmentStatement() throws RecognitionException {
        CommonTree IDENT1=null;
        int e = 0;


        try {
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/BlangEvaluatorWalker.g:24:3: ( ^( ':=' IDENT e= expression ) )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/BlangEvaluatorWalker.g:24:5: ^( ':=' IDENT e= expression )
            {
            match(input,17,FOLLOW_17_in_assignmentStatement87); 

            match(input, Token.DOWN, null); 
            IDENT1=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_assignmentStatement89); 
            pushFollow(FOLLOW_expression_in_assignmentStatement93);
            e=expression();

            state._fsp--;


            match(input, Token.UP, null); 
             variables.put((IDENT1!=null?IDENT1.getText():null), e); 

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
    // $ANTLR end "assignmentStatement"


    // $ANTLR start "expression"
    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/BlangEvaluatorWalker.g:27:1: expression returns [int result] : ( ^( '+' op1= expression op2= expression ) | ^( '-' op1= expression op2= expression ) | ^( '*' op1= expression op2= expression ) | ^( '/' eop1= expression op2= expression ) | ^( 'mod' op1= expression op2= expression ) | ^( NEGATION e= expression ) | IDENT | INTEGER );
    public final int expression() throws RecognitionException {
        int result = 0;

        CommonTree IDENT2=null;
        CommonTree INTEGER3=null;
        int op1 = 0;

        int op2 = 0;

        int eop1 = 0;

        int e = 0;


        try {
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/BlangEvaluatorWalker.g:28:3: ( ^( '+' op1= expression op2= expression ) | ^( '-' op1= expression op2= expression ) | ^( '*' op1= expression op2= expression ) | ^( '/' eop1= expression op2= expression ) | ^( 'mod' op1= expression op2= expression ) | ^( NEGATION e= expression ) | IDENT | INTEGER )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt2=1;
                }
                break;
            case 31:
                {
                alt2=2;
                }
                break;
            case 28:
                {
                alt2=3;
                }
                break;
            case 29:
                {
                alt2=4;
                }
                break;
            case 30:
                {
                alt2=5;
                }
                break;
            case NEGATION:
                {
                alt2=6;
                }
                break;
            case IDENT:
                {
                alt2=7;
                }
                break;
            case INTEGER:
                {
                alt2=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/BlangEvaluatorWalker.g:28:5: ^( '+' op1= expression op2= expression )
                    {
                    match(input,27,FOLLOW_27_in_expression115); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression119);
                    op1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression123);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     result = op1 + op2; 

                    }
                    break;
                case 2 :
                    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/BlangEvaluatorWalker.g:29:5: ^( '-' op1= expression op2= expression )
                    {
                    match(input,31,FOLLOW_31_in_expression133); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression137);
                    op1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression141);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     result = op1 - op2; 

                    }
                    break;
                case 3 :
                    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/BlangEvaluatorWalker.g:30:5: ^( '*' op1= expression op2= expression )
                    {
                    match(input,28,FOLLOW_28_in_expression151); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression155);
                    op1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression159);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     result = op1 * op2; 

                    }
                    break;
                case 4 :
                    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/BlangEvaluatorWalker.g:31:5: ^( '/' eop1= expression op2= expression )
                    {
                    match(input,29,FOLLOW_29_in_expression169); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression173);
                    eop1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression177);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     result = op1 / op2; 

                    }
                    break;
                case 5 :
                    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/BlangEvaluatorWalker.g:32:5: ^( 'mod' op1= expression op2= expression )
                    {
                    match(input,30,FOLLOW_30_in_expression187); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression191);
                    op1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression195);
                    op2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     result = op1 % op2; 

                    }
                    break;
                case 6 :
                    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/BlangEvaluatorWalker.g:33:5: ^( NEGATION e= expression )
                    {
                    match(input,NEGATION,FOLLOW_NEGATION_in_expression205); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression209);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     result = -e; 

                    }
                    break;
                case 7 :
                    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/BlangEvaluatorWalker.g:34:5: IDENT
                    {
                    IDENT2=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_expression218); 
                     result = variables.get((IDENT2!=null?IDENT2.getText():null)); 

                    }
                    break;
                case 8 :
                    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/BlangEvaluatorWalker.g:35:5: INTEGER
                    {
                    INTEGER3=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_expression226); 
                     result = Integer.parseInt((INTEGER3!=null?INTEGER3.getText():null)); 

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
        return result;
    }
    // $ANTLR end "expression"

    // Delegated rules


 

    public static final BitSet FOLLOW_assignmentStatement_in_evaluator62 = new BitSet(new long[]{0x00000000F8020070L});
    public static final BitSet FOLLOW_expression_in_evaluator67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_evaluator69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_assignmentStatement87 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_assignmentStatement89 = new BitSet(new long[]{0x00000000F8000070L});
    public static final BitSet FOLLOW_expression_in_assignmentStatement93 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_27_in_expression115 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression119 = new BitSet(new long[]{0x00000000F8000070L});
    public static final BitSet FOLLOW_expression_in_expression123 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_31_in_expression133 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression137 = new BitSet(new long[]{0x00000000F8000070L});
    public static final BitSet FOLLOW_expression_in_expression141 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_28_in_expression151 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression155 = new BitSet(new long[]{0x00000000F8000070L});
    public static final BitSet FOLLOW_expression_in_expression159 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_29_in_expression169 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression173 = new BitSet(new long[]{0x00000000F8000070L});
    public static final BitSet FOLLOW_expression_in_expression177 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_30_in_expression187 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression191 = new BitSet(new long[]{0x00000000F8000070L});
    public static final BitSet FOLLOW_expression_in_expression195 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEGATION_in_expression205 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression209 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_expression218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_expression226 = new BitSet(new long[]{0x0000000000000002L});

}