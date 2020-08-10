package com.xuhu.LeetCode.ojEveryDay.Y2020.M08.D08;


import com.xuhu.LeetCode.a.util.TreeNode;

class Solution {

    TreeNode t1, t2, pre;

    public void recoverTree(TreeNode root) {
        inOrder(root);
        int temp = t1.val;
        t1.val = t2.val;
        t2.val = temp;
    }

    /**
     * 解决问题关键思路
     * 对于二叉搜索树，中序遍历的结果是有序的
     * 执行中序遍历二叉树，如果仅有一个逆序对，则赋给t1,t2,如果有两个逆序对，则把前一个的前一个
     * 后一个的后一个赋值，最后再交换记录下来的两个节点的val即可
     * @param root
     */
    private void inOrder(TreeNode root) {
        if (root == null){
            return;
        }
        inOrder(root.left);
        if (pre != null && pre.val > root.val){
            if (t1 == null){
                t1 = pre;
            }
            t2 = root;
        }
        pre = root;
        inOrder(root.right);
    }
}