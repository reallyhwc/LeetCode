package com.xuhu.LeetCode.easy.easyBefore500.easy0496;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] array = {1,3,4,2};
        int[] array1 = {4,1,2};

        ListUtils.pringlnArrays(solution.nextGreaterElement(array1,array));
    }
}