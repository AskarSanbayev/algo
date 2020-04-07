package com.algorithm.askar.hashtable;

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int n = numbers[i];
            if (map.containsKey(n)) {
                return new int[]{map.get(n), i + 1};
            } else {
                map.put(target - n, i + 1);
            }
        }
        return null;
    }
}
