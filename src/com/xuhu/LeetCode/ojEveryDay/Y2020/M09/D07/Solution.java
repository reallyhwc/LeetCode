package com.xuhu.LeetCode.ojEveryDay.Y2020.M09.D07;


import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {

    /**
     * 小顶堆优化版本 18ms
     * @param nums
     * @param k
     * @return
     */
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> map.get(o1) - map.get(o2));

        for ( Integer num : map.keySet()){
            queue.add(num);
            while (queue.size() > k){
                queue.poll();
            }
        }

        int[] ans = new int[k];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = queue.poll();
        }
        return ans;
    }

    /**
     * 小顶堆原始版本 20ms
     * @param nums
     * @param k
     * @return
     */
    public int[] topKFrequent1(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> queue = new PriorityQueue<>((o1, o2) -> o1.getValue() - (o2.getValue()));

        for ( Map.Entry<Integer,Integer> entry : map.entrySet()){
            queue.add(entry);
            while (queue.size() > k){
                queue.poll();
            }
        }

        int[] ans = new int[k];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = queue.poll().getKey();
        }
        return ans;
    }
}