package com.xuhu.LeetCode.easy.easyBefore300.easy0257;

import com.xuhu.LeetCode.a.util.CreateBinaryTreeByArray;
import com.xuhu.LeetCode.a.util.TreeNode;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        Integer[] array = {1,2,3,null,5};
        TreeNode root = CreateBinaryTreeByArray.createBinaryTreeByArray(array,0);
        for(String str : solution.binaryTreePaths(root)){
            System.out.println(str);
        }
    }
}