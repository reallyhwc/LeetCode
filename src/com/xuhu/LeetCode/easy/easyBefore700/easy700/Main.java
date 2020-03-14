package com.xuhu.LeetCode.easy.easyBefore700.easy700;

import com.xuhu.LeetCode.a.util.CreateBinaryTreeByArray;
import com.xuhu.LeetCode.a.util.TreeNode;
import com.xuhu.LeetCode.a.util.TreeOperation;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        Integer[] array = {4,2,7,1,3};
        TreeNode node = CreateBinaryTreeByArray.createBinaryTreeByArray(array,0);
        TreeOperation.show(node);
        TreeOperation.show(solution.searchBST(node,2));
        TreeOperation.show(solution.searchBST(node,5));
    }
}