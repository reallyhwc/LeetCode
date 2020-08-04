package com.xuhu.LeetCode.mid.midBefore400.mid0328;


import com.xuhu.LeetCode.a.util.ListNode;

class Solution {
    /**
     * 指针之间的跳转逻辑请参考同文件夹下的图片
     * @param head
     * @return
     */
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null ) {
            return head;
        }
        ListNode start = head;
        ListNode mid = head.next;
        ListNode pre = head.next;
        ListNode end = head.next.next;
        while (end != null) {
            start.next = end;
            pre.next = end.next;
            end.next = mid;

            start = start.next;
            pre = pre.next;
            if (null != pre && pre.next != null) {
                end = pre.next;
            }else {
                break;
            }
        }
        return head;
    }
}