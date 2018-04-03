package com.ceritoxi.util;
import java.util.Stack;

public class Meth {

    public static boolean isDividableByXorY(int dividend, int x, int y) {
        if ((x != 0 && dividend % x == 0) || (y != 0 && dividend % y == 0)) {
            return true;
        }
        return false;
    }

    public static int sumOfNumbersUnderZThatAreDividableByXorY (int x, int y, int z) {
        int sum = 0;

        if (z < 1) {
            return sum;
        }
        for (int i = 1; i < z; i++) {
            if (isDividableByXorY(i, x, y)) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isEven (int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isEven (long number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public static int sumOfEvenFibonacciTermsUnderX (int x) {

        int result = 0;
        int sum = 0;
        int firstTerm = 0;
        int secondTerm = 1;

        while (sum < x) {
            if (isEven(sum)) {
                result += sum;
            }
            sum = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = sum;
        }
        return result;
    }

    public static boolean isPrime (long number) {

        if (number == 2 || number == 3 || number == 5) {
            return true;
        }
        if (number <= 1 || number % 2 == 0 || number % 3 == 0 || number % 5 == 0) {
            return false;
        }

        for (long i = 3; i <= java.lang.Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPrime (int number) {

        if (number == 2 || number == 3 || number == 5) {
            return true;
        }
        if (number <= 1 || number % 2 == 0 || number % 3 == 0 || number % 5 == 0) {
            return false;
        }

        for (int i = 3; i <= java.lang.Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int nextPrime (int number) {
        if (number == 0) {
            return 2;
        }
        if (isEven(number) || number == 1) {
            number++;
        } else {
            number += 2;
        }
        while (!isPrime(number)) {
            number += 2;
        }
        return number;
    }

    public static long nextPrime (long number) {
        if (number == 0) {
            return 2;
        }
        if (isEven(number) || number == 1) {
            number++;
        } else {
            number += 2;
        }
        while (!isPrime(number)) {
            number += 2;
        }
        return number;
    }

    //assuming prime is indeed a prime
    public static int primeIndex (int prime) {
        //indexing from 0
        int index = 0;
        int auxPrime = 2;
        while (auxPrime < prime) {
            index++;
            auxPrime = nextPrime(auxPrime);
        }
        return index;
    }

    public static long largestPrimeFactorOfX (long x) {
        long largest = 0;
        for (long i = 1; i <= x; i++) {
            if (isPrime(i) && x % i == 0) {
                if (i > largest) {
                    largest = i;
                }
                x /= i;
                i = 1;
            }
        }
        return largest;
    }

    public static boolean isPalindrome (int number) {
        String stringNumber = String.valueOf(number);
        if (number > 0) {
            for (int i = 0; i < stringNumber.length() / 2; i++) {
                if (stringNumber.charAt(i) != stringNumber.charAt(stringNumber.length() - (1 + i))) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < (stringNumber.length() / 2) - 1; i++) {
                if (stringNumber.charAt(i + 1) != stringNumber.charAt(stringNumber.length() - (1 + i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int largestPalindromeMadeFromTwoXDigitNumberThatAreLesserThenSix (int x) {
        if (x < 1 || x > 5) {
            return 0;
        }
        int largest = 0;
        int counter = 0;

        for (int i = positiveIntegerPower(10, x - 1); i < positiveIntegerPower(10, x) - 1; i++) {
            for (int j = positiveIntegerPower(10, x - 1) + counter; j <= positiveIntegerPower(10, x) - 1; j++) {
                if (isPalindrome(i * j) && i * j > largest) {
                    largest = i * j;
                }
            }
            counter++;
        }
        return largest;
    }

    public static int positiveIntegerPower (int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        int ogBase = base;
        for (int i = 1; i < exponent; i++) {
            base *= ogBase;
        }
        return base;
    }

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

    public static int[][] primeFactorsOfX (int x) {
        if (x == 1) {
            int[][] exceptionArray = new int[1][2];
            exceptionArray[0][0] = 2;
            exceptionArray[0][1] = 0;
            return exceptionArray;
        } else if (x < 1) {
            int[][] exceptionArray = new int[1][2];
            exceptionArray[0][0] = 0;
            exceptionArray[0][1] = 1;
            return exceptionArray;
        }

        Stack factors = new Stack();
        for (int i = 2; i <= x; i = nextPrime(i)) {
            if (x % i == 0) {
                factors.push(i);
                x /= i;
                i = 1;
            }
        }

        int[] factorsArray = new int[factors.size()];
        for (int i = 0; i < factorsArray.length; i++) {
            factorsArray[i] = (int)factors.pop();
        }

        factorsArray = quickSort(factorsArray);
        int numberOfDifferentPrimes = 1;
        for (int i = 1; i < factorsArray.length; i++) {
            if (factorsArray[i] > factorsArray[i - 1]) {
                numberOfDifferentPrimes++;
            }
        }

        int[][] finalPrimeFactors = new int[numberOfDifferentPrimes][2];
        for (int i = 0; i < numberOfDifferentPrimes; i++) {
            finalPrimeFactors[i][1] = 1;
        }
        int counter = 0;
        for (int i = 0; i < factorsArray.length - 1; i++) {
            finalPrimeFactors[counter][0] = factorsArray[i];
            if (factorsArray[i] < factorsArray[i + 1]) {
                counter++;
            } else if (factorsArray[i] == factorsArray[i + 1]) {
                finalPrimeFactors[counter][1]++;
            }
        }
        finalPrimeFactors[counter][0] = factorsArray[factorsArray.length - 1];
        return finalPrimeFactors;
    }

    public static int greatestCommonDivisor(int x, int y) {
        int[][] xArray = primeFactorsOfX(x);
        int[][] yArray = primeFactorsOfX(y);
        int[][] gcdArray = new int[xArray.length][2];
        for (int[] aGcdFactor : gcdArray) {
            aGcdFactor[0] = 1;
            aGcdFactor[1] = 1;
        }

        int gcdCounter = 0;
        for (int[] anXFactor : xArray) {
            for (int[] anYFactor : yArray) {
                if (anXFactor[0] == anYFactor[0]){
                    gcdArray[gcdCounter][0] = anYFactor[0];
                    if (anXFactor[1] < anYFactor[1]) {
                        gcdArray[gcdCounter][1] = anXFactor[1];
                    } else {
                        gcdArray[gcdCounter][1] = anYFactor[1];
                    }
                    gcdCounter++;
                }
            }
        }

        int result = 1;
        for (int[] aGcdFactor : gcdArray) {
            result *= positiveIntegerPower(aGcdFactor[0], aGcdFactor[1]);
        }
        return result;
    }

    public static int greatestCommonDivisor(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        if (numbers.length == 1) {
            return numbers[0];
        }
        int gcd = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            gcd = greatestCommonDivisor(gcd, numbers[i]);
        }
        return gcd;
    }

    public static int leastCommonMultiple(int x, int y) {
        int[][] xArray = primeFactorsOfX(x);
        int[][] yArray = primeFactorsOfX(y);
        int[][] lcmArray = new int[xArray.length + yArray.length][2];
        for (int[] anLcmFactor : lcmArray) {
            anLcmFactor[0] = 1;
            anLcmFactor[1] = 1;
        }

        int lcmCounter = 0;
        for (int[] anXFactor : xArray) {
            lcmArray[lcmCounter][0] = anXFactor[0];
            lcmArray[lcmCounter][1] = anXFactor[1];
            lcmCounter++;
        }

        boolean isInLcmArray;
        for (int[] anYFactor : yArray) {
            isInLcmArray = false;
            for (int i = 0; i < lcmArray.length; i++) {
                if (anYFactor[0] == lcmArray[i][0]) {
                    isInLcmArray = true;
                    if (anYFactor[1] > lcmArray[i][1]) {
                        lcmArray[i][1] = anYFactor[1];
                    }
                }
            }
            if (!isInLcmArray) {
                lcmArray[lcmCounter][0] = anYFactor[0];
                lcmArray[lcmCounter][1] = anYFactor[1];
                lcmCounter++;
            }
        }

        int result = 1;
        for (int[] anLcmFactor : lcmArray) {
            result *= positiveIntegerPower(anLcmFactor[0], anLcmFactor[1]);
        }
        return result;
    }

    public static int leastCommonMultiple(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        if (numbers.length == 1) {
            return numbers[0];
        }
        int lcm = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            lcm = leastCommonMultiple(lcm, numbers[i]);
        }
        return lcm;
    }

    public static int absolute(int number) {
        if (number < 0) {
            return number * -1;
        } else {
            return number;
        }
    }

    public static int differenceBetweenSumOfSquaresAndSquareOfSumUnderX(int x) {
        x = absolute(x);
        int result = 0;
        for (int i = 1; i < x; i++) {
            for (int j = i + 1; j < x ; j++) {
                result += i * j * 2;
            }
        }
        return result;
    }

    public static long nthPrime(long number) {
        long prime = 0;
        while (number > 0) {
            prime = nextPrime(prime);
            number--;
        }
        return prime;
    }

    public static long largestProductInAStringOfDigitsMadeFormXAdjacentDigits(String digits, int x) {
        if (x == 0) {
            return 0;
        }

        int[] digitsArray = new int[digits.length()];
        for (int i = 0; i < digits.length(); i++) {
            digitsArray[i] = Character.getNumericValue(digits.charAt(i));
        }
        long largest = 0;
        long temp;
        for (int i = 0; i < digits.length() - x; i++) {
            temp = 1;
            for (int j = 0; j < x; j++) {
                temp *= digitsArray[i + j];
                if (temp > largest) {
                    largest = temp;
                }
            }
        }
        return largest;
    }

    public static boolean isPythagoreanTriplet(int x, int y, int z) {
        return (positiveIntegerPower(x, 2) + positiveIntegerPower(y, 2)) == positiveIntegerPower(z, 2);
    }

    /*public static int productOfAPythagoreanTripletForWhichTheSumIsX(int x) {

    }*/

    public static long sumOfAllPrimesBelowX(long x) {
        long sum = 0;
        long prime = 0;
        while (prime < x) {
            sum += prime;
            prime = nextPrime(prime);
        }
        return sum;
    }
}

