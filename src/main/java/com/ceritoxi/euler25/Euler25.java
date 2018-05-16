package com.ceritoxi.euler25;

import com.ceritoxi.util.Math;
import java.math.BigInteger;

public class Euler25 {
	
	private long result;
	
	public Euler25() {
		this.result = task(1000);
	}
	
	public int task(int limit) {
		//This shit became the same fucking thing that you can see on a google first page, which is kind of infuriating,
		//but since I worked 10 fucking hours to make it as efficient as I can, I no longer give a fuck.
		
		int counterToHowManyFibonacciNumbersWeHadGoneTrough = 2;
		BigInteger limitDigitsLongNumber = (new BigInteger("10")).pow(limit - 1);
		BigInteger[] fibonacciHelpers = new BigInteger[3];

		fibonacciHelpers[0] = BigInteger.ONE;
		fibonacciHelpers[2] = BigInteger.ONE;
		
		int i = 0;
		
		while ((fibonacciHelpers[i]).compareTo(limitDigitsLongNumber) < 0) {
			i = (i + 1) % 3;
			fibonacciHelpers[i] = fibonacciHelpers[(i + 1) % 3].add(fibonacciHelpers[(i + 2) % 3]);
			counterToHowManyFibonacciNumbersWeHadGoneTrough++;
		}
		return counterToHowManyFibonacciNumbersWeHadGoneTrough;
    }
	
	
	public long getResult() {
		return this.result;
	}
	
	public void run() {
		System.out.println(this.result);
	}
}