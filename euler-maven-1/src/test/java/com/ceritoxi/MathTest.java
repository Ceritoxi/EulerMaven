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
	
	
}