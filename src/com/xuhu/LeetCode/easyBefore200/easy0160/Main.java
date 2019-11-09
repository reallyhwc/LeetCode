package com.xuhu.LeetCode.easyBefore200.easy0160;

import com.xuhu.LeetCode.a.util.ListNode;
import com.xuhu.LeetCode.a.util.ListNodeUtil;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListNode node = new ListNode(4);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(8);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);

        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(0);
        ListNode node7 = new ListNode(1);
        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        node5.next = node6;
        node6.next = node7;
        node7.next = node2;

        ListNodeUtil.printListNode(solution.getIntersectionNode(node,node5));
        System.out.println();
    }
}