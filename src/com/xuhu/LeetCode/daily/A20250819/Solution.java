package com.xuhu.LeetCode.daily.A20250819;


class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int now = 0;
        long sum = 0;
        for (int num : nums) {
            if (num == 0) {
                now++;
            } else {
                sum += getDetail(now);
                now = 0;
            }
        }
        if (now > 0) {
            sum += getDetail(now);
        }
        return sum;
    }

    private Long getDetail(int num) {
        return ((long) num * (num + 1) / 2);
    }
}