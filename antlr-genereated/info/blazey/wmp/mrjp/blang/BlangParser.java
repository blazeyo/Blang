// $ANTLR 3.3 Nov 30, 2010 12:50:56 /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g 2011-05-30 15:13:33

  package info.blazey.wmp.mrjp.blang;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class BlangParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NEGATION", "BLOCK", "IDENT", "ASSIGN", "IF", "WHILE", "INTEGER", "MULT", "DIV", "MOD", "PLUS", "MINUS", "DIGIT", "LETTER", "WHITESPACE", "'program'", "'endprogram'", "'return'", "';'", "'then'", "'else'", "'end'", "'do'", "'('", "')'"
    };
    public static final int EOF=-1;
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
    public static final int BLOCK=5;
    public static final int IDENT=6;
    public static final int ASSIGN=7;
    public static final int IF=8;
    public static final int WHILE=9;
    public static final int INTEGER=10;
    public static final int MULT=11;
    public static final int DIV=12;
    public static final int MOD=13;
    public static final int PLUS=14;
    public static final int MINUS=15;
    public static final int DIGIT=16;
    public static final int LETTER=17;
    public static final int WHITESPACE=18;

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
    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:23:1: program : 'program' ( statement )* returnStatement 'endprogram' ;
    public final BlangParser.program_return program() throws RecognitionException {
        BlangParser.program_return retval = new BlangParser.program_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal1=null;
        Token string_literal4=null;
        BlangParser.statement_return statement2 = null;

        BlangParser.returnStatement_return returnStatement3 = null;


        CommonTree string_literal1_tree=null;
        CommonTree string_literal4_tree=null;

        try {
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:24:3: ( 'program' ( statement )* returnStatement 'endprogram' )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:24:5: 'program' ( statement )* returnStatement 'endprogram'
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal1=(Token)match(input,19,FOLLOW_19_in_program83); if (state.failed) return retval;
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:25:7: ( statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IDENT||(LA1_0>=IF && LA1_0<=WHILE)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_program92);
            	    statement2=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement2.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            pushFollow(FOLLOW_returnStatement_in_program101);
            returnStatement3=returnStatement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, returnStatement3.getTree());
            string_literal4=(Token)match(input,20,FOLLOW_20_in_program107); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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

    public static class returnStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "returnStatement"
    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:30:1: returnStatement : 'return' expression ';' ;
    public final BlangParser.returnStatement_return returnStatement() throws RecognitionException {
        BlangParser.returnStatement_return retval = new BlangParser.returnStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal5=null;
        Token char_literal7=null;
        BlangParser.expression_return expression6 = null;


        CommonTree string_literal5_tree=null;
        CommonTree char_literal7_tree=null;

        try {
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:31:3: ( 'return' expression ';' )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:31:5: 'return' expression ';'
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal5=(Token)match(input,21,FOLLOW_21_in_returnStatement123); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal5_tree = (CommonTree)adaptor.create(string_literal5);
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal5_tree, root_0);
            }
            pushFollow(FOLLOW_expression_in_returnStatement126);
            expression6=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression6.getTree());
            char_literal7=(Token)match(input,22,FOLLOW_22_in_returnStatement128); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "returnStatement"

    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:34:1: statement : ( assignStatement | ifStatement | whileStatement );
    public final BlangParser.statement_return statement() throws RecognitionException {
        BlangParser.statement_return retval = new BlangParser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BlangParser.assignStatement_return assignStatement8 = null;

        BlangParser.ifStatement_return ifStatement9 = null;

        BlangParser.whileStatement_return whileStatement10 = null;



        try {
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:35:3: ( assignStatement | ifStatement | whileStatement )
            int alt2=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt2=1;
                }
                break;
            case IF:
                {
                alt2=2;
                }
                break;
            case WHILE:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:35:5: assignStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_assignStatement_in_statement144);
                    assignStatement8=assignStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignStatement8.getTree());

                    }
                    break;
                case 2 :
                    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:36:5: ifStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_ifStatement_in_statement150);
                    ifStatement9=ifStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatement9.getTree());

                    }
                    break;
                case 3 :
                    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:37:5: whileStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_whileStatement_in_statement156);
                    whileStatement10=whileStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileStatement10.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:40:1: assignStatement : IDENT ASSIGN expression ';' ;
    public final BlangParser.assignStatement_return assignStatement() throws RecognitionException {
        BlangParser.assignStatement_return retval = new BlangParser.assignStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT11=null;
        Token ASSIGN12=null;
        Token char_literal14=null;
        BlangParser.expression_return expression13 = null;


        CommonTree IDENT11_tree=null;
        CommonTree ASSIGN12_tree=null;
        CommonTree char_literal14_tree=null;

        try {
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:41:3: ( IDENT ASSIGN expression ';' )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:41:5: IDENT ASSIGN expression ';'
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT11=(Token)match(input,IDENT,FOLLOW_IDENT_in_assignStatement171); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT11_tree = (CommonTree)adaptor.create(IDENT11);
            adaptor.addChild(root_0, IDENT11_tree);
            }
            ASSIGN12=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignStatement173); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN12_tree = (CommonTree)adaptor.create(ASSIGN12);
            root_0 = (CommonTree)adaptor.becomeRoot(ASSIGN12_tree, root_0);
            }
            pushFollow(FOLLOW_expression_in_assignStatement176);
            expression13=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression13.getTree());
            char_literal14=(Token)match(input,22,FOLLOW_22_in_assignStatement178); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:44:1: ifStatement : IF expression 'then' block ( 'else' block )? 'end' 'if' ';' ;
    public final BlangParser.ifStatement_return ifStatement() throws RecognitionException {
        BlangParser.ifStatement_return retval = new BlangParser.ifStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IF15=null;
        Token string_literal17=null;
        Token string_literal19=null;
        Token string_literal21=null;
        Token string_literal22=null;
        Token char_literal23=null;
        BlangParser.expression_return expression16 = null;

        BlangParser.block_return block18 = null;

        BlangParser.block_return block20 = null;


        CommonTree IF15_tree=null;
        CommonTree string_literal17_tree=null;
        CommonTree string_literal19_tree=null;
        CommonTree string_literal21_tree=null;
        CommonTree string_literal22_tree=null;
        CommonTree char_literal23_tree=null;

        try {
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:45:3: ( IF expression 'then' block ( 'else' block )? 'end' 'if' ';' )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:45:5: IF expression 'then' block ( 'else' block )? 'end' 'if' ';'
            {
            root_0 = (CommonTree)adaptor.nil();

            IF15=(Token)match(input,IF,FOLLOW_IF_in_ifStatement194); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IF15_tree = (CommonTree)adaptor.create(IF15);
            root_0 = (CommonTree)adaptor.becomeRoot(IF15_tree, root_0);
            }
            pushFollow(FOLLOW_expression_in_ifStatement197);
            expression16=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression16.getTree());
            string_literal17=(Token)match(input,23,FOLLOW_23_in_ifStatement199); if (state.failed) return retval;
            pushFollow(FOLLOW_block_in_ifStatement208);
            block18=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block18.getTree());
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:47:5: ( 'else' block )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==24) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:47:6: 'else' block
                    {
                    string_literal19=(Token)match(input,24,FOLLOW_24_in_ifStatement215); if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_ifStatement224);
                    block20=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block20.getTree());

                    }
                    break;

            }

            string_literal21=(Token)match(input,25,FOLLOW_25_in_ifStatement232); if (state.failed) return retval;
            string_literal22=(Token)match(input,IF,FOLLOW_IF_in_ifStatement235); if (state.failed) return retval;
            char_literal23=(Token)match(input,22,FOLLOW_22_in_ifStatement238); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:52:1: whileStatement : WHILE expression 'do' block 'end' 'while' ';' ;
    public final BlangParser.whileStatement_return whileStatement() throws RecognitionException {
        BlangParser.whileStatement_return retval = new BlangParser.whileStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WHILE24=null;
        Token string_literal26=null;
        Token string_literal28=null;
        Token string_literal29=null;
        Token char_literal30=null;
        BlangParser.expression_return expression25 = null;

        BlangParser.block_return block27 = null;


        CommonTree WHILE24_tree=null;
        CommonTree string_literal26_tree=null;
        CommonTree string_literal28_tree=null;
        CommonTree string_literal29_tree=null;
        CommonTree char_literal30_tree=null;

        try {
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:53:3: ( WHILE expression 'do' block 'end' 'while' ';' )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:53:5: WHILE expression 'do' block 'end' 'while' ';'
            {
            root_0 = (CommonTree)adaptor.nil();

            WHILE24=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStatement254); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WHILE24_tree = (CommonTree)adaptor.create(WHILE24);
            root_0 = (CommonTree)adaptor.becomeRoot(WHILE24_tree, root_0);
            }
            pushFollow(FOLLOW_expression_in_whileStatement257);
            expression25=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression25.getTree());
            string_literal26=(Token)match(input,26,FOLLOW_26_in_whileStatement259); if (state.failed) return retval;
            pushFollow(FOLLOW_block_in_whileStatement268);
            block27=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block27.getTree());
            string_literal28=(Token)match(input,25,FOLLOW_25_in_whileStatement274); if (state.failed) return retval;
            string_literal29=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStatement277); if (state.failed) return retval;
            char_literal30=(Token)match(input,22,FOLLOW_22_in_whileStatement280); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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

    public static class block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:58:1: block : ( statement )* -> ^( BLOCK ( statement )* ) ;
    public final BlangParser.block_return block() throws RecognitionException {
        BlangParser.block_return retval = new BlangParser.block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BlangParser.statement_return statement31 = null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:59:3: ( ( statement )* -> ^( BLOCK ( statement )* ) )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:59:5: ( statement )*
            {
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:59:5: ( statement )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==IDENT||(LA4_0>=IF && LA4_0<=WHILE)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block296);
            	    statement31=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement31.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);



            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 59:16: -> ^( BLOCK ( statement )* )
            {
                // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:59:19: ^( BLOCK ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:59:27: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "block"

    public static class term_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:64:1: term : ( IDENT | '(' expression ')' | INTEGER );
    public final BlangParser.term_return term() throws RecognitionException {
        BlangParser.term_return retval = new BlangParser.term_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT32=null;
        Token char_literal33=null;
        Token char_literal35=null;
        Token INTEGER36=null;
        BlangParser.expression_return expression34 = null;


        CommonTree IDENT32_tree=null;
        CommonTree char_literal33_tree=null;
        CommonTree char_literal35_tree=null;
        CommonTree INTEGER36_tree=null;

        try {
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:65:3: ( IDENT | '(' expression ')' | INTEGER )
            int alt5=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt5=1;
                }
                break;
            case 27:
                {
                alt5=2;
                }
                break;
            case INTEGER:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:65:5: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT32=(Token)match(input,IDENT,FOLLOW_IDENT_in_term325); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT32_tree = (CommonTree)adaptor.create(IDENT32);
                    adaptor.addChild(root_0, IDENT32_tree);
                    }

                    }
                    break;
                case 2 :
                    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:66:5: '(' expression ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal33=(Token)match(input,27,FOLLOW_27_in_term331); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal33_tree = (CommonTree)adaptor.create(char_literal33);
                    adaptor.addChild(root_0, char_literal33_tree);
                    }
                    pushFollow(FOLLOW_expression_in_term333);
                    expression34=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression34.getTree());
                    char_literal35=(Token)match(input,28,FOLLOW_28_in_term335); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal35_tree = (CommonTree)adaptor.create(char_literal35);
                    adaptor.addChild(root_0, char_literal35_tree);
                    }

                    }
                    break;
                case 3 :
                    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:67:5: INTEGER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INTEGER36=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_term341); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTEGER36_tree = (CommonTree)adaptor.create(INTEGER36);
                    adaptor.addChild(root_0, INTEGER36_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:70:1: unary : ( '+' | negation )* term ;
    public final BlangParser.unary_return unary() throws RecognitionException {
        BlangParser.unary_return retval = new BlangParser.unary_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal37=null;
        BlangParser.negation_return negation38 = null;

        BlangParser.term_return term39 = null;


        CommonTree char_literal37_tree=null;

        try {
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:71:3: ( ( '+' | negation )* term )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:71:5: ( '+' | negation )* term
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:71:5: ( '+' | negation )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==PLUS) ) {
                    alt6=1;
                }
                else if ( (LA6_0==MINUS) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:71:6: '+'
            	    {
            	    char_literal37=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary357); if (state.failed) return retval;

            	    }
            	    break;
            	case 2 :
            	    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:71:13: negation
            	    {
            	    pushFollow(FOLLOW_negation_in_unary362);
            	    negation38=negation();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(negation38.getTree(), root_0);

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            pushFollow(FOLLOW_term_in_unary367);
            term39=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term39.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:74:1: mult : unary ( ( MULT | DIV | MOD ) unary )* ;
    public final BlangParser.mult_return mult() throws RecognitionException {
        BlangParser.mult_return retval = new BlangParser.mult_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MULT41=null;
        Token DIV42=null;
        Token MOD43=null;
        BlangParser.unary_return unary40 = null;

        BlangParser.unary_return unary44 = null;


        CommonTree MULT41_tree=null;
        CommonTree DIV42_tree=null;
        CommonTree MOD43_tree=null;

        try {
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:75:3: ( unary ( ( MULT | DIV | MOD ) unary )* )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:75:5: unary ( ( MULT | DIV | MOD ) unary )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_unary_in_mult380);
            unary40=unary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary40.getTree());
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:75:11: ( ( MULT | DIV | MOD ) unary )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=MULT && LA8_0<=MOD)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:75:12: ( MULT | DIV | MOD ) unary
            	    {
            	    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:75:12: ( MULT | DIV | MOD )
            	    int alt7=3;
            	    switch ( input.LA(1) ) {
            	    case MULT:
            	        {
            	        alt7=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt7=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt7=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt7) {
            	        case 1 :
            	            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:75:13: MULT
            	            {
            	            MULT41=(Token)match(input,MULT,FOLLOW_MULT_in_mult384); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MULT41_tree = (CommonTree)adaptor.create(MULT41);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MULT41_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:75:21: DIV
            	            {
            	            DIV42=(Token)match(input,DIV,FOLLOW_DIV_in_mult389); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            DIV42_tree = (CommonTree)adaptor.create(DIV42);
            	            root_0 = (CommonTree)adaptor.becomeRoot(DIV42_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:75:28: MOD
            	            {
            	            MOD43=(Token)match(input,MOD,FOLLOW_MOD_in_mult394); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MOD43_tree = (CommonTree)adaptor.create(MOD43);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MOD43_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_unary_in_mult398);
            	    unary44=unary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary44.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:78:1: expression : mult ( ( PLUS | MINUS ) mult )* ;
    public final BlangParser.expression_return expression() throws RecognitionException {
        BlangParser.expression_return retval = new BlangParser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLUS46=null;
        Token MINUS47=null;
        BlangParser.mult_return mult45 = null;

        BlangParser.mult_return mult48 = null;


        CommonTree PLUS46_tree=null;
        CommonTree MINUS47_tree=null;

        try {
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:79:3: ( mult ( ( PLUS | MINUS ) mult )* )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:79:5: mult ( ( PLUS | MINUS ) mult )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_mult_in_expression415);
            mult45=mult();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mult45.getTree());
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:79:10: ( ( PLUS | MINUS ) mult )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=PLUS && LA10_0<=MINUS)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:79:11: ( PLUS | MINUS ) mult
            	    {
            	    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:79:11: ( PLUS | MINUS )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==PLUS) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==MINUS) ) {
            	        alt9=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:79:12: PLUS
            	            {
            	            PLUS46=(Token)match(input,PLUS,FOLLOW_PLUS_in_expression419); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS46_tree = (CommonTree)adaptor.create(PLUS46);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUS46_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:79:20: MINUS
            	            {
            	            MINUS47=(Token)match(input,MINUS,FOLLOW_MINUS_in_expression424); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUS47_tree = (CommonTree)adaptor.create(MINUS47);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUS47_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_mult_in_expression428);
            	    mult48=mult();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mult48.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:82:1: negation : '-' -> NEGATION ;
    public final BlangParser.negation_return negation() throws RecognitionException {
        BlangParser.negation_return retval = new BlangParser.negation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal49=null;

        CommonTree char_literal49_tree=null;
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");

        try {
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:83:3: ( '-' -> NEGATION )
            // /home/blazej/development/eclipse/Blang/src/info/blazey/wmp/mrjp/blang/Blang.g:83:5: '-'
            {
            char_literal49=(Token)match(input,MINUS,FOLLOW_MINUS_in_negation445); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MINUS.add(char_literal49);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 83:9: -> NEGATION
            {
                adaptor.addChild(root_0, (CommonTree)adaptor.create(NEGATION, "NEGATION"));

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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


 

    public static final BitSet FOLLOW_19_in_program83 = new BitSet(new long[]{0x0000000000200340L});
    public static final BitSet FOLLOW_statement_in_program92 = new BitSet(new long[]{0x0000000000200340L});
    public static final BitSet FOLLOW_returnStatement_in_program101 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_program107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_returnStatement123 = new BitSet(new long[]{0x000000000800C440L});
    public static final BitSet FOLLOW_expression_in_returnStatement126 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_returnStatement128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignStatement_in_statement144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_assignStatement171 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ASSIGN_in_assignStatement173 = new BitSet(new long[]{0x000000000800C440L});
    public static final BitSet FOLLOW_expression_in_assignStatement176 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_assignStatement178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement194 = new BitSet(new long[]{0x000000000800C440L});
    public static final BitSet FOLLOW_expression_in_ifStatement197 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ifStatement199 = new BitSet(new long[]{0x0000000003000340L});
    public static final BitSet FOLLOW_block_in_ifStatement208 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_ifStatement215 = new BitSet(new long[]{0x0000000002000340L});
    public static final BitSet FOLLOW_block_in_ifStatement224 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ifStatement232 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_IF_in_ifStatement235 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ifStatement238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement254 = new BitSet(new long[]{0x000000000800C440L});
    public static final BitSet FOLLOW_expression_in_whileStatement257 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_whileStatement259 = new BitSet(new long[]{0x0000000002000340L});
    public static final BitSet FOLLOW_block_in_whileStatement268 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_whileStatement274 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement277 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_whileStatement280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_block296 = new BitSet(new long[]{0x0000000000000342L});
    public static final BitSet FOLLOW_IDENT_in_term325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_term331 = new BitSet(new long[]{0x000000000800C440L});
    public static final BitSet FOLLOW_expression_in_term333 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_term335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_term341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unary357 = new BitSet(new long[]{0x000000000800C440L});
    public static final BitSet FOLLOW_negation_in_unary362 = new BitSet(new long[]{0x000000000800C440L});
    public static final BitSet FOLLOW_term_in_unary367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_mult380 = new BitSet(new long[]{0x0000000000003802L});
    public static final BitSet FOLLOW_MULT_in_mult384 = new BitSet(new long[]{0x000000000800C440L});
    public static final BitSet FOLLOW_DIV_in_mult389 = new BitSet(new long[]{0x000000000800C440L});
    public static final BitSet FOLLOW_MOD_in_mult394 = new BitSet(new long[]{0x000000000800C440L});
    public static final BitSet FOLLOW_unary_in_mult398 = new BitSet(new long[]{0x0000000000003802L});
    public static final BitSet FOLLOW_mult_in_expression415 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_PLUS_in_expression419 = new BitSet(new long[]{0x000000000800C440L});
    public static final BitSet FOLLOW_MINUS_in_expression424 = new BitSet(new long[]{0x000000000800C440L});
    public static final BitSet FOLLOW_mult_in_expression428 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_MINUS_in_negation445 = new BitSet(new long[]{0x0000000000000002L});

}