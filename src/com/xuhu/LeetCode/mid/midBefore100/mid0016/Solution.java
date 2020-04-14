package com.xuhu.LeetCode.mid.midBefore100.mid0016;


import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int len = nums.length;
        for(int i = 0; i < len - 2; i++){
            int begin = i + 1;
            int end = len - 1;
            while (begin < end){
                int tempSum = nums[begin] + nums[end];
                int tempTarget = target - nums[i];
                min = Math.abs(min) > Math.abs(tempSum-tempTarget) ? tempSum-tempTarget : min;
                if(tempSum == tempTarget){
                    return target;
                }else if(tempSum > tempTarget){
                    end--;
                }else if(tempSum < tempTarget){
                    begin++;
                }
            }
        }

        return target + min;
    }
}