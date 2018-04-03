package com.ceritoxi;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Euler2Test extends TestCase {
    
	Euler2 euler2 = new Euler2();
	
    public Euler2Test( String testName ) {
        super( testName );
    }

    public static Test suite() {
        return new TestSuite( Euler2Test.class );
    }

    public void testEuler2() {
		int resultOfTheProblem = 4613732;
        assertEquals(resultOfTheProblem,euler2.getResult());
    }
}
