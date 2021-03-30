package com.JDb.compute;

import java.util.*;

public class LeetCode40 {
    public static void main(String[] args) {
        LeetCode40 leetCode39 = new LeetCode40();
//        System.out.println(leetCode39.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
        System.out.println(leetCode39.combinationSum2(new int[]{2, 5, 2, 1, 5}, 5));
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(candidates, 0, target);
        return rs;
    }

    List<List<Integer>> rs = new ArrayList<>();
    LinkedList<Integer> list = new LinkedList<>();
    HashSet<String> set = new HashSet<>();

    public void dfs(int[] candidates, int i, int target) {
        if (target == 0) {
            ArrayList<Integer> s = new ArrayList<>(list);
            Collections.sort(s);
            String toString = s.toString();
            if (!set.contains(toString)) {
                rs.add(s);
            }
            set.add(toString);
        }
        if (target < 0) {
            return;
        }
        for (int i1 = i; i1 < candidates.length; i1++) {
            list.addLast(candidates[i1]);
            dfs(candidates, i1 + 1, target - candidates[i1]);
            list.removeLast();
        }
    }

}
