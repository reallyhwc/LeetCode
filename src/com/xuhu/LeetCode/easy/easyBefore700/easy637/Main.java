package com.xuhu.LeetCode.easy.easyBefore700.easy637;

import com.xuhu.LeetCode.a.util.CreateBinaryTreeByArray;
import com.xuhu.LeetCode.a.util.ListUtils;
import com.xuhu.LeetCode.a.util.TreeNode;
import com.xuhu.LeetCode.a.util.TreeOperation;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        Integer[] array = {2147483647,2147483647,2147483647};
        TreeNode node = CreateBinaryTreeByArray.createBinaryTreeByArray(array, 0);
        TreeOperation.show(node);
        System.out.println();

        ListUtils.printList(solution.averageOfLevels(node));
    }
}