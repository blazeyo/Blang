package info.blazey.wmp.mrjp.blang.evaluators;

public class IntEvaluator implements Evaluator {

	private int value;
	
	@Override
	public int evaluate() {
		return value;
	}

	public IntEvaluator(int value) {
		this.value = value;
	}

}
