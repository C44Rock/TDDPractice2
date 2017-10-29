package com.techelevator;

public class KataStringCalculator {

	public int add(String numbers) {
		
		int count = 0;
		
		String[] str = numbers.split("[^\\d]+");

		if (numbers == "") {
			return 0;
		} else {
			for(int i = 0; i < str.length; i++) {
				count += Integer.parseInt(str[i]);
			}
		}
		
		return count;
	}
}
