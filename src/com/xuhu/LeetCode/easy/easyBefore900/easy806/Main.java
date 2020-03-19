package com.xuhu.LeetCode.easy.easyBefore900.easy806;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] width = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        int[] width1 = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};

        ListUtils.pringlnArrays(solution.numberOfLines(width,"abcdefghijklmnopqrstuvwxyz"));
        ListUtils.pringlnArrays(solution.numberOfLines(width1,"bbbcccdddaaa"));
    }
}