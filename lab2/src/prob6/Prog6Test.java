package prob6;

import static org.junit.Assert.*;

import org.junit.Test;

public class Prog6Test {

	String[] testData = {"palo", "palo", "bonito", "palo", "e"};

	@Test
	public void testRemoveDups() {
		String[] result = Prog6.removeDups(testData);
		
		assertTrue(result.length == 3);
	}

}
