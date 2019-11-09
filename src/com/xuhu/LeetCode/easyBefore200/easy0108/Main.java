package com.xuhu.LeetCode.easyBefore200.easy0108;

import com.xuhu.LeetCode.a.util.CreateBinaryTreeByArray;
import com.xuhu.LeetCode.a.util.TreeNode;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        Integer[] array = {-10,-3,0,5,9};
        TreeNode result = CreateBinaryTreeByArray.createBinaryTreeByArray(array,0);
        System.out.println(result);
    }
}