package com.ceritoxi.euler9;

import com.ceritoxi.util.Math;

public class Euler9 {
	
	private int result;
	
	public Euler9() {
		this.result = task();
	}
	
	private int task() {
		for (int x = 1; x < 1000; x++) {
            for (int y = 1; y < 1000; y++) {
                for (int z = 1; z < 1000; z++) {
                    if (Math.isPythagoreanTriplet(x, y, z) && x + y + z == 1000) {
                        return x * y * z;
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