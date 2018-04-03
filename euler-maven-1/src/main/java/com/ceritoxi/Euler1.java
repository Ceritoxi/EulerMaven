package com.ceritoxi;

public class Euler1 {
	
	private int sum;
	
	public Euler1() {
		this.sum = 0;
		this.sum = Math.sumOfNumbersUnderZThatAreDividableByXorY(3, 5, 1000);
	}
	
	public int getResult() {
		return this.sum;
	}
	
	public void run() {
		System.out.println(this.sum);
	}
}