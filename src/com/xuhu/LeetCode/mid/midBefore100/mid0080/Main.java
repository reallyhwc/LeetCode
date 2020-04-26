package com.xuhu.LeetCode.mid.midBefore100.mid0080;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
//        int[] array = {1,1,1,2,2,3};
//        System.out.println(solution.removeDuplicates(array) + "\n");
//        ListUtils.pringlnArrays(array);

        int[] array = {0,0,1,1,1,1,2,3,3};
        System.out.println(solution.removeDuplicates(array) + "\n");
        ListUtils.pringlnArrays(array);
    }
}