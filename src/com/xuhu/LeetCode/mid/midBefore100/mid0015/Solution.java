package com.xuhu.LeetCode.mid.midBefore100.mid0015;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> lists = new ArrayList<>();
        if(nums == null || nums.length < 3){
            return lists;
        }
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++){
            int before = i + 1;
            int end = nums.length - 1;
            while (before < end){
                int nowSum = nums[before] + nums[end];
                if(nowSum == -nums[i]){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[before]);
                    list.add(nums[end]);
                    lists.add(list);
                    //去重
                    while (before < end && nums[before] == nums[before+1]) before++;
                    while (before < end && nums[end] == nums[end - 1]) end--;
                    before++;
                    end--;
                }else if (nowSum > -nums[i]){
                    end--;
                }else if(nowSum < -nums[i]){
                    before++;
                }
            }
            while (i < nums.length - 3 && nums[i] == nums[i+1]) i++;
        }
        return lists;
    }
}