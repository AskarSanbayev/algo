package com.algorithm.askar.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindWords {
    public String[] findWords(String[] words) {
        List<String> l = new ArrayList<>();
        for (int i = 0 ; i < words.length;i++){
            char r = words[i].charAt(0);
            Set<Character> rs = getr(r);
            boolean not = true;
            for (int j = 1;j < words[i].length();j++){
                if (!rs.contains(words[i].charAt(j))){
                    not = false;
                }
            }
            if (not){
                l.add(words[i]);
            }
        }
        String[] stockArr = new String[l.size()];
        stockArr = l.toArray(stockArr);
        return stockArr;
    }

    private static Set<Character> getr(Character c) {
        char[] c1 = new char[]{'Q', 'q', 'W', 'w', 'E', 'e', 'R', 'r', 'T', 't', 'Y', 'y', 'U', 'u', 'I', 'i', 'O', 'o', 'P', 'p'};
        char[] c2 = new char[]{'A', 'a', 'S', 's', 'D', 'd', 'F', 'f', 'G', 'g', 'H', 'h', 'J', 'j', 'K', 'k', 'L', 'l'};
        char[] c3 = new char[]{'Z', 'z', 'X', 'C', 'c', 'x', 'V', 'v', 'B', 'b', 'N', 'n', 'M', 'm'};
        Set<Character> r1 = new HashSet<>();
        for (int i = 0; i < c1.length; i++) {
            r1.add(c1[i]);
        }
        Set<Character> r2 = new HashSet<>();
        for (int i = 0; i < c2.length; i++) {
            r2.add(c2[i]);
        }
        Set<Character> r3 = new HashSet<>();
        for (int i = 0; i < c3.length; i++) {
            r3.add(c3[i]);
        }
        if (r1.contains(c)) {
            return r1;
        } else if (r2.contains(c)) {
            return r2;
        }
        return r3;
    }
}
