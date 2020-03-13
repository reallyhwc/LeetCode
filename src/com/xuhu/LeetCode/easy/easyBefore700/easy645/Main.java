package com.xuhu.LeetCode.easy.easyBefore700.easy645;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] array = {1,2,2,4};
        int[] array1 = {2,2};
        int[] array2 = {2,2};
        ListUtils.pringlnArrays(solution.findErrorNums(array));
        ListUtils.pringlnArrays(solution.findErrorNums(array1));
        ListUtils.pringlnArrays(solution.findErrorNums(array2));
    }
}