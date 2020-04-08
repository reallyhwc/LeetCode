package com.xuhu.LeetCode.easy.easyBefore1000.easy938;

import com.xuhu.LeetCode.a.util.CreateBinaryTreeByArray;
import com.xuhu.LeetCode.a.util.TreeNode;
import com.xuhu.LeetCode.a.util.TreeOperation;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        TreeNode node = CreateBinaryTreeByArray.createBinaryTreeByArray(new Integer[]{10,5,15,3,7,13,18,1,null,6},0);
        TreeOperation.show(node);
        System.out.println(solution.rangeSumBST(node,6,10));
    }
}