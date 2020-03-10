package BehavioralPatternInterpreter;

public class MultiplyExpression implements Expression {
	private String expression;
	
	public MultiplyExpression(String expression) {
		this.expression = expression;
	}
	public int interpret(InterpreterEngine engine) {
		return engine.multiply(expression);
	}

}
