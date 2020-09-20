package com.xuhu.LeetCode.game.week.W2020_09_20.T02;


import java.util.*;

class Solution {
    int max;

    Set<String> set;
    public int maxUniqueSplit(String s) {
        max = 0;
        set = new HashSet<>();
        dfs(0,0,1,s);
        return max;
    }

    private void dfs(int begin, int end, int res, String s){
        if (end == s.length()-1){
            if (set.contains(s.substring(begin,end+1))){
                return;
            }else {
                max = Math.max(max,res);
                return;
            }
        }
        String str = s.substring(begin,end+1);
        // 不重复 切一下begin - end
        if (!set.contains(str)){
            set.add(str);
            dfs(end+1, end+1, res+1,s);
            set.remove(str);
        }
        // end处不切
        dfs(begin,end + 1,res,s);
    }

}