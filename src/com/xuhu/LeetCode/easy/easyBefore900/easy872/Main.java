package com.xuhu.LeetCode.easy.easyBefore900.easy872;

import com.xuhu.LeetCode.a.util.CreateBinaryTreeByArray;
import com.xuhu.LeetCode.a.util.ListUtils;
import com.xuhu.LeetCode.a.util.TreeNode;
import com.xuhu.LeetCode.a.util.TreeOperation;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        Integer[] array = {3,5,1,6,2,9,8,null,null,7,4};
        TreeNode node = CreateBinaryTreeByArray.createBinaryTreeByArray(array,0);
        TreeOperation.show(node);
        ListUtils.printList(solution.method(node,new ArrayList<Integer>()));

        System.out.println(solution.leafSimilar(node,node));
    }
}