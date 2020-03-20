package com.xuhu.LeetCode.easy.easyBefore900.easy819;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        String[] strings = {"hit"};
        String[] strings1 = {"bob", "hit"};
//        System.out.println(solution.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.",strings));
//        System.out.println(solution.mostCommonWord("Bob",strings1));
        System.out.println(solution.mostCommonWord("Bob. hIt, baLl",strings1));
    }
}