package com.xuhu.LeetCode.easy.easyBefore500.easy0482;


class Solution {
    public String licenseKeyFormatting(String S, int K) {
        StringBuffer ans = new StringBuffer();
        int length = S.length();
        int tempNum = 0;
        for(int i = length - 1; i >= 0; i--){
            char c = S.charAt(i);
            if(c == '-') continue;
            if(c <= 'z' && c >= 'a'){
                c -= ('a' - 'A');
            }
            ans.append(c);
            tempNum++;
            if(tempNum == K){
                ans.append('-');
                tempNum = 0;
            }
        }
        while (ans.length() != 0 && ans.charAt(ans.length()-1) == '-'){
            ans.deleteCharAt(ans.length() - 1);
        }
        return ans.reverse().toString();
    }
}