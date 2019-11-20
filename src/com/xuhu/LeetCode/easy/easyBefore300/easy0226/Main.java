package com.xuhu.LeetCode.easy.easyBefore300.easy0226;

import com.xuhu.LeetCode.a.util.CreateBinaryTreeByArray;
import com.xuhu.LeetCode.a.util.TreeNode;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        Integer[] array = {4,2,7,1,3,6,9};
        TreeNode node = solution.invertTree(CreateBinaryTreeByArray.createBinaryTreeByArray(array,0));
        System.out.println();
    }
}