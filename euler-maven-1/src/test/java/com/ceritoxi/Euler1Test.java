package com.ceritoxi;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Euler1Test extends TestCase {
    
	Euler1 euler1 = new Euler1();
	
    public Euler1Test( String testName ) {
        super( testName );
    }

    public static Test suite() {
        return new TestSuite( Euler1Test.class );
    }

    public void testEuler1() {
		int resultOfTheProblem = 233168;
        assertEquals(resultOfTheProblem,euler1.getResult());
    }
}
