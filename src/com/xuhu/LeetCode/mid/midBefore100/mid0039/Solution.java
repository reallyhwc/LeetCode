package com.xuhu.LeetCode.mid.midBefore100.mid0039;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> listALL = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);

        find(listALL,list,candidates,target,0);


        return listALL;

    }

    private void find(List<List<Integer>> listALl, List<Integer> list, int[] candidates, int target, int num){
        if(target == 0){
            listALl.add(list);
            return;
        }
        if(target < candidates[0]){
            return;
        }

        for(int i = num; i < candidates.length; i++){
            //拷贝一份 避免影响原来的List
            List<Integer> temp = new ArrayList<>(list);
            temp.add(candidates[i]);
            find(listALl,temp,candidates,target - candidates[i], i);
        }
    }
}