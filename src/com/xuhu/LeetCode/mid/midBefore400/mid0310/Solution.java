package com.xuhu.LeetCode.mid.midBefore400.mid0310;


import java.util.*;

class Solution {
    /**
     * 思路 不要按照一个二叉树来从上到下的来理解
     * 以一颗视图意义上的四周扩散的形状来理解
     * 在下面的for循环中，每次去剥离开来叶子结点
     * 且根据数学上的规律 余下的根节点要么一个要么两个，不会有更多
     * 剥离到 剩余的节点数不超过两个 然后再返回
     * @param n
     * @param edges
     * @return
     */
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> ansList = new ArrayList<>();
        if (n == 1){
            ansList.add(0);
            return ansList;
        }
        int[] nums = new int[n];
        List<List<Integer>> list = new ArrayList<> ();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        for (int[] edge : edges){
            nums[edge[0]]++;
            nums[edge[1]]++;
            list.get(edge[0]).add(edge[1]);
            list.get(edge[1]).add(edge[0]);
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++){
            if (nums[i] == 1){
                queue.add(i);
            }
        }

        while (n > 2){
            int size = queue.size();
            for (int i = 0; i < size; i++){
                int temp = queue.poll();
                List<Integer> tempList = list.get(temp);
                if (tempList != null && tempList.size() > 0){
                    for (int val : tempList){
                        nums[val]--;
                        if (nums[val] == 1){
                            queue.add(val);
                        }
                    }
                }

                n--;
            }
        }

        while (!queue.isEmpty()){
            ansList.add(queue.poll());
        }
        return ansList;
    }
}