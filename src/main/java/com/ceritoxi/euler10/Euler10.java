package com.ceritoxi.euler10;

import com.ceritoxi.util.Math;

public class Euler10 {
	
	private long result;
	
	public Euler10() {
		this.result = 0;
		this.result = Math.sumOfAllPrimesBelow(2000000);
	}
	
	
	public long getResult() {
		return this.result;
	}
	
	public void run() {
		System.out.println(this.result);
	}
}