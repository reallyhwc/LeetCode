package com.xuhu.LeetCode.ojEveryDay.Y2020.M09.D21;

import com.xuhu.LeetCode.a.util.TreeOperation;
import com.xuhu.LeetCode.a.util.TreeUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        TreeOperation.show(solution.convertBST(TreeUtils.create(new Integer[]{5,2,13},0)));
    }
}