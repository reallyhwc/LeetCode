package com.xuhu.LeetCode.easy.easyBefore600.easy0559;

import com.xuhu.LeetCode.a.util.Node;

/*
// Definition for a Node.
class Node {
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
};
*/
class Solution {
    public int maxDepth(Node root) {
        int max_d = 0;
        if(root == null){
            return 0;
        }
        if(null == root.children || root.children.size() == 0){
            return 1;
        }
        for(int i = 0; i < root.children.size(); i++){
            max_d = Math.max(max_d, maxDepth(root.children.get(i)));
        }
        return max_d + 1;
    }
}