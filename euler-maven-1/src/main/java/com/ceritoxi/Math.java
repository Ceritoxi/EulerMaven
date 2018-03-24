package com.ceritoxi;

public class Math {
	
	public static boolean isDividableByXorY(int dividend, int numberX, int numberY) {
		if (numberX == 0 && numberY == 0) return false ;
		if (numberX != 0 && dividend % numberX == 0) return true;
		if (numberY != 0 && dividend % numberY == 0) return true;
	
		return false;
	}
	
	public static int sumOfNumbersUnderZThatAreDividableByXorY (int numberX, int numberY, int numberZ) {
		int sum = 0;
		
		if (numberZ < 1) return sum;
			
		for (int i = 1; i < numberZ; i++) {
			if (isDividableByXorY(i, numberX, numberY)) sum += i;
		}
		return sum;
	}
}