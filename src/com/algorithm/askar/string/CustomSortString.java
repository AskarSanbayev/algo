package com.algorithm.askar.string;

public class CustomSortString {
    public String customSortString(String S, String T) {
        char[] arr = new char[26];
        StringBuilder str = new StringBuilder();

        for (char el : T.toCharArray()) {
            arr[el - 'a']++;
        }

        for (int i = 0; i < S.length(); i++) {
            char temp = S.charAt(i);
            for (int j = 0; j < arr[temp - 'a']; j++) {
                str.append(temp);
            }
            arr[temp - 'a'] = 0;
        }

        for (int i = 0; i < T.length(); i++) {
            if (arr[T.charAt(i) - 'a'] > 0) {
                for (int j = 0; j < arr[T.charAt(i) - 'a']; j++) {
                    str.append(T.charAt(i));
                }
            }
            arr[T.charAt(i) - 'a'] = 0;
        }


        return str.toString();
    }
}
