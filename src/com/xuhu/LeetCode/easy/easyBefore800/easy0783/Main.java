package com.xuhu.LeetCode.easy.easyBefore800.easy0783;

import com.xuhu.LeetCode.a.util.CreateBinaryTreeByArray;
import com.xuhu.LeetCode.a.util.TreeNode;
import com.xuhu.LeetCode.a.util.TreeOperation;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        Integer[] array = {4,2,6,1,3,null,null};
        TreeNode node = CreateBinaryTreeByArray.createBinaryTreeByArray(array,0);
        TreeOperation.show(node);
        System.out.println(solution.minDiffInBST(node));
    }
}