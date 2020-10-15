package com.xuhu.LeetCode.ojEveryDay.Y2020.M10.D15;

/**
 * @author xuhu
 * @date 2020-10-15 12:35
 */
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}