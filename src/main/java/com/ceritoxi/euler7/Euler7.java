package com.ceritoxi.euler7;

import com.ceritoxi.util.Math;

public class Euler7 {
	
	private int result;
	
	public Euler7() {
		this.result = 0;
		this.result = Math.nthPrime(10001);
	}
	
	public int getResult() {
		return this.result;
	}
	
	public void run() {
		System.out.println(this.result);
	}
}