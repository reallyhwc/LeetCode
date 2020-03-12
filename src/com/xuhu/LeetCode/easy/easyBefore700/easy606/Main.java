package com.xuhu.LeetCode.easy.easyBefore700.easy606;

import com.xuhu.LeetCode.a.util.CreateBinaryTreeByArray;
import com.xuhu.LeetCode.a.util.TreeNode;
import com.xuhu.LeetCode.a.util.TreeOperation;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        Integer[] array = {1,2,3,4};
        Integer[] array1 = {1,2,3,null,4};
        TreeNode treeNode = CreateBinaryTreeByArray.createBinaryTreeByArray(array,0);
        TreeNode treeNode1 = CreateBinaryTreeByArray.createBinaryTreeByArray(array1,0);
        TreeOperation.show(treeNode);
        TreeOperation.show(treeNode1);
        System.out.println(solution.tree2str(treeNode));
        System.out.println(solution.tree2str(treeNode1));
    }
}