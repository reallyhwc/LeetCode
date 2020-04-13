package com.xuhu.LeetCode.mid.midBefore100.mid0008;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.myAtoi("42"));
        System.out.println(solution.myAtoi("      -42"));
        System.out.println(solution.myAtoi("      42"));
        System.out.println(solution.myAtoi("   4399 acbsauidb"));
        System.out.println(solution.myAtoi("   - 1 000 999"));
    }
}