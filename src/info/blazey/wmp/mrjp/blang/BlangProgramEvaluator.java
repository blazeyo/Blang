package info.blazey.wmp.mrjp.blang;

import info.blazey.wmp.mrjp.blang.BlangParser.program_return;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.TreeAdaptor;

public class BlangProgramEvaluator {
	
	private static final TreeAdaptor adaptor = new CommonTreeAdaptor() {
		public Object create(Token payload) {
			return new CommonTree(payload);
		}
	};
	
	public static int evaluate(CharStream stream) throws RecognitionException {
		BlangLexer lexer = new BlangLexer(stream);
		TokenRewriteStream tokens = new TokenRewriteStream(lexer);
		BlangParser parser = new BlangParser(tokens);
		
		parser.setTreeAdaptor(adaptor);
		program_return program = parser.program();
		CommonTree tree = (CommonTree) program.getTree();
		System.out.println(tree.toStringTree());
		
		CommonTreeNodeStream NodeStream = new CommonTreeNodeStream(tree);
		BlangEvaluatorWalker walker = new BlangEvaluatorWalker(NodeStream);
		
		int result = walker.evaluator();
		
		return result;
	}
	
}
