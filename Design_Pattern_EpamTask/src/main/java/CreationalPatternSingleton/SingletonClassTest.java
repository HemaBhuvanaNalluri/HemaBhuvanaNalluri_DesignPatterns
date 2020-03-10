package CreationalPatternSingleton;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingletonClassTest {

	@Test
	public void testShowMessage() {
		SingletonClass s=new SingletonClass();
		assertEquals("I'm a singleton object!",s.showMessage());
		
	}
	
}
