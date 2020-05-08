package com.xuhu.LeetCode.mid.midBefore200.mid0117;


import com.xuhu.LeetCode.a.common.Node;

class Solution {
    public Node connect(Node root) {
        if(root == null) return root;
        if(root.left != null && root.right != null){
            root.left.next = root.right;
        }
        if(root.left != null && root.right == null){
            root.left.next = getNext(root.next);
        }
        if(root.right != null){
            root.right.next = getNext(root.next);
        }
        connect(root.right);
        connect(root.left);
        return root;
    }

    private Node getNext(Node node){
        if(node == null) return null;
        if(node.left != null) return node.left;
        if(node.right != null) return node.right;
        if(node.next != null) return getNext(node.next);
        return null;
    }
}