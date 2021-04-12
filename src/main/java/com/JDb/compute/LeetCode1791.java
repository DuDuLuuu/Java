package com.JDb.compute;

public class LeetCode1791 {
    public int findCenter(int[][] edges) {

        int i = edges[0][0];
        int i1 = edges[0][1];
        int i2 = edges[1][0];
        int i3 = edges[1][1];
        if (i == i2) {
            return i;
        }
        if (i == i3) {
            return i;
        }
        if (i1 == i2) {
            return i1;
        }
        if (i1 == i3) {
            return i1;
        }
        return 0;
    }
}
