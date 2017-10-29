package com.techelevator;


public class KataWordsBackToNumbers {
	
	public int conversion(String str) {
		String[] words = str.split(" ");
		
		int number = 0;
		int finalNumber = 0;
		
		for (String s : words) {
			if (s.equals("zero")) {
				number += 0;
			} else if (s.equals("one")) {
				number += 1;
			} else if (s.equals("two")) {
				number += 2;
			} else if (s.equals("three")) {
				number += 3;
			} else if (s.equals("four")) {
				number += 4;
			} else if (s.equals("five")) {
				number += 5;
			} else if (s.equals("six")) {
				number += 6;
			} else if (s.equals("seven")) {
				number += 7;
			} else if (s.equals("eight")) {
				number += 8;
			} else if (s.equals("nine")) {
				number += 9;
			} else if (s.equals("ten")) {
				number += 10;
			} else if (s.equals("eleven")) {
				number += 11;
			} else if (s.equals("twelve")) {
				number += 12;
			} else if (s.equals("thirteen")) {
				number += 13;
			} else if (s.equals("fourteen")) {
				number += 14;
			} else if (s.equals("fifteen")) {
				number += 15;
			} else if (s.equals("sixteen")) {
				number += 16;
			} else if (s.equals("seventeen")) {
				number += 17;
			} else if (s.equals("eighteen")) {
				number += 18;
			} else if (s.equals("nineteen")) {
				number += 19;
			} else if (s.equals("twenty")) {
				number += 20;
			} else if (s.equals("thirty")) {
				number += 30;
			} else if (s.equals("forty")) {
				number += 40;
			} else if (s.equals("fifty")) {
				number += 50;
			} else if (s.equals("sixty")) {
				number += 60;
			} else if (s.equals("seventy")) {
				number += 70;
			} else if (s.equals("eighty")) {
				number += 80;
			} else if (s.equals("ninety")) {
				number += 90;
			} else if (s.equals("hundred")) {
				number *= 100;
				finalNumber += number;
				number = 0;
			} else if (s.equals("thousand")) {
				number *= 1000;
				finalNumber += number;
				number = 0;
			}
			
		}
		
		finalNumber += number;
		number = 0;
		return finalNumber;
		
	}
}
