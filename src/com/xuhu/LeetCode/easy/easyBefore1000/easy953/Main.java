package com.xuhu.LeetCode.easy.easyBefore1000.easy953;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.isAlienSorted(new String[]{"hello","leetcode"},"hlabcdefgijkmnopqrstuvwxyz"));
        System.out.println(solution.isAlienSorted(new String[]{"word","world","row"},"worldabcefghijkmnpqstuvxyz"));
        System.out.println(solution.isAlienSorted(new String[]{"apple","app"},"abcdefghijklmnopqrstuvwxyz"));
    }
}