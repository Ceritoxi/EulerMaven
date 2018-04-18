package com.ceritoxi.util;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class UtilTest extends TestCase {
    
    public UtilTest( String testName ) {
        super( testName );
    }

    public static Test suite() {
        return new TestSuite( UtilTest.class );
    }
	
	public void testMathIsDividableBy() {
		int[] expectedResult1 = {3, 20, 21, 27, 30, 31, 37, 40, 47, 48, 51, 52, 56, 56, 60, 65, 76, 89, 96};
		int[] expectedResult2 = {1, 12, 17, 33, 40, 53, 57, 60, 65, 74, 77, 80, 85, 91, 94, 94, 97, 100};
		int[] expectedResult3 = {5, 5, 5, 17, 22, 34, 35, 41, 48, 88, 88};
		int[] expectedResult4 = {3, 11, 13, 18, 21, 25, 25, 26, 44, 73, 90, 97};
		int[] expectedResult5 = {23, 28, 35, 41, 48, 53, 78, 78};
		int[] testArray1 = {89, 96, 56, 31, 47, 76, 48, 20, 56, 27, 21, 30, 40, 65, 52, 37, 3, 51, 60};
		int[] testArray2 = {60, 65, 94, 17, 97, 57, 85, 12, 94, 53, 74, 77, 100, 40, 80, 1, 33, 91};
		int[] testArray3 = {88, 5, 41, 22, 5, 17, 88, 5, 35, 48, 34};
		int[] testArray4 = {3, 13, 21, 18, 44, 97, 26, 90, 25, 73, 11, 25};
		int[] testArray5 = {53, 78, 23, 28, 41, 48, 35, 78};
		int[] testResult1 = Util.quickSort(testArray1);
		int[] testResult2 = Util.quickSort(testArray2);
		int[] testResult3 = Util.quickSort(testArray3);
		int[] testResult4 = Util.quickSort(testArray4);
		int[] testResult5 = Util.quickSort(testArray5);
		for (int i = 0; i < testArray1.length; i++) {
			assertEquals(expectedResult1[i], testResult1[i]);
		}
		for (int i = 0; i < testArray2.length; i++) {
			assertEquals(expectedResult2[i], testResult2[i]);
		}
		for (int i = 0; i < testArray3.length; i++) {
			assertEquals(expectedResult3[i], testResult3[i]);
		}
		for (int i = 0; i < testArray4.length; i++) {
			assertEquals(expectedResult4[i], testResult4[i]);
		}
		for (int i = 0; i < testArray5.length; i++) {
			assertEquals(expectedResult5[i], testResult5[i]);
		}
	}
}