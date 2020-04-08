package com.xuhu.LeetCode.easy.easyBefore900.easy884;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListUtils.printlnStrs(solution.uncommonFromSentences("this apple is sweet","this apple is sour"));
        ListUtils.printlnStrs(solution.uncommonFromSentences("apple apple","banana"));
    }
}