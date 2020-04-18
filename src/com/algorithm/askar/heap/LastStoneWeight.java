package com.algorithm.askar.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> s = new PriorityQueue<>(Collections.reverseOrder());
        for (int el :stones){
            s.add(el);
        }

        while (s.size()>=2){
            int y = s.poll();
            int x = s.poll();
            if (x != y){
                s.add(y-x);
            }
        }

        return s.isEmpty() ? 0 : s.poll();
    }
}
