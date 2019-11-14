package com.xuhu.LeetCode.easy.easyBefore300.easy0206;

import com.xuhu.LeetCode.a.util.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode result = null;
        ListNode temp = head;
        while (temp != null){
            ListNode next = temp.next;
            temp.next = result;
            result = temp;
            temp = next;
        }
        return result;
    }
}