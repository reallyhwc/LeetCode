package com.xuhu.LeetCode.mid.midBefore300.mid0222;


import com.xuhu.LeetCode.a.util.TreeNode;

class Solution {


    // 再来个二分
    public int countNodes(TreeNode root) {
        if (root == null){
            return 0;
        }
        int LD = getDepth(root.left);
        int RD = getDepth(root.right);
        if(LD == RD){
            // 左右子树深度相同，说明左子树为满二叉树
            // 那么总的节点数目为 左子树（2^LD-1） + 根节点（1） + 右子树（countNodes(root.right)）
            return (1<<LD )+ countNodes(root.right);
        }else {
            // 左右子树深度不相同 但是根据完全二叉树性质 此时右子树为满二叉树
            // 那么总的节点数目为 ： 左子树（countNodes(root.left)） + 根节点（1） + 右子树（2^RD-1）
            return (1<<RD) + countNodes(root.left);
        }
    }

    private int getDepth(TreeNode root){
        int depth = 0;
        while (root != null){
            depth++;
            root = root.left;
        }
        return depth;
    }

    // 来个递归解法 太简单了没意义
    public int countNodes1(TreeNode root) {
        if (root == null){
            return 0;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}