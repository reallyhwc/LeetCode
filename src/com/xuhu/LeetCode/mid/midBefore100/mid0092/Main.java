package com.xuhu.LeetCode.mid.midBefore100.mid0092;

import com.xuhu.LeetCode.a.util.ListNode;
import com.xuhu.LeetCode.a.util.ListNodeUtil;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListNode node = ListNodeUtil.convertArrayToListNode(new int[]{1,2,3,4,5});
        ListNodeUtil.printListNode(node);
        System.out.println("------------------------\n");
        ListNodeUtil.printListNode(solution.reverseBetween(node,2,4));
    }
}