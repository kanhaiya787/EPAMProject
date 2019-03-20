import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArithmeticCalculatorTest {

	@Test
	public void testAddition() {
		ArithmeticCalculator c = new ArithmeticCalculator();
		assertEquals(10, c.Addition(2,8));
		assertEquals(-6, c.Addition(2,-8));
		assertEquals(1, c.Addition(2,-1));
	}
	
	@Test
	public void testMultiplication() {
		ArithmeticCalculator c = new ArithmeticCalculator();
		assertEquals(6, c.Multiplication(2,3));
		assertEquals(-10, c.Multiplication(2,-5));
		assertEquals(-12, c.Multiplication(-4,3));
		
	}
	
	@Test
	public void testDivision() {
		ArithmeticCalculator c = new ArithmeticCalculator();
		assertEquals(1.5, c.Division(3,2));
		assertEquals(8, c.Division(16,2));
		assertEquals(-7.5, c.Division(-15,2));
		assertEquals(1.5, c.Division(-3,-2));
		Assertions.assertThrows(ArithmeticException.class, () -> c.Division(5, 0));
	}
	

}
