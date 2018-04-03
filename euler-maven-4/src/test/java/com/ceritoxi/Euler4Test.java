package com.ceritoxi;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Euler4Test extends TestCase {
    
	Euler4 euler4 = new Euler4();
	
    public Euler4Test( String testName ) {
        super( testName );
    }

    public static Test suite() {
        return new TestSuite( Euler4Test.class );
    }

    public void testEuler4() {
		int resultOfTheProblem = 906609;
        assertEquals(resultOfTheProblem,euler4.getResult());
    }
}
