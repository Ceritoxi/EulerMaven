package com.ceritoxi.euler3;

import com.ceritoxi.util.Math;

public class Euler3 {
	
	private long result;
	
	public Euler3() {
		this.result = Math.largestPrimeFactorOf(600851475143L);
	}
	
	public long getResult() {
		return this.result;
	}
	
	public void run() {
		System.out.println(this.result);
	}
}