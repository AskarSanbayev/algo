package com.algorithm.askar.hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> m = new HashMap<>();
        Set<Integer> r = new HashSet<>();
        for (int i = 0 ; i < arr.length;i++){
            m.put(arr[i],m.getOrDefault(arr[i],0)+1);
        }
        for (int key : m.keySet()) {
            int v = m.get(key);
            if (!r.add(v)){
                return false;
            } else {
                r.add(v);
            }
        }
        return true;
    }
}
