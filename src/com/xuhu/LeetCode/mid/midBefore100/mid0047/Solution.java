package com.xuhu.LeetCode.mid.midBefore100.mid0047;


import java.util.ArrayList;
import java.util.List;

class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        dfs(nums,0);
        return ans;
    }

    private void dfs(int[] nums, int cur){
        if(cur == nums.length){
            List<Integer> list = new ArrayList<>();
            for(int x : nums){
                list.add(x);
            }
            ans.add(list);
        }else {
            for(int i = cur; i < nums.length; i++){
                if(canSwap(nums,cur,i)){
                    swap(nums,cur,i);
                    dfs(nums,cur+1);
                    swap(nums,i,cur);
                }
            }

        }
    }

    //有点搞不懂为什么这里从begin找到end，找到相同的就return false
    private boolean canSwap(int[] nums, int begin, int end){
        for(int i = begin; i < end; i++){
            if(nums[i] == nums[end]){
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