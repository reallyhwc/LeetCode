package com.xuhu.LeetCode.easy.easyBefore300.easy0235;

import com.xuhu.LeetCode.a.util.CreateBinaryTreeByArray;
import com.xuhu.LeetCode.a.util.TreeNode;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        Integer[] array = {6,2,8,0,4,7,9,null,null,3,5};
        Integer[] array1 = {2,null,null,3,5};
        Integer[] array2 = {8,7,9};
        Integer[] array3 = {4,3,5};
        TreeNode root = CreateBinaryTreeByArray.createBinaryTreeByArray(array,0);
        TreeNode left = CreateBinaryTreeByArray.createBinaryTreeByArray(array1,0);
        TreeNode right = CreateBinaryTreeByArray.createBinaryTreeByArray(array2,0);
        TreeNode temp = CreateBinaryTreeByArray.createBinaryTreeByArray(array3,0);
        System.out.println(solution.lowestCommonAncestor(root,left,right).val);
        System.out.println(solution.lowestCommonAncestor(root,left,temp).val);
    }
}