package com.algorithm.askar.stack;

import java.util.Stack;

public class MinimumAddToMakeParenthenesValid {
    public int minAddToMakeValidWithStack(String S) {
        Stack<Character> open = new Stack<>();
        int count = 0;
        for (char el : S.toCharArray()) {
            if (el == '(') {
                open.push(el);
            } else {
                if (open.isEmpty()) {
                    count++;
                } else {
                    open.pop();
                }
            }
        }

        return count + open.size();
    }

    public int minAddToMakeValid(String S) {
        int charCount = 0;
        int count = 0;
        for (char el : S.toCharArray()) {
            if (el == '(') {
                charCount += el;
            } else {
                if (charCount == 0) {
                    count++;
                } else {
                    charCount -= '(';
                }
            }
        }
        return count + charCount / '(';
    }
}
