package com.algorithm.askar.array;

import java.util.Arrays;

public class RankTeamsByVotes {
    class Node {
        char ch;
        int[] count = new int[26];

        Node(char ch) {
            this.ch = ch;
        }
    }

    public String rankTeams(String[] votes) {
        Node[] nodes = new Node[26];
        for (int i = 0; i < 26; i++) {
            nodes[i] = new Node((char) (i + 'A'));
        }
        for (String vote : votes) {
            for (int i = 0; i < vote.length(); i++) {
                nodes[vote.charAt(i) - 'A'].count[i] += 1;
            }
        }
        Arrays.sort(nodes, (o1, o2) -> {
            for (int i = 0; i < 26; i++) {
                if (o1.count[i] != o2.count[i]) {
                    return o2.count[i] - o1.count[i];
                }
            }
            return o1.ch - o2.ch;
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < votes[0].length(); i++) {
            sb.append(nodes[i].ch);
        }
        return sb.toString();
    }
}