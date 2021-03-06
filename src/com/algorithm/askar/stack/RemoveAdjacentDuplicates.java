package com.algorithm.askar.stack;

import java.util.Stack;

public class RemoveAdjacentDuplicates {
    public String removeDuplicates(String S) {
        Stack<Character> s = new Stack<>();
        for (char el : S.toCharArray()){
            if (!s.isEmpty() && s.peek() == el){
                s.pop();
            } else {
                s.push(el);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char el : s){
            sb.append(el);
        }
        return sb.toString();
    }
}
