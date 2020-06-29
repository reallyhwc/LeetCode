package com.xuhu.LeetCode.mid.midBefore200.mid0200;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println();
        char[][] chars = {"11110".toCharArray(),
                          "11010".toCharArray(),
                          "11000".toCharArray(),
                          "00000".toCharArray()};
        char[][] chars1 = {"11000".toCharArray(),
                           "11000".toCharArray(),
                           "00100".toCharArray(),
                           "00011".toCharArray()};
        char[][] chars2 = {{'1'}};
        char[][] chars3 = {{'0'}};
        System.out.println(solution.numIslands(chars));
        System.out.println(solution.numIslands(chars1));
        System.out.println(solution.numIslands(chars2));
        System.out.println(solution.numIslands(chars3));
    }
}