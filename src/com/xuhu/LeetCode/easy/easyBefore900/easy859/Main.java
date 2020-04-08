package com.xuhu.LeetCode.easy.easyBefore900.easy859;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.buddyStrings("ab","ba"));
        System.out.println(solution.buddyStrings("ab","ab"));
        System.out.println(solution.buddyStrings("aa","aa"));
        System.out.println(solution.buddyStrings("aaaaaaabc","aaaaaaacb"));
        System.out.println(solution.buddyStrings("","aa"));
    }
}