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
	
	
}