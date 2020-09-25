package com.xuhu.LeetCode.ojEveryDay.Y2020.M09.D25;


import com.xuhu.LeetCode.a.util.TreeNode;

class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return method(inorder,postorder,0,inorder.length-1,0,postorder.length-1);
    }

    private TreeNode method(int[] inorder, int[] postorder, int iBegin, int iEnd, int pBegin, int pEnd) {
        if (iBegin > iEnd) {
            return null;
        }
        if (iBegin == iEnd) {
            return new TreeNode(inorder[iBegin]);
        }
        TreeNode node = new TreeNode(postorder[pEnd]);
        int temp = iBegin;
        while (temp <= iEnd && inorder[temp] != postorder[pEnd]) {
            temp++;
        }
        int size = temp - iBegin + 1;
        node.left = method(inorder, postorder, iBegin, iBegin + size-2, pBegin, pBegin + size-2);
        node.right = method(inorder, postorder, iBegin + size, iEnd, pBegin + size-1, pEnd - 1);
        return node;
    }
}