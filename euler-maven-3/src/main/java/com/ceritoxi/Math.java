package com.ceritoxi;


public class Math {
	
	public static boolean isDividableByXorY(int dividend, int numberX, int numberY) {
		if (numberX == 0 && numberY == 0) return false ;
		if (numberX != 0 && dividend % numberX == 0) return true;
		if (numberY != 0 && dividend % numberY == 0) return true;
	
		return false;
	}
	
	public static int sumOfNumbersUnderZThatAreDividableByXorY (int numberX, int numberY, int numberZ) {
		int sum = 0;
		
		if (numberZ < 1) return sum;
			
		for (int i = 1; i < numberZ; i++) {
			if (isDividableByXorY(i, numberX, numberY)) sum += i;
		}
		return sum;
	}
	
	public static boolean isEven (int number) {
		if (number % 2 == 0) return true;
		return false;
	}
	
	public static int sumOfEvenFibonacciTermsUnderX (int numberX) {
		
		int result = 0;
		int sum = 0;
		int firstTerm = 0;
		int secondTerm = 1;

		while (sum < numberX) {
			if (isEven(sum)) result += sum;
			sum = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = sum;
		}
		return result;
	}
	
	public static boolean isPrime (long number) {
		
		if (number == 2 || number == 3 || number == 5) return true;
		if (number <= 1 || number % 2 == 0 || number % 3 == 0 || number % 5 == 0) return false;
		
		for (long i = 3; i <= java.lang.Math.sqrt(number); i += 2) {
			if (number % i == 0) return false;
		}
		
		return true;
	}
	
	public static long largestPrimeFactorOfX (long numberX) {
		long largest = 0;
		for (long i = 1; i <= numberX; i++) {
			if (isPrime(i) && numberX % i == 0) {
				if (i > largest) largest = i;
				numberX /= i;
				i = 1;
			}
		}
		return largest;
	}
}