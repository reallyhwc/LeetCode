package com.xuhu.LeetCode.mid.midBefore100.mid0019;


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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //思路，先让一个node走n-1次，再定义一个node为头部，当做返回值
        //双node同步往后退，前一个Node撞到List尾部，则后一个node为返回值
        ListNode before = head;
        while (n > 1){
            before = before.next;
            n--;
        }
        ListNode ans = new ListNode(-1);
        ListNode result = ans;
        ans.next = head;
        while (before.next != null){
            before = before.next;
            ans = ans.next;
        }
        if(ans != null && ans.next != null){
            if(ans.next.next != null){
                ListNode node = ans.next.next;
                ans.next = node;
            }else {
                ans.next = null;
            }
        }
        return result.next;
    }
}