package com.xuhu.LeetCode.easy.easyBefore300.easy0242;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        String s = "anagram";
        String t = "nagaram";
        System.out.println(solution.isAnagram(s,t));
        System.out.println(solution.isAnagram("rat","car"));
    }
}