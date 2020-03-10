package com.xuhu.LeetCode.a.util;

import java.util.List;

/**
 * @author xuhu
 * @date 2020-03-10 14:20
 */
// Definition for a Node.
public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}