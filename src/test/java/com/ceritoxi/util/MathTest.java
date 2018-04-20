package com.ceritoxi.util;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MathTest extends TestCase {
    
    public MathTest( String testName ) {
        super( testName );
    }

    public static Test suite() {
        return new TestSuite( MathTest.class );
    }
	
	public void testMathIsDividableBy() {
		assertEquals(false, Math.isDividableBy(100, 0));
		assertEquals(false, Math.isDividableBy(100, 3));
		assertEquals(false, Math.isDividableBy(100, 7));
		assertEquals(true, Math.isDividableBy(100, 5));
		assertEquals(true, Math.isDividableBy(-100, 5));
		assertEquals(true, Math.isDividableBy(100, 1));
    }
	
	public void testMathSumOfNumbersUnderZThatAreDividableByXorY() {
		assertEquals(0, Math.sumOfNumbersUnderZThatAreDividableByXorY(0, 0,  100));
		assertEquals(45, Math.sumOfNumbersUnderZThatAreDividableByXorY(0, 1,  10));
		assertEquals(45, Math.sumOfNumbersUnderZThatAreDividableByXorY(1, 0,  10));
		assertEquals(0, Math.sumOfNumbersUnderZThatAreDividableByXorY(1, 0,  -10));
		assertEquals(0, Math.sumOfNumbersUnderZThatAreDividableByXorY(1, 0,  0));
    }
	
	public void testMathIsEven() {
		assertEquals(true, Math.isEven(-2));
		assertEquals(false, Math.isEven(-1));
		assertEquals(true, Math.isEven(0));
		assertEquals(false, Math.isEven(1));
		assertEquals(true, Math.isEven(2));
		assertEquals(true, Math.isEven(-2L));
		assertEquals(false, Math.isEven(-1L));
		assertEquals(true, Math.isEven(0L));
		assertEquals(false, Math.isEven(1L));
		assertEquals(true, Math.isEven(2L));
    }
	
	public void testMathSumOfEvenFibonacciTermsUnder() {
		assertEquals(0, Math.sumOfEvenFibonacciTermsUnder(-2));
		assertEquals(0, Math.sumOfEvenFibonacciTermsUnder(0));
		assertEquals(2, Math.sumOfEvenFibonacciTermsUnder(5));
		assertEquals(2, Math.sumOfEvenFibonacciTermsUnder(7));
    }
	
	public void testMathPrimeSieveFromZeroTo() {
		boolean expectedResult1 = false;
		boolean[] expectedResult2 = {false};
		boolean[] expectedResult3 = {false, false};
		boolean[] expectedResult4 = {false, false, true};
		boolean[] result2 = Math.primeSieveFromZeroTo(0);
		boolean[] result3 = Math.primeSieveFromZeroTo(1);
		boolean[] result4 = Math.primeSieveFromZeroTo(2);
		
		try {
			Math.primeSieveFromZeroTo(-1);
		} catch (IllegalArgumentException e) {
			expectedResult1 = true;
		}
		assertTrue(expectedResult1);
		for (int i = 0; i < expectedResult2.length; i++) {
			assertEquals(expectedResult2[i], result2[i]);
		}
		for (int i = 0; i < expectedResult3.length; i++) {
			assertEquals(expectedResult3[i], result3[i]);
		}
		for (int i = 0; i < expectedResult4.length; i++) {
			assertEquals(expectedResult4[i], result4[i]);
		}
    }
	
	public void testMathIsPrime() {
		assertEquals(true, Math.isPrime(2));
		assertEquals(false, Math.isPrime(1));
		assertEquals(false, Math.isPrime(0));
		assertEquals(false, Math.isPrime(-300));
		assertEquals(false, Math.isPrime(-2));
		assertEquals(true, Math.isPrime(6857));
		assertEquals(true, Math.isPrime(2L));
		assertEquals(false, Math.isPrime(1L));
		assertEquals(false, Math.isPrime(0L));
		assertEquals(false, Math.isPrime(-300L));
		assertEquals(false, Math.isPrime(-2L));
		assertEquals(true, Math.isPrime(6857L));
    }
	
	public void testMathNextPrime() {
		assertEquals(2, Math.nextPrime(0));
		assertEquals(2, Math.nextPrime(1));
		assertEquals(3, Math.nextPrime(2));
		assertEquals(5, Math.nextPrime(3));
		assertEquals(5, Math.nextPrime(4));
		assertEquals(2L, Math.nextPrime(0L));
		assertEquals(2L, Math.nextPrime(1L));
		assertEquals(3L, Math.nextPrime(2L));
		assertEquals(5L, Math.nextPrime(3L));
		assertEquals(5L, Math.nextPrime(4L));
    }
	
	public void testMathPrimeIndex() {
		boolean expectedResult1 = false;
		boolean expectedResult2 = false;
		try {
			Math.primeIndex(1);
		} catch (IllegalArgumentException e) {
			expectedResult1 = true;
		}
		try {
			Math.primeIndex(0);
		} catch (IllegalArgumentException e) {
			expectedResult2 = true;
		}
		assertTrue(expectedResult1);
		assertTrue(expectedResult2);
		assertEquals(0, Math.primeIndex(2));
		assertEquals(1, Math.primeIndex(3));
		assertEquals(2, Math.primeIndex(5));
		assertEquals(3, Math.primeIndex(7));
	}
	
	public void testMathLargestPrimeFactorOf() {
		assertEquals(6857, Math.largestPrimeFactorOf(6857));
		assertEquals(5, Math.largestPrimeFactorOf(100000));
		assertEquals(0, Math.largestPrimeFactorOf(0));
		assertEquals(0, Math.largestPrimeFactorOf(-100000));
    }

    public void testMathIsPalindrome() {
		assertEquals(true, Math.isPalindrome(0));
		assertEquals(true, Math.isPalindrome(9889));
		assertEquals(true, Math.isPalindrome(-9889));
		assertEquals(false, Math.isPalindrome(10));
		assertEquals(false, Math.isPalindrome(-224));
		assertEquals(false, Math.isPalindrome(6857));
    }
	
	public void testMathLargestPalindromeMadeFromTwoXDigitNumberThatAreLessThenSix() {
		assertEquals(906609, Math.largestPalindromeMadeFromTwoXDigitNumberThatAreLessThenSix(3));
    }
	
	public void testMathPositiveIntegerPower() {
		assertEquals(1, Math.positiveIntegerPower(10, 0));
		assertEquals(10, Math.positiveIntegerPower(10, 1));
		assertEquals(25, Math.positiveIntegerPower(5, 2));
		assertEquals(10000, Math.positiveIntegerPower(-10, 4));
    }
	
	public void testMathPrimeFactorsOf() {
		int[][] expectedResult1 = new int[1][2];
		expectedResult1[0][0] = 0;
        expectedResult1[0][1] = 1;
		int[][] expectedResult2 = new int[1][2];
		expectedResult2[0][0] = 2;
        expectedResult2[0][1] = 0;
		int[][] expectedResult3 = new int[1][2];
		expectedResult3[0][0] = 2;
        expectedResult3[0][1] = 1;
		int[][] expectedResult4 = new int[2][2];
		expectedResult4[0][0] = 2;
        expectedResult4[0][1] = 1;
        expectedResult4[1][0] = 5;
        expectedResult4[1][1] = 1;
		int[][] expectedResult5 = new int[2][2];
		expectedResult5[0][0] = 2;
        expectedResult5[0][1] = 2;
        expectedResult5[1][0] = 5;
        expectedResult5[1][1] = 2;
		int[][] testResult1 = Math.primeFactorsOf(0);
		int[][] testResult2 = Math.primeFactorsOf(1);
		int[][] testResult3 = Math.primeFactorsOf(2);
		int[][] testResult4 = Math.primeFactorsOf(10);
		int[][] testResult5 = Math.primeFactorsOf(100);
		

		assertEquals(testResult1[0][0], expectedResult1[0][0]);
		assertEquals(testResult1[0][1], expectedResult1[0][1]);
		

		assertEquals(testResult2[0][0], expectedResult2[0][0]);
		assertEquals(testResult2[0][1], expectedResult2[0][1]);
	
		
		assertEquals(testResult3[0][0], expectedResult3[0][0]);
		assertEquals(testResult3[0][1], expectedResult3[0][1]);
	
		
		assertEquals(testResult4[0][0], expectedResult4[0][0]);
		assertEquals(testResult4[0][1], expectedResult4[0][1]);
		assertEquals(testResult4[1][0], expectedResult4[1][0]);
		assertEquals(testResult4[1][1], expectedResult4[1][1]);
		
		
		assertEquals(testResult5[0][0], expectedResult5[0][0]);
		assertEquals(testResult5[0][1], expectedResult5[0][1]);
		assertEquals(testResult5[1][0], expectedResult5[1][0]);
		assertEquals(testResult5[1][1], expectedResult5[1][1]);
	}
	
	public void testMathGreatestCommonDivisor() {
		int[] expectedResults = {56, 204, 225, 1};
		int[] testArray = {2352, 5544, 54880};
		assertEquals(expectedResults[0], Math.greatestCommonDivisor(testArray));
		assertEquals(expectedResults[1], Math.greatestCommonDivisor(1020,  1224));
		assertEquals(expectedResults[2], Math.greatestCommonDivisor(73125, 7425));
		assertEquals(expectedResults[3], Math.greatestCommonDivisor(4617, 6800));
	}
	
	public void testMathLeastCommonMultiple() {
		int[] expectedResults = {388080, 35280, 315900, 180};
		int[] testArray = {120, 693, 2352};
		assertEquals(expectedResults[0], Math.leastCommonMultiple(testArray));
		assertEquals(expectedResults[1], Math.leastCommonMultiple(1176,  720));
		assertEquals(expectedResults[2], Math.leastCommonMultiple(972, 8775));
		assertEquals(expectedResults[3], Math.leastCommonMultiple(12, 45));
		
	}
	
	public void testMathDifferenceBetweenSumOfSquaresAndSquareOfSumUnder() {
		assertEquals(2640, Math.differenceBetweenSumOfSquaresAndSquareOfSumUnder(11));
		assertEquals(25164150, Math.differenceBetweenSumOfSquaresAndSquareOfSumUnder(101));
	}
	
	public void testMathNthPrime() {
		boolean expectedResult1 = false;
		try {
			Math.nthPrime(0);
		} catch (IllegalArgumentException e) {
			expectedResult1 = true;
		}
		assertTrue(expectedResult1);
		assertEquals(2, Math.nthPrime(1));
		assertEquals(3, Math.nthPrime(2));
		assertEquals(5, Math.nthPrime(3));
		assertEquals(7, Math.nthPrime(4));
	}
	
	public void testMathLargestProductInAStringOfDigitsMadeFormXAdjacentDigits() {
		assertEquals(23514624000L, Math.largestProductInAStringOfDigitsMadeFormXAdjacentDigits("7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450", 13));
	}
	
	public void testMathIsPythagoreanTriplet() {
		assertEquals(true, Math.isPythagoreanTriplet(3, 4, 5));
		assertEquals(true, Math.isPythagoreanTriplet(9, 40 ,41));
		assertEquals(false, Math.isPythagoreanTriplet(14, 51, 15));
		assertEquals(false, Math.isPythagoreanTriplet(1, 2, 3));
	}
	
	public void testMathSumOfAllPrimesBelow() {
		assertEquals(17, Math.sumOfAllPrimesBelow(8));
		assertEquals(10, Math.sumOfAllPrimesBelow(7));
		assertEquals(17, Math.sumOfAllPrimesBelow(10));
		assertEquals(0, Math.sumOfAllPrimesBelow(1));
		assertEquals(0, Math.sumOfAllPrimesBelow(2));
	}
}