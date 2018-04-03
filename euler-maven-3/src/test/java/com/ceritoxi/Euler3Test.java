package com.ceritoxi;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Euler3Test extends TestCase {
    
	Euler3 euler3 = new Euler3();
	
    public Euler3Test( String testName ) {
        super( testName );
    }

    public static Test suite() {
        return new TestSuite( Euler3Test.class );
    }

    public void testEuler3() {
		int resultOfTheProblem = 6857;
        assertEquals(resultOfTheProblem,euler3.getResult());
    }
}
