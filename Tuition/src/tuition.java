import static org.junit.Assert.*;

import org.junit.Test;

public class tuition {

	@Test
	public void tuitioncosttest() {
		double result = Main.tuitioncost(10, 10);
		assertEquals(92.82, result, .0001);
	}
	@Test
	public void amountowedtest() {
		double result = Main.amountowed(10, 10, 3, 3);
		assertEquals(286.81, result, .01);
	}
	@Test 
	public void monthlytest() {
		double result = Main.monthly(10, 10, 3, 3);
		assertEquals(7.97, result, .01);
	}

}
