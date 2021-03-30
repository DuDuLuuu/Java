package com.JDb.compute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LeetCode77 {
    public static void main(String[] args) {
        LeetCode77 o = new LeetCode77();
        System.out.println(o.combine(4, 2));
    }

    public List<List<Integer>> combine(int n, int k) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        dfs(arr, 0, k);
        return rs;
    }

    LinkedList<Integer> list = new LinkedList<>();
    List<List<Integer>> rs = new ArrayList<>();

    private void dfs(int[] arr, int index, int k) {
        if (list.size() == k) {
            rs.add(new ArrayList<>(list));
            return;
        }
        if (list.size() > k) {
            return;
        }

        for (int i = index; i < arr.length; i++) {
            if (list.size() != 0 && arr[i] <= list.getLast()) {
                continue;
            }
            list.addLast(arr[i]);
            dfs(arr, index + 1, k);
            list.removeLast();
        }
    }

}
