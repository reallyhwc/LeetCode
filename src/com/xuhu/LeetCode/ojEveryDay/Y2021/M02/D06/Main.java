package com.xuhu.LeetCode.ojEveryDay.Y2021.M02.D06;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.maxScore(new int[]{1,2,3,4,5,6,1}, 3));
        System.out.println(solution.maxScore(new int[]{2,2,2}, 2));
        System.out.println(solution.maxScore(new int[]{9,7,7,9,7,7,9}, 7));
        System.out.println(solution.maxScore(new int[]{1,1000,1}, 1));
        System.out.println(solution.maxScore(new int[]{1,79,80,1,1,1,200,1}, 3));
    }
}