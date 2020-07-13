package com.xuhu.LeetCode.mid.midBefore300.mid0236;

import com.xuhu.LeetCode.a.util.TreeNode;
import com.xuhu.LeetCode.a.util.TreeOperation;
import com.xuhu.LeetCode.a.util.TreeUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        TreeNode five = TreeUtils.create(new Integer[]{5,6,2,null,null,7,4},0);
        TreeNode two = TreeUtils.create(new Integer[]{1,0,8},0);
        TreeNode three = new TreeNode(3);
        three.left = five;
        three.right = two;
        TreeOperation.show(solution.lowestCommonAncestor(three,five,two));
    }
}