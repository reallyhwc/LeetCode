package com.xuhu.LeetCode.mid.midBefore300.mid0236;


import com.xuhu.LeetCode.a.util.TreeNode;

class Solution {
    /**
     * 老递归思路，第一时间没想出来
     *
     * 看看代码就懂了
     *
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null){
            return root;
        }
        if (root == p || root == q){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(left != null && right != null){
            return root;
        }else if (left != null){
            return left;
        }else if (right != null){
            return right;
        }
        return null;
    }
}