package com.ceritoxi.euler5;

import com.ceritoxi.util.Math;

public class Euler5 {
	
	private int result;
	
	public Euler5() {
		int[] arguments = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		this.result = Math.greatestCommonDivisor(arguments);
	}
	
	public int getResult() {
		return this.result;
	}
	
	public void run() {
		System.out.println(this.result);
	}
}