package com.xuhu.LeetCode.easy.easyBefore600.easy0572;

import com.xuhu.LeetCode.a.util.CreateBinaryTreeByArray;
import com.xuhu.LeetCode.a.util.TreeNode;
import com.xuhu.LeetCode.a.util.TreeOperation;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        Integer[] array1 = {3,4,5,1,2,null,null,null,null,0};
        Integer[] array2 = {4,1,2};
        TreeNode s = CreateBinaryTreeByArray.createBinaryTreeByArray(array1,0);
        TreeNode t = CreateBinaryTreeByArray.createBinaryTreeByArray(array2,0);
        TreeOperation.show(s);
        TreeOperation.show(t);
        System.out.println(solution.isSubtree(s,t));
    }
}