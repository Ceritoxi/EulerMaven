package com.ceritoxi.euler4;

import com.ceritoxi.util.Math;

public class Euler4 {
	
	private int result;
	
	public Euler4() {
		this.result = 0;
		this.result = Math.largestPalindromeMadeFromTwoXDigitNumberThatAreLesserThenSix(3);
	}
	
	public int getResult() {
		return this.result;
	}
	
	public void run() {
		System.out.println(this.result);
	}
}