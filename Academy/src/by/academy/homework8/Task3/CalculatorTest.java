package by.academy.homework8.Task3;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	private Calculator calculator;

	@Test
	public void testGetSum() throws Exception {
		assertEquals(15, calculator.getSum(7, 8));
	}

	@Test
	public void testGetDifference() throws Exception {
		assertEquals(4, calculator.getDifference(10, 6));
	}

	@Test
	public void testGetMultiple() throws Exception {
		assertEquals(12, calculator.getMultiple(3, 4));
	}

}