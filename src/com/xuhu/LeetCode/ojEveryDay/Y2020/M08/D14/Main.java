package com.xuhu.LeetCode.ojEveryDay.Y2020.M08.D14;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.isValid("()"));
        System.out.println(solution.isValid("()[]{}"));
        System.out.println(solution.isValid("(]"));
        System.out.println(solution.isValid("([)]"));
        System.out.println(solution.isValid("{[]}"));
    }
}