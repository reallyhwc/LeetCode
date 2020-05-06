package com.xuhu.LeetCode.a.common;

/**
 * @author xuhu
 * @date 2020-05-06 19:31
 */
// 完美二叉树，其所有叶子节点都在同一层，每个父节点都有两个子节点
// next 指的是 同层级的右边一个结点
public class Node {
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
};