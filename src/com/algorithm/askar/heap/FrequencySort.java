package com.algorithm.askar.heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FrequencySort {
    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        PriorityQueue<Letter> queue = new PriorityQueue<>((x, y) -> y.count - x.count);
        Letter letter;
        for (char el : s.toCharArray()) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }

        for (char key : map.keySet()) {
            letter = new Letter(key, map.get(key));
            queue.add(letter);
        }

        while (!queue.isEmpty()) {
            letter = queue.poll();
            while (letter.count > 0) {
                letter.count--;
                sb.append(letter.ch);
            }
        }

        return sb.toString();
    }

    static class Letter {
        char ch;
        int count;

        Letter(char ch, int c) {
            this.ch = ch;
            this.count = c;
        }
    }
}
