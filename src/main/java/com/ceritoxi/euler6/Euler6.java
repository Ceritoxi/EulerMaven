package com.ceritoxi.euler6;

import com.ceritoxi.util.Math;

public class Euler6 {
	
	private int result;
	
	public Euler6() {
		this.result = Math.differenceBetweenSumOfSquaresAndSquareOfSumUnder(101);
	}
	
	public int getResult() {
		return this.result;
	}
	
	public void run() {
		System.out.println(this.result);
	}
}