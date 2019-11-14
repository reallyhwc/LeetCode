package com.xuhu.LeetCode.easy.easyBefore300.easy0206;

import com.xuhu.LeetCode.a.util.ListNodeUtil;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] array = {1,2,3,4,5};
        ListNodeUtil.printListNode(solution.reverseList(ListNodeUtil.convertArrayToListNode(array)));
    }
}