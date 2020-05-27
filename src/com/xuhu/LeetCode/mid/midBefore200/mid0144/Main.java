package com.xuhu.LeetCode.mid.midBefore200.mid0144;

import com.xuhu.LeetCode.a.util.ListUtils;
import com.xuhu.LeetCode.a.util.TreeUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListUtils.pringlnList(solution.preorderTraversal(TreeUtils.create(new Integer[]{},0)));
        ListUtils.pringlnList(solution.preorderTraversal(TreeUtils.create(new Integer[]{1,null,2,null,null,3},0)));
    }
}