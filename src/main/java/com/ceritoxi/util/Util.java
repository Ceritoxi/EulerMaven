package com.ceritoxi.util;

public class Util {
	public static int[] quickSort(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return inputArray;
        }
        inputArray = sort(0, inputArray.length - 1, inputArray);
        return inputArray;
    }

    private static int[] sort(int lowerIndex, int higherIndex, int[] array) {
        int i = lowerIndex;
        int j = higherIndex;
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                array = swapTermsInArrayByIndex(i, j, array);
                i++;
                j--;
            }
        }
        if (lowerIndex < j)
            array = sort(lowerIndex, j, array);
        if (i < higherIndex)
            array = sort(i, higherIndex, array);
        return array;
    }
	
    private static int[] swapTermsInArrayByIndex(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }
}