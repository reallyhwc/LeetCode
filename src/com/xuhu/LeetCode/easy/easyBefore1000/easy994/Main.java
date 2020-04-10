package com.xuhu.LeetCode.easy.easyBefore1000.easy994;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.orangesRotting(new int[][]{{2,1,1},{1,1,0},{0,1,1}}));
        System.out.println(solution.orangesRotting(new int[][]{{2,1,1},{0,1,1},{1,0,1}}));
        System.out.println(solution.orangesRotting(new int[][]{{0,2}}));
    }
}