package com.xuhu.LeetCode.game.week.W2020_10_11.T02;

import com.xuhu.LeetCode.a.util.TreeNode;
import com.xuhu.LeetCode.a.util.TreeOperation;
import com.xuhu.LeetCode.a.util.TreeUtils;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.maximalNetworkRank(4, new int[][]{{0,1},{0,3},{1,2},{1,3}}));;
    }
}