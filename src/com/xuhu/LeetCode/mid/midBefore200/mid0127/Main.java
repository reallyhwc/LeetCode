package com.xuhu.LeetCode.mid.midBefore200.mid0127;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.ladderLength("hit","cog", ListUtils.createListByArray(new String[]{"hot","dot","dog","lot","log","cog"})));
    }
}