package com.xuhu.LeetCode.mid.midBefore200.mid0133;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xuhu
 * @date 2020-05-14 21:01
 */
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}