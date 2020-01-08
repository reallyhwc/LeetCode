package com.xuhu.LeetCode.easy.easyBefore500.easy0437;


import com.xuhu.LeetCode.a.util.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    //这是参考大佬的解法 思路比较厉害  自己想应该就是用双重递归法然后累计得出，时间复杂度会比较高，下回再试试时间复杂度是什么级别
    public int pathSum(TreeNode root, int sum) {
        return pathSum(root,sum,new int[1000],0);
    }

    /**
     * 计算符合要求的路径的function
     * @param root root根节点
     * @param sum sum
     * @param array array 保存路径 保存根节点到当前节点的路径
     * @param p 路径长度 保存根节点到当前结点的长度 如果相邻则p = 1
     * @return 符合要求的路径数
     */
    public int pathSum(TreeNode root, int sum, int[] array, int p){
        if(null == root){
            return 0;
        }
        int temp = root.val;
        int a = (temp == sum) ? 1 : 0;
        for(int i = p - 1; i >= 0; i--){
            temp += array[i];
            if(sum == temp){
                a++;
            }
        }
        array[p] = root.val;
        int b = pathSum(root.left,sum,array,p + 1);
        int c = pathSum(root.right,sum,array,p + 1);
        return a + b + c;
    }
}