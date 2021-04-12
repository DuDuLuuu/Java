package com.JDb.compute;

import java.util.Arrays;
import java.util.LinkedList;

public class LeetCode1409 {
    public static void main(String[] args) {
        LeetCode1409 leetCode1409 = new LeetCode1409();
        System.out.println(Arrays.toString(leetCode1409.processQueries(new int[]{4,1,2,2}, 4)));
    }
    public int[] processQueries(int[] queries, int m) {

        LinkedList<Integer> l = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            l.add(i + 1);
        }

        for (int i = 0; i < queries.length; i++) {
            int c = queries[i];
            int index = 0;
            for (int j = 0; j < l.size(); j++) {
                if (l.get(j) == c) {
                    index = j;
                    l.remove(j);
                    l.addFirst(c);
                    break;
                }
            }
            queries[i] = index;
        }
        return queries;
    }
}
