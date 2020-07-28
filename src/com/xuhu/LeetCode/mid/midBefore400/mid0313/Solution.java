package com.xuhu.LeetCode.mid.midBefore400.mid0313;


import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {

    /**
     * 时间最好的解法
     * 也是采用多重指针的方式
     * 只是利用pre数组 + count数组来实现 比较巧妙
     * @param n
     * @param primes
     * @return
     */
    public int nthSuperUglyNumber(int n, int[] primes) {
        int len = primes.length;
        int[] ugly = new int[n];
        int[] count = new int[len];
        int[] pre = new int[len];
        Arrays.fill(pre, 1);
        ugly[0] = 1;

        for (int i = 1; i < n; i++) {
            int numMax = Integer.MAX_VALUE;
            for (int j = 0; j < len; j++){
                if (ugly[i-1] == pre[j]){
                    pre[j] = primes[j]*ugly[count[j]];
                    count[j]++;
                }
                numMax = Math.min(numMax,pre[j]);
            }
            ugly[i] = numMax;
        }
        return ugly[n - 1];
    }

    /**
     * 思路很好 利用小顶堆 但是时间炸了 击败10%
     * 稍微优化后也仅击败12%
     * 个人感觉还是炸在了小顶堆上面 需要一直处理小顶堆
     *
     * @param n
     * @param primes
     * @return
     */
    public int nthSuperUglyNumber2(int n, int[] primes) {
        PriorityQueue<Long> queue = new PriorityQueue<>();
        long res = 1;
        for (int i = 1; i < n; i++) {
            for (int prime : primes) {
                queue.add(prime * res);
            }
            res = queue.poll();
            while (i < n && !queue.isEmpty() && res == queue.peek()) {
                queue.poll();
            }
        }
        return (int) res;
    }

    /**
     * 自己做法  参考264 三指针法（用多指针即可）
     * 但是用时稍微长了点
     *
     * @param n
     * @param primes
     * @return
     */
    public int nthSuperUglyNumber1(int n, int[] primes) {
        int[] ans = new int[n];
        int pLength = primes.length;
        int[] indexArray = new int[pLength];
        ans[0] = 1;
        int index = 1;
        while (index < n) {
            int[] tempVal = new int[pLength];
            int minValue = Integer.MAX_VALUE;
            for (int i = 0; i < pLength; i++) {
                tempVal[i] = ans[indexArray[i]] * primes[i];
                minValue = Math.min(minValue, tempVal[i]);
            }
            for (int i = 0; i < pLength; i++) {
                if (minValue == tempVal[i]) {
                    indexArray[i]++;
                }
            }
            ans[index++] = minValue;
        }
        return ans[n - 1];
    }
}