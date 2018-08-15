import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testPrimeLabTest {

	@Test
	void test1() {
		//arrange
	
		//act
		int result = PrimeLabApp.getNthPrime(1);
		
		//assert
		assertEquals(2, result);
	}
	
	@Test
	void test2() {
		//arrange
	
		//act
		int result = PrimeLabApp.getNthPrime(2);
		
		//assert
		assertEquals(3, result);
	}
	
	@Test
	void test3() {
		//arrange
	
		//act
		int result = PrimeLabApp.getNthPrime(3);
		
		//assert
		assertEquals(5, result);
	}
	
	@Test
	void test4() {
		//arrange
	
		//act
		int result = PrimeLabApp.getNthPrime(4);
		
		//assert
		assertEquals(7, result);
	}
	
	@Test
	void testPrime1() {
		//arrange
	
		//act
		boolean result = PrimeLabApp.getPrime(2);
		
		//assert
		assertEquals(true, result);
	}

}
