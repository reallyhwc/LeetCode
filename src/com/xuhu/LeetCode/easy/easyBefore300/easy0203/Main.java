package com.xuhu.LeetCode.easy.easyBefore300.easy0203;

import com.xuhu.LeetCode.a.util.ListNodeUtil;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] array = {1,2,3,4,5,5,6,6,7,8,9};
        System.out.println();
        ListNodeUtil.printListNode(solution.removeElements(ListNodeUtil.convertArrayToListNode(array),6));

    }
}