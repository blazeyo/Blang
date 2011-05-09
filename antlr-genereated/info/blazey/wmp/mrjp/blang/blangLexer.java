// $ANTLR 3.3 Nov 30, 2010 12:50:56 /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g 2011-05-06 15:45:08

  package info.blazey.wmp.mrjp.blang;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class blangLexer extends Lexer {
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

    public blangLexer() {;} 
    public blangLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public blangLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:11:6: ( 'program' )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:11:8: 'program'
            {
            match("program"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:12:7: ( 'body' )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:12:9: 'body'
            {
            match("body"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:13:7: ( 'return' )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:13:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:14:7: ( ';' )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:14:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:15:7: ( 'endbody' )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:15:9: 'endbody'
            {
            match("endbody"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:16:7: ( 'endprogram' )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:16:9: 'endprogram'
            {
            match("endprogram"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:17:7: ( 'var' )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:17:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:18:7: ( ':=' )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:18:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:19:7: ( 'if' )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:19:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:20:7: ( 'then' )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:20:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:21:7: ( 'else' )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:21:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:22:7: ( 'end' )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:22:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:23:7: ( 'while' )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:23:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:24:7: ( 'do' )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:24:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:25:7: ( 'endwhile' )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:25:9: 'endwhile'
            {
            match("endwhile"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:26:7: ( '(' )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:26:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:27:7: ( ')' )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:27:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:28:7: ( '+' )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:28:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:29:7: ( '-' )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:29:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:30:7: ( '*' )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:30:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:31:7: ( '/' )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:31:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:32:7: ( 'mod' )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:32:9: 'mod'
            {
            match("mod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:87:17: ( ( '0' .. '9' ) )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:87:19: ( '0' .. '9' )
            {
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:87:19: ( '0' .. '9' )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:87:20: '0' .. '9'
            {
            matchRange('0','9'); 

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:88:17: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:88:19: ( 'a' .. 'z' | 'A' .. 'Z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:90:9: ( ( DIGIT )+ )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:90:11: ( DIGIT )+
            {
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:90:11: ( DIGIT )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:90:11: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:91:7: ( LETTER ( LETTER | DIGIT )* )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:91:10: LETTER ( LETTER | DIGIT )*
            {
            mLETTER(); 
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:91:17: ( LETTER | DIGIT )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }
                else if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:91:18: LETTER
            	    {
            	    mLETTER(); 

            	    }
            	    break;
            	case 2 :
            	    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:91:27: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:93:13: ( ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )* )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:93:15: ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )*
            {
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:93:15: ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\t' && LA3_0<='\n')||(LA3_0>='\f' && LA3_0<='\r')||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITESPACE"

    public void mTokens() throws RecognitionException {
        // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | INTEGER | IDENT | WHITESPACE )
        int alt4=25;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:1:10: T__9
                {
                mT__9(); 

                }
                break;
            case 2 :
                // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:1:15: T__10
                {
                mT__10(); 

                }
                break;
            case 3 :
                // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:1:21: T__11
                {
                mT__11(); 

                }
                break;
            case 4 :
                // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:1:27: T__12
                {
                mT__12(); 

                }
                break;
            case 5 :
                // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:1:33: T__13
                {
                mT__13(); 

                }
                break;
            case 6 :
                // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:1:39: T__14
                {
                mT__14(); 

                }
                break;
            case 7 :
                // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:1:45: T__15
                {
                mT__15(); 

                }
                break;
            case 8 :
                // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:1:51: T__16
                {
                mT__16(); 

                }
                break;
            case 9 :
                // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:1:57: T__17
                {
                mT__17(); 

                }
                break;
            case 10 :
                // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:1:63: T__18
                {
                mT__18(); 

                }
                break;
            case 11 :
                // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:1:69: T__19
                {
                mT__19(); 

                }
                break;
            case 12 :
                // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:1:75: T__20
                {
                mT__20(); 

                }
                break;
            case 13 :
                // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:1:81: T__21
                {
                mT__21(); 

                }
                break;
            case 14 :
                // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:1:87: T__22
                {
                mT__22(); 

                }
                break;
            case 15 :
                // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:1:93: T__23
                {
                mT__23(); 

                }
                break;
            case 16 :
                // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:1:99: T__24
                {
                mT__24(); 

                }
                break;
            case 17 :
                // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:1:105: T__25
                {
                mT__25(); 

                }
                break;
            case 18 :
                // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:1:111: T__26
                {
                mT__26(); 

                }
                break;
            case 19 :
                // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:1:117: T__27
                {
                mT__27(); 

                }
                break;
            case 20 :
                // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:1:123: T__28
                {
                mT__28(); 

                }
                break;
            case 21 :
                // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:1:129: T__29
                {
                mT__29(); 

                }
                break;
            case 22 :
                // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:1:135: T__30
                {
                mT__30(); 

                }
                break;
            case 23 :
                // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:1:141: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 24 :
                // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:1:149: IDENT
                {
                mIDENT(); 

                }
                break;
            case 25 :
                // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/blang.g:1:155: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\1\25\3\24\1\uffff\2\24\1\uffff\4\24\6\uffff\1\24\3\uffff\6\24\1"+
        "\47\2\24\1\52\4\24\1\62\1\24\1\64\1\uffff\2\24\1\uffff\1\67\1\24"+
        "\1\71\4\24\1\uffff\1\76\1\uffff\1\77\1\24\1\uffff\1\24\1\uffff\4"+
        "\24\2\uffff\1\106\1\24\1\110\3\24\1\uffff\1\114\1\uffff\1\115\2"+
        "\24\2\uffff\1\24\1\121\1\24\1\uffff\1\123\1\uffff";
    static final String DFA4_eofS =
        "\124\uffff";
    static final String DFA4_minS =
        "\1\50\1\162\1\157\1\145\1\uffff\1\154\1\141\1\uffff\1\146\2\150"+
        "\1\157\6\uffff\1\157\3\uffff\1\157\1\144\1\164\1\144\1\163\1\162"+
        "\1\60\1\145\1\151\1\60\1\144\1\147\1\171\1\165\1\60\1\145\1\60\1"+
        "\uffff\1\156\1\154\1\uffff\1\60\1\162\1\60\1\162\1\157\1\162\1\150"+
        "\1\uffff\1\60\1\uffff\1\60\1\145\1\uffff\1\141\1\uffff\1\156\1\144"+
        "\1\157\1\151\2\uffff\1\60\1\155\1\60\1\171\1\147\1\154\1\uffff\1"+
        "\60\1\uffff\1\60\1\162\1\145\2\uffff\1\141\1\60\1\155\1\uffff\1"+
        "\60\1\uffff";
    static final String DFA4_maxS =
        "\1\172\1\162\1\157\1\145\1\uffff\1\156\1\141\1\uffff\1\146\2\150"+
        "\1\157\6\uffff\1\157\3\uffff\1\157\1\144\1\164\1\144\1\163\1\162"+
        "\1\172\1\145\1\151\1\172\1\144\1\147\1\171\1\165\1\172\1\145\1\172"+
        "\1\uffff\1\156\1\154\1\uffff\1\172\1\162\1\172\1\162\1\157\1\162"+
        "\1\150\1\uffff\1\172\1\uffff\1\172\1\145\1\uffff\1\141\1\uffff\1"+
        "\156\1\144\1\157\1\151\2\uffff\1\172\1\155\1\172\1\171\1\147\1\154"+
        "\1\uffff\1\172\1\uffff\1\172\1\162\1\145\2\uffff\1\141\1\172\1\155"+
        "\1\uffff\1\172\1\uffff";
    static final String DFA4_acceptS =
        "\4\uffff\1\4\2\uffff\1\10\4\uffff\1\20\1\21\1\22\1\23\1\24\1\25"+
        "\1\uffff\1\27\1\30\1\31\21\uffff\1\11\2\uffff\1\16\7\uffff\1\14"+
        "\1\uffff\1\7\2\uffff\1\26\1\uffff\1\2\4\uffff\1\13\1\12\6\uffff"+
        "\1\15\1\uffff\1\3\3\uffff\1\1\1\5\3\uffff\1\17\1\uffff\1\6";
    static final String DFA4_specialS =
        "\124\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\14\1\15\1\20\1\16\1\uffff\1\17\1\uffff\1\21\12\23\1\7\1\4"+
            "\5\uffff\32\24\6\uffff\1\24\1\2\1\24\1\13\1\5\3\24\1\10\3\24"+
            "\1\22\2\24\1\1\1\24\1\3\1\24\1\11\1\24\1\6\1\12\3\24",
            "\1\26",
            "\1\27",
            "\1\30",
            "",
            "\1\32\1\uffff\1\31",
            "\1\33",
            "",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\40",
            "",
            "",
            "",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "\1\50",
            "\1\51",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\12\24\7\uffff\32\24\6\uffff\1\24\1\57\15\24\1\60\6\24\1\61"+
            "\3\24",
            "\1\63",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "",
            "\1\65",
            "\1\66",
            "",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "\1\70",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "\1\100",
            "",
            "\1\101",
            "",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "",
            "",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "\1\107",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "\1\111",
            "\1\112",
            "\1\113",
            "",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "\1\116",
            "\1\117",
            "",
            "",
            "\1\120",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "\1\122",
            "",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | INTEGER | IDENT | WHITESPACE );";
        }
    }
 

}