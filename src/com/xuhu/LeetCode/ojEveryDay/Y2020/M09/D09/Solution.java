package com.xuhu.LeetCode.ojEveryDay.Y2020.M09.D09;


import java.util.ArrayList;
import java.util.List;

class Solution {
    /**
     * 典型回溯剪枝操作  具体不详细写了
     * @param candidates
     * @param target
     * @return
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ansList = new ArrayList<> ();
        backTrace(ansList,new ArrayList<> (),0,0,candidates,target);
        return ansList;
    }

    private void backTrace(List<List<Integer>> ansList, List<Integer> list, int nowTarget, int lastIndex,int[] candidates, int target){
        if (nowTarget == target){
            ansList.add(new ArrayList<>(list));
            return;
        }
        if (nowTarget > target){
            return;
        }
        for (int i = lastIndex; i < candidates.length; i++) {
            if (candidates[i] > (target-nowTarget)){
                continue;
            }
            list.add(candidates[i]);
            backTrace(ansList,list,nowTarget+candidates[i],i,candidates,target);
            list.remove(list.size() - 1);
        }
    }
}