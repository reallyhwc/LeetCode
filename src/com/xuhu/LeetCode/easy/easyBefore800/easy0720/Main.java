package com.xuhu.LeetCode.easy.easyBefore800.easy0720;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        String[] strings = {"w","wo","wor","worl", "world"};
        String[] strings1 = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        System.out.println(solution.longestWord(strings));
        System.out.println(solution.longestWord(strings1));
    }
}