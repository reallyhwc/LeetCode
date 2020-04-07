package com.xuhu.LeetCode.easy.easyBefore900.easy897;

import com.xuhu.LeetCode.a.util.CreateBinaryTreeByArray;
import com.xuhu.LeetCode.a.util.TreeNode;
import com.xuhu.LeetCode.a.util.TreeOperation;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        TreeNode node = CreateBinaryTreeByArray.createBinaryTreeByArray(new Integer[]{5,3,6,2,4,null,8,1,null,null,null,null,null,7,9},0);
        TreeOperation.show(node);
        System.out.println("------------------------------------------------");
        TreeOperation.show(solution.increasingBST(node));
    }
}