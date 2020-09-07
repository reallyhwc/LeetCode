package com.xuhu.LeetCode.mid.midBefore200.mid0199;

import com.xuhu.LeetCode.a.util.ListUtils;
import com.xuhu.LeetCode.a.util.TreeUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListUtils.printList(solution.rightSideView(TreeUtils.create(new Integer[]{1,2,3,null,5,null,4},0)));
    }
}