package com.xuhu.LeetCode.easy0141;

import com.xuhu.LeetCode.a.util.ListNode;

import java.util.Date;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListNode node = new ListNode(3);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(-4);
        node.next = node1;
        node1.next = node2;
        node2.next = node3;
//        node3.next = node1;
        System.out.println(solution.hasCycle(node));
    }
}