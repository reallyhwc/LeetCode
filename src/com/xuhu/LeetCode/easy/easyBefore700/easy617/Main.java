package com.xuhu.LeetCode.easy.easyBefore700.easy617;

import com.xuhu.LeetCode.a.util.CreateBinaryTreeByArray;
import com.xuhu.LeetCode.a.util.TreeNode;
import com.xuhu.LeetCode.a.util.TreeOperation;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        Integer[] array = {1,3,2,5,null,null,null};
        Integer[] array1 = {2,1,3,null,4,null,7};

        TreeNode treeNode = CreateBinaryTreeByArray.createBinaryTreeByArray(array,0);
        TreeNode treeNode1 = CreateBinaryTreeByArray.createBinaryTreeByArray(array1,0);

//        TreeOperation.show(treeNode);
//        System.out.println();
//        TreeOperation.show(treeNode1);
//        System.out.println();
        TreeOperation.show(solution.mergeTrees(treeNode,treeNode1));

        System.out.println();
    }
}