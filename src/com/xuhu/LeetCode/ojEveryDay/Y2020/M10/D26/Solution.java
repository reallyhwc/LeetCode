package com.xuhu.LeetCode.ojEveryDay.Y2020.M10.D26;


import java.util.Arrays;

class Solution {
    public int[] smallerNumbersThanCurrent1(int[] nums) {
        int[] ans = new int[nums.length];
        Arrays.fill(ans, nums.length);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] <= nums[j]){
                    ans[i]--;
                }
            }
        }
        return ans;
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101];
        for(int i=0; i<nums.length; i++){
            count[nums[i]]++;
        }
        int pre = 0;
        int cur = 0;
        for(int i=1; i<count.length; i++){
            cur = count[i];
            count[i] = count[i-1] + pre;
            pre = cur;
        }
        count[0] = 0;
        int[] res = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            res[i] = count[nums[i]];
        }
        return res;
    }
}
