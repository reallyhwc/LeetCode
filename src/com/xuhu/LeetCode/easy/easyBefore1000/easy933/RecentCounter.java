package com.xuhu.LeetCode.easy.easyBefore1000.easy933;

import java.util.LinkedList;

/**
 * @author xuhu
 * @date 2020-04-08 18:42
 */
class RecentCounter {

    private LinkedList<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        while (!queue.isEmpty() && queue.peek() < t - 3000){
            queue.poll();
        }
        queue.offer(t);
        return queue.size();
    }
}