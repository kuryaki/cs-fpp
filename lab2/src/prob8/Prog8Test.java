package prob8;

import static org.junit.Assert.*;

import org.junit.Test;

public class Prog8Test {
	
	int[] testData = { 2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};

	@Test
	public void testMin() {
		int min = Prog8.min(testData);
		
		assertTrue(min == -22);
	}

}
