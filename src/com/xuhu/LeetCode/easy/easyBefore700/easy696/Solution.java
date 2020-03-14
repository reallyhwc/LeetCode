package com.xuhu.LeetCode.easy.easyBefore700.easy696;


import java.util.Map;

class Solution {
    public int countBinarySubstrings(String s) {
        int[] results = new int[s.length()];
        int t = 0;
        results[0] = 1;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i-1) == s.charAt(i)){
                results[t]++;
            }else {
                results[++t] = 1;
            }
        }
        int ans = 0;
        for(int i = 1; i < results.length; i++){
            ans += Math.min(results[i-1],results[i]);
        }
        return ans;
    }
//    暂时无法理解工作原理的一段时间复杂度更低的代码，先留存
//    public int countBinarySubstrings(String s) {
//        int pre = 0,cur = 1,counts = 0;
//        for(int i = 1;i < s.length();i++){
//            if(s.charAt(i) == s.charAt(i - 1)){
//                cur += 1;
//            }else{
//                pre = cur;
//                cur = 1;
//            }
//            if(pre >= cur) counts++;
//        }
//        return counts;
//    }
}