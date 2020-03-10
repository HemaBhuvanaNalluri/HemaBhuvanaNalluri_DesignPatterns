package structuralPatternBridge;

import static org.junit.Assert.*;

import org.junit.Test;

public class SmallDogTest {
	
	@Test
	public void testFeed() {
		SmallDog s=new SmallDog();
		assertEquals("Feeding a big dog, 2 times a day with 250 g of Granules",s.feed(2, 250, "Granules"));
	}

}
