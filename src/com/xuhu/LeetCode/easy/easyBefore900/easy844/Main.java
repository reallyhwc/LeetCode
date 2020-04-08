package com.xuhu.LeetCode.easy.easyBefore900.easy844;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.backspaceCompare("ab#c","ad#c"));
        System.out.println(solution.backspaceCompare("ab##","c#d#"));
        System.out.println(solution.backspaceCompare("a##c","#a#c"));
        System.out.println(solution.backspaceCompare("a#c","b"));
    }
}