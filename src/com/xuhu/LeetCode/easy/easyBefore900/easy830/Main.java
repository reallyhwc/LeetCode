package com.xuhu.LeetCode.easy.easyBefore900.easy830;

import com.xuhu.LeetCode.a.util.ListUtils;

import java.util.List;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
//        for(List list : solution.largeGroupPositions("abbxxxxzzy")){ ListUtils.pringlnList(list); }
        for(List list : solution.largeGroupPositions("abcdddeeeeaabbbcd")){ ListUtils.pringlnList(list); }
    }
}