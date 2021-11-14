package OperationOnMath;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class MathUtilsTest {


	@Test
	public void testadd() {
		System.out.println("this test ran");
		MathUtils mathUtils = new MathUtils();
		int expected = 2;
		int actual = mathUtils.add(1, 1);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testdivide() {
		MathUtils mathUtils = new MathUtils();
		assertThrows(ArithmeticException.class, () -> mathUtils.divide(1,0));
	}
	
	@Test
	public void testfindCircleArea() {
		MathUtils mathUtils = new MathUtils();
		assertEquals(314,mathUtils.findCircleArea(10));
	}

}
