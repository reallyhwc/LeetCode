package com.xuhu.LeetCode.ojEveryDay.Y2021.M02.D05;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.equalSubstring("abcd","bcdf",4));
        System.out.println(solution.equalSubstring("abcd","bcdf",3));
        System.out.println(solution.equalSubstring("abcd","bcdf",5));
        System.out.println(solution.equalSubstring("abcd","cdef",3));
        System.out.println(solution.equalSubstring("abcd","acde",0));
        System.out.println(solution.equalSubstring("abcd","eght",1));
    }
}