package com.xuhu.LeetCode.mid.midBefore200.mid0109;


import com.xuhu.LeetCode.a.util.ListNode;
import com.xuhu.LeetCode.a.util.TreeNode;

class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return  new TreeNode(head.val);

        ListNode pre = head;
        ListNode p = pre.next;
        ListNode q = p.next;

        while (q != null && q.next != null){
            pre = pre.next;
            p = pre.next;
            q = q.next.next;
        }

        int val = p.val;
        TreeNode root = new TreeNode(val);
        pre.next = null;
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(p.next);
        return root;
    }
}