package com.xuhu.LeetCode.mid.midBefore100.mid0063;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.uniquePathsWithObstacles(new int[][]{{1,0}}));
        System.out.println(solution.uniquePathsWithObstacles(new int[][]{{0,0,0},{0,1,0},{0,0,0}}));
    }
}