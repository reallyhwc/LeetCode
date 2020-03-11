package com.xuhu.LeetCode.easy.easyBefore600.easy0589;


import com.xuhu.LeetCode.a.util.Node;
import com.xuhu.LeetCode.a.util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
    List<Integer> list = null;
    public List<Integer> preorder(Node root) {
        //以下为采用递归做法
        list = new ArrayList<>();
        preorder_digui(root);
        return list;

        //以下采用迭代
//        return preorder_diedai(root);
    }

    private void preorder_digui(Node root){
        if(root == null){
            return ;
        }
        list.add(root.val);
        if(root.children != null && root.children.size() != 0){
            for(Node node : root.children){
                preorder_digui(node);
            }
        }
    }

    public List<Integer> preorder_diedai(Node root){
        List<Integer> list = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        if(root == null){
            return list;
        }
        stack.push(root);
        while (!stack.isEmpty()){
            Node node = stack.pop();
            list.add(node.val);
            if(node.children != null && node.children.size() != 0){
                for(int i = node.children.size() - 1; i >= 0; i--){
                    stack.push(node.children.get(i));
                }
            }
        }
        return list;

    }
}