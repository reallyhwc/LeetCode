package com.xuhu.LeetCode.ojEveryDay.Y2020.M09.D10;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ansList = new ArrayList<> ();
        backTrace(candidates,target,ansList,new ArrayList<> (),-1);
        return ansList;
    }

    private void backTrace(int[] candidates, int target, List<List<Integer>> ansList, List<Integer> list, int lastIndex){
        if (target == 0){
            ansList.add(new ArrayList<>(list));
            return;
        }
        if (target < 0){
            return;
        }
        for (int i = lastIndex + 1; i < candidates.length; i++){
            if (candidates[i] > target) {
                return;
            }
            if (i > lastIndex+1 && candidates[i] == candidates[i-1]){
                continue;
            }

            list.add(candidates[i]);
            backTrace(candidates,target - candidates[i],ansList,list,i);
            list.remove(list.size() - 1);
        }
    }
}