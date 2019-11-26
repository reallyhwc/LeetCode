package com.xuhu.LeetCode.easy.easyBefore300.easy0234;

import com.xuhu.LeetCode.a.util.ListNodeUtil;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] array = {1,2,3,4};
        int[] array1 = {1,2,3,4,3,2,1};
        System.out.println(solution.isPalindrome(ListNodeUtil.convertArrayToListNode(array)));
        System.out.println(solution.isPalindrome(ListNodeUtil.convertArrayToListNode(array1)));
    }
}