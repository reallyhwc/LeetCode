package com.xuhu.LeetCode.game.week.W2020_10_11.T02;


import com.xuhu.LeetCode.a.util.TreeNode;

import java.util.*;

class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        if (roads == null || roads.length == 0){
            return 0;
        }
        if (roads.length == 1){
            return 1;
        }
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            map.put(i,new ArrayList<> ());
        }

        for (int[] road : roads){
            nums[road[0]]++;
            nums[road[1]]++;
            map.get(road[0]).add(road[1]);
            map.get(road[1]).add(road[0]);
        }

        int max = 0;

        for (int i = 0 ;i < n-1; i++){
            for (int j = i+1; j < n; j++) {
                int tempNum = nums[i] + nums[j];
                if (map.get(i).contains(j)){
                    tempNum--;
                }
                max = Math.max(max,tempNum);
            }
        }


        return max;

    }
}