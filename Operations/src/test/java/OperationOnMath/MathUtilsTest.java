package OperationOnMath;

import static org.junit.Assert.*;

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
	public void testfindCircleArea() {
		MathUtils mathUtils = new MathUtils();
		assertEquals(314,mathUtils.findCircleArea(10));
	}

}
