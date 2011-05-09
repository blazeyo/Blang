// $ANTLR 3.3 Nov 30, 2010 12:50:56 /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g 2011-05-08 00:56:05

  package info.blazey.wmp.mrjp.blang;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class BlangParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NEGATION", "IDENT", "INTEGER", "DIGIT", "LETTER", "WHITESPACE", "'program'", "'return'", "';'", "'endprogram'", "':='", "'if'", "'then'", "'else'", "'end'", "'while'", "'do'", "'endwhile'", "'('", "')'", "'+'", "'*'", "'/'", "'mod'", "'-'"
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
    public static final int NEGATION=4;
    public static final int IDENT=5;
    public static final int INTEGER=6;
    public static final int DIGIT=7;
    public static final int LETTER=8;
    public static final int WHITESPACE=9;

    // delegates
    // delegators


        public BlangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public BlangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return BlangParser.tokenNames; }
    public String getGrammarFileName() { return "/home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g"; }


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:21:1: program : 'program' ( statement )* 'return' expression ';' 'endprogram' ;
    public final BlangParser.program_return program() throws RecognitionException {
        BlangParser.program_return retval = new BlangParser.program_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal1=null;
        Token string_literal3=null;
        Token char_literal5=null;
        Token string_literal6=null;
        BlangParser.statement_return statement2 = null;

        BlangParser.expression_return expression4 = null;


        CommonTree string_literal1_tree=null;
        CommonTree string_literal3_tree=null;
        CommonTree char_literal5_tree=null;
        CommonTree string_literal6_tree=null;

        try {
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:22:3: ( 'program' ( statement )* 'return' expression ';' 'endprogram' )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:22:5: 'program' ( statement )* 'return' expression ';' 'endprogram'
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal1=(Token)match(input,10,FOLLOW_10_in_program69); 
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:23:7: ( statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IDENT||LA1_0==15||LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:23:7: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_program78);
            	    statement2=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement2.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            string_literal3=(Token)match(input,11,FOLLOW_11_in_program87); 
            pushFollow(FOLLOW_expression_in_program90);
            expression4=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression4.getTree());
            char_literal5=(Token)match(input,12,FOLLOW_12_in_program92); 
            string_literal6=(Token)match(input,13,FOLLOW_13_in_program99); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:28:1: statement : ( assignStatement | ifStatement | whileStatement );
    public final BlangParser.statement_return statement() throws RecognitionException {
        BlangParser.statement_return retval = new BlangParser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BlangParser.assignStatement_return assignStatement7 = null;

        BlangParser.ifStatement_return ifStatement8 = null;

        BlangParser.whileStatement_return whileStatement9 = null;



        try {
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:29:3: ( assignStatement | ifStatement | whileStatement )
            int alt2=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 19:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:29:5: assignStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_assignStatement_in_statement115);
                    assignStatement7=assignStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, assignStatement7.getTree());

                    }
                    break;
                case 2 :
                    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:30:5: ifStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_ifStatement_in_statement121);
                    ifStatement8=ifStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, ifStatement8.getTree());

                    }
                    break;
                case 3 :
                    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:31:5: whileStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_whileStatement_in_statement127);
                    whileStatement9=whileStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, whileStatement9.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class assignStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignStatement"
    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:34:1: assignStatement : IDENT ':=' expression ';' ;
    public final BlangParser.assignStatement_return assignStatement() throws RecognitionException {
        BlangParser.assignStatement_return retval = new BlangParser.assignStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT10=null;
        Token string_literal11=null;
        Token char_literal13=null;
        BlangParser.expression_return expression12 = null;


        CommonTree IDENT10_tree=null;
        CommonTree string_literal11_tree=null;
        CommonTree char_literal13_tree=null;

        try {
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:35:3: ( IDENT ':=' expression ';' )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:35:5: IDENT ':=' expression ';'
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT10=(Token)match(input,IDENT,FOLLOW_IDENT_in_assignStatement142); 
            IDENT10_tree = (CommonTree)adaptor.create(IDENT10);
            adaptor.addChild(root_0, IDENT10_tree);

            string_literal11=(Token)match(input,14,FOLLOW_14_in_assignStatement144); 
            string_literal11_tree = (CommonTree)adaptor.create(string_literal11);
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal11_tree, root_0);

            pushFollow(FOLLOW_expression_in_assignStatement147);
            expression12=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression12.getTree());
            char_literal13=(Token)match(input,12,FOLLOW_12_in_assignStatement149); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignStatement"

    public static class ifStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStatement"
    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:38:1: ifStatement : 'if' expression 'then' ( statement )* ( 'else' ( statement )* )? 'end' 'if' ;
    public final BlangParser.ifStatement_return ifStatement() throws RecognitionException {
        BlangParser.ifStatement_return retval = new BlangParser.ifStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal14=null;
        Token string_literal16=null;
        Token string_literal18=null;
        Token string_literal20=null;
        Token string_literal21=null;
        BlangParser.expression_return expression15 = null;

        BlangParser.statement_return statement17 = null;

        BlangParser.statement_return statement19 = null;


        CommonTree string_literal14_tree=null;
        CommonTree string_literal16_tree=null;
        CommonTree string_literal18_tree=null;
        CommonTree string_literal20_tree=null;
        CommonTree string_literal21_tree=null;

        try {
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:39:3: ( 'if' expression 'then' ( statement )* ( 'else' ( statement )* )? 'end' 'if' )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:39:5: 'if' expression 'then' ( statement )* ( 'else' ( statement )* )? 'end' 'if'
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal14=(Token)match(input,15,FOLLOW_15_in_ifStatement165); 
            string_literal14_tree = (CommonTree)adaptor.create(string_literal14);
            adaptor.addChild(root_0, string_literal14_tree);

            pushFollow(FOLLOW_expression_in_ifStatement167);
            expression15=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression15.getTree());
            string_literal16=(Token)match(input,16,FOLLOW_16_in_ifStatement169); 
            string_literal16_tree = (CommonTree)adaptor.create(string_literal16);
            adaptor.addChild(root_0, string_literal16_tree);

            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:40:7: ( statement )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==IDENT||LA3_0==15||LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:40:7: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_ifStatement177);
            	    statement17=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement17.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:41:5: ( 'else' ( statement )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:41:6: 'else' ( statement )*
                    {
                    string_literal18=(Token)match(input,17,FOLLOW_17_in_ifStatement185); 
                    string_literal18_tree = (CommonTree)adaptor.create(string_literal18);
                    adaptor.addChild(root_0, string_literal18_tree);

                    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:42:7: ( statement )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==IDENT||LA4_0==15||LA4_0==19) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:42:7: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_ifStatement193);
                    	    statement19=statement();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, statement19.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            string_literal20=(Token)match(input,18,FOLLOW_18_in_ifStatement202); 
            string_literal20_tree = (CommonTree)adaptor.create(string_literal20);
            adaptor.addChild(root_0, string_literal20_tree);

            string_literal21=(Token)match(input,15,FOLLOW_15_in_ifStatement204); 
            string_literal21_tree = (CommonTree)adaptor.create(string_literal21);
            adaptor.addChild(root_0, string_literal21_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ifStatement"

    public static class whileStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileStatement"
    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:46:1: whileStatement : 'while' expression 'do' ( statement )* 'endwhile' ;
    public final BlangParser.whileStatement_return whileStatement() throws RecognitionException {
        BlangParser.whileStatement_return retval = new BlangParser.whileStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal22=null;
        Token string_literal24=null;
        Token string_literal26=null;
        BlangParser.expression_return expression23 = null;

        BlangParser.statement_return statement25 = null;


        CommonTree string_literal22_tree=null;
        CommonTree string_literal24_tree=null;
        CommonTree string_literal26_tree=null;

        try {
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:47:3: ( 'while' expression 'do' ( statement )* 'endwhile' )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:47:5: 'while' expression 'do' ( statement )* 'endwhile'
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal22=(Token)match(input,19,FOLLOW_19_in_whileStatement221); 
            string_literal22_tree = (CommonTree)adaptor.create(string_literal22);
            adaptor.addChild(root_0, string_literal22_tree);

            pushFollow(FOLLOW_expression_in_whileStatement223);
            expression23=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression23.getTree());
            string_literal24=(Token)match(input,20,FOLLOW_20_in_whileStatement225); 
            string_literal24_tree = (CommonTree)adaptor.create(string_literal24);
            adaptor.addChild(root_0, string_literal24_tree);

            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:48:7: ( statement )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==IDENT||LA6_0==15||LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:48:7: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_whileStatement233);
            	    statement25=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement25.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            string_literal26=(Token)match(input,21,FOLLOW_21_in_whileStatement240); 
            string_literal26_tree = (CommonTree)adaptor.create(string_literal26);
            adaptor.addChild(root_0, string_literal26_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "whileStatement"

    public static class term_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:54:1: term : ( IDENT | '(' expression ')' | INTEGER );
    public final BlangParser.term_return term() throws RecognitionException {
        BlangParser.term_return retval = new BlangParser.term_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT27=null;
        Token char_literal28=null;
        Token char_literal30=null;
        Token INTEGER31=null;
        BlangParser.expression_return expression29 = null;


        CommonTree IDENT27_tree=null;
        CommonTree char_literal28_tree=null;
        CommonTree char_literal30_tree=null;
        CommonTree INTEGER31_tree=null;

        try {
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:55:3: ( IDENT | '(' expression ')' | INTEGER )
            int alt7=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt7=1;
                }
                break;
            case 22:
                {
                alt7=2;
                }
                break;
            case INTEGER:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:55:5: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT27=(Token)match(input,IDENT,FOLLOW_IDENT_in_term259); 
                    IDENT27_tree = (CommonTree)adaptor.create(IDENT27);
                    adaptor.addChild(root_0, IDENT27_tree);


                    }
                    break;
                case 2 :
                    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:56:5: '(' expression ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal28=(Token)match(input,22,FOLLOW_22_in_term265); 
                    char_literal28_tree = (CommonTree)adaptor.create(char_literal28);
                    adaptor.addChild(root_0, char_literal28_tree);

                    pushFollow(FOLLOW_expression_in_term267);
                    expression29=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression29.getTree());
                    char_literal30=(Token)match(input,23,FOLLOW_23_in_term269); 
                    char_literal30_tree = (CommonTree)adaptor.create(char_literal30);
                    adaptor.addChild(root_0, char_literal30_tree);


                    }
                    break;
                case 3 :
                    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:57:5: INTEGER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INTEGER31=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_term275); 
                    INTEGER31_tree = (CommonTree)adaptor.create(INTEGER31);
                    adaptor.addChild(root_0, INTEGER31_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "term"

    public static class unary_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary"
    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:60:1: unary : ( '+' | negation )* term ;
    public final BlangParser.unary_return unary() throws RecognitionException {
        BlangParser.unary_return retval = new BlangParser.unary_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal32=null;
        BlangParser.negation_return negation33 = null;

        BlangParser.term_return term34 = null;


        CommonTree char_literal32_tree=null;

        try {
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:61:3: ( ( '+' | negation )* term )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:61:5: ( '+' | negation )* term
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:61:5: ( '+' | negation )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }
                else if ( (LA8_0==28) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:61:6: '+'
            	    {
            	    char_literal32=(Token)match(input,24,FOLLOW_24_in_unary291); 

            	    }
            	    break;
            	case 2 :
            	    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:61:13: negation
            	    {
            	    pushFollow(FOLLOW_negation_in_unary296);
            	    negation33=negation();

            	    state._fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(negation33.getTree(), root_0);

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            pushFollow(FOLLOW_term_in_unary301);
            term34=term();

            state._fsp--;

            adaptor.addChild(root_0, term34.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unary"

    public static class mult_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mult"
    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:64:1: mult : unary ( ( '*' | '/' | 'mod' ) unary )* ;
    public final BlangParser.mult_return mult() throws RecognitionException {
        BlangParser.mult_return retval = new BlangParser.mult_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal36=null;
        Token char_literal37=null;
        Token string_literal38=null;
        BlangParser.unary_return unary35 = null;

        BlangParser.unary_return unary39 = null;


        CommonTree char_literal36_tree=null;
        CommonTree char_literal37_tree=null;
        CommonTree string_literal38_tree=null;

        try {
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:65:3: ( unary ( ( '*' | '/' | 'mod' ) unary )* )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:65:5: unary ( ( '*' | '/' | 'mod' ) unary )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_unary_in_mult314);
            unary35=unary();

            state._fsp--;

            adaptor.addChild(root_0, unary35.getTree());
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:65:11: ( ( '*' | '/' | 'mod' ) unary )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=25 && LA10_0<=27)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:65:12: ( '*' | '/' | 'mod' ) unary
            	    {
            	    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:65:12: ( '*' | '/' | 'mod' )
            	    int alt9=3;
            	    switch ( input.LA(1) ) {
            	    case 25:
            	        {
            	        alt9=1;
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt9=2;
            	        }
            	        break;
            	    case 27:
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
            	            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:65:13: '*'
            	            {
            	            char_literal36=(Token)match(input,25,FOLLOW_25_in_mult318); 
            	            char_literal36_tree = (CommonTree)adaptor.create(char_literal36);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal36_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:65:20: '/'
            	            {
            	            char_literal37=(Token)match(input,26,FOLLOW_26_in_mult323); 
            	            char_literal37_tree = (CommonTree)adaptor.create(char_literal37);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal37_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:65:27: 'mod'
            	            {
            	            string_literal38=(Token)match(input,27,FOLLOW_27_in_mult328); 
            	            string_literal38_tree = (CommonTree)adaptor.create(string_literal38);
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal38_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_unary_in_mult332);
            	    unary39=unary();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unary39.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mult"

    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:68:1: expression : mult ( ( '+' | '-' ) mult )* ;
    public final BlangParser.expression_return expression() throws RecognitionException {
        BlangParser.expression_return retval = new BlangParser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal41=null;
        Token char_literal42=null;
        BlangParser.mult_return mult40 = null;

        BlangParser.mult_return mult43 = null;


        CommonTree char_literal41_tree=null;
        CommonTree char_literal42_tree=null;

        try {
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:69:3: ( mult ( ( '+' | '-' ) mult )* )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:69:5: mult ( ( '+' | '-' ) mult )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_mult_in_expression349);
            mult40=mult();

            state._fsp--;

            adaptor.addChild(root_0, mult40.getTree());
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:69:10: ( ( '+' | '-' ) mult )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24||LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:69:11: ( '+' | '-' ) mult
            	    {
            	    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:69:11: ( '+' | '-' )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==24) ) {
            	        alt11=1;
            	    }
            	    else if ( (LA11_0==28) ) {
            	        alt11=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:69:12: '+'
            	            {
            	            char_literal41=(Token)match(input,24,FOLLOW_24_in_expression353); 
            	            char_literal41_tree = (CommonTree)adaptor.create(char_literal41);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal41_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:69:19: '-'
            	            {
            	            char_literal42=(Token)match(input,28,FOLLOW_28_in_expression358); 
            	            char_literal42_tree = (CommonTree)adaptor.create(char_literal42);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal42_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_mult_in_expression362);
            	    mult43=mult();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mult43.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class negation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "negation"
    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:72:1: negation : '-' -> NEGATION ;
    public final BlangParser.negation_return negation() throws RecognitionException {
        BlangParser.negation_return retval = new BlangParser.negation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal44=null;

        CommonTree char_literal44_tree=null;
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");

        try {
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:73:3: ( '-' -> NEGATION )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:73:5: '-'
            {
            char_literal44=(Token)match(input,28,FOLLOW_28_in_negation379);  
            stream_28.add(char_literal44);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 73:9: -> NEGATION
            {
                adaptor.addChild(root_0, (CommonTree)adaptor.create(NEGATION, "NEGATION"));

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "negation"

    // Delegated rules


 

    public static final BitSet FOLLOW_10_in_program69 = new BitSet(new long[]{0x0000000000088820L});
    public static final BitSet FOLLOW_statement_in_program78 = new BitSet(new long[]{0x0000000000088820L});
    public static final BitSet FOLLOW_11_in_program87 = new BitSet(new long[]{0x0000000011400060L});
    public static final BitSet FOLLOW_expression_in_program90 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_program92 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_program99 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignStatement_in_statement115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_assignStatement142 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_assignStatement144 = new BitSet(new long[]{0x0000000011400060L});
    public static final BitSet FOLLOW_expression_in_assignStatement147 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_assignStatement149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ifStatement165 = new BitSet(new long[]{0x0000000011400060L});
    public static final BitSet FOLLOW_expression_in_ifStatement167 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ifStatement169 = new BitSet(new long[]{0x00000000000E8020L});
    public static final BitSet FOLLOW_statement_in_ifStatement177 = new BitSet(new long[]{0x00000000000E8020L});
    public static final BitSet FOLLOW_17_in_ifStatement185 = new BitSet(new long[]{0x00000000000C8020L});
    public static final BitSet FOLLOW_statement_in_ifStatement193 = new BitSet(new long[]{0x00000000000C8020L});
    public static final BitSet FOLLOW_18_in_ifStatement202 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ifStatement204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_whileStatement221 = new BitSet(new long[]{0x0000000011400060L});
    public static final BitSet FOLLOW_expression_in_whileStatement223 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_whileStatement225 = new BitSet(new long[]{0x0000000000288020L});
    public static final BitSet FOLLOW_statement_in_whileStatement233 = new BitSet(new long[]{0x0000000000288020L});
    public static final BitSet FOLLOW_21_in_whileStatement240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_term259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_term265 = new BitSet(new long[]{0x0000000011400060L});
    public static final BitSet FOLLOW_expression_in_term267 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_term269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_term275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_unary291 = new BitSet(new long[]{0x0000000011400060L});
    public static final BitSet FOLLOW_negation_in_unary296 = new BitSet(new long[]{0x0000000011400060L});
    public static final BitSet FOLLOW_term_in_unary301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_mult314 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_25_in_mult318 = new BitSet(new long[]{0x0000000011400060L});
    public static final BitSet FOLLOW_26_in_mult323 = new BitSet(new long[]{0x0000000011400060L});
    public static final BitSet FOLLOW_27_in_mult328 = new BitSet(new long[]{0x0000000011400060L});
    public static final BitSet FOLLOW_unary_in_mult332 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_mult_in_expression349 = new BitSet(new long[]{0x0000000011000002L});
    public static final BitSet FOLLOW_24_in_expression353 = new BitSet(new long[]{0x0000000011400060L});
    public static final BitSet FOLLOW_28_in_expression358 = new BitSet(new long[]{0x0000000011400060L});
    public static final BitSet FOLLOW_mult_in_expression362 = new BitSet(new long[]{0x0000000011000002L});
    public static final BitSet FOLLOW_28_in_negation379 = new BitSet(new long[]{0x0000000000000002L});

}