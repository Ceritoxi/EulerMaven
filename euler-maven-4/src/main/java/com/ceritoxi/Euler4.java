package com.ceritoxi;

public class Euler4 {
	
	private long result;
	
	public Euler4() {
		this.result = 0;
		task();
	}
	
	private void task() {
		this.result = Math.largestPalindromeMadeFromTwoXDigitNumberThatAreLesserThenSix(3);
	}
	
	public long getResult() {
		return this.result;
	}
	
	public void printResult() {
		System.out.println(this.result);
	}
}