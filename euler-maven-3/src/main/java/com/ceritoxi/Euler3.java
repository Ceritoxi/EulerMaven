package com.ceritoxi;

public class Euler3 {
	
	private long result;
	
	public Euler3() {
		this.result = 0;
		this.result = Math.largestPrimeFactorOfX(600851475143l);
	}
	
	public long getResult() {
		return this.result;
	}
	
	public void run() {
		System.out.println(this.result);
	}
}