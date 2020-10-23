package com.xuhu.LeetCode.ojEveryDay.Y2020.M10.D23;


import com.xuhu.LeetCode.a.util.ListNode;

class Solution {
    /**
     * 判断是否为回文链表 拷贝数据做法：
     * 原地做法：
     * 首先找到中点截取前后端链表 反转后段链表然后再讲两段链表进行比较
     * 比较完成之后再把后半段反转回来拼接回去（避免对入参产生影响）
     * @param head 待判断链表
     * @return 当前链表是否为回文链表
     */
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null){
            return true;
        }
        ListNode mid = this.getMid(head);
        ListNode end = this.reverseListNode(mid.next);
        ListNode begin = head;

        ListNode tempEnd = end;

        while (end != null && end.val == begin.val){
            end = end.next;
            begin = begin.next;
        }

        mid.next = reverseListNode(tempEnd);
        return end == null;
    }

    public ListNode getMid(ListNode node){
        if (node == null || node.next == null) {
            return node;
        }
        ListNode p1 = node;
        ListNode p2 = node.next;
        while (p2 != null && p2.next != null){
            p1 = p1.next;
            p2 = p2.next.next;
        }
        return p1;
    }

    public ListNode reverseListNode(ListNode node){
        if (node == null || node.next == null) {
            return node;
        }
        ListNode ans = null;
        while (node != null){
            ListNode temp = node.next;
            node.next = ans;
            ans = node;
            node = temp;
        }
        return ans;
    }

    /**
     * 判断是否为回文链表 拷贝数据做法：
     * 拷贝翻转一个链表reverse 然后再比对数据
     * @param head 待判断链表
     * @return 当前链表是否为回文链表
     */
    public boolean isPalindrome1(ListNode head) {
        if (head == null || head.next == null){
            return true;
        }
        ListNode headTarget = head;
        ListNode reverse = null;
        while (head != null){
            ListNode temp = new ListNode(head.val);
            temp.next = reverse;
            reverse = temp;
            head = head.next;
        }

        while (headTarget != null && reverse != null){
            if (headTarget.val != reverse.val){
                return false;
            }else {
                headTarget = headTarget.next;
                reverse = reverse.next;
            }
        }

        if (reverse != null || headTarget != null){
            return false;
        }
        return true;
    }
}