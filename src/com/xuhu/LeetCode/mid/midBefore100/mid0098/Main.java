package com.xuhu.LeetCode.mid.midBefore100.mid0098;

import com.xuhu.LeetCode.a.util.TreeUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.isValidBST(TreeUtils.create(new Integer[]{2,1,3},0)));
        System.out.println(solution.isValidBST(TreeUtils.create(new Integer[]{5,1,4,null,null,3,6},0)));
        System.out.println(solution.isValidBST(TreeUtils.create(new Integer[]{1,1},0)));
    }
}