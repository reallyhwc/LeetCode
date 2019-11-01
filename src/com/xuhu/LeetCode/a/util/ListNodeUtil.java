package com.xuhu.LeetCode.a.util;

/**
 * @author xuhu
 * @date 2019-10-31 22:52
 */
public class ListNodeUtil {

    /**
     * 处理ListNode 通用类函数之-打印ListNode
     * @param node 待打印ListNode
     * 依次打印出ListNode的每个节点
     */
    public static void printListNode(ListNode node){
        while (node != null){
            System.out.println(node.val);
            node = node.next;
        }
    }
}
