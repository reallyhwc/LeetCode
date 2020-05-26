package com.xuhu.LeetCode.mid.midBefore200.mid0138;


/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) {
            return head;
        }
        Node node = head;
        // copy 链表
        while (node != null){
            Node clone = new Node(node.val);
            clone.next = node.next;
            Node temp = node.next;
            node.next = clone;
            node = temp;
        }

        node = head;
        while (node != null){
            node.next.random = node.random == null ? null : node.random.next;
            node = node.next.next;
        }

        node = head;
        Node cloneHead = head.next;
        while (node.next != null){
            Node temp = node.next;
            node.next = node.next.next;
            node = temp;
        }
        return cloneHead;
    }
}