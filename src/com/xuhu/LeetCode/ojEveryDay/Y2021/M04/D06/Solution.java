package com.xuhu.LeetCode.ojEveryDay.Y2021.M04.D06;


class Solution {
    public int removeDuplicates(int[] nums) {
        int ans = nums.length;
        int begin = 1;
        int end = 1;
        boolean secondSame = false;
        while (end < nums.length){
            if (nums[end] == nums[end-1]){
                if (!secondSame){
                    nums[begin] = nums[end];
                    begin++;
                    secondSame = true;
                }else {
                    ans--;
                }
            }else {
                nums[begin] = nums[end];
                begin++;
                secondSame = false;
            }
            end++;
        }
        return ans;
    }
}