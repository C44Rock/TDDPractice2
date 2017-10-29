package com.techelevator;

public class KataNumbersToWords {
	
	public String numberToWords(int number) {
		String[] units = new String[] { "zero", "one", "two", "three", "four", "five","six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
		String[] tens = new String[] { "zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

		
		if (number == 0)
		    return "zero";

		String words = "";

		if ((number / 1000) > 0)
		{
		    words += numberToWords(number / 1000) + " thousand ";
		    number %= 1000;
		}

		if ((number / 100) > 0)
		{
		    words += numberToWords(number / 100) + " hundred ";
		    number %= 100;
		}

		if (number > 0)
		{
		    if (number < 20)
		        words += units[number];
		    else
		    {
		        words += tens[number / 10];
		        if ((number % 10) > 0)
		            words += "-" + units[number % 10];
		    }
		}

		return words;
	}
		/*String str = Integer.toString(number);
		
		if (number < 10) {
			return singleDigit(number);
		} else if(number > 9 && number < 20){
			return tenToNineteen(number);
			
		} else if (number < 100){
			return doubleDigits(number) + singleDigit(Integer.parseInt(str.substring(1)));
			
		} else if (number < 110) {
			return singleDigit(Integer.parseInt(str.substring(0,1))) + " " + hundred + " " + singleDigit(Integer.parseInt(str.substring(1)));
			
		}
		else if (number < 120){
			return singleDigit(Integer.parseInt(str.substring(0,1))) + " " + hundred + " " + tenToNineteen(Integer.parseInt(str.substring(1)));
			
		} else if (number < 1000){
			return singleDigit(Integer.parseInt(str.substring(0,1))) + " " + hundred + " " + doubleDigits(Integer.parseInt(str.substring(1))) + " " + singleDigit(Integer.parseInt(str.substring(2)));
			
		} else if (number < 10000 && number % 1000 < 10) {
			return singleDigit(Integer.parseInt(str.substring(0,1))) + " " + thousand + " " + singleDigit(Integer.parseInt(str.substring(3)));
			
		} else if (number < 10000 && number % 1000 < 20 && number % 1000 > 9){
			return singleDigit(Integer.parseInt(str.substring(0,1))) + " " + thousand + " " + tenToNineteen(Integer.parseInt(str.substring(2)));
			
		} else if (number < 10000) {
			return singleDigit(Integer.parseInt(str.substring(0,1))) + " " + thousand + " " + singleDigit(Integer.parseInt(str.substring(1))) + hundred + " " + doubleDigits(Integer.parseInt(str.substring(2))) + " " + singleDigit(Integer.parseInt(str.substring(3)));
			
		} else {
			return "zero";
		}*/
		
	
	
	
	public String singleDigit(int number) {
		
		if(number == 0) {
			return "zero";
		} else if(number == 1) {
			return "one";
		} else if(number == 2) {
			return "two";
		} else if(number == 3) {
			return "three";
		} else if(number == 4) {
			return "four";
		} else if(number == 5) {
			return "five";
		} else if(number == 6) {
			return "six";
		} else if(number == 7) {
			return "seven";
		} else if(number == 8) {
			return "eight";
		} else {
			return "nine";
		} 
	
	}
	
public String tenToNineteen(int number) {
		
		if(number == 10) {
			return "ten";
		} else if(number == 11) {
			return "eleven";
		} else if(number == 12) {
			return "twelve";
		} else if(number == 13) {
			return "thirteen";
		} else if(number == 14) {
			return "rourteen";
		} else if(number == 15) {
			return "fifteen";
		} else if(number == 16) {
			return "sixteen";
		} else if(number == 17) {
			return "seventeen";
		} else if(number == 18) {
			return "eightteen";
		} else {
			return "nineteen";
		} 
	
	}

	public String doubleDigits(int number) {
		
		if(number < 30) {
			return "twenty";
		} else if(number > 29 && number < 40) {
			return "thirty";
		} else if(number > 39 && number < 50) {
			return "forty";
		} else if(number > 49 && number < 60) {
			return "fifty";
		} else if(number > 59 && number < 70) {
			return "sixty";
		} else if(number > 69 && number < 80) {
			return "seventy";
		} else if(number > 79 && number < 90) {
			return "eighty";
		} else  {
			return "ninety";
		}
	
	}
	
	
}
