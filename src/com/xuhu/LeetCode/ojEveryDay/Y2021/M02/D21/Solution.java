package com.xuhu.LeetCode.ojEveryDay.Y2021.M02.D21;


import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public int longestSubarray(int[] nums, int limit) {
        PriorityQueue<Integer> bigQueue = new PriorityQueue<> ((x,y)-> y-x);
        // 建立两个堆
        PriorityQueue<Integer> smallQueue = new PriorityQueue<> ();
        bigQueue.add(nums[0]);
        smallQueue.add(nums[0]);
        int begin = 0;
        int end = 1;
        int max = 1;
        while (end < nums.length){
            int nowTarget = Math.abs(bigQueue.peek() - smallQueue.peek());
            if (nowTarget <= limit){
                bigQueue.add(nums[end]);
                smallQueue.add(nums[end]);
                max = Math.max(max,end - begin);
                end++;
            }else {
                bigQueue.remove(nums[begin]);
                smallQueue.remove(nums[begin]);
                begin++;
            }
        }
        if (Math.abs(bigQueue.peek() - smallQueue.peek()) <= limit){
            max = Math.max(max,end - begin);
        }
        return max;
    }
}