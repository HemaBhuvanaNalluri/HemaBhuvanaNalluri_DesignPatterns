package BehavioralPatternInterpreter;

import static org.junit.Assert.*;
import org.junit.Test;

public class MultiplyExpressionTest {
	private InterpreterEngine engine;
	@Test
	public void testMultiplyExpression() {
		MultiplyExpression m=new MultiplyExpression("multiply 5 and 5");
	}

	/*est
	public void testInterpret() {
		MultiplyExpression m=new MultiplyExpression("multiply 5 and 5");
		assertEquals(2,m.interpret(engine),2);
		
	}*/

}
