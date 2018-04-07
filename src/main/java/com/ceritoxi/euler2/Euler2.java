package com.ceritoxi.euler2;

import com.ceritoxi.util.Math;

public class Euler2 {
	
	private int result;
	
	public Euler2() {
		this.result = 0;
		this.result = Math.sumOfEvenFibonacciTermsUnder(4000000);
	}
	
	public int getResult() {
		return this.result;
	}
	
	public void run() {
		System.out.println(this.result);
	}
}