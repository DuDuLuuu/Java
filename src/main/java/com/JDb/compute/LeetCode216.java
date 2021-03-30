package com.JDb.compute;

import java.util.*;

public class LeetCode216 {
    public static void main(String[] args) {
        LeetCode216 leetCode39 = new LeetCode216();
        System.out.println(leetCode39.combinationSum3(3, 9));
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        dfs(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 0, k, n);
        return rs;
    }


    List<List<Integer>> rs = new ArrayList<>();
    LinkedList<Integer> list = new LinkedList<>();
    HashSet<String> set = new HashSet<>();

    public void dfs(int[] candidates, int index, int k, int target) {
        if (list.size() > k) {
            return;
        }
        if (k == list.size() && target == 0) {
            ArrayList<Integer> l = new ArrayList<>(list);
            Collections.sort(l);
            String s = l.toString();
            if (!set.contains(s)) {
                rs.add(l);
            }
            set.add(s);
        }
        for (int i = index; i < candidates.length; i++) {
            int c = candidates[i];
            if (list.contains(c)) {
                continue;
            }
            list.addLast(c);
            dfs(candidates, index + 1, k, target - c);
            list.removeLast();
        }
    }

}
