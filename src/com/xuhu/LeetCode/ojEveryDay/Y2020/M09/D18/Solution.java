package com.xuhu.LeetCode.ojEveryDay.Y2020.M09.D18;


import java.util.ArrayList;
import java.util.List;

class Solution {
    List<List<Integer>> list;
    public List<List<Integer>> permuteUnique(int[] nums) {
        list = new ArrayList<>();
        dfs(nums,0);
        return list;
    }

    private void dfs(int[] nums, int cur){
        if (cur == nums.length){
            List<Integer> tempList = new ArrayList<> ();
            for (int num : nums){
                tempList.add(num);
            }
            list.add(tempList);
            return;
        }
        for (int i = cur; i < nums.length; i++){
            if (canSwap(nums,cur,i)){
                swap(nums, cur, i);
                dfs(nums,cur+1);
                swap(nums, cur, i);
            }
        }
    }

    private boolean canSwap(int[] nums, int begin, int end){
        for (int i = begin; i < end; i++) {
            if (nums[i] == nums[end]){
                return false;
            }
        }
        return true;
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}