package com.algorithm.askar.string;

import java.util.HashSet;
import java.util.Set;

public class GoatLatin {
    public String toGoatLatin(String S) {
        Set<Character> s = new HashSet<>();
        s.add('a');
        s.add('e');
        s.add('i');
        s.add('o');
        s.add('u');
        s.add('A');
        s.add('E');
        s.add('I');
        s.add('O');
        s.add('U');
        int c = 1;
        StringBuilder sb = new StringBuilder();
        String[] arr = S.split(" ");
        for (int i = 0; i < arr.length; i++) {
            char[] arr2 = arr[i].toCharArray();
            if (s.contains(arr2[0])) {
                sb.append(new String(arr2));
                sb.append("ma");
            } else {
                sb.append(new String(arr2, 1, arr2.length - 1));
                sb.append(arr2[0]);
                sb.append("ma");
            }
            for (int j = 0; j < c; j++) {
                sb.append('a');
            }
            if (i != arr.length - 1) {
                sb.append(" ");
            }
            c++;
        }
        return sb.toString();
    }
}
