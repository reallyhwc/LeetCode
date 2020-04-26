package com.xuhu.LeetCode.mid.midBefore100.mid0082;

import com.xuhu.LeetCode.a.util.ListNode;
import com.xuhu.LeetCode.a.util.ListNodeUtil;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
//        ListNodeUtil.printListNode(solution.deleteDuplicates(ListNodeUtil.convertArrayToListNode(new int[]{1,2,3,3,4,4,5})));
        ListNodeUtil.printListNode(solution.deleteDuplicates(ListNodeUtil.convertArrayToListNode(new int[]{1,1,1,2,3})));
    }
}