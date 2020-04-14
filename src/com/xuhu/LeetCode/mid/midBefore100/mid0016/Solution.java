package com.xuhu.LeetCode.mid.midBefore100.mid0016;


import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // 首先把数组排序
        Arrays.sort(nums);
        //定义一个min值，表示数组中的三个数  与target的差值
        // 即 nums[1] + nums[2] + nums[3] - min = target
        // nums[1] + nums[2] + nums[3] = target + min
        int min = Integer.MAX_VALUE;
        int len = nums.length;
        for(int i = 0; i < len - 2; i++){
            //定义 i  然后对于其后面的数组进行双指针逼近
            int begin = i + 1;
            int end = len - 1;
            while (begin < end){
                int tempSum = nums[begin] + nums[end];
                int tempTarget = target - nums[i];
                //找出绝对值最小的min （需要注意的时候存放min时需要区分正负号）
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