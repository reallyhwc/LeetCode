package com.xuhu.LeetCode.mid.midBefore200.mid0143;

import com.xuhu.LeetCode.a.util.ListNode;
import com.xuhu.LeetCode.a.util.ListNodeUtil;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListNode node = ListNodeUtil.convertArrayToListNode(new int[]{1,2,3,4});
//        solution.reorderList(node);
        ListNodeUtil.printListNode(ListNodeUtil.revertListNode(node));
    }
}