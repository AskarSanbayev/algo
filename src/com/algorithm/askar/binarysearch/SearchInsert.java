package com.algorithm.askar.binarysearch;

public class SearchInsert {
    public int searchInsert(int[] arr, int target) {
        int idx = -1;
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == target) {
                idx = mid;
                break;
            }
            if (arr[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        if (idx == -1) {
            return l;
        }
        return idx;
    }
}
