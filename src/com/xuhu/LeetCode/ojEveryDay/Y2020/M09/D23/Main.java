package com.xuhu.LeetCode.ojEveryDay.Y2020.M09.D23;

import com.xuhu.LeetCode.a.util.TreeOperation;
import com.xuhu.LeetCode.a.util.TreeUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        TreeOperation.show(solution.mergeTrees(TreeUtils.create(new Integer[]{1,3,2,5},0)
                ,TreeUtils.create(new Integer[] {2,1,3,null,4,null,7},0)));
    }
}