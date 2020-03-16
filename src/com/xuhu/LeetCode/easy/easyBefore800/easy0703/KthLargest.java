package com.xuhu.LeetCode.easy.easyBefore800.easy0703;

import java.util.PriorityQueue;

/**
 * @author xuhu
 * @date 2020-03-16 14:43
 */
class KthLargest {
    final PriorityQueue<Integer> queue;
    final int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        queue = new PriorityQueue<>(k);
        for(int num : nums){
            add(num);
        }
    }

    public int add(int val) {
        if(queue.size() < k){
            queue.offer(val);
        }else if(val > queue.peek()){
            queue.poll();
            queue.offer(val);
        }
        return queue.peek();
    }
}
