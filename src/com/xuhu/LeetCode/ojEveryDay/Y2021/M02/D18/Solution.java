package com.xuhu.LeetCode.ojEveryDay.Y2021.M02.D18;


import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public int minKBitFlips(int[] A, int K) {
        int res = 0;
        Deque<Integer> que = new LinkedList<>();
        for (int i = 0; i < A.length; i++) {
            if (que.size() > 0 && i > que.peek() + K - 1) {
                que.removeFirst();
            }
            //1.本来是1，翻转奇数次变为0，所以需要再次翻转，放入队列
            //2.本来是0，翻转偶数次还是0，所以需要再次翻转，放入队列
            if (que.size() % 2 == A[i]) {
                if (i + K > A.length) return -1;
                que.add(i);
                res += 1;
            }
        }
        return res;
    }
}