package com.xuhu.LeetCode.easy.easyBefore600.easy0538;

import com.xuhu.LeetCode.a.util.CreateBinaryTreeByArray;
import com.xuhu.LeetCode.a.util.TreeNode;
import com.xuhu.LeetCode.a.util.TreeOperation;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        Integer[] array = {5,2,13};
        TreeNode root = CreateBinaryTreeByArray.createBinaryTreeByArray(array,0);
        TreeOperation.show(root);
        solution.convertBST(root);
        TreeOperation.show(root);
    }
}