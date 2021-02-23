package com.xuhu.LeetCode.ojEveryDay.Y2021.M02.D23;


class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        // 首先求出来老板不使用技能 满意的顾客数
        int sum = 0;
        int len = customers.length;
        for (int i = 0; i < len; i++) {
            if (grumpy[i] == 0){
                sum += customers[i];
            }
        }
        // 再使用滑动窗口 求出以X为长度的区间中，能够多满意的顾客的最大数目
        int windowMAX = 0;
        int windowValue = 0;
        int i = 0;
        for (; i < X; i++){
            if (grumpy[i] == 1) {
                windowValue += customers[i];
            }
        }
        while (i < len){
            windowMAX = Math.max(windowMAX,windowValue);
            windowValue -= (grumpy[i-X] == 1 ? customers[i-X] : 0);
            windowValue += (grumpy[i] == 1 ? customers[i] : 0);
            i++;
        }
        windowMAX = Math.max(windowMAX,windowValue);
        return sum + windowMAX;
    }
}