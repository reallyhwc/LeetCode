package com.xuhu.LeetCode.mid.midBefore100.mid0094;

import com.xuhu.LeetCode.a.util.ListUtils;
import com.xuhu.LeetCode.a.util.TreeUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListUtils.printList(solution.inorderTraversal(TreeUtils.create(new Integer[]{1,null,2,null,null,3},0)));
    }
}