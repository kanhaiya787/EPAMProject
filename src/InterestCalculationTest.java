import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InterestCalculationTest {

	
		@Test
		void testSimpleIntrest() {
			InterestCalculation simpleIntrest;
			simpleIntrest = new InterestCalculation(10000, 10, 1);
			assertEquals(1000, simpleIntrest.calcSimpleIntrest());
			simpleIntrest = new InterestCalculation(12000, 12.5f, 2);
			assertEquals(3000, simpleIntrest.calcSimpleIntrest());
		}
		
		@Test
		void testCompoundIntrest() {
			InterestCalculation compoundIntrest;
			compoundIntrest = new InterestCalculation(1000, 5, 1);
			assertEquals(1049.9999523162842, compoundIntrest.calcCompoundIntrest());
			compoundIntrest = new InterestCalculation(20202, 2.5f, 5);
			assertEquals(22856.7060585414, compoundIntrest.calcCompoundIntrest());
		}
	}


