package com.xuhu.LeetCode.mid.midBefore300.mid0215;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {

    /**
     * 排序   没办法这个速度快
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }

    /**
     * 标准小顶堆做法  但是时间有点长
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargest1(int[] nums, int k) {
        // 使用小顶堆来存放数据
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        for (int item : nums){
            // 如果超过设定的最小堆的容量
            // 依次吧最小堆的最小值放出来
            while (minHeap.size() > k){
                minHeap.poll();
            }
            // 如果小于设定最小堆容量 直接入堆即可
            if(minHeap.size() < k){
                minHeap.add(item);
            }else {
                // 当前最小堆容量恰好等于设定值
                // 判断一下再决定是否入堆
                if(minHeap.peek() < item){
                    minHeap.poll();
                    minHeap.add(item);
                }
            }
        }
        return minHeap.peek();
    }
}