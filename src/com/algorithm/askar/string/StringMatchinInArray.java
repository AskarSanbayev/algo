package com.algorithm.askar.string;

import java.util.ArrayList;
import java.util.List;

public class StringMatchinInArray {
    public List<String> stringMatching(String[] words) {
        List<String> s = new ArrayList<>();
        boolean arr[] = new boolean[words.length];
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[j].indexOf(words[i]) >= 0 && !arr[i] && words[j].length() != words[i].length()) {
                    s.add(words[i]);
                    arr[i] = true;
                }
            }
        }
        return s;
    }
}
