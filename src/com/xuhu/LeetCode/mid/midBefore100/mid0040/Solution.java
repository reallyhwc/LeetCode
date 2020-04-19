package com.xuhu.LeetCode.mid.midBefore100.mid0040;


import java.lang.reflect.Array;
import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int len = candidates.length;
        List<List<Integer>> listAll = new ArrayList<>();
        if(len == 0) return listAll;

        Arrays.sort(candidates);
        Deque<Integer> path = new ArrayDeque<>(len);
        dfs(candidates,len,0,target,path,listAll);
        return listAll;
    }

    private void dfs(int[] candidates, int len, int begin, int target, Deque<Integer> path, List<List<Integer>> listAll){
        if(target == 0){
            listAll.add(new ArrayList<>(path));
            return;
        }
        for(int i = begin; i < len; i++){
            //大剪枝
            if(target < candidates[i]){
                break;
            }

            if(i > begin && candidates[i] == candidates[i-1]){
                continue;
            }

            path.add(candidates[i]);

            dfs(candidates,len,i+1,target - candidates[i],path,listAll);
            path.removeLast();
        }
    }


    //这里仅仅只是得出了结果，并未对结果进行去重
//    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
//        List<List<Integer>> listALL = new ArrayList<List<Integer>>();
//        List<Integer> list = new ArrayList<>();
//        Arrays.sort(candidates);
//        boolean[] hasUsed = new boolean[candidates.length];
//
//        find(listALL,list,candidates,target,hasUsed);
//        return listALL;
//    }
//
//    private void find(List<List<Integer>> listALL, List<Integer> list, int[] candidates, int target, boolean[] hasUsed){
//        if(target == 0){
//            listALL.add(list);
//            return;
//        }
//        if (target < candidates[0]){
//            return;
//        }
//        for(int i = 0; i < candidates.length; i++){
//            if(!hasUsed[i]){
//                List<Integer> temp = new ArrayList<>(list);
//                temp.add(candidates[i]);
//                hasUsed[i] = true;
//                find(listALL,temp,candidates,target - candidates[i],hasUsed);
//                hasUsed[i] = false;
//            }
//        }
//    }
}