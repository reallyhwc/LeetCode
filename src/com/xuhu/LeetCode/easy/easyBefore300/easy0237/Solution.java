package com.xuhu.LeetCode.easy.easyBefore300.easy0237;

import com.xuhu.LeetCode.a.util.ListNode;

class Solution {

    //题目意思诡异,,,
    // 目的就是，删掉node的头结点，但是又不影响node前面的值
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}