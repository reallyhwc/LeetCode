package com.xuhu.LeetCode.mid.midBefore100.mid0056;


import java.util.BitSet;

class Solution {
    //这里是把bitSet 当做是一个一维数组用来存放区间
    public int[][] merge(int[][] intervals) {
        BitSet bitSet = new BitSet();
        int max = 0;
        for(int[] interval : intervals){
            int temp = interval[1] * 2 + 1;
            bitSet.set(interval[0] * 2,temp,true);
            max = Math.max(max,temp);
        }

        int index = 0;
        int count = 0;

        while (index < max){
            int start = bitSet.nextSetBit(index);
            int end = bitSet.nextClearBit(start);
            int[] item = {start / 2, (end - 1) / 2};
            intervals[count++] = item;

            index = end;
        }

        int[][] ans = new int[count][2];

        for(int i = 0; i < count; i++){
            ans[i] = intervals[i];
        }

        return ans;
    }
}