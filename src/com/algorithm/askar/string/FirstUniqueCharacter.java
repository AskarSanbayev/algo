package com.algorithm.askar.string;

public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        int arr[] = new int[26];
        for (int el : s.toCharArray()) {
            arr[el - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
