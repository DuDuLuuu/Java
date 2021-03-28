package com.JDb.compute;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode39 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        dfs(candidates, 0, target);
        return rs;
    }

    List<List<Integer>> rs = new ArrayList<>();
    LinkedList<Integer> list = new LinkedList<>();

    public void dfs(int[] candidates, int i, int target) {
        if (target == 0) {
            rs.add(new ArrayList<>(list));
        }
        if (target < 0) {
            return;
        }
        for (int i1 = i; i1 < candidates.length; i1++) {
            list.addLast(candidates[i1]);
            dfs(candidates, i1, target - candidates[i1]);
            list.removeLast();
        }
    }

}
