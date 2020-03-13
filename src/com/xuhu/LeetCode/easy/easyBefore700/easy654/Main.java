package com.xuhu.LeetCode.easy.easyBefore700.easy654;

import com.xuhu.LeetCode.a.util.CreateBinaryTreeByArray;
import com.xuhu.LeetCode.a.util.TreeNode;
import com.xuhu.LeetCode.a.util.TreeOperation;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        Integer[] array = {5,3,6,2,4,null,7};
        TreeNode node = CreateBinaryTreeByArray.createBinaryTreeByArray(array,0);
        TreeOperation.show(node);

        System.out.println(solution.findTarget(node,9));
        System.out.println(solution.findTarget(node,28));
    }
}