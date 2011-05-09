package info.blazey.wmp.mrjp.blang;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.RecognitionException;

public class BlangInterpreter {

	public static void main(String[] args) throws RecognitionException {
//		CharStream stream = new ANTLRStringStream("program var x; body return 2 + 3; endbody endprogram");
		CharStream stream = new ANTLRStringStream("program x:= 2; return x + x * -x + 1; endprogram");
		
		int result = BlangProgramEvaluator.evaluate(stream);
		
		System.out.println("The result is: " + result);
	}
	
}
