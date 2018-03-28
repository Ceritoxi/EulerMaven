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
	
	public void testMathIsDividableByXorY() {
		assertEquals(false, Math.isDividableByXorY(100, 0,  0));
		assertEquals(false, Math.isDividableByXorY(100, 3,  7));
		assertEquals(true, Math.isDividableByXorY(100, 5,  0));
		assertEquals(true, Math.isDividableByXorY(100, 0,  5));
		assertEquals(true, Math.isDividableByXorY(-100, 0,  5));
		assertEquals(true, Math.isDividableByXorY(-100, 0,  5));
		assertEquals(true, Math.isDividableByXorY(-100, 0,  5));
		assertEquals(true, Math.isDividableByXorY(100, 3,  5));
		assertEquals(true, Math.isDividableByXorY(100, 5,  3));
		assertEquals(true, Math.isDividableByXorY(100, 2,  5));
		assertEquals(true, Math.isDividableByXorY(-100, 2,  5));
		assertEquals(true, Math.isDividableByXorY(-100, 2,  5));
		assertEquals(true, Math.isDividableByXorY(-100, 2,  5));
    }
	
	public void testMathSumOfNumbersUnderZThatAreDividableByXorY() {
		//if (Math.sumOfNumbersUnderZThatAreDividableByXorY(x,y,z))
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
    }
	
	public void testMathSumOfEvenFibonacciTermsUnderX() {
		assertEquals(0, Math.sumOfEvenFibonacciTermsUnderX(-2));
		assertEquals(0, Math.sumOfEvenFibonacciTermsUnderX(0));
		assertEquals(2, Math.sumOfEvenFibonacciTermsUnderX(5));
		assertEquals(2, Math.sumOfEvenFibonacciTermsUnderX(7));
    }
	
	public void testMathIsPrime() {
		assertEquals(true, Math.isPrime(2));
		assertEquals(false, Math.isPrime(1));
		assertEquals(false, Math.isPrime(0));
		assertEquals(false, Math.isPrime(-300));
		assertEquals(false, Math.isPrime(-2));
		assertEquals(true, Math.isPrime(6857));
    }
	
	public void testMathLargestPrimeFactorOfX() {
		assertEquals(6857, Math.largestPrimeFactorOfX(6857));
		assertEquals(5, Math.largestPrimeFactorOfX(100000));
		assertEquals(0, Math.largestPrimeFactorOfX(0));
		assertEquals(0, Math.largestPrimeFactorOfX(-100000));
    }

    public void testMathIsPalindrome() {
		assertEquals(true, Math.isPalindrome(0));
		assertEquals(true, Math.isPalindrome(9889));
		assertEquals(true, Math.isPalindrome(-9889));
		assertEquals(false, Math.isPalindrome(10));
		assertEquals(false, Math.isPalindrome(-224));
		assertEquals(false, Math.isPalindrome(6857));
    }
	
	public void testMathLargestPalindromeMadeFromTwoXDigitNumberThatAreLesserThenSix() {
		assertEquals(906609, Math.largestPalindromeMadeFromTwoXDigitNumberThatAreLesserThenSix(3));
    }
	
	public void testMathPositiveIntegerPower() {
		assertEquals(1, Math.positiveIntegerPower(10, 0));
		assertEquals(10, Math.positiveIntegerPower(10, 1));
		assertEquals(25, Math.positiveIntegerPower(5, 2));
		assertEquals(10000, Math.positiveIntegerPower(-10, 4));
    }
}