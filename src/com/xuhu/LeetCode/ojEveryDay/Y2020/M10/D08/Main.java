package com.xuhu.LeetCode.ojEveryDay.Y2020.M10.D08;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        char[] chars = "Hello Word!".toCharArray();
        solution.reverseString(chars);
        ListUtils.printChars(chars);
    }
}