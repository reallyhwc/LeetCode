package com.xuhu.LeetCode.a.util;

import java.util.List;

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

    public static ListNode convertArrayToListNode(int[] array){
        if(null == array || array.length == 0){
            return null;
        }
        ListNode temp = new ListNode(array[0]);
        ListNode result = temp;
        for(int i = 1; i < array.length; i++){
            ListNode node = new ListNode(array[i]);
            temp.next = node;
            temp = temp.next;
        }
        return result;
    }

    public static ListNode revertListNode(ListNode node){
        ListNode ans = null;
        ListNode tempNode = node;
        while (tempNode != null){
            node = tempNode;
            tempNode = tempNode.next;
            node.next = ans;
            ans = node;
        }
        return ans;
    }
}
