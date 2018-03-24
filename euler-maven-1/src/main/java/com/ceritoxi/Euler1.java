package com.ceritoxi;

public class Euler1 {
	
	private int sum;
	
	public Euler1() {
		this.sum = 0;
		task();
	}
	
	private void task() {
		this.sum = Math.sumOfNumbersUnderZThatAreDividableByXorY(3, 5, 1000);
	}
	
	public int getResult() {
		return this.sum;
	}
	
	public void printResult() {
		System.out.println(this.sum);
	}
}