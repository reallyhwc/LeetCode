package com.xuhu.LeetCode.mid.midBefore200.mid0150;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
        System.out.println(solution.evalRPN(new String[]{"4", "13", "5", "/", "+"}));
        System.out.println(solution.evalRPN(new String[]{"4","13","5","/","+"}));
        System.out.println(solution.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
    }
}