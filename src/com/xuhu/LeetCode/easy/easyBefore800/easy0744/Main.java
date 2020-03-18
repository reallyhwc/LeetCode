package com.xuhu.LeetCode.easy.easyBefore800.easy0744;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        char[] letters = {'c','f','j'};
        System.out.println(solution.nextGreatestLetter(letters,'a'));
        System.out.println(solution.nextGreatestLetter(letters,'c'));
        System.out.println(solution.nextGreatestLetter(letters,'d'));
        System.out.println(solution.nextGreatestLetter(letters,'g'));
        System.out.println(solution.nextGreatestLetter(letters,'j'));
        System.out.println(solution.nextGreatestLetter(letters,'k'));
    }
}