package com.ceritoxi;

public class Euler4 {
	
	private long result;
	
	public Euler4() {
		this.result = 0;
		this.result = Math.largestPalindromeMadeFromTwoXDigitNumberThatAreLesserThenSix(3);
	}
	
	public long getResult() {
		return this.result;
	}
	
	public void run() {
		System.out.println(this.result);
	}
}