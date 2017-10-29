package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class KataWordsBackToNumbersTest {
	
	KataWordsBackToNumbers wordsToNum;
	
	@Before
	public void setup() {
		wordsToNum = new KataWordsBackToNumbers();
	}
	
	@Test
	public void zeroShouldBe0() {
		int num = wordsToNum.conversion("zero");
		Assert.assertEquals("should be 0", 0, num);
	}
	
	@Test
	public void tenShouldBe10() {
		int num = wordsToNum.conversion("ten");
		Assert.assertEquals("should be 10", 10, num);

	}
	
	@Test
	public void nineteenShouldBe19() {
		int num = wordsToNum.conversion("nineteen");
		Assert.assertEquals("should be 19", 19, num);

	}
	
	@Test
	public void oneHundredFortyFourShouldBe144() {
		int num = wordsToNum.conversion("one hundred forty four");
		Assert.assertEquals("should be 144", 144, num);

	}
	
	@Test
	public void eighteenNinetySevenShouldBe1897() {
		int num = wordsToNum.conversion("one thousand eight hundred ninety seven");
		Assert.assertEquals("should be 1897", 1897, num);
	}
}
