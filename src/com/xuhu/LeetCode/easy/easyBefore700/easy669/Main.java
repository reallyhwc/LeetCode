package com.xuhu.LeetCode.easy.easyBefore700.easy669;

import com.xuhu.LeetCode.a.util.CreateBinaryTreeByArray;
import com.xuhu.LeetCode.a.util.TreeNode;
import com.xuhu.LeetCode.a.util.TreeOperation;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        Integer[] array = {1,0,2};
        Integer[] array1 = {3,0,4,null,2,null,null,null,null,1};
        TreeNode node = CreateBinaryTreeByArray.createBinaryTreeByArray(array,0);
        TreeNode node1 = CreateBinaryTreeByArray.createBinaryTreeByArray(array1,0);

        TreeOperation.show(node);
        TreeOperation.show(node1);

        TreeOperation.show(solution.trimBST(node,1,2));
        TreeOperation.show(solution.trimBST(node1,1,3));
        System.out.println();
    }
}