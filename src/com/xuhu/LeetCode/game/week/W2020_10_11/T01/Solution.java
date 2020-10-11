package com.xuhu.LeetCode.game.week.W2020_10_11.T01;

import java.util.Arrays;

class Solution {
    public int maxDepth(String s) {
        if (null == s || s.length() == 0){
            return 0;
        }
        char[] chars = s.toCharArray();
        int max = 0;
        int now = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '('){
                now++;
                max = Math.max(max,now);
            }else if (chars[i] ==')'){
                now--;
            }else {

            }
        }

        return max;
    }
}