package structuralPatternBridge;

import static org.junit.Assert.*;

import org.junit.Test;

public class BigDogTest {
	
	@Test
	public void test() {
		BigDog b=new BigDog();
		assertEquals("Feeding a big dog, 3 times a day with 500 g of Meat",b.feed(3, 500, "Meat"));
	}

}
