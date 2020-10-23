package com.xuhu.LeetCode.ojEveryDay.Y2020.M10.D23;

import com.xuhu.LeetCode.a.util.ListNodeUtil;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(ListNodeUtil.convertArrayToListNode(new int[]{1,1,2,2,3,3,4,3,3,2,2,1,1})));
        System.out.println(solution.isPalindrome(ListNodeUtil.convertArrayToListNode(new int[]{1,1,2,2,3,3,4,3,3,2,2,1})));
    }
}