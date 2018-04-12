package com.ceritoxi.euler9;

import com.ceritoxi.util.Math;

public class Euler9 {
	
	private int result;
	
	public Euler9() {
		this.result = task();
	}
	
	private int task() {
		for (int i = 1; i < 1000; i++) {
            for (int j = 1; j < 1000; j++) {
                for (int k = 1; k < 1000; k++) {
                    if (Math.isPythagoreanTriplet(i, j, k) && i + j + k == 1000) {
                        return i * j * k;
                    }
                }
            }
        }
		return 0;
	}
	
	public int getResult() {
		return this.result;
	}
	
	public void run() {
		System.out.println(this.result);
	}
}