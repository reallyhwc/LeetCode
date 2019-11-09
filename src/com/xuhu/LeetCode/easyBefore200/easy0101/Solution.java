package com.xuhu.LeetCode.easyBefore200.easy0101;


import com.xuhu.LeetCode.a.util.TreeNode;

class Solution {

    //递归解法
    public boolean isSymmetric(TreeNode root) {
        //root 为null 返回true
        if(root == null){
            return true;
        }
        return isMirrorTree(root.left,root.right);
    }

    //判断两个树是否为镜像树
    public boolean isMirrorTree(TreeNode p, TreeNode q) {
        //运用递归的思想
        //两个都为空 true
        if(p == null && q == null){
            return true;
        }
        //只有一个为空 false
        if(p == null || q == null){
            return false;
        }
        //判断 pq 的值是否相同，不同那不需要比较了，直接false
        //相同则，等同于把左右子树左右翻转一下，就和比较相同的树原理一样了
        return p.val == q.val ? (isMirrorTree(p.left,q.right) && isMirrorTree(p.right,q.left)) : false;
    }
}