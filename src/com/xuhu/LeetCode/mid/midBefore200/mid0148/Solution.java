package com.xuhu.LeetCode.mid.midBefore200.mid0148;


import com.xuhu.LeetCode.a.util.ListNode;

class Solution {
    public ListNode sortList(ListNode head) {
        return head == null ? null : mergeSort(head);
    }

    private ListNode mergeSort(ListNode node){
        if(node.next == null) return node;
        ListNode p = node;
        ListNode q = node;
        ListNode pre = null;
        while (q != null && q.next != null){
            pre = p;
            p = p.next;
            q = q.next.next;
        }
        pre.next = null;
        ListNode l = mergeSort(node);
        ListNode r = mergeSort(p);
        return merge(l,r);
    }

    private ListNode merge(ListNode node1, ListNode node2){
        ListNode ans = new ListNode(0);
        ListNode cur = ans;
        while (node1 != null && node2 != null){
            if(node1.val <= node2.val){
                cur.next = node1;
                cur = cur.next;
                node1 = node1.next;
            }else {
                cur.next = node2;
                cur = cur.next;
                node2 = node2.next;
            }
        }
        if(node1 != null)cur.next = node1;
        if(node2 != null)cur.next = node2;
        return ans.next;
    }
}