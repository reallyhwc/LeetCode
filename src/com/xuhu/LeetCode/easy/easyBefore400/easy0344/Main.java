package com.xuhu.LeetCode.easy.easyBefore400.easy0344;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        char[] s = {'h','e','l','l','o'};

        solution.reverseString(s);
        for(char c : s){
            System.out.println(c);
        }

    }
}