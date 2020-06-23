package com.xuhu.LeetCode.mid.midBefore200.mid0173;

import com.xuhu.LeetCode.a.util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class BSTIterator {

    Stack<TreeNode> stack ;

    /**
     * 这里其实采用了很多种方法
     * 包括初始 逆中序遍历入栈（整个二叉树）
     * 初始 中序遍历入List（整个二叉树）
     * 初始 中左续遍历入栈（中序遍历暂停法，用到那儿遍到哪儿）
     * @param root
     */
    public BSTIterator(TreeNode root) {
        stack = new Stack<TreeNode>();
        inorder(root);
    }

    private void inorder(TreeNode root){
        while (root != null){
            stack.push(root);
            root = root.left;
        }
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode node = stack.pop();
        if(node.right != null){
            inorder(node.right);
        }
        return node.val;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return stack.size() > 0;
    }
}