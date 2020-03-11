package com.xuhu.LeetCode.easy.easyBefore600.easy0590;


import com.xuhu.LeetCode.a.util.Node;

import javax.management.NotificationEmitter;
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
    public List<Integer> postorder(Node root) {
        //以下解法 迭代
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        stack1.push(root);
        while (!stack1.isEmpty()){
            Node node = stack1.pop();
            if(node.children != null && node.children.size() > 0){
                for(Node tempNode : node.children){
                    stack1.push(tempNode);
                }
            }
            stack2.push(node);
        }
        while (!stack2.isEmpty()){
            list.add(stack2.pop().val);
        }
        return list;

        //以下解法  递归
//        return postorder_digui(root);
    }

    List<Integer> list = new ArrayList<>();
    public List<Integer> postorder_digui(Node root){
        digui_method(root);
        return list;
    }

    private void digui_method(Node root){
        if(root == null){
            return;
        }
        if(root.children != null && root.children.size() > 0){
            for(Node node : root.children){
                digui_method(node);
            }
        }
        list.add(root.val);
    }
}

