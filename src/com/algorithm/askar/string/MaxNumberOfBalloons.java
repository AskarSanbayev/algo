package com.algorithm.askar.string;

public class MaxNumberOfBalloons {
    public int maxNumberOfBalloons(String text) {
        int c = 0;
        int[] gr = new int[26];
        for (char el : text.toCharArray()) {
            gr[el - 'a']++;
        }
        int l = gr['b' - 'a'];
        for (int i = 0; i < l; i++) {
            boolean yes = true;
            for (char el : "balloon".toCharArray()) {
                gr[el - 'a']--;
                if (gr[el - 'a'] < 0) {
                    yes = false;
                    break;
                }
            }
            if (yes) {
                c++;
            } else {
                break;
            }
        }
        return c;
    }

    public int maxNumberOfBalloonsOptimal(String text) {
        int[] chars = new int[26];
        for (char c : text.toCharArray()) {
            chars[c - 'a']++;
        }
        int min = chars[1];//for b
        min = Math.min(min, chars[0]);//for a
        min = Math.min(min, chars[11] / 2);// for l /2
        min = Math.min(min, chars[14] / 2);//similarly for o/2
        min = Math.min(min, chars[13]);//for n
        return min;
    }
}
