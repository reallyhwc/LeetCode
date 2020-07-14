package com.xuhu.LeetCode.mid.midBefore300.mid0260;


class Solution {
    public int[] singleNumber(int[] nums) {
        int diff = 0;
        for (int num : nums){
            diff ^= num;
        }
        // 计算出 diff中第一个1的位置 如6 二进制表示为110 那么第一个1位第二位，用二进制表示为10 同理  5 -》 101 -> 1
        // 这里的关键思路是： 计算出来的diff中 属于结果  a^b  的结果，取出这个数的二进制表示的第一个1  可以根据这个把数组中的数拆分成两部分
        // 每部分相与得出来的就是结果
        int diffNum = diff & (~diff+1);
        int a = 0;
        int b = 0;
        for (int num : nums){
            if ((num & diffNum) == 0){
                a ^= num;
            }else {
                b ^= num;
            }
        }

        return new int[]{a,b};
    }
}