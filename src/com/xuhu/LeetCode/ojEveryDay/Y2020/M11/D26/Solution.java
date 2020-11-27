package com.xuhu.LeetCode.ojEveryDay.Y2020.M11.D26;


import java.util.Arrays;

class Solution {

    public int maximumGap(int[] nums) {
        if (null == nums || nums.length < 2){
            return 0;
        }
        int n = nums.length;
        int minVal = Arrays.stream(nums).min().getAsInt();
        int maxVal = Arrays.stream(nums).max().getAsInt();

        int d = Math.max(1,(maxVal - minVal) / (n-1));

        int bucketSize = (maxVal - minVal) / d +1;

        // 定义桶数组 - 仅记录最大最小值
        int[][] bucket = new int[bucketSize][2];
        for (int i = 0; i < bucketSize; i++) {
            Arrays.fill(bucket[i],-1);
        }

        for (int i = 0; i < n; i++){
            int idx = (nums[i] - minVal) / d;
            if (bucket[idx][0] == -1){
                bucket[idx][0] = bucket[idx][1] = nums[i];
            }else {
                bucket[idx][1] = Math.max(bucket[idx][1], nums[i]);
                bucket[idx][0] = Math.min(bucket[idx][0], nums[i]);
            }
        }
        int res = 0;
        int pre = -1;

        for (int i = 0; i < bucketSize; i++){
            if (bucket[i][0] == -1){
                continue;
            }
            if (pre != -1){
                res = Math.max(res,bucket[i][0] - bucket[pre][1]);
            }
            pre = i;
        }

        return res;

    }

    /**
     * 草率草率，不该直接sort 不讲武德
     * @param nums nums
     * @return ans
     */
    public int maximumGap01(int[] nums) {
        if (null == nums || nums.length < 2){
            return 0;
        }
        Arrays.sort(nums);
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max,nums[i] - nums[i-1]);
        };
        return max;
    }
}