package com.xuhu.LeetCode.mid.midBefore300.mid0223;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.computeArea(-3, 0, 3, 4, 0, -1, 9, 2));
        System.out.println(solution.computeArea(-2,-2,2,2,3,3,4,4));
        System.out.println(solution.computeArea(-2,-2,2,2,-4,3,-3,4));
        System.out.println(solution.computeArea(-2,-2,2,2,-4,-4,-3,-3));
        System.out.println(solution.computeArea(-2,-2,2,2,3,-4,4,-3));
    }
}