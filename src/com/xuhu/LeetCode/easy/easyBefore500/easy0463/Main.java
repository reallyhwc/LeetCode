package com.xuhu.LeetCode.easy.easyBefore500.easy0463;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[][] arrays = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        int[][] arrays1 = {{0,1}};
        System.out.println(solution.islandPerimeter(arrays));
        System.out.println(solution.islandPerimeter(arrays1));
    }
}