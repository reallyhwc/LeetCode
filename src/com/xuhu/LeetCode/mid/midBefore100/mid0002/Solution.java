package com.xuhu.LeetCode.mid.midBefore100.mid0002;


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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(-1);
        ListNode node = new ListNode(-1);
        ans= node;
        int addNum = 0;
        while (l1 != null || l2 != null || addNum != 0){
            int sum = addNum;
            sum += l1 != null ? l1.val : 0;
            sum += l2 != null ? l2.val : 0;

            if(l1 != null){
                l1 = l1.next;
            }

            if(l2 != null){
                l2 = l2.next;
            }

            if(sum > 9){
                addNum = sum / 10;
                sum = sum % 10;
            }else {
                addNum = 0;
            }
            node.next = new ListNode(sum);
            node = node.next;
        }
        return ans.next;
    }
}