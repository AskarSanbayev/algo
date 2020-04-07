package com.algorithm.askar.string;

public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        int l = 0;
        int r = s.length() - 1;
        char arr[] = s.toCharArray();
        while (l < r) {
            char leftEl = arr[l];
            char rightEl = arr[r];
            if (Character.isLetter(leftEl) && Character.isLetter(rightEl)) {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            } else if (Character.isLetter(leftEl)) {
                r--;
            } else if (Character.isLetter(rightEl)) {
                l++;
            } else {
                l++;
                r--;
            }
        }
        return new String(arr);
    }
}
