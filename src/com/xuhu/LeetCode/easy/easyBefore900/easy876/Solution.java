package com.xuhu.LeetCode.easy.easyBefore900.easy876;


import com.xuhu.LeetCode.a.util.ListNode;

import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode l1 = head;
        ListNode l2 = head;
        while (l2.next != null){
            l1 = l1.next;
            l2 = l2.next;
            if(l2 != null){
                l2 = l2.next;
            }
        }
        return l1;
    }
}