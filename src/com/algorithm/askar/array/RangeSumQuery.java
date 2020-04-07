package com.algorithm.askar.array;

public class RangeSumQuery {
    private int data[];

    public RangeSumQuery(int[] nums) {
        data = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            data[i + 1] = data[i] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return data[j + 1] - data[i];
    }
}
