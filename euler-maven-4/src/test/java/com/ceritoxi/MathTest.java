package com.ceritoxi;

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