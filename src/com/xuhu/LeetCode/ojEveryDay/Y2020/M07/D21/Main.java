package com.xuhu.LeetCode.ojEveryDay.Y2020.M07.D21;

import com.xuhu.LeetCode.a.util.TreeNode;
import com.xuhu.LeetCode.a.util.TreeOperation;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        for (TreeNode node : solution.generateTrees(3)){
            TreeOperation.show(node);
        }
    }
}