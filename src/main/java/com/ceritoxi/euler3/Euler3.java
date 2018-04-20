package com.ceritoxi.euler3;

import com.ceritoxi.util.Math;

public class Euler3 {
	
	private int result;
	
	public Euler3() {
		this.result = Math.largestPrimeFactorOf(600851475143);
	}
	
	public int getResult() {
		return this.result;
	}
	
	public void run() {
		System.out.println(this.result);
	}
}