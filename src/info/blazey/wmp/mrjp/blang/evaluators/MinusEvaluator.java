package info.blazey.wmp.mrjp.blang.evaluators;

public class MinusEvaluator implements Evaluator {

	private Evaluator op1;
	private Evaluator op2;
	
	@Override
	public int evaluate() {
		return op1.evaluate() - op2.evaluate();
	}

	public MinusEvaluator(Evaluator op1, Evaluator op2) {
		this.op1 = op1;
		this.op2 = op2;
	}

}
