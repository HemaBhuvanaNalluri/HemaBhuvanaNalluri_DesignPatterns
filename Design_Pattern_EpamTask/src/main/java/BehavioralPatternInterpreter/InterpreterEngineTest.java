package BehavioralPatternInterpreter;

import static org.junit.Assert.*;

import org.junit.Test;

public class InterpreterEngineTest {

	@Test
	public void testAdd() {
		InterpreterEngine i=new InterpreterEngine();
		assertEquals(40,i.add("add 15 and 25"));
	}
	@Test
	public void testMul() {
		InterpreterEngine i=new InterpreterEngine();
		assertEquals(25,i.multiply("multiply 5 and 5"));
	}

}
