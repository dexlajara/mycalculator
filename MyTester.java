import static org.junit.Assert.*;

import org.junit.Test;


public class MyTester {
	
	//Test cases for NFactorial function
	
	//factorial of n where n > 1
	@Test
	public void testNfactorial() {
		MyCalculator calc = new MyCalculator();
		int actual = calc.nfactorial(4);
		
		assertEquals("Factorial of 4 = 24", 24, actual, 0.0);
	}
	
	//factorial of n where n == 0
	@Test
	public void testNfactorial2() {
		MyCalculator calc = new MyCalculator();
		int actual = calc.nfactorial(0);
		
		assertEquals("Factorial of 0 = 1", 1, actual, 0.0);
	}
	
	//factorial of n where n < 0
	@Test
	public void testNfactorial3() {
		MyCalculator calc = new MyCalculator();
		int actual = calc.nfactorial(-3);
		
		assertEquals("Factorial of -3 = Invalid/-1", -1, actual, 0.0);
	}
	
	
	//Test cases for binary search function
	//searching a value in the middle
	@Test
	public void testBinarySearch() {
		MyCalculator calc = new MyCalculator();
		int[] array = {1, 2, 3, 4, 5, 6};
		int actual = calc.binarySearch(array, 3);
		
		assertEquals("Position of 3 = [2]", 2, actual, 0.0);
	}
	
	//searching a value in the 0th index
	@Test
	public void testBinarySearch2() {
		MyCalculator calc = new MyCalculator();
		int[] array = {1, 2, 3, 4, 5, 6};
		int actual = calc.binarySearch(array, 1);
		
		assertEquals("Position of 1 = [0]", 0, actual, 0.0);
	}
	
	//searching a value in the last index
	@Test
	public void testBinarySearch3() {
		MyCalculator calc = new MyCalculator();
		int[] array = {1, 2, 3, 4, 5, 6};
		int actual = calc.binarySearch(array, 6);
		
		assertEquals("Position of 6 = [5]", 5, actual, 0.0);
	}
	
	//searching a value not in the array
	@Test
	public void testBinarySearch4() {
		MyCalculator calc = new MyCalculator();
		int[] array = {1, 2, 3, 4, 5, 6};
		int actual = calc.binarySearch(array, 0);
		
		assertEquals("Position of 0 = Not found/-1", -1, actual, 0.0);
	}

}
