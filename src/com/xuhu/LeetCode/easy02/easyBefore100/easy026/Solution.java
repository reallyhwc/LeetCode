package com.xuhu.LeetCode.easy02.easyBefore100.easy026;


import java.util.HashSet;
import java.util.Set;

class Solution {
    public int removeDuplicates(int[] nums) {
        // 双指针秒了
        Set<Integer> set = new HashSet<>();
        int index = 0;
        int pre = 0;

        for (; pre < nums.length; pre++) {
            if (!set.contains(nums[pre])) {
                set.add(nums[pre]);
                nums[index] = nums[pre];
                index++;
            }
        }

        return index;
    }
}