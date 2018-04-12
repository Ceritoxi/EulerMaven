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
	
	
}