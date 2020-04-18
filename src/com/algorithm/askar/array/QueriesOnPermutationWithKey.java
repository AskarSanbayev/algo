package com.algorithm.askar.array;

public class QueriesOnPermutationWithKey {
    public int[] processQueries(int[] queries, int m) {
        int p[] = new int[m];
        for (int i = 1; i <= m; i++) {
            p[i - 1] = i;
        }
        for (int i = 0; i < queries.length; i++) {
            int n = queries[i];
            for (int j = 0; j < p.length; j++) {
                if (n == p[j]) {
                    queries[i] = j;
                    break;
                }
            }

            for (int j = queries[i]; j > 0; j--) {
                int temp = p[j];
                p[j] = p[j - 1];
                p[j - 1] = temp;
            }
        }

        return queries;
    }
}
