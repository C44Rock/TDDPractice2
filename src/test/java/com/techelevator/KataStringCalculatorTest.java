package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataStringCalculatorTest {
	
	private KataStringCalculator calc;
	
	@Before
	public void setup() {
		calc = new KataStringCalculator();
	}
	
	
	@Test
	public void string0WillReturn0() {
		int result = calc.add("");
		Assert.assertEquals("empty string should return 0", 0, result);
	}
	
	@Test
	public void string1WillReturn1() {
		int result = calc.add("1");
		Assert.assertEquals("1 should return 1", 1, result);
	}
	
	@Test
	public void string1Comma2WillReturn3() {
		int result = calc.add("1,2");
		Assert.assertEquals("1, 2 should return 3", 3, result);
	}
	
	@Test
	public void string1Comma5Comma7WillReturn13() {
		int result = calc.add("1,5,7");
		Assert.assertEquals("1,5,7 should return 13", 13, result);
	}
	

	@Test
	public void string1Comma5Comma7WillReturn29() {
		int result = calc.add("1,5,7,8,3,4,1");
		Assert.assertEquals("1,5,7,8,3,4,1 should return 29", 29, result);
	}
	
	@Test
	public void string12Comma3WillReturn15() {
		int result = calc.add("12,3");
		Assert.assertEquals("12,3 should return 15", 15, result);
	}

	@Test
	public void stringReturns6() {
		int result = calc.add("1\n2,3");
		Assert.assertEquals("1\n2,3 should return 6", 6, result);
	}
	
	@Test
	public void stringReturns14() {
		int result = calc.add("3\n5\n2,4");
		Assert.assertEquals("3\\n5\\n2,4 should return 14", 14, result);
	}
	
	@Test
	public void stringReturns3() {
		int result = calc.add("//;\n1;2");
		Assert.assertEquals("//;\\n1;2 should return 3", 3, result);
	}
}
