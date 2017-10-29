package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataNumbersToWordsTest {
	
	private KataNumbersToWords converter;
	
	@Before
	public void setup() {
		converter = new KataNumbersToWords();
	}
	@Test
	public void number_zero_returns_word_zero() {		
		String result = converter.numberToWords(0);
		
		Assert.assertEquals("zero", result);
	}
	@Test
	public void number_one_returns_word_one() {		
		String result = converter.numberToWords(1);
		
		Assert.assertEquals("Result should be spelled one","one", result);
	
	}	
	@Test
	public void number_two_returns_word_two() {		
		String result = converter.numberToWords(2);
		
		Assert.assertEquals("Result should be spelled two","two", result);
	}
	@Test
	public void number_twelve_returns_word_twelve() {		
		String result = converter.numberToWords(12);
		
		Assert.assertEquals("Result should be spelled twelve","twelve", result);
	}
	@Test
	public void number_22_returns_word_twentytwo() {		
		String result = converter.numberToWords(22);
		
		Assert.assertEquals("Result should be spelled twentytwo","twenty-two", result);
	
	}
	@Test
	public void number_157_returns_word_hundred_and_fiftyseven() {		
		String result = converter.numberToWords(109);
		
		Assert.assertEquals("Result should be spelled one hundred and fifty seven","one hundred nine", result);
	
	}
	
	@Test
	public void number_4076_returns_word_hundred_and_fiftyseven() {		
		String result = converter.numberToWords(4876);
		
		Assert.assertEquals("Result should be spelled four thousand eight hundred seventy six","four thousand eight hundred seventy-six", result);
	
	}
	
	@Test
	public void number_23486_returns_correctly() {		
		String result = converter.numberToWords(23486);
		
		Assert.assertEquals("Result should be spelled twenty-three thousand four hundred eighty-six","twenty-three thousand four hundred eighty-six", result);
	
	}
	
	@Test
	public void number_937273_returns_correctlyn() {		
		String result = converter.numberToWords(937273);
		
		Assert.assertEquals("Result should be spelled nine hundred thirty-seven thousand two hundred seventy-three","nine hundred thirty-seven thousand two hundred seventy-three", result);
	
	}
}
