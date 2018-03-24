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
}