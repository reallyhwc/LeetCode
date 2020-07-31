package com.xuhu.LeetCode.ojEveryDay.Y2020.M07.D31;


class Solution {
    /**
     * 二分有点奇怪？
     * 直接遍历好了
     * @param nums
     * @return
     */
    public int findMagicIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == i){
                return i;
            }
        }
        return -1;
    }
}