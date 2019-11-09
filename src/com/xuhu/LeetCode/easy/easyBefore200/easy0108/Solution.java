package com.xuhu.LeetCode.easy.easyBefore200.easy0108;


import com.xuhu.LeetCode.a.util.TreeNode;

class Solution {
    //平衡二叉树-但是并不计较值，只要求能够高度差符合即可
    //采用分治法，去中间结点为root，数组左边生成的树当做左节点，右边的当做右节点即可

    public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums,0,nums.length - 1);
    }

    private TreeNode build(int[] nums, int l, int r){
        if(l > r){
            return null;
        }
        int m = (l + r) / 2;
        TreeNode root = new TreeNode(nums[m]);
        root.left = build(nums,l,m - 1);
        root.right = build(nums,m+1,r);
        return root;
    }
}