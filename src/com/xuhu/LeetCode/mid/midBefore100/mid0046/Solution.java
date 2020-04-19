package com.xuhu.LeetCode.mid.midBefore100.mid0046;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> listAll = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean[] hasUsed = new boolean[nums.length];
        find(listAll,list,0,nums.length,nums,hasUsed);
        return listAll;
    }

    private void find(List<List<Integer>> listAll, List<Integer> list, int num, int len, int[] nums, boolean[] hasUsed){
        if(num == len){
            listAll.add(list);
            return;
        }
        if(num > len){
            return;
        }

        for(int i = 0; i < len; i++){
            if(!hasUsed[i]){
                List<Integer> temp = new ArrayList<>(list);
                temp.add(nums[i]);
                hasUsed[i] = true;
                find(listAll,temp,num+1,len,nums,hasUsed);
                hasUsed[i] = false;
            }
        }
    }
}