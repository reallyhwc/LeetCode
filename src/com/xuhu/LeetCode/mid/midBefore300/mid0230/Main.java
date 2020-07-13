package com.xuhu.LeetCode.mid.midBefore300.mid0230;

import com.xuhu.LeetCode.a.util.TreeUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.kthSmallest(TreeUtils.create(new Integer[]{3,1,4,null,2},0),1));
        System.out.println(solution.kthSmallest(TreeUtils.create(new Integer[]{5,3,6,2,4,null,null,1},0),3));
    }
}