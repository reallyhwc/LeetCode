package com.xuhu.LeetCode.easy.easyBefore200.easy0112;


import com.xuhu.LeetCode.a.util.TreeNode;

class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        //递归求解
        if(root == null){
            return false;
        }
        //如果是叶子结点，则判断当前sum是否与自己相等，相等则返回true
        if(root.left == null && root.right == null){
            return sum == root.val;
        }
        //否则，判断左右子树是否存在 sum-root.val的路径（一旦有一个符合，返回也是true）
        return hasPathSum(root.left,sum-root.val) || hasPathSum(root.right,sum-root.val);
    }
}