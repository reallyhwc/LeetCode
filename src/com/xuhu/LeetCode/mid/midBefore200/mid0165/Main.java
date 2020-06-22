package com.xuhu.LeetCode.mid.midBefore200.mid0165;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.compareVersion("0.1","1.1"));
        System.out.println(solution.compareVersion("1.0.1","1"));
        System.out.println(solution.compareVersion("7.5.2.4","7.5.3"));
        System.out.println(solution.compareVersion("1.01","1.001"));
        System.out.println(solution.compareVersion("1.0","1.0.0"));
    }
}