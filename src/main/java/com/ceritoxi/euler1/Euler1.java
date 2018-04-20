package com.ceritoxi.euler1;

import com.ceritoxi.util.Math;

public class Euler1 {
	
	private int result;
	
	public Euler1() {
		this.result = Math.sumOfNumbersUnderZThatAreDividableByXorY(3, 5, 1000);
	}
	
	public int getResult() {
		return this.result;
	}
	
	public void run() {
		System.out.println(this.result);
	}
}