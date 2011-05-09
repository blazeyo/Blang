package info.blazey.wmp.mrjp.blang.evaluators;

public class NegationEvaluator implements Evaluator {

	private Evaluator op;
	
	@Override
	public int evaluate() {
		return -op.evaluate();
	}

	public NegationEvaluator(Evaluator op) {
		this.op = op;
	}

}
