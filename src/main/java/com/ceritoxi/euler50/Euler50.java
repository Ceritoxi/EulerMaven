package com.ceritoxi.euler50;

import com.ceritoxi.util.Math;

public class Euler50 {
	
	private long result;
	
	public Euler50() {
		this.result = task();
	}
	
	public int task() {
		boolean[] primeArray = Math.primeSieveFromZeroTo(20000000);
       
        int max = 0;
        int maxprime = 0;
        int auxmax = 0;
        int auxmax2 = 0;
        int auxmaxprime = 0;
        int sum = 0;

        for (int i = 2; i < 500000; i ++) {
            for (int j = i; sum < 1000000; j++) {
                if (primeArray[j]) {
                    sum += j;
                    auxmax++;
                    if (primeArray[sum]) {
                        auxmax2 = auxmax;
                        auxmaxprime = sum;
                    }
                }
            }
            if (max < auxmax2) {
                max = auxmax2;
                maxprime = auxmaxprime;
            }
            sum = 0;
            auxmax = 0;
            auxmax2 = 0;
            auxmaxprime = 0;
        }
		return maxprime;
    }
	
	
	public long getResult() {
		return this.result;
	}
	
	public void run() {
		System.out.println(this.result);
	}
}