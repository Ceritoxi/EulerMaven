package com.ceritoxi;


public class Math {
	
	public static boolean isDividableByXorY(int dividend, int x, int y) {
		if ((x != 0 && dividend % x == 0) || (y != 0 && dividend % y == 0)) {
			return true;
		}
		return false;
	}
	
	public static int sumOfNumbersUnderZThatAreDividableByXorY (int x, int y, int z) {
		int sum = 0;
		
		if (z < 1) {
			return sum;
		}
		for (int i = 1; i < z; i++) {
			if (isDividableByXorY(i, x, y)) {
				sum += i;
			}
		}
		return sum;
	}
	
	public static boolean isEven (int number) {
		if (number % 2 == 0) {
			return true;
		}
		return false;
	}
	
	public static int sumOfEvenFibonacciTermsUnderX (int x) {
		
		int result = 0;
		int sum = 0;
		int firstTerm = 0;
		int secondTerm = 1;

		while (sum < x) {
			if (isEven(sum)) {
				result += sum;
			}
			sum = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = sum;
		}
		return result;
	}
	
	public static boolean isPrime (long number) {
		
		if (number == 2 || number == 3 || number == 5) {
			return true;
		}
		if (number <= 1 || number % 2 == 0 || number % 3 == 0 || number % 5 == 0) {
			return false;
		}
		
		for (long i = 3; i <= java.lang.Math.sqrt(number); i += 2) {
			if (number % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static long largestPrimeFactorOfX (long x) {
		long largest = 0;
		for (long i = 1; i <= x; i++) {
			if (isPrime(i) && x % i == 0) {
				if (i > largest) {
					largest = i;
				}
				x /= i;
				i = 1;
			}
		}
		return largest;
	}
	
	public static boolean isPalindrome (int number) {
		String stringNumber = String.valueOf(number);
		if (number > 0) {
			for (int i = 0; i < stringNumber.length() / 2; i++) {
				if (stringNumber.charAt(i) != stringNumber.charAt(stringNumber.length() - (1 + i))) {
					return false;
				}
			}
		} else {
			for (int i = 0; i < (stringNumber.length() / 2) - 1; i++) {
				if (stringNumber.charAt(i + 1) != stringNumber.charAt(stringNumber.length() - (1 + i))) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static int largestPalindromeMadeFromTwoXDigitNumberThatAreLesserThenSix (int x) {
		if (x < 1 || x > 5) {
			return 0;
		}
		int largest = 0;
		int counter = 0;
		
		for (int i = positiveIntegerPower(10, x - 1); i < positiveIntegerPower(10, x) - 1; i++) {
			for (int j = positiveIntegerPower(10, x - 1) + counter; j <= positiveIntegerPower(10, x) - 1; j++) {
				if (isPalindrome(i * j) && i * j > largest) {
					largest = i * j;
				}
			}
			counter++;
		}
		return largest;
	}
	
	public static int positiveIntegerPower (int base, int exponent) {
		if (exponent == 0) {
			return 1;
		}
		int ogBase = base;
		for (int i = 1; i < exponent; i++) {
			base *= ogBase;
		}
		return base;
	}
}