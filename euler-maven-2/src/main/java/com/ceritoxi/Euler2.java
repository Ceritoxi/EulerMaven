package com.ceritoxi;

public class Euler2 {
	
	private int sum;
	
	public Euler2() {
		this.sum = 0;
		this.sum = Math.sumOfEvenFibonacciTermsUnderX(4000000);
	}
	
	public int getResult() {
		return this.sum;
	}
	
	public void run() {
		System.out.println(this.sum);
	}
}