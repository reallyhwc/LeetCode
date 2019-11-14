package com.xuhu.LeetCode.easy.easyBefore300.easy0205;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        String s = "egg";
        String t = "add";
        String s1 = "foo";
        String t1 = "bar";
        String s2 = "paper";
        String t2 = "title";
        System.out.println(solution.isIsomorphic(s, t));
        System.out.println(solution.isIsomorphic(s1, t1));
        System.out.println(solution.isIsomorphic(s2, t2));
    }
}