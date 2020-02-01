package com.xuhu.LeetCode.easy.easyBefore500.easy0448;


import java.util.ArrayList;
import java.util.List;

class Solution {
    /**
     * 思路： 从前到后走一遍当前数组
     * 把下表为|nums[i]|的变为负数 知道最后再走一遍整个数组，还为正数的，即为数组中没有出现过的数字
     *
     * @param nums nums
     * @return List - 数组中没有出现过的数字
     */
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


