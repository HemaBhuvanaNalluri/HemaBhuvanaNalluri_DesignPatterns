package BehavioralPatternInterpreter;
import static org.junit.Assert.*;


import org.junit.Test;

public class MainTest {
	private InterpreterEngine engine;
	
	@Test
	public void testInterpret() {
		Main m=new Main(engine);
		/*assertEquals(20,m.interpret("add 5 and 15"));*/
	}
}
