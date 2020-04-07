package com.algorithm.askar.array;

public class FindMissingNumber {
    public int findMissingNumber(int[] arr, int n) {
        int base = n * (n + 1) / 2;
        int temp = 0;
        for (int el : arr) {
            temp += el;
        }
        return base - temp;
    }
}
