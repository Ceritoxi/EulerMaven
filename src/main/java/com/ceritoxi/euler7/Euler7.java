package com.ceritoxi.euler7;

import com.ceritoxi.util.Math;

public class Euler7 {
	
	private long result;
	
	public Euler7() {
		this.result = Math.nthPrime(10001);
	}
	
	public long getResult() {
		return this.result;
	}
	
	public void run() {
		System.out.println(this.result);
	}
}