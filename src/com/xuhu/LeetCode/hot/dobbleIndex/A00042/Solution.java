package com.xuhu.LeetCode.hot.dobbleIndex.A00042;

class Solution {
    public int trap(int[] height) {

        //  接雨水，整体还是偏向于数学视角思路
        int sum = 0;

        int[] leftH = new int[height.length];
        int[] rightH = new int[height.length];

        leftH[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftH[i] = Math.max(leftH[i - 1], height[i]);
        }
        rightH[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightH[i] = Math.max(rightH[i + 1], height[i]);
        }
        for (int i = 0; i < height.length; i++) {
            sum += (Math.min(leftH[i], rightH[i]) - height[i]);
        }

        return sum;
    }
}