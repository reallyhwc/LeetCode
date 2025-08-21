package com.xuhu.LeetCode.hot.hash.A00128;


import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int max = 1;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int cur = num;
                int curMax = 1;
                while (set.contains(cur + 1)) {
                    cur++;
                    curMax++;
                }
                max = Math.max(curMax, max);
            }
        }
        return max;
    }
}