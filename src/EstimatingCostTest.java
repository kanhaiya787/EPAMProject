import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**
 * 
 * @author Kanhaiya787
 *
 */
class EstimatingCostTest {

	@Test
	void test() {
	EstimatingCost ce;
	ce = new EstimatingCost(0, 100, false);
	assertEquals(120000, ce.findCost());
	ce = new EstimatingCost(0, 250.562585, false);
	assertEquals(300675.102, ce.findCost());
	ce = new EstimatingCost(2, 4, true);
	assertEquals(10000, ce.findCost());
	ce = new EstimatingCost(2, 6, false);
	assertEquals(10800, ce.findCost());

}
}
