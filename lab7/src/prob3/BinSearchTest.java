package prob3;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinSearchTest {

	@Test
	public void testTrue() {
		
		String source = "aabcdeghklllmnoortvxxxyz";
		char c = 'c';
		
		assertTrue(BinSearch.search(source, c));
	}
	
	@Test
	public void testFalse() {
		
		String source = "aabcdeghklllmnoortvxxxyz";
		char c = 'f';
		
		assertFalse(BinSearch.search(source, c));
	}

}
