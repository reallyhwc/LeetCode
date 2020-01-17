package com.xuhu.LeetCode.easy.easyBefore500.easy0448;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        if(null == nums || nums.length == 0){
            return new ArrayList<>();
        }
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            if(num < 0){
                num = -num;
            }
            num--;
            if(nums[num] > 0){
                nums[num] = -nums[num];
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                list.add(i + 1);
            }
        }
        return list;
    }
}


